/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appvisoranimales;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;

/**
 * FXML Controller class
 *
 * @author Luis
 */
public class VisorAnimalesController implements Initializable {
    @FXML
    private ListView<Animal> lista;
    @FXML
    private ImageView imagen;
    
    //Crear el observableList
    ObservableList<Animal> datos = FXCollections.observableArrayList();
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    
        //Creo los datos.
        Animal gato = new Animal ("Gato", "appvisoranimales/Image/thumbgato.jpg", "appvisoranimales/Image/gato.jpg");
        Animal perro = new Animal("Perro", "appvisoranimales/Image/thumbperro.jpg", "appvisoranimales/Image/perro.jpg");
        Animal pajaro = new Animal("Pájaro", "appvisoranimales/Image/thumbpajaro.jpg", "appvisoranimales/Image/pajaro.jpg");

        //Añado los animales al ObservableList.
        datos.add(gato);
        datos.add(perro);
        datos.add(pajaro);
        
        //carga los datos a la lista.
        lista.setItems(datos);
        
        lista.setCellFactory((ListView<Animal> l) -> new CeldaImagenTexto());
        
        //Según la selección cargará una imagen u otra.
        lista.getSelectionModel().selectedItemProperty().addListener(
            (ObservableValue<? extends Animal> ov, Animal old_val, 
                Animal new_val) -> {
                    Image imagenMuestra = new Image(new_val.getRutaImagen());
                    imagen.setImage(imagenMuestra);
        });
    }    
    
}
