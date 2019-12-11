/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CampoTextoBoton;

import java.io.IOException;
import javafx.beans.property.StringProperty;


import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

/**
 *
 * @author Luis
 */
public class ControlCTB extends HBox {
    @FXML private TextField textField;

    public ControlCTB() {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("control_ctb.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);
        
        try {
            fxmlLoader.load();            
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
    }
    
    public String getText() {
        return textProperty().get();
    }
    
    public void setText(String value) {
        textProperty().set(value);
    }
    
    public StringProperty textProperty() {
        return textField.textProperty();
    }
        
    @FXML
    protected void doSomething() {
        System.out.println("El botón fue pulsado!");
    }
}
