
package super_shop_management_system;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Main_GUIController implements Initializable {

    @FXML
    private TextField txtfld_userID;
    @FXML
    private PasswordField passfld_pass;
    @FXML
    private Button btn_submit;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

    @FXML
    private void txtfld_userID_Action(ActionEvent event) {
        
    }

    @FXML
    private void passfld_pass_Action(ActionEvent event) {
    }

    @FXML
    private void btn_submit_Action(ActionEvent event)throws IOException {
        
        String userid = txtfld_userID.getText();
        String password = passfld_pass.getText();
        
        if(password.equals("123") && userid.equals("Siyam"))
        {
        
         Parent After_Login = FXMLLoader.load(getClass().getResource("After_Login.fxml"));
        Scene src1 = new Scene (After_Login);
        Stage app_primaryStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_primaryStage.setScene(src1);
        app_primaryStage.show();
        
        }
        
        
        if(password.equals("321") && userid.equals("Rahim"))
        {
        
        Parent After_Login = FXMLLoader.load(getClass().getResource("After_Login.fxml"));
        Scene src1 = new Scene (After_Login);
        Stage app_primaryStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_primaryStage.setScene(src1);
        app_primaryStage.show();
        
        }
        
         if(password.equals("13579") && userid.equals("Fahim"))
        {
        
        Parent After_Login = FXMLLoader.load(getClass().getResource("After_Login.fxml"));
        Scene src1 = new Scene (After_Login);
        Stage app_primaryStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_primaryStage.setScene(src1);
        app_primaryStage.show();
        
        }
        
        
        else
        {
        

            
        }
        
        
       /* Parent After_Login = FXMLLoader.load(getClass().getResource("After_Login.fxml"));
        Scene src1 = new Scene (After_Login);
        Stage app_primaryStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_primaryStage.setScene(src1);
        app_primaryStage.show();
        */

       
    }

 
    
}
