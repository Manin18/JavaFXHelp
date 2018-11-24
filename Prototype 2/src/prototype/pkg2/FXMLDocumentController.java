/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype.pkg2;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 *
 * @author test
 */
public class FXMLDocumentController implements Initializable {
    
   @FXML
    private Button startBtn;

    @FXML
    private Button quitBtn;

    @FXML
    void QuitButton(ActionEvent event) {
        Stage stage = (Stage) quitBtn.getScene().getWindow();
        stage.close();
    }

    @FXML
    void StartButton(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("GameStart.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        
        stage.setScene(new Scene(root1));
        stage.close();
        stage.show();
        
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
