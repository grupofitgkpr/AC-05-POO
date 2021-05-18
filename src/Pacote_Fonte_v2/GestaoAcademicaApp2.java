package Pacote_Fonte_v2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @authors
 *  Integrantes:                                    R.A: 
 *      Giovanni Assis Lopes			|   1903604
 *      Kaique Mantoanelli Silva		|   1903168
 *      Pedro Henrique Oliveira Dantas Lopes    |   1904007
 *      Rafael Serino Kiss			|   1903107
 */
public class GestaoAcademicaApp2 {
    public static void main(String[] args) {
        
        // Criação da Faculdade com base nos arquivos
        Faculdade faculdade = new Faculdade("Faculdade Fictícia");

        faculdade.carregarDadosArquivo("disciplinas.txt",
                                       "estudantes.txt",
                                       "matriculas.txt");
        
        while (true) { //Loop do Menu
            System.out.println("-------- Menu --------");
            Scanner input = new Scanner(System.in);
            System.out.println("[0] Encerrar programa\n"
                              +"[1] Lista informações dos alunos\n"
                              +"[2] Lista o código das disciplinas\n"
                              +"[3] Estudantes matriculados em X disciplina\n"
                              +"[4] Disciplinas matriculadas em X aluno\n"
                              +"Digite a opção desejada:");
            int opc = input.nextInt();
            
            switch (opc){
                case 0:
                    System.out.println("----- Fim do Programa -----");
                    System.exit(-1);
                    break;
                case 1:
                    listDeEstudantes(faculdade.getEstudantes());
                    break;
                case 2:
                    codDaDisciplina(faculdade.getDisciplinas());
                    break;
                case 3:
                    listarEstDisc(faculdade.getDisciplinas());
                    break;
                case 4:
                    listarDiscEst(faculdade.getEstudantes());
                    break;
                default:
                    System.out.println("Opção inválida");
            }
            System.out.println("");
        }
    }

    private static void listDeEstudantes(ArrayList<Estudante> estudantes) {
        // Iterar lista de alunos
        System.out.println("\n--- Lista de estudantes ---");
        for (Estudante estudante : estudantes)
            System.out.println(estudante.lista());
    }

    private static void codDaDisciplina(ArrayList<Disciplina> disciplinas) {
        // Iterar lista de disciplinas
        System.out.println("\n--- Lista de Disciplinas ---");
        for (Disciplina disciplina : disciplinas)
            System.out.println(disciplina.lista());
    }

    private static void listarEstDisc(ArrayList<Disciplina> disciplinas) {
        // Encontrar disciplina desejada
        Scanner input = new Scanner(System.in);
        Disciplina disciplina = null;
        while (disciplina == null) {
            System.out.println("\nDigite o código da disciplina (Case Sensitive): ");
            String opc = input.nextLine();
            disciplina = findDisciplinaByCodigo(opc, disciplinas);
            if (disciplina == null)
                System.out.println("Disciplina inválida");
        }
        
        // Encontrar e iterar lista de alunos que estão matriculados na disciplina
        ArrayList<Estudante> estudantes = disciplina.getEstudantesMatriculados();
        System.out.println("\n--- Lista de alunos da disciplina: " + disciplina.getCodigo() + " ---");
        
        for (Estudante estudante : estudantes)
            System.out.println(estudante.lista2());
        
        System.out.println("\nTotal de alunos: " + estudantes.size());
    }

    private static void listarDiscEst(ArrayList<Estudante> estudantes) {
        // Encontrar aluno desejada
        Scanner input = new Scanner(System.in);
        Estudante estudante = null;
        while (estudante == null){
            System.out.println("\nDigite o id do aluno: ");
            int opc = input.nextInt();
            estudante = findEstudanteById(opc, estudantes);
            if (estudante == null)
                System.out.println("Estudante inválido");
        }
        
        // Encontrar e iterar lista de disciplinas que o aluno esta matriculado
        ArrayList<Disciplina> disciplinas = estudante.getDisciplinasMatriculadas();
        System.out.println("\n--- Lista de Disciplinas do aluno: " + estudante.getNome() + " ---");
        
        for (Disciplina disciplina : disciplinas) {
            System.out.println(disciplina.lista() + " | Créditos: " + disciplina.getCreditos());
        }
        System.out.println("\nTotal de créditos do aluno: " + estudante.getTotalCreditos());
    }
    
    private static Estudante findEstudanteById(int id, ArrayList<Estudante> estudantes) {
        for (Estudante estudante : estudantes) {
            if (id == estudante.getId()) {
                return estudante; //estudante encontrado
            }
        }
        return null; //estudante não encontrado
    }

    private static Disciplina findDisciplinaByCodigo(String codigo, ArrayList<Disciplina> disciplinas) {
        for (Disciplina disciplina : disciplinas) {
            if (codigo.equals(disciplina.getCodigo())) {
                return disciplina;//disciplina encontrada
            }
        }
        return null;//disciplina não encontrada
    }
}
