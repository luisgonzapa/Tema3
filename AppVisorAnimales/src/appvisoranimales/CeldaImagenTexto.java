/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appvisoranimales;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

public class CeldaImagenTexto extends ListCell<Animal> {

    VBox vertical = new VBox();
    ImageView image = new ImageView();
    Label label = new Label();

    public CeldaImagenTexto() {
        vertical.setAlignment(Pos.CENTER);
        image.setPreserveRatio(true);
        image.setFitHeight(100);
        vertical.getChildren().addAll(label, image);
        //label.autosize();
        label.setWrapText(true);
        label.setAlignment(Pos.CENTER);
        this.setPrefWidth(super.getPrefWidth());
    }

    @Override
    public void updateItem(Animal animal, boolean empty) {
        super.updateItem(animal, empty);

        if (animal == null) {
            setGraphic(null);
        } else {
            Image imagen = new Image(animal.getRutaIcono());
            image.setImage(imagen);
            label.setText(animal.getNombre());
            setGraphic(vertical);
        }
    }
}

