package br.inatel.exc;
import br.inatel.comp.Computador;

public class Cliente {
    private String nome;
    private String cpf;

    public Computador[] computadores = new Computador[10];

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public float calculaTotalCompra(){
        float total = 0;
        for(int i = 0; i < computadores.length; i++){
            if(computadores[i] != null) {
                total += computadores[i].getPreco();
            }
        }
        return total;
    }
    public String getNome(){
        return nome;
    }
    public String getCpf(){
        return cpf;
    }
}
