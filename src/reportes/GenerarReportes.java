package reportes;

import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import ventanas.VentanaPrincipal;

/**
 *
 * @author Omar David
 */
public class GenerarReportes {
    
    public void reporteReunion(){
        try {
            JasperReport reporte = (JasperReport) JRLoader.loadObject("ReporteReunion.jasper");
            //Map parametro = new HashMap();
            
            //parametro.put("numExpediente", numExpediente);
            
            JasperPrint j = JasperFillManager.fillReport(reporte,null, VentanaPrincipal.cn.conectar());
            JasperViewer jv = new JasperViewer(j, false);
            jv.setTitle("Reporte Reunión");
            jv.setVisible(true);
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public void reportePieza(int idPieza){
        try {
            JasperReport reporte = (JasperReport) JRLoader.loadObject("ReportePieza.jasper");
            Map parametro = new HashMap();
            
            parametro.put("idPieza", idPieza);
            
            JasperPrint j = JasperFillManager.fillReport(reporte,null, VentanaPrincipal.cn.conectar());
            JasperViewer jv = new JasperViewer(j, false);
            jv.setTitle("Ficha de Pieza");
            jv.setVisible(true);
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
