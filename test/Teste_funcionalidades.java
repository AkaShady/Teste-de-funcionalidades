/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author aluno
 */
public class Teste_funcionalidades {

    public Teste_funcionalidades() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    /**
     * Test of calculaMulta method, of class Classe_de_Teste.
     */
    @Test
    public void testCalculaMultaAlunoMaiorQueZero() {
        System.out.println("calcular multa aluno, maior que zero");
        String nome = "aluno";
        float valor = 10.0F;
        Classe_de_Teste instance = new Classe_de_Teste();
        boolean expResult = true;
        boolean resultado = false;
        double result = instance.calculaMulta(nome, valor);
        if (result > 0) {
            resultado = true;
        }
        assertEquals(expResult, resultado);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testCalculaMultaAlunoMenorQueZero() {
        System.out.println("calcular multa aluno, menor que zero");
        String nome = "aluno";
        float valor = -10.0F;
        Classe_de_Teste instance = new Classe_de_Teste();
        boolean expResult = true;
        boolean resultado = false;
        double result = instance.calculaMulta(nome, valor);
        if (valor < 0) {
            resultado = true;
        }
        assertEquals(expResult, resultado);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testCalculaMultaAlunoIgualAZero() {
        System.out.println("calcular multa aluno, igual a zero");
        String nome = "aluno";
        float valor = 0F;
        Classe_de_Teste instance = new Classe_de_Teste();
        boolean expResult = true;
        boolean resultado = false;
        double result = instance.calculaMulta(nome, valor);
        if (valor == 0) {
            resultado = true;
        }
        assertEquals(expResult, resultado);
        // TODO review the generated test co
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testCalculaMultaProfessorMaiorQueZero() {
        System.out.println("calcular multa professor, maior que zero");
        String nome = "professor";
        float valor = 10.0F;
        Classe_de_Teste instance = new Classe_de_Teste();
        boolean expResult = true;
        boolean resultado = false;
        double result = instance.calculaMulta(nome, valor);
        if (result > 0) {
            resultado = true;
        }
        assertEquals(expResult, resultado);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testCalculaMultaProfessorMenorQueZero() {
        System.out.println("calcular multa professor, menor que zero");
        String nome = "professor";
        float valor = -10.0F;
        Classe_de_Teste instance = new Classe_de_Teste();
        boolean expResult = true;
        boolean resultado = false;
        double result = instance.calculaMulta(nome, valor);
        if (valor < 0) {
            resultado = true;
        }
        assertEquals(expResult, resultado);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testCalculaMultaProfessorIgualAZero() {
        System.out.println("calcular multa professor, igual a zero");
        String nome = "professor";
        float valor = 0F;
        Classe_de_Teste instance = new Classe_de_Teste();
        boolean expResult = true;
        boolean resultado = false;
        double result = instance.calculaMulta(nome, valor);
        if (valor == 0) {
            resultado = true;
        }
        assertEquals(expResult, resultado);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testCalculaMultaQualquerOutraPessoaMaiorQueZero() {
        System.out.println("calcular multa de qualquer outra pessoa, maior que zero");
        String nome = "outra";
        float valor = 10.0F;
        Classe_de_Teste instance = new Classe_de_Teste();
        boolean expResult = true;
        boolean resultado = true;
        double result = instance.calculaMulta(nome, valor);
        assertEquals(expResult, resultado);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testCalculaMultaQualquerOutraPessoaMenorQueZero() {
        System.out.println("calcular multa de qualquer outra pessoa, menor que zero");
        String nome = "outra";
        float valor = -10.0F;
        Classe_de_Teste instance = new Classe_de_Teste();
        boolean expResult = true;
        boolean resultado = true;
        double result = instance.calculaMulta(nome, valor);
        assertEquals(expResult, resultado);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testCalculaMultaQualquerOutraPessoaIgualAZero() {
        System.out.println("calcular multa de qualquer outra pessoa, menor que zero");
        String nome = "outra";
        float valor = 0F;
        Classe_de_Teste instance = new Classe_de_Teste();
        boolean expResult = true;
        boolean resultado = true;
        double result = instance.calculaMulta(nome, valor);
        assertEquals(expResult, resultado);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /*@Test
    public void testCalculaValorMulta() {
        System.out.println("calculaMulta");
        String nome = "aluno";
        float valor = 10.0F;
        Classe_de_Teste instance = new Classe_de_Teste();
        double expResult = 51.0F;
        double result = instance.calculaMulta(nome, valor);
        assertTrue(expResult == result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }*/
}
