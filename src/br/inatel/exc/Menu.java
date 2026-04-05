package br.inatel.exc;

import br.inatel.comp.Computador;
import br.inatel.comp.HardwareBasico;
import br.inatel.comp.MemoriaUSB;
import java.util.Scanner;

public class Menu {

    public void inicioCompra(Cliente cliente) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite sua matricula: ");
        float mat = sc.nextFloat();

        // PC 1
        HardwareBasico[] h1 = {
                new HardwareBasico("Pentium Core i3", 2200),
                new HardwareBasico("Memoria RAM", 8),
                new HardwareBasico("HD", 500)
        };
        Computador pc1 = new Computador("Apple", mat, "macOS Sequoia", 64, h1);
        pc1.addMemoriaUSB(new MemoriaUSB("Pendrive", 16));

        //PC 2
        HardwareBasico[] h2 = {
                new HardwareBasico("Pentium Core i5", 3370),
                new HardwareBasico("Memoria RAM", 16),
                new HardwareBasico("HD", 1000)
        };
        Computador pc2 = new Computador("Samsung", mat + 1234, "Windows 8", 64, h2);
        pc2.addMemoriaUSB(new MemoriaUSB("Pen-drive", 32));

        //PC 3
        HardwareBasico[] h3 = {
                new HardwareBasico("Pentium Core i7", 4500),
                new HardwareBasico("Memoria RAM", 32),
                new HardwareBasico("HD", 2000)
        };
        Computador pc3 = new Computador("Dell", mat + 5678, "Windows 10", 64, h3);
        pc3.addMemoriaUSB(new MemoriaUSB("HD Externo", 1000));

        int op = -1;
        int pos = 0;

        while (op != 0) {
            System.out.println("1- Apple | 2- Samsung | 3- Dell | 0- Sair");
            System.out.print("Escolha: ");
            op = sc.nextInt();

            if (op == 0) {
                System.out.println("Finalizando...");
            } else if (pos >= cliente.computadores.length) {
                System.out.println("Carrinho cheio!");
            } else if (op == 1) {
                cliente.computadores[pos] = pc1;
                System.out.println("PC Apple adicionado!");
                pos++;
            } else if (op == 2) {
                cliente.computadores[pos] = pc2;
                System.out.println("PC Samsung adicionado!");
                pos++;
            } else if (op == 3) {
                cliente.computadores[pos] = pc3;
                System.out.println("PC Dell adicionado!");
                pos++;
            } else {
                System.out.println("Opcao invalida!");
            }
        }
        sc.close();
    }
}