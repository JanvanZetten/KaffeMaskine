/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kaffemaskinesim;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**#000000
 *
 * @author janvanzetten
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private Rectangle KaffeStraale;
    
<<<<<<< HEAD
    
    Timer timer = new Timer();
    
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
=======
>>>>>>> 6cdc7df3519d7fbb11f3fb0588ed4a885ddd4834
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

    @FXML
    private void SortKaffeAction(ActionEvent event) throws InterruptedException {
        KaffeStraale.setFill(Color.BLACK);
        
            TimerTask task = new TimerTask()
    {
        
        public void run()
        {
                KaffeStraale.setFill(Color.TRANSPARENT);   
        }

    };
            
            
        timer.schedule(task,10000l);
    }

    @FXML
    private void SortKaffeMedSukkerAction(ActionEvent event) throws InterruptedException {
        KaffeStraale.setFill(Color.BLACK);
        
            TimerTask task = new TimerTask()
    {
        
        public void run()
        {
                KaffeStraale.setFill(Color.TRANSPARENT);   
        }

    };
        
        timer.schedule(task,10000l);
    }

    @FXML
    private void KaffeMedMælkAction(ActionEvent event) throws InterruptedException {
        KaffeStraale.setFill(Color.SIENNA);
        
            TimerTask task = new TimerTask()
    {
        
        public void run()
        {
                KaffeStraale.setFill(Color.TRANSPARENT);   
        }

    };
        
        timer.schedule(task,10000l);
    }

    @FXML
    private void KaffeMedMælkOgSukker(ActionEvent event) throws InterruptedException {
        KaffeStraale.setFill(Color.SIENNA);
        
            TimerTask task = new TimerTask()
    {
        
        public void run()
        {
                KaffeStraale.setFill(Color.TRANSPARENT);   
        }

    };
        
        timer.schedule(task,10000l);
    }
    
}
