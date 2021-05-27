package Pacote_Fonte_v2;

import java.util.ArrayList;

public abstract class Estudante {

    // Atributos
    protected long id;
    protected String nome;
    protected String email;
    protected ArrayList<Matricula> matriculas;

    // Construtores
    public Estudante(long id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        matriculas = new ArrayList<>();
    }

    // Métodos Públicos
    public void addMatricula(Matricula matricula) { // Adiciona uma matricula na lista de matriculas
        matriculas.add(matricula);
    }

    public ArrayList getDisciplinasMatriculadas() {
        ArrayList<Disciplina> disciplinasMatriculadas = new ArrayList<>();
        for (Matricula matricula : matriculas) {
            Disciplina disciplina = matricula.getDisciplina();
            disciplinasMatriculadas.add(disciplina);
        }
        return disciplinasMatriculadas;
    }

    // Métodos Especiais
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Matricula> getMatriculas() {
        return matriculas;
    }

    public void setMatriculas(ArrayList<Matricula> matriculas) {
        this.matriculas = matriculas;
    }
    
    public abstract int getTotalCreditos();
    
    public abstract String lista();
    
    public abstract String lista2();
}
