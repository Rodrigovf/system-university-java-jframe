package trabalho;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mari Caramello
 */
public class Disciplina {
    private int codigoDisciplina,qtdCredito;
    private String nomeDisciplina;
    static private double valorCredito;
    
    
    public Disciplina (){
        
    }
    public Disciplina (int codigoDisciplina, int qtdCredito, String nomeDisciplina){
        this.codigoDisciplina = codigoDisciplina;
        this.qtdCredito = qtdCredito;
        this.nomeDisciplina = nomeDisciplina;
        
    }
    
    
    public int getCodigoDisciplina(){
        return codigoDisciplina;
    }
    public void setCodigoDisciplina(int codigoDisciplina){
        this.codigoDisciplina = codigoDisciplina;
    }
    
    
    public int getQtdCredito(){
        return qtdCredito;
    }
    public void setQtdCredito(int qtdCredito){
        this.qtdCredito = qtdCredito;
    }
    
    
    public String getNomeDisciplina(){
        return nomeDisciplina;
    }
    public void setNomeDisciplina (String nomeDisciplina){
        this.nomeDisciplina = nomeDisciplina;
    }
    
    
    public static double getvCredito(){
        return valorCredito;
    }
    public static void setvCredito(double valorCredito){
        Disciplina.valorCredito = valorCredito;
    }
    
 
    @Override
    public String toString() {
        return "Código: " + getCodigoDisciplina() + "  Dsciplina: " + getNomeDisciplina() + "  Qtd. Crédito: " +getQtdCredito()+ "  Valor Crédito: " + getvCredito();
    }
}

