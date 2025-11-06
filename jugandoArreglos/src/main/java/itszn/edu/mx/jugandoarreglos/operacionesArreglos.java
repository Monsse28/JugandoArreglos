/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package itszn.edu.mx.jugandoarreglos;

/**
 *
 * @author monss
 */
public class operacionesArreglos {
    public float calcularSuma(float [] num){
        if(num==null)
            return 0f;
        float suma=0f;
        //Recorrer arreglo
        for(int i = 0; i < num.length; i++){
            suma = suma + num[i];
            
        }
        return suma;
    }
    
    public float calcularPromedio(float[] num) {
    float suma = 0f;
    for (int i = 0; i < num.length; i++) {
        suma = suma + num[i];
    }
    float promedio = suma / num.length;
    return promedio;
    }

    public int contarMayoresQue(float[] num, float limite) {
        int contador = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] > limite) {
                contador++;
            }
        }
        return contador;
    }
    
    public float[] invertirArreglo(float[] num) {
        float[] invertido = new float[num.length];
        int j = 0;
        for (int i = num.length - 1; i >= 0; i--) {
            invertido[j] = num[i];
            j++;
        
        }
        return invertido;
}
    public float[] obtenerAbsolutos(float[] num) {
        float[] absolutos = new float[num.length];
        for (int i = 0; i < num.length; i++) {
            absolutos[i] = Math.abs(num[i]);
        }
        return absolutos;
    }
}