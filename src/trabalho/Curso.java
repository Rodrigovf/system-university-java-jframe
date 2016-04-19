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
public class Curso {
    private int codigo, totalCargaH;
    private String nome, areaConhecimento;

    public Curso() {
    }
    
        
    public Curso(int codigo, int totalCargaH, String nome, String areaConhecimento) {
        this.codigo = codigo;
        this.totalCargaH = totalCargaH;
        this.nome = nome;
        this.areaConhecimento = areaConhecimento;
    }
        //GET E SET
    public int getCodigo() {
        return codigo;
    }

    public int getTotalCargaH() {
        return totalCargaH;
    }

    public String getNome() {
        return nome;
    }

    public String getAreaConhecimento() {
        return areaConhecimento;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setTotalCargaH(int totalCargaH) {
        this.totalCargaH = totalCargaH;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAreaConhecimento(String areaConhecimento) {
        this.areaConhecimento = areaConhecimento;
    }

    @Override
    public String toString() {
        return "\nCodigo=" + codigo + ", totalCargaH=" + totalCargaH + ", nome=" + nome + ", areaConhecimento=" + areaConhecimento;
    }
    
    
    
    
}
