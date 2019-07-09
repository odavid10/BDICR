package codigo;

import reportes.GenerarReportes;
import ventanas.VentanaPrincipal;

/**
 *
 * @author Omar David
 */
public class Principal {
    
    public static void main(String[] args) {
        
        VentanaPrincipal VentanaPrincipal = new VentanaPrincipal();
        
        //VentanaPrincipal.setVisible(true);
        GenerarReportes g = new GenerarReportes();
        
        g.reportePieza(20);
        
    }
    
}
