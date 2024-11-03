package a;

import java.io.IOException;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class PrimaryController {
    public Button button1;
    public Button button2;
    public Button button3;

    @FXML
    // private void switchToSecondary() throws IOException {
    //     App.setRoot("secondary");
    // }

       public void initialize() {
       ResourceBundle bundle = ResourceBundle.getBundle("bundle1");
       button1.setText(bundle.getString("button1.text"));
       button2.setText(bundle.getString("button2.text"));
       button3.setText(bundle.getString("button3.text"));
   }
}
