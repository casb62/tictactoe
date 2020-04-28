package mygame;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class TictactoeController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}

public class Controller {
   private boolean isFirstPlayer = true;

   public void buttonClickHandler(ActionEvent evt){

        Button clickedButton = (Button) evt.getTarget();
        String buttonLabel = clickedButton.getText();

        if ("".equals(buttonLabel) && isFirstPlayer){
            clickedButton.setText("X");
            isFirstPlayer = false;
        } else if("".equals(buttonLabel) && !isFirstPlayer){
            clickedButton.setText("O");
            isFirstPlayer = true;
        }
   }
}