package TestPrueba;

import ArrayBidimensional.ValoresConstantes;
import javax.swing.JOptionPane;

public class TestMatrizConstantes {
    public static void main(String[] args) {
        MenuConstantes();
    }
  public static void MenuConstantes(){
      ValoresConstantes objet0=new ValoresConstantes();
      int sel; String cad= " "; int dato = 0;
       do{ 
    sel=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese una opcion\n 1.Imprimir matriz\n 2.Imprimir matriz ordenada"));
   switch(sel) {
       case 1: 
           objet0.imprimirMatriz();
           break;
           
       case 2:
           objet0.imprimirMatrizOrdenada();
           break;
           
       case 3:
          System.exit(0);
           break;
   }
  }while(sel!=3);
}}
