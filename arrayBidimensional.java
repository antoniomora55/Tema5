package ArrayBidimensional;

public class arrayBidimensional {
    public static void main(String[] args) {
      int[ ][ ] elementos=new int[ 4][4 ];
    int ren=0;int col=0;
    do{
    col=0;
    do{
        elementos[ren][col]=(int)Math.random()*100;
        col++;
    }while(col<5);
    ren++;
    
}while(ren<5);  
for(int i=0;i<5;i++){
   for(int j=0;j<5;j++){
      System.out.println(elementos[i][j]+"  "); 
   } 
}System.out.println("/n");
        
    }

}
