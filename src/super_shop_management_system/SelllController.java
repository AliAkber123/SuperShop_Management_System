/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package super_shop_management_system;
import java.sql.*;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Rudra
 */
public class SelllController implements Initializable {

    @FXML
    private Button Back_btn;
    @FXML
    private Button Submit_btn;
    @FXML
    private TextField ProductName;
    @FXML
    private TextField Price;
    @FXML
    private TextField Quantity;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void Back_btn_Action(ActionEvent event)throws IOException {
        Parent After_Login = FXMLLoader.load(getClass().getResource("After_Login.fxml"));
        Scene src88 = new Scene (After_Login);
        Stage app_primaryStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_primaryStage.setScene(src88);
        app_primaryStage.show();
    }

    @FXML
    private void Submit_btn_Action(ActionEvent event) {
        
        String url="jdbc:mysql://127.0.0.1/import";
        String username="root";
        String pass="";
        try{
        Connection conn = DriverManager.getConnection(url, username, pass);
        Statement stmt=conn.createStatement();
        String sql="DELETE FROM `importtable` WHERE Price = 10000";
        
         }catch(Exception e){
            System.out.println(e);
        }
        
        
    }

    @FXML
    private void ProductName_Action(ActionEvent event) {
    }

    @FXML
    private void Price_Action(ActionEvent event) {
    }

    @FXML
    private void Quantity_Action(ActionEvent event) {
    }
    
}
