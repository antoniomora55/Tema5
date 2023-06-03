
package ArrayBidimensional;
import javax.swing.JOptionPane;
public class ValoresConstantes {  
    public static void main(String[] args) {
        ValoresConstantes obj=new ValoresConstantes();
        obj.imprimirMatrizOrdenada();
    }
   private byte i,j;
   public int matriz2[ ][ ]={{18,-3,14},{35,4,20},{4,-16,70},{24,3,10}};
//public int matriz3=new matriz3[ 4][3 ];
     public String imprimirMatriz(){ String cad="";
        for(byte k=(byte) (i+1);k<matriz2.length;k++){
            for(byte l=(byte)(j+1);l<matriz2[0].length;l++){
                 cad+="\t   " +matriz2[k][l];
            }cad+="\n";
        }
    return cad;
     }
     
     public void imprimirMatrizOrdenada(){
               int aux;
        
        for(int k=0;k<matriz2.length;k++){
            for(int f=0;f<=matriz2[k].length-2;f++){
                if(matriz2[k][f]>matriz2[k][f+1]){
                    aux=matriz2[k][f+1];
                    matriz2[k][f+1] = matriz2[k][f];
                    matriz2[k][f] = aux;
                }
            }
        }
        
        for(int l=0; l<matriz2.length;l++){
            for(int m=0; m<matriz2[l].length;m++){
                System.out.print(matriz2[l][m]+" ");
            }
            System.out.println();
        }
     }
}

//Diseñar un metodo que permita visualisar los datos de
//una matriz llamada matriz2 que almacena valores constantes, debera de imprimir la matriz original y la matriz con datos ordenados