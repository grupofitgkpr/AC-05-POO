package Pacote_Fonte_v2;

import java.util.ArrayList;

public class EstudantePos extends Estudante {
    private final String tema;
    private final String orientador;
    
    public EstudantePos(long id, String nome, String email, String tema, String orientador) {
        super(id, nome, email);
        this.tema = tema;
        this.orientador = orientador;
    }
    
    public String getTema() {
        return tema;
    }
    
    public String getOrientador() {
        return orientador;
    }
    
    @Override
    public int getTotalCreditos(){
        int soma = 0;
        ArrayList<Disciplina> disciplinas = this.getDisciplinasMatriculadas();
        for (Disciplina disciplina : disciplinas){
            soma += disciplina.getCreditos();
        }
        return soma;
    }
    
    @Override
    public String lista() {
        return "Id: " + id + " | Nome: " + nome + " | Créditos: " 
                + this.getTotalCreditos() + " | Tema: " + tema + " | Orientador: " + orientador;
    }

    @Override
    public String lista2() {
        return "Id: " + id + " | Nome: " + nome + " | Email: " + email 
                + " | Créditos: " + getTotalCreditos() + " | Tema: " + tema + " | Orientador: " + orientador;
    }
}
