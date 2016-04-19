package trabalho;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 114905910
 */
public class Aluno extends Pessoa {
  
  private int anoIgresso;
  private String tipoIngresso;
    

    public Aluno() {
    }
    
    public Aluno(int anoIgresso, String tipoIngresso, int codigo, String nome, String curso) {
        super(codigo, nome, curso);
        this.anoIgresso = anoIgresso;
        this.tipoIngresso = tipoIngresso;
    }

    public int getAnoIgresso() {
        return anoIgresso;
    }

    public String getTipoIngresso() {
        return tipoIngresso;
    }

    public void setAnoIgresso(int anoIgresso) {
        this.anoIgresso = anoIgresso;
    }

    public void setTipoIngresso(String tipoIngresso) {
        this.tipoIngresso = tipoIngresso;
    }

    @Override
    public String toString() {
        return super.toString()+ "AnoIgresso=" + anoIgresso + ", tipoIngresso=" + tipoIngresso;
    }
    
    

    
    

    
    

}

   