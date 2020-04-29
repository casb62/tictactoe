package mygame;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class TictactoeController implements Initializable {

    private boolean isFirstPlayer = true;

    @FXML
    private Button clickedButton;

    @FXML
    private void handleButtonAction(ActionEvent event) {
        Button clickedButton = (Button) event.getTarget();
        String buttonLabel = clickedButton.getText();
        if ("".equals(buttonLabel) && isFirstPlayer) {
            clickedButton.setText("X");
            isFirstPlayer = false;
        } else if ("".equals(buttonLabel) && !isFirstPlayer) {
            clickedButton.setText("O");
            isFirstPlayer = true;
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
}
