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
public class Coordenador extends Professor{
    private int gratificacao;
    
    public Coordenador() {
    }

    public Coordenador(int gratificacao, int cargaHsemanal, double valorHoraAula,  int codigo, String nome, String curso, boolean coordenador) {
        super(cargaHsemanal, valorHoraAula, codigo, nome, curso, coordenador);
        this.gratificacao = gratificacao;
    }
  
    public double getGratificacao() {
        return gratificacao;
    }

    public void setGratificacao(int gratificacao) {
        this.gratificacao = gratificacao;
    }
    
    

    @Override
    public String toString() {
        return super.toString() + " adicional=" + gratificacao;
    }
    
     
    @Override
    public double calculaSalario(){        
        return super.calculaSalario() + super.calculaSalario()*gratificacao/100; 
    }
    

    
}
