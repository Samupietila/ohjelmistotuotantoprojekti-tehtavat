package com.example;
/*
Put header here


 */

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class FXMLController implements Initializable {
    
    @FXML
    private Label lblOut;
    public Button button1;
    public Button button2;
    public Button button3;
    
    @FXML
    private void btnClickAction(ActionEvent event) {
        lblOut.setText("Hello World!");
    }
    
    @Override
    public void initialize( URL url, ResourceBundle rb) {
        rb = ResourceBundle.getBundle("com.example.bundle1");
        button1.setText(rb.getString("button1.text"));
        button2.setText(rb.getString("button2.text"));
        button3.setText(rb.getString("button3.text"));
    }    
}
