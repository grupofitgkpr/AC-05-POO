/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pacote_Fonte_v1;

/**
 *
 * @author PedroHODL
 */
public class EstudanteGrad extends Estudante {
    private int horasAtividades;
    
    public EstudanteGrad(long id, String nome, String email, int horasAtividades) {
        super(id, nome, email);
        this.horasAtividades = horasAtividades;
    }
    
    public int getHoras() {
        return horasAtividades;
    }
    
    @Override
    public int getTotalCreditos(){
        return horasAtividades + super.getTotalCreditos();
    }
    
    @Override
    public String lista() {
        return super.lista() + " | AC: " + horasAtividades + " horas";
    }
    
    @Override
    public String lista2() {
        return super.lista2() + " | AC: " + horasAtividades + " horas";
    }
}
