package ui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Demo extends Application{
    private Scene scene;
    Parent root;
    @Override
    public void start(Stage stage) throws IOException {
        System.out.println(getClass().getResource(
                "/fxml/initialize.fxml"));
        root = FXMLLoader.load(getClass().getResource("/fxml/initialize.fxml"));
        Scene scene = new Scene(root, 800, 600);
        stage.setTitle("Login system");
        stage.setScene(scene);
        stage.show();
    }

}
