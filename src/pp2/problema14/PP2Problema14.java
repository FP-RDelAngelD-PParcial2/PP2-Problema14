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
    public static int[][] llenarTabla(int[][]tabla){
        for (int i=0; i<10; i++){ //aumenta i una vez
            for (int j=0; j<10; j++){ //aumenta j una vez (hasta llegar a 10)
                tabla[i][j]=i*j;
            }
        }
       return tabla;
    }
    public static void mostrarTabla(int [][]b){
        for(int i=0; i<10; i++){
         for(int j=0; j<10; j++){ 
              System.out.print(i + "x" + j + "=" + b[i][j] + "\n"); 
         }
       }      
    }
}
