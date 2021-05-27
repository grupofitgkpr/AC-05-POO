package Pacote_Fonte_v2;

import java.util.ArrayList;

public class Disciplina {

    // Atributos
    private String codigo;
    private int creditos;
    private ArrayList<Matricula> matriculas;

    // Construtores
    public Disciplina(String codigo, int creditos) {
        this.codigo = codigo;
        this.creditos = creditos;
        matriculas = new ArrayList<>();
    }
    
    // Métodos Públicos
    public void addMatricula(Matricula matricula) { // Adiciona uma matricula na lista de matriculas
        matriculas.add(matricula);
    }
    
    public ArrayList getEstudantesMatriculados() { // Retorna uma lista de estudantes matriculados
       ArrayList<Estudante> estudantesMatriculados = new ArrayList<>();
        for (Matricula matricula : matriculas) {
            Estudante estudante = matricula.getEstudante();
            estudantesMatriculados.add(estudante);
        }
        return estudantesMatriculados;
    }

    // Métodos Especiais
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public ArrayList<Matricula> getMatriculas() {
        return matriculas;
    }

    public void setMatriculas(ArrayList<Matricula> matriculas) {
        this.matriculas = matriculas;
    }

    public String lista() {
        return  "Código: " + this.getCodigo();
    }
}
