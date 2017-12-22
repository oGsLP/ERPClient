package ui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import rmi.RemoteHelper;
import ui.login.LoginController;
import ui.login.LoginOverviewController;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main extends Application{

    private Stage stage;
    // 弹窗
    private Stage extraStage;
    private Stage extraStage2;

    // 内部窗口
    private SplitPane rootLayout;

    private Scene scene;
    private final double MINIMUM_WINDOW_WIDTH = 400.0;
    private final double MINIMUM_WINDOW_HEIGHT = 250.0;

    RemoteHelper helper=RemoteHelper.getInstance();

    public Main(){}

    @Override
    public void start(Stage primaryStage){
        stage = primaryStage;
        stage.initStyle(StageStyle.UNDECORATED);
        stage.setTitle("ERP");
        stage.setMinHeight(MINIMUM_WINDOW_HEIGHT);
        stage.setMinWidth(MINIMUM_WINDOW_WIDTH);
        stage.setResizable(false);
        initUI();
        stage.show();
    }
    public void initUI() {
        try {

        } catch (Exception e) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, e);
        }
    }



}
