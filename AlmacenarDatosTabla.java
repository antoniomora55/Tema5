package ArrayBidimensional;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class AlmacenarDatosTabla {
    public Object matriz[ ][ ]; 
    int dato=1;
    private byte i,j; //i filas y j columnas
    public AlmacenarDatosTabla(int m, int n){
        matriz = new Object[m][n];
        i=-1; j=-1;
    }

    public boolean matrizVacia(){
     return (i==-1 && j==-1);}
    
    public boolean isEspacioMatriz(){
        return(i<matriz.length-1 && j<matriz[0].length-1);}   
    
    public void añadirDato(Object valor) {
        if(isEspacioMatriz()){
        for(byte k=(byte) (i+1);k<matriz.length;k++){
                for(byte l=(byte)(j+1);l<matriz[0].length;l++){
         matriz[i][j]=(Object[]) valor;

                }}
     }else{
         System.out.println("matriz llena");
    }


}
    public void leerXFilas(){
        if(isEspacioMatriz()){
            for(byte k=(byte) (i+1);k<matriz.length;k++){
                for(byte l=(byte)(j+1);l<matriz[0].length;l++){
                matriz[k][l]=dato;
                }} byte k = 0, l=0; i=k;j=l;
        }}
    public String verMatriz(){ String cad="";
        for(byte k=(byte) (i+1);k<matriz.length;k++){
                for(byte l=(byte)(j+1);l<matriz[0].length;l++){
                cad+="\t   " +matriz[k][l];
                }cad+="\n";}
        return cad;
    }
    
    
    
    public void diagonalPrincipalSuma(){
        int diagonalPrincipal[]=new int[matriz.length];
       for(byte k=(byte) (i+1);k<matriz.length;k++){
                for(byte l=(byte)(j+1);l<matriz[0].length;l++){
              if(i==j){
                  diagonalPrincipal[i]=(int) matriz[i][j];
                  int suma=0;
                   for(int elemento:diagonalPrincipal){
                       suma=suma+elemento;
                       JOptionPane.showMessageDialog(null, "Diagonal principal:\t"+suma);
                   }
              }
                }
           }}
    
    public void imprimeDiagonalInferior(){
         int diagonalInferior[]=new int[matriz.length];
 for(byte k=(byte) (i+1);k<matriz.length;k++){
                for(byte l=(byte)(j+1);l<matriz[0].length;l++){
              if(i>j){
                  diagonalInferior[i]=(int) matriz[i][j];
                  int suma=0;
                  for(int elemento:diagonalInferior){
                       JOptionPane.showMessageDialog(null, "Diagonal inferior:\t"+elemento);
                       suma=suma+elemento;}}}}}
    
    public double octal(int numero){
        int exp, digito;
        double octal;
        exp=0;
        octal=0;
        while(numero>=1){
                digito = numero % 8;           
                octal = octal + digito * Math.pow(10, exp);                                                   
                exp++;
                numero = numero/8;
        } return octal;
    }
}
//hacer matriz de 4x4 y obtener la suma de los elementos en la diagonal principal, en la diagonal principal i y j son iguales
//diseñar un metodo que tenga la suma de la diagonal principal de un arreglo bidimensional
//Diseñar un metodo que imprima solo los elementos de la diagonal inferior, la diagonal inferior es cuando la i es mayor a la j
//Diseñar un metodo que imprima los datos almacenados en un arreglo bidimensional y su recpectivo valor octal