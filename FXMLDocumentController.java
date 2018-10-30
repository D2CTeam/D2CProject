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
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * @author Donna Svinis
 */
public class FXMLDocumentController implements Initializable { 
    
    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
        Parent table_view_parent = FXMLLoader.load(getClass().getResource("ContactTableView.fxml"));
        Scene table_view_scene = new Scene(table_view_parent);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.setScene(table_view_scene);
        app_stage.show();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
