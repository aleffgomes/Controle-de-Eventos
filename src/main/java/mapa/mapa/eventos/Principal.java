/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package mapa.mapa.eventos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alefp
 * Média numeros impares
 */
public class Principal {
  
    public static void main(String[] args) {

        List<String> lista = new ArrayList<>();
        int start = 1;
        int last = 1000;
        int sum = 0;
        int count = 0;

        while (start <= last) {
            if (start % 2 != 0) {
                sum += start;
                count++;
            }
            start++;
        } 

        System.out.println("Soma dos numeros ímpares: " + sum);
        System.out.println("Quantidade de numeros ímpares: " + count);
        System.out.println("Média sob numeros ímpares: " + (sum / count));  
        System.out.println("Média sob todos os numeros: " + (sum / last)); 
        
        return;    
    }
}
