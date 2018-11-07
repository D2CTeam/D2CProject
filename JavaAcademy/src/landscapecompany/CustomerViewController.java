/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package landscapecompany;

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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author dvsvi
 */
public class CustomerViewController implements Initializable {

    /**
     * When this method is called it will change the Scene back to the home page
     */  
        @FXML
    private void changeScreenButtonPushed(ActionEvent event) throws IOException {
        Parent table_view_parent = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        Scene table_view_scene = new Scene(table_view_parent);
        Stage app_stage = (Stage)((Node) event.getSource()).getScene().getWindow();
        app_stage.setScene(table_view_scene);
        app_stage.show();
    }
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
