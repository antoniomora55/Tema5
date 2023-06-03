
package EntradaSalida;

import javax.swing.JOptionPane;

public class Tools {
       public static String leerString(String msje)
    {
        return (JOptionPane.showInputDialog(null,msje,JOptionPane.INFORMATION_MESSAGE));
    }
           public static int leerInt (String msje)
    {
        return (Integer.parseInt(JOptionPane.showInputDialog(null,msje,JOptionPane.INFORMATION_MESSAGE)));
    }
          public static void imprimepantalla(String msje)
    {
       JOptionPane.showMessageDialog(null,msje,"salida",JOptionPane.INFORMATION_MESSAGE);
    }
}
