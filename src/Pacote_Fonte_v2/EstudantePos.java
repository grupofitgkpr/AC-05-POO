/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pacote_Fonte_v2;

/**
 *
 * @author PedroHODL
 */
public class EstudantePos extends Estudante {
    private String tema;
    private String orientador;
    
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
        return super.getTotalCreditos();
    }
    
    @Override
    public String lista() {
        return super.lista() + " | Tema: " + tema + " | Orientador: " + orientador;
    }
    
    @Override
    public String lista2() {
        return super.lista2() + " | Tema: " + tema + " | Orientador: " + orientador;
    }
}
