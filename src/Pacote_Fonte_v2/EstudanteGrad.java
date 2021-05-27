package Pacote_Fonte_v2;

import java.util.ArrayList;

public class EstudanteGrad extends Estudante {
    private final int horasAtividades;
    
    public EstudanteGrad(long id, String nome, String email, int horasAtividades) {
        super(id, nome, email);
        this.horasAtividades = horasAtividades;
    }
    
    public int getHoras() {
        return horasAtividades;
    }
    
    @Override
    public int getTotalCreditos(){
        int soma = horasAtividades;
        ArrayList<Disciplina> disciplinas = this.getDisciplinasMatriculadas();
        for (Disciplina disciplina : disciplinas){
            soma += disciplina.getCreditos();
        }
        return soma;
    }
    
    @Override
    public String lista() {
        return "Id: " + id + " | Nome: " + nome + " | Créditos: " 
                + this.getTotalCreditos() + " | AC: " + horasAtividades + " horas";
    }
    
    @Override
    public String lista2() {
        return "Id: " + id + " | Nome: " + nome + " | Créditos: " + " | Email: " 
                + email + this.getTotalCreditos() + " | AC: " + horasAtividades + " horas";
    }
}
