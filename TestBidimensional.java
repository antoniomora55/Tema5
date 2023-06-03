/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TestPrueba;

import ArrayBidimensional.AlmacenarDatosTabla;
import ArrayUnidimensional.Metodos;
import EntradaSalida.Tools;
import javax.swing.JOptionPane;

/**
 *
 * @author LOPEZ
 */
public class TestBidimensional {
     public static void main(String[] args) {
        MenuBidi();
    } 
    public static void MenuBidi(){
   AlmacenarDatosTabla objeto=new AlmacenarDatosTabla((byte)4,(byte)4);
   Metodos ob=new Metodos(); int sel; String cad= " "; int dato=0;
   
   do{ 
    sel=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese una opcion\n 1.Leer\n 2.Ver matriz\n 3.Sumar la diagonal principal\n 4.Mostrar la diagonal inferior\n"
    		+ "5. Mostrar octal\n 6.Salir"));
   switch(sel) {
       case 1: 
    	   dato=Tools.leerInt("Ingrese un numero");
      objeto.añadirDato(dato);
           break;
       case 2: 
           objeto.verMatriz();
           break;
       case 3: 
           objeto.diagonalPrincipalSuma();
           break;
       case 4: 
           objeto.imprimeDiagonalInferior();
           break;
           
       case 5: 
        objeto.octal(dato);
           break;
       case 6: 
           sel=6;
              break;
   }}while(sel!=6);
}  
}
