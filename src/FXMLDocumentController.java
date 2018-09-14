/**
* @author ingrid.carmona@uao.edu.co - Ingrid Carmona Diaz - 2150147
* @author sebastian.carmona@uao.edu.co - Sebastian Carmona - 2170266
* @date 14 Septiembre 2018 - 2018-03
* @version IDE 8.2
* Descripción de la clase ...
*/

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;

public class FXMLDocumentController implements Initializable {

    @FXML
    private Label txCrearEsfera;

    @FXML
    private Label txCrearCubo;

    @FXML
    private Label txCrearCilindro;
    
    @FXML
    private Canvas Lienzo;

    @FXML
    void btCilindro(ActionEvent event) {

    }

    @FXML
    void btCubo(ActionEvent event) {

    }

    @FXML
    void btEsfera(ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
