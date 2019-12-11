/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appusoselector;

//Importamos el componente.
import SelectorDeslizamiento.SelectorDeslizamiento;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.beans.property.ObjectProperty;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

/**
 *
 * @author Luis
 */
public class SelectorController implements Initializable {
    
    @FXML
    private SelectorDeslizamiento arriba;
    @FXML
    private SelectorDeslizamiento abajo;
    @FXML
    private Label texto;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
      
        ArrayList<String> numeros = new ArrayList();
        numeros.add("Uno");
        numeros.add("Dos");
        numeros.add("Tres");
        numeros.add("Cuatro");
        numeros.add("Cinco");
        
        arriba.setItems(numeros);
        abajo.setItems(numeros);

        arriba.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                texto.setText("El selector de arriba se pulso.");
            }
        });
        
        abajo.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                texto.setText("El selector de abajo se pulso.");
            }
        });
    }    
    
}
