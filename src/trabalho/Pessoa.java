package trabalho;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author adm
 */
public class Pessoa {
    private int codigo;
    private String nome, curso;

    public Pessoa() {
    }

    public Pessoa(int codigo, String nome, String curso) {
        this.codigo = codigo;
        this.nome = nome;
        this.curso = curso;
    }
    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getCurso() {
        return curso;
    }

    
    @Override
    public String toString() {
        return "Codigo=" + codigo + ", nome=" + nome + ", curso=" + curso;
    }
}
