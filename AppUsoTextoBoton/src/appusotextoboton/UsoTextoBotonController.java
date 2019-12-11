/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appusotextoboton;

import CampoTextoBoton.ControlCTB;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class UsoTextoBotonController implements Initializable {

    @FXML
    private ControlCTB nombre;
    @FXML
    private ControlCTB apellidos;
    @FXML
    private Label texto;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        nombre.getChildren().get(1).addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            public void handle(MouseEvent event) {
                texto.setText("El nombre es: "+nombre.getText());      
            }
        });
                  
        apellidos.getChildren().get(1).addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            public void handle(MouseEvent event) {
                texto.setText("Su apellido es: "+apellidos.getText());      
            }
        });

    }    
    
}