
package PrimerProyecto;

import javafx.scene.image.Image;

/**
 * 
 * @author Alem Solano Vasquez
 */

public class DeterminaTurno {
    
    public int turnoInicial (int turno){
        
        
        int siguienteTurno = 1+(int) (Math.random()*2);
        
        if (siguienteTurno==1){  // si el resultado 
            
            siguienteTurno=1;
            
        }else{
            
            siguienteTurno=2;
        }
        
        return siguienteTurno;
    }
    
     
   //Establece la imagen del cuadrado
    
    public Image dibujaX() {
        String imagenXUrl = (""); // falta agregar la imagen
        Image ImagenX = new Image(imagenXUrl);
        return ImagenX;
    }

    public Image dibujaO() {
        String imagenOUrl = (""); // x2
        Image ImagenO = new Image(imagenOUrl);
        return ImagenO;
    }
    
}
    