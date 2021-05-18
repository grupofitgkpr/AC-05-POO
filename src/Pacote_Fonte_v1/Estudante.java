package Pacote_Fonte_v1;

import java.util.ArrayList;

public abstract class Estudante {

    // Atributos
    private long id;
    private String nome;
    private String email;
    private ArrayList<Matricula> matriculas = new ArrayList<>();

    // Construtores
    public Estudante(long id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
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
    
    public int getTotalCreditos() {
        int soma = 0;
        ArrayList<Disciplina> disciplinas = this.getDisciplinasMatriculadas();
        for (Disciplina disciplina : disciplinas){
            soma += disciplina.getCreditos();
        }
        return soma;
    }

    public String lista() {
        return  "Id: " + this.getId() + " | Nome: " + this.getNome() + " | Créditos: " + this.getTotalCreditos();
    }
    
    public String lista2() {
        return  "Id: " + this.getId() + " | Nome: " + this.getNome() + " | Email: " 
                + this.getEmail() + " | Créditos: " + this.getTotalCreditos();
    }
}
