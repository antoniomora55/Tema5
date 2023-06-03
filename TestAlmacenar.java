package TestPrueba;
import javax.swing.JOptionPane; import java.util.Random; import ArrayUnidimensional.Metodos;
import ArrayUnidimensional.AlmacenarDatos;
import EntradaSalida.Tools;
public class TestAlmacenar {
    public static void main(String[] args) {
        Menu();
    }
  public static void Menu(){
         AlmacenarDatos obj=new AlmacenarDatos((byte)10);
         Metodos dat=new Metodos();
int dato;
int sel;

do{ 
    sel=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese una opcion\n 1.Leer\n 2.Primos\n 3.Imprimir\n 4.Aleatorio \n 5.Constantes\n 6.Frecuencia\n  8.Ordenar\n 9.Ejercicio 1\n 10.Ejercicio 2\n 11.Ejercicio 3\n12.Ejercicio 4\n13.Salir"));
   switch(sel) {
       
       case 1: 
         dato=Tools.leerInt(Integer.MIN_VALUE+" ingrese un entero "+Integer.MAX_VALUE);
      obj.añadirDato(dato);
           break;
       case 2: String cad=obj.imprimePrimos(); break; 
       case 3: 
      if(obj.arrayVacio()) Tools.imprimepantalla("Array vacio");
      else Tools.imprimepantalla("Datos almacenados:\n "+obj.imprimeDatosArray()+"\nPrimos:\n ");
          break;
       case 4: 
           Random aleatorio=new Random();
dato=aleatorio.nextInt(21);
//  Tools.imprimepantalla("Binario "+obj.convertirABinario());
           break;
           case 5: 
             break;
           case 6: 
               
               break;
           case 7:
              cad=obj.imprimeFrecuencia();
               break;
           case 8:
              obj.ordenarBurbuja();
              Tools.imprimepantalla("Datos ordenados:\n"+obj.imprimeDatosArray());
               break;
               case 9:
            	   
                 dat.validarPar(33);
                 dat.validarImpar(12);
                   dat.validarCero(0);
                   dat.ArrayIncisoABC();
                   //Tools.imprimepantalla("Datos "+dat.ArrayIncisoABC()+dat.validarPar(33)+dat.validarImpar(22)+dat.validarCero(2));
               break;
            case 10:  
            obj.altura();
            break;
             case 11: obj.cadena(); break;
             case 12: obj.taxista(); break;
             
             case 13:  break;
   }
}while(sel!=13);

  /*Agregar un opcion que se llame binario en la unidad ejecutable, usando la plantilla de AlmacenarDatos
  recorra el arreglo tomando cada valor y convirtiendolo a su numero binario correspondiente, debera presentar
  en una pantalla emergente la lista de valores capturados y la lista de los valores binarios*/
     }}

    