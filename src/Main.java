import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create UI components
        Label label = new Label("Hello JavaFX!");
        Button button = new Button("Click Me!");

        // Add event handler
        button.setOnAction(e -> {
            label.setText("Button Clicked! JavaFX is working! 🎉");
        });

        // Layout
        VBox root = new VBox(10);
        root.getChildren().addAll(label, button);
        root.setStyle("-fx-padding: 20;");

        // Scene
        Scene scene = new Scene(root, 400, 200);

        // Stage
        primaryStage.setTitle("JavaFX Test");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}