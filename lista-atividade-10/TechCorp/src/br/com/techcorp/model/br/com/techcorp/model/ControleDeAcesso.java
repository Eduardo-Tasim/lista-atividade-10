package br.com.techcorp.model;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Collection;
import java.util.List;

public class ControleDeAcesso {
    private List<String> historicoCatraca = new ArrayList<>();
    private HashSet<String> autorizadosSalaSegura = new HashSet<>();
    
    private void registrarAcesso(funcionario f){
        historicoCatraca.add(f.getMatricula());
    }

    private void concederAcessoSala(funcionario funcionario){
        boolean conseguiuInserir = autorizadosSalaSegura.add(funcionario.getMatricula());

        if(conseguiuInserir){
            System.out.println("Acesso liberado para a Sala Segura.");
        } else{
            System.out.println("Aviso: Matrícula já registrada na sala. Acesso não permitido.");
        }
    }
}
