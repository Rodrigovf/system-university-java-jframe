package trabalho;


import trabalho.Pessoa;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 114905910
 */
public class Professor extends Pessoa {

    private int cargaHsemanal;
    private double valorHoraAula;
    //double salario;
    boolean coordenador;

    public Professor() {
    }

    public Professor(int cargaHsemanal, double valorHoraAula, int codigo, String nome, String curso,boolean coordenador) {
        super(codigo, nome, curso);
        this.cargaHsemanal = cargaHsemanal;
        this.valorHoraAula = valorHoraAula;
        //this.salario = salario;
        this.coordenador = coordenador;
    }
    
    public boolean getCoordenador(){
        return coordenador;
    }
    public void setCoordenador(boolean coordenador){
        this.coordenador = coordenador;
    }

//    public double getSalario() {
//        return salario;
//    }
//
//    public void setSalario(double salario) {
//        this.salario = salario;
//    }
    
    public int getCargaHsemanal() {
        return cargaHsemanal;
    }

    public double getValorHoraAula() {
        return valorHoraAula;
    }

    public void setCargaHsemanal(int cargaHsemanal) {
        this.cargaHsemanal = cargaHsemanal;
    }

    public void setValorHoraAula(double valorHoraAula) {
        this.valorHoraAula = valorHoraAula;
    }

    public double calculaSalario() {
       return  cargaHsemanal * valorHoraAula;
        
    }

//    @Override
//    public String toString() {
//        return "CargaHsemanal=" + cargaHsemanal + ", valorHoraAula=" + valorHoraAula+", salário="+salario+", coordenador="+coordenador;
//    }

    @Override
    public String toString() {
        return super.toString()+"cargaHsemanal=" + cargaHsemanal + ", valorHoraAula=" + valorHoraAula + ", coordenador=" + coordenador ;
    }
    

}
