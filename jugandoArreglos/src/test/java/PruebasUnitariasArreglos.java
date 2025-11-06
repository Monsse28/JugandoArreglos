/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import itszn.edu.mx.jugandoarreglos.operacionesArreglos;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author monss
 */
public class PruebasUnitariasArreglos {
    
    public PruebasUnitariasArreglos() {
    }
    
    /**
     *
     * @throws Exception
     */

    
    private operacionesArreglos opa;
    @BeforeEach
    public void setUp() {
        opa=new operacionesArreglos();
    }
    

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void pruebaSuma1(){
        float[] entrada={10f,15f,10f};
        float salidaEsperada=35f;
        
        float salidaReal=opa.calcularSuma(entrada);
        
        assertEquals(salidaEsperada,salidaReal);
    }
    
    @Test
    public void pruebaSuma2nulo(){
        float[] entrada=null;
        float salidaEsperada=0f;
        
        float salidaReal=opa.calcularSuma(entrada);
        
        assertEquals(salidaEsperada,salidaReal);
    }
    @Test
    public void pruebasPromedio(){
        operacionesArreglos opa = new operacionesArreglos();
    float[] entrada = {10f, 15f, 5f};
    float salidaEsperada = 10f;

    float salidaReal = opa.calcularPromedio(entrada);

    assertEquals(salidaEsperada, salidaReal, 0.001);
        
    }
    
    @Test
    public void pruebasContarMayoresQue(){
        operacionesArreglos opa = new operacionesArreglos();
    float[] entrada = {5f, 12f, 8f, 20f};
    float limite = 10f;
    int salidaEsperada = 2;

    int salidaReal = opa.contarMayoresQue(entrada, limite);

    assertEquals(salidaEsperada, salidaReal);
    }
    
    @Test
    public void pruebasInvertirArreglo(){
         operacionesArreglos opa = new operacionesArreglos();
    float[] entrada = {1f, 2f, 3f, 4f};
    float[] salidaEsperada = {4f, 3f, 2f, 1f};

    float[] salidaReal = opa.invertirArreglo(entrada);

    assertArrayEquals(salidaEsperada, salidaReal, 0.001f);
    }
    
    @Test
    public void pruebasObtenerAbsoluto(){
        operacionesArreglos opa = new operacionesArreglos();
    float[] entrada = {-5f, 3f, -10f, 0f};
    float[] salidaEsperada = {5f, 3f, 10f, 0f};

    float[] salidaReal = opa.obtenerAbsolutos(entrada);

    assertArrayEquals(salidaEsperada, salidaReal, 0.001f);
    }
}
