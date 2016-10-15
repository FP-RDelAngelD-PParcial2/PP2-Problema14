/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.problema14;
/**
 *
 * @author PC
 */
public class PP2Problema14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][]tabla= new int [7][7];
        tabla=llenarTabla(tabla);
        mostrarTabla(tabla);
    }
    public static int[][] llenarTabla(int[][]a){
        for (int i=0; i<a.length; i++){ //aumenta i una vez
            for (int j=0; j<a.length; j++){ //aumenta j una vez (hasta llegar al tamaño del arreglo)
                if(i==j){
                    a[i][j]=1;
                }else{
                    a[i][j]=0;
                }
            }
        }
       return a;
    }
    public static void mostrarTabla(int [][]b){
        for(int i=0; i<b.length; i++){
         for(int j=0; j<b.length; j++){ 
              System.out.print(b[i][j]); 
         }
       }      
    }
}
