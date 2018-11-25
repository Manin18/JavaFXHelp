/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype.pkg2;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author test
 */
public class FXMLDocumentController implements Initializable {
   
    //START MENU BUTTONS
    @FXML
    private Button startBtn;

    @FXML
    private Button quitBtn;
    
    //INTERACTIVE IN-GAME BUTTONS
        //ROOMS BUTTONS
    @FXML
    private Button oneBtn;
    
    @FXML
    private Button sTartBtn;
    
    @FXML
    private Button twoBtn;
     
        //INVENTORY BUTTON
    @FXML
    private Button inventoryBtn;
    
    @FXML
    private Button inventoryBackBtn;
    
        //INVENTORY LIST
    @FXML
    private ListView<?> inventoryList;
//------------------------------------------------------------------------------------------------
        //ACTION EVENTS
    @FXML
    void QuitButton(ActionEvent event) {
            Platform.exit();
    }

    @FXML
    void StartButton(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("GameStart.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.initStyle(StageStyle.UTILITY);
        stage.setScene(new Scene(root1));
        stage.show();
    }
    
    @FXML
    void STARTButton(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("GameStart.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.initStyle(StageStyle.UTILITY);
        stage.setScene(new Scene(root1));
        stage.show();
    }
    
    @FXML
    void OneButton(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("1.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.initStyle(StageStyle.UTILITY);
        stage.setScene(new Scene(root1));
        stage.show();
    }
    
    @FXML
    void TwoButton(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("2.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.initStyle(StageStyle.UTILITY);
        stage.setScene(new Scene(root1));
        stage.show();
    }
    
    @FXML
    void InventoryButton(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Inventory.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.initStyle(StageStyle.UNDECORATED);
        stage.setScene(new Scene(root1));
        stage.show();
    }
    
      @FXML
    void BackButton(ActionEvent event) throws IOException {
        Stage stage = (Stage) inventoryBackBtn.getScene().getWindow();
        stage.close();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
