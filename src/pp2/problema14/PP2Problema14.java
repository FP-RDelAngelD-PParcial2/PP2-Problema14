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
        //Declaracion de matriz
        int[][]tabla= new int [7][7];
        mostrarTabla(llenarTabla(tabla));
    }
    public static int[][] llenarTabla(int[][]a){
        for (int i=0; i<a.length; i++){ //aumenta i una vez
            for (int j=0; j<a.length; j++){ //aumenta j una vez (hasta llegar al tamaño de la matriz)
                if(i==j){//Si es que i es igual a j en el aumento
                    a[i][j]=1; //La posicion [i][j] sera 1
                }else{ //Sino
                    a[i][j]=0; //La posicion [i][j] sera 0
                                    //Ejemplo, al iniciar i es 0 y j es 0; i==j; osea 0==0; entonces a[0][0] sera 1
                                    //Al seguir j es 1; i==j; osea 0==1; entonces es falso y a[0][1] sera 0
                                    //Al seguir j es 2; i==j; osea 0==2; entonces es falso y a[0][2] sera 0
                                    //Cuando j llegue a el tamaño de la matriz(7) saldra y regresara a i
                                    //i sera 1 y j sera 0; i==j; osea 1==0; entonces es falso y a[1][0] sera 0
                                    //Al seguir j es 1; i==j; osea 1==1; entonces es verdadero y a[1][1] sera 1
                }
            }
        }
       return a; //Regresa la matriz
    }
    public static void mostrarTabla(int [][]b){
        for(int i=0; i<b.length; i++){ //Mientras que i sea menor que el tamaño de la matriz
         for(int j=0; j<b.length; j++){ //Mientras que j sea menor al tamaño de la amtriz
              System.out.print(b[i][j]); //Se imprimie el valor de la posicion [i][j]
                                         //Por ejemplo, i sera 0 y j sera 0, el programa imprimira
                                         //lo que hay en la posicion [0][0] que es 1 y seguira
         }
       }      
    }
}
