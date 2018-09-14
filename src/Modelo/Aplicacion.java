/**
 * @author ingrid.carmona@uao.edu.co - Ingrid Carmona Diaz - 2150147
 * @author sebastian.carmona@uao.edu.co - Sebastian Carmona - 2170266
 * @date 14 Septiembre 2018 - 2018-03
 * @version IDE 8.2 Descripción de la clase ... Esta es la clase principal
 */
package Modelo;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Aplicacion extends Application {

    private ObjetosGeometricos Box;
    /**
     * Descripción del método.
     *
     * @param Aplicacion descripción. // De cada uno de los parámetros que recibe el
     * método.
     * @return explicación del valor de retorno del método
     */
    
    
    @Override
    public void start(Stage stage) throws Exception{
        
        Box = new Cube(50, Color.AQUA,50);
        Node controlPanel = PanelFactory.createControlPanel(stage, Box);
        Node scene3D = ObjectFactory.createScene3D(Box);
        
        Group root = new Group();
        root.getChildren().add(scene3D);
        root.getChildren().add(controlPanel);
        
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.getScene().setCamera(new PerspectiveCamera());
        stage.setResizable(false);
        stage.setTitle("Traslación");
        stage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }

    

}
