
package com.mycompany.contagemregressiva;

import java.util.Scanner;

/**
 *
 * @author Natã
 */
public class ContagemRegressiva {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
                
        int n = teclado.nextInt();
        
       /*PROGRESSIVO*/ for (int i=n; i<=100; i++){ 
       /*(int i=n; i>=1; i--) REGRESSIVO*/
            
            System.out.println(i);
            
        }
    }
}
