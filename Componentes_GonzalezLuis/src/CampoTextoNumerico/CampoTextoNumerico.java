/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CampoTextoNumerico;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextField;

/**
 *
 * @author Luis
 */
public class CampoTextoNumerico extends TextField {

    @FXML
    private TextField textField;

    public CampoTextoNumerico() {

        super();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("control_ctn.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);
        
        try {
            fxmlLoader.load();            
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
    }

            @Override
        public void replaceText(int start, int end, String text) {

            if (!text.matches("[a-z, A-Z]")) {
                super.replaceText(start, end, text);
            }
        }

        @Override
        public void replaceSelection(String text) {
            if (!text.matches("[a-z, A-Z]")) {
                super.replaceSelection(text);
            }
        }
}
