/**
* @author ingrid.carmona@uao.edu.co - Ingrid Carmona Diaz - 2150147
* @author sebastian.carmona@uao.edu.co - Sebastian Carmona - 2170266
* @date 14 Septiembre 2018 - 2018-03
* @version IDE 8.2
* Descripción de la clase ...
*/
package Modelo;

import java.util.LinkedList;
import javafx.geometry.Point3D;
import javafx.scene.paint.Color;
import javafx.scene.shape.MeshView;

/**
 *
 * @author ingrid.carmona
 */
public abstract class ObjetosGeometricos extends MeshView{
    private LinkedList<Point3D> Vertices;
    private double Size;
    
    public ObjetosGeometricos (double Size, Color color, double shade){
        this.Size = Size;
        
        Vertices = new LinkedList<>();
        
    }
}
