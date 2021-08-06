package Util;

import javax.swing.JPanel;

public class UtilSwing {
    public static void colocarNuevoPanel(JPanel jpanPadre, JPanel jpanHijo){
        /*Eliminamos el contenido del panel*/
        jpanPadre.removeAll();
        
        /*Agregamos el hijo*/
        jpanPadre.add(jpanHijo);
        
        /*Actualizamos visualmente los cambios*/
        jpanPadre.updateUI();
    }
    
    public static JPanel obtenerPadre(JPanel jpanHijo){
        return (JPanel) jpanHijo.getParent();
    }
    
    public static void quitarPanel(JPanel jpanHijo){
        JPanel jpanPadre = obtenerPadre(jpanHijo);
        jpanPadre.removeAll();
        jpanPadre.updateUI();
    }
    
}
