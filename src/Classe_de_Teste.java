/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class Classe_de_Teste {
    public double calculaMulta(String nome, float valor){
        double multa = 0;
        if(nome.equalsIgnoreCase("aluno")){
            multa = 0.10 * valor + 50;
        }
        
        if(nome.equalsIgnoreCase("professor")){
            multa = 0.20 * valor + 60;
        }
        
        if (multa < 0) 
            multa = 0;
        
        
        if (multa > 1000) 
            multa = 500;
        
        return multa;
    }
}
