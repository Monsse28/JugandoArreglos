/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package itszn.edu.mx.jugandoarreglos;

/**
 *
 * @author monss
 */
public class JugandoArreglos {

    public static void main(String[] args) {
        operacionesArreglos op = new operacionesArreglos();

        float[] pesos = {12f, 45f, 3.5f};

        // Suma
        float sum = op.calcularSuma(pesos);
        System.out.println("La suma es: " + sum);

        // Promedio
        float promedio = op.calcularPromedio(pesos);
        System.out.println("El promedio es: " + promedio);
        
        // Cantidad de elementos que exceden el límite
        int mayores = op.contarMayoresQue(pesos, 10f);
        System.out.println("Cantidad de elementos mayores que el límite: " + mayores);
        
        // Arreglo invertido
        float[] invertido = op.invertirArreglo(pesos);
        System.out.println("Arreglo invertido:");
        for (float n : invertido) {
            System.out.println(n);
        }

        // Arreglo con valores absolutos
        float[] absolutos = op.obtenerAbsolutos(pesos);
        System.out.println("Arreglo con valores absolutos:");
        for (float n : absolutos) {
            System.out.println(n);
        }
    }
}


    
       

    


