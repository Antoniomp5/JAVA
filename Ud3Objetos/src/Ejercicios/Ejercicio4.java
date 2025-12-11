/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

/**
 *
 * @author 05_1DAW_Alum
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        short max = Short.MAX_VALUE;   // 32767
        short min = Short.MIN_VALUE;   // -32768

        System.out.println("Valor máximo del tipo short: " + max);
        System.out.println("Valor mínimo del tipo short: " + min);

        short siguiente = (short) (max + 1);

        System.out.println("Valor de max + 1: " + siguiente);

        if (siguiente == min) {
            System.out.println("El tipo short se comporta de forma cíclica.");
        } else {
            System.out.println("El tipo short NO se comporta de forma cíclica.");
        }
    }

}
    

