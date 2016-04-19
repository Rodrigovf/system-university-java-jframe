package trabalho;

public class Turma {

    private int numeroTurma, quantVagas, idDia;
    private String  idTurno; //horario;
    private String disciplina;

    public Turma() {
    }

   
    public Turma(int numeroTurma, int quantVagas, String idTurno, String disciplina) {
        this.numeroTurma = numeroTurma;
        this.quantVagas = quantVagas;
        this.idTurno = idTurno;
        this.disciplina = disciplina;
    }
    
//    public int getIDdia() {
//        return idDia;
//    }
//
//    public void setIDdia(int idDia) {
//        this.idDia = idDia;
//    }
    
    public String getIDturno() {
        return idTurno;
    }

    public void setIDturno(String idTurno) {
        this.idTurno = idTurno;
    }

    public int getNumeroTurma() {
        return numeroTurma;
    }

    public void setNumeroTurma(int numeroTurma) {
        this.numeroTurma = numeroTurma;
    }

    public int getQuantVagas() {
        return quantVagas;
    }

    public void setQuantVagas(int quantVagas) {
        this.quantVagas = quantVagas;
    }

//    public String getHorario() {
//        return horario;
//    }
//
//    public void setHorario(String horario) {
//        this.horario = horario;
//    }
     public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
    
     public String toString() {
        return "Código= " + getNumeroTurma() + ", Qtd.vagas= " + getQuantVagas() + ", horário da turma= " + getIDturno()+", disciplina= "+getDisciplina();
    }

   

   

   

}
