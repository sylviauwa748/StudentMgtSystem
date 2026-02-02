package com.studentapp.util;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.*;

public class AppLogger {
    private static Logger logger;
    private AppLogger(){

    }

    //add configuration(default)
//    private static void configureLogger() {
//        logger.setLevel(java.util.logging.Level.ALL);
//    }

    //console and file
    private static void configureLogger() {
        try {
            logger.setUseParentHandlers(false);

            ConsoleHandler consoleHandler = new ConsoleHandler();
            consoleHandler.setLevel(Level.ALL);
            consoleHandler.setFormatter(new CustomFormatter());
            logger.addHandler(consoleHandler);

            FileHandler fileHandler = new FileHandler("student_app.log", true);
            fileHandler.setLevel(Level.ALL);
            fileHandler.setFormatter(new CustomFormatter());
            logger.addHandler(fileHandler);

            logger.setLevel(Level.ALL);

        } catch (IOException e) {
            System.err.println("Logger setup failed");
            e.printStackTrace();
        }
    }


    //how logs should appear
    private static class CustomFormatter extends Formatter {

        private static final DateTimeFormatter FORMATTER =
                DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        @Override
        public String format(LogRecord record) {
            return "[" + LocalDateTime.now().format(FORMATTER) + "] "
                    + "[" + record.getLevel() + "] "
                    + record.getMessage() + "\n";
        }
    }



    public static Logger getInstance(){
        if(logger == null){
            logger = Logger.getLogger("StudentMgtSystem");
            configureLogger();
        }
        return logger;
    }
}
