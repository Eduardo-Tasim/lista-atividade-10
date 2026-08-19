package br.com.techcorp.model;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ControleDeAcesso {
    private List<String> historicoCatraca = new ArrayList<>();
    
    private void registrarAcesso(funcionario f){
        funcionario funcionario = new funcionario();
        funcionario.setMatricula(f.getMatricula());
        historicoCatraca.addAll((Collection<? extends String>) funcionario.getMatricula());
    }
}
