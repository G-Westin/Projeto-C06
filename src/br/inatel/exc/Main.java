package br.inatel.exc;

import br.inatel.comp.Computador;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Gabriel Westin", "093.182.276-98");
        new Menu().inicioCompra(cliente);

        System.out.println("=== SEU PEDIDO: ===");
    System.out.println("Cliente: " + cliente.getNome() + " || CPF: " + cliente.getCpf());
    System.out.println();
        for (int i = 0; i < cliente.computadores.length; i++) {
            if (cliente.computadores[i] != null) {
                cliente.computadores[i].mostraPCConfigs();
            }
        }
        System.out.println();
        System.out.println("Total: R$ " + cliente.calculaTotalCompra());
        ProcessarPedido.processar(cliente.computadores);
    }
}