/*
 * Luís González Palomo
 * Temporizador
 */
package Temporizador;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.util.Duration;


public class TemporizadorController extends HBox implements Initializable {

    @FXML
    private Label Numero;
    @FXML
    private HBox panel;
    @FXML
    private Label label1;
    
    private Timeline tiempo;
    private int inicio = 3;
    private IntegerProperty segundos = new SimpleIntegerProperty(inicio);

    public TemporizadorController() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Temporizador.fxml"));
            fxmlLoader.setRoot(this);
            fxmlLoader.setController(this);
            fxmlLoader.load();
        } catch (IOException ex) {
            System.out.println("Excepcion de entrada/salida");
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Numero.textProperty().bind(segundos.asString());
        segundos.set(inicio);
        tiempo = new Timeline();
        tiempo.getKeyFrames().add(new KeyFrame(Duration.seconds(inicio + 1), new KeyValue(segundos, 0)));
        tiempo.playFromStart();
    }
}