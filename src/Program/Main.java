  /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Program;

import Formularios.*;
import javax.swing.JFrame;
import org.jvnet.substance.SubstanceLookAndFeel;

/**
 *
 * @author Miguel Angel
 */
public class Main {
    private static int EXIT_ON_CLOSE;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         JFrame.setDefaultLookAndFeelDecorated(true);
     SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.CremeSkin");
     /*.setCurrentTheme("org.jvnet.substance.theme.SubstanceLightAquaTheme");*/
     /*SubstanceLookAndFeel.setCurrentWatermark("org.jvnet.substance.watermark.SubstanceWoodWatermark");/*/
    /*SubstanceLookAndFeel.setCurrentWatermark(new SubstanceImageWatermark("C:\\Fondo.jpg"));*/
    //FacturaServicio  NEW = new FacturaServicio ();
  UsuarioContra NEW = new UsuarioContra();
    NEW.setVisible(true);
    
    /*- org.jvnet.substance.watermark. SubstanceBubblesWatermark
        * org.jvnet.substance.watermark. SubstanceBinaryWatermark
        * org.jvnet.substance.watermark. SubstanceCopperplateEngravingWatermark
        * org.jvnet.substance.watermark. SubstanceCrosshatchWatermark
        * org.jvnet.substance.watermark. SubstanceFabricWatermark
        * org.jvnet.substance.watermark. SubstanceGenericNoiseWatermark
        * org.jvnet.substance.watermark. SubstanceImageWatermark
        * org.jvnet.substance.watermark. SubstanceKatakanaWatermark
        * org.jvnet.substance.watermark.SubstanceLatchWatermark
        * org.jvnet.substance.watermark. SubstanceMagneticFieldWatermark
        * org.jvnet.substance.watermark. SubstanceMarbleVeinWatermark
        * org.jvnet.substance.watermark.SubstanceMazeWatermark
        * org.jvnet.substance.watermark. SubstanceMetalWallWatermark
        * org.jvnet.substance.watermark.SubstanceNoneWatermark
        * org.jvnet.substance.watermark.SubstanceNullWatermark
        * org.jvnet.substance.watermark. SubstancePlanktonWatermark
        * org.jvnet.substance.watermark. SubstanceStripeWatermark
        * org.jvnet.substance.watermark. SubstanceWoodWatermark*/
        // TODO code application logic here
    }
}
