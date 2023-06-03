package ArrayUnidimensional;
import ArrayUnidimensional.Metodos;
import EntradaSalida.Tools;

import java.util.Arrays;
import java.util.Scanner;
 import java.util.regex.*;
import javax.swing.JOptionPane;
public class AlmacenarDatos {
   public Object datos [ ];
private byte i;//variable subindice
private int binario=0;
    public AlmacenarDatos(int num) {
        datos=new Object[num];
        i=-1;
    }
 public boolean arrayVacio()
 {
     return (i==-1);
 }
 public boolean esEspacio(){
     return (i<datos.length-1);
 }
 public void añadirDato(Object valor){
     if(esEspacio()){
         i++;
         datos[i]=valor;
     }else{
         System.out.println("Arreglo lleno");
     }//la i es un subindice que me permite llevar el control de lso datos incertados
 }
 public String imprimeDatosArray(){
     int j;String cad=" ";
     for(j=0; j<=i;j++){
         cad+=j + "["+datos[j]+"]\n";
     }return cad;
 }
 public String imprimePrimos(){
    int j; String cad=" ";
     for(j=0;j<i;j++){
    	 
Metodos.esPrimo((int)datos[j ]);
cad+=datos[j]+"]\n";
 }
       return cad;
 }
 public  int convertirABinario(int valor){
         binario=(int)valor%2;
         valor=(int)valor/2;
       return binario;
     }
 public void imprimeTriangulos(){
     
 }
 
 public  String imprimeFrecuencia(){
String cad =""; byte n = 0;
            for (int i = 1; i < n; i++) {
                cad+="*";
            }
            return cad;

 } 
 public int sumaDeDigitos(int valor){ int suma=0;
     for(int j=0;j<valor;j++){
     suma+=(int)datos[i]%10; 
      valor/=10;
     
     }
       return suma;
 } 
public void ordenarBurbuja(){
  Object aux;

    byte k,f;
    for(k=0; k<i; k++)
    for(f=(byte)(k+1); f<i;f++){
      if((int)datos[k]>(int)datos[f]){
          aux=datos[k];
          datos[k]=datos[f];
          datos[f]=aux;
      }
    }
}
public void altura(){
Scanner sc = new Scanner(System.in);

     int i, N;
        int contMas = 0, contMenos = 0;
        double media = 0;
      do{
N=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero de personas: "));
                                                          

        }while(N<=0);
       double[] alto = new double[N];
        for (i = 0; i < N; i++) {
alto[i]=Double.parseDouble(JOptionPane.showInputDialog(null, "estatura persona " + (i+1) + " = "));
  
            media = media + alto[i];
    
}media = media / N;
for (i = 0; i < alto.length; i++) {
            if (alto[i] > media){ //si la estatura es mayor que la media
                contMas++;
            } else if (alto[i] < media){ //si es menor
                contMenos++;
            }
        }

JOptionPane.showMessageDialog(null, "Estatura media: "+media);
JOptionPane.showMessageDialog(null, "Estatura superior a la media: "+contMas);
JOptionPane.showMessageDialog(null, "Estatura inferior a la media: "+contMenos);
}
public void cadena(){
	String Acu="";
     int i, N;
 do{
N=Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el tamaño del array: "));
                                                          

        }while(N<=0);  
   String[] cadena = new String[N];
    for (i = 0; i < N; i++) {
cadena[i]=JOptionPane.showInputDialog(null, "Ingrese una cadena");
    Acu="\n"+cadena[i];
  for (int j = cadena.length - 1; j >= 0 ; j--) {
        }}JOptionPane.showMessageDialog(null, Arrays.toString(cadena));
    
    
}
public void taxista(){ int dia=0; int pagoTotal=0;
    int pago=0,x=0,promedio=0,total=0;
    int[] array = new int[31];
     int mayor = 0;
     for (i = 1; i <=30; i++){
         pago=0;
     array[i]=  Integer.parseInt(JOptionPane.showInputDialog(null, 
             "Dia "+i+" Digite el numero de viajes que ha realizado"));  
    if(array[i]<10){
        pago=array[i]*1500;
     }
     else if(array[i]>=11 && array[i]<=30){
        pago=array[i]*3500;
     }
     else {
        pago=array[i]*5000;
     }
    
     for ( x = 1; x < array.length; x++) {
	if (array[x] > mayor) {
	mayor = array[x];
        dia=x;
	}}

     total+=array[i];
    pagoTotal+=pago;
JOptionPane.showMessageDialog(null, "El pago en el dia: "+array[i]+" fue "+pago);

     } promedio=total/3;
JOptionPane.showMessageDialog(null, "El promedio de viajes fue: "+promedio);
JOptionPane.showMessageDialog(null, "El dia en que mas viajes hizo fue el: "+dia+" Con "+mayor+" viajes hechos");
JOptionPane.showMessageDialog(null, "El pago total del mes fue: "+pagoTotal);
}
}
