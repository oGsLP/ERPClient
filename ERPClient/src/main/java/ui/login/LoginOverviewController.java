package ui.login;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import ui.Main;

import javafx.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;

public class LoginOverviewController implements Initializable{

    public Main main;
    //总经理登录按钮 跳转至登录页面
    @FXML
    public Button managerLoginButton;
    //总经理登录按钮 跳转至登录页面
    @FXML
    public Button finanzenLoginButton;
    //总经理登录按钮 跳转至登录页面
    @FXML
    public Button stockLoginButton;
    //总经理登录按钮 跳转至登录页面
    @FXML
    public Button saleLoginButton;

    @FXML
    public void gotoManage(ActionEvent e){

    }

    @FXML
    public void gotoStock(ActionEvent e){

    }

    @FXML
    public void gotoFinace(ActionEvent e){

    }

    @FXML
    public void gotoSale(ActionEvent e){

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void setMain(Main main){
        this.main = main;
    }


}
