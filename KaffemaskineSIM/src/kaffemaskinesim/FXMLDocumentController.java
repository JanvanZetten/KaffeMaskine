/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kaffemaskinesim;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author janvanzetten
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private Rectangle KaffeStraale;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void SortKaffeAction(ActionEvent event) {
    }

    @FXML
    private void SortKaffeMedSukkerAction(ActionEvent event) {
    }

    @FXML
    private void KaffeMedMælkAction(ActionEvent event) {
    }

    @FXML
    private void KaffeMedMælkOgSukker(ActionEvent event) {
    }
    
}
