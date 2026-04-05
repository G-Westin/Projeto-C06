package br.inatel.comp;

public class Computador {
    private String marca;
    private float preco;
    private SistemaOperacional sistemaOperacional;
    private HardwareBasico[] hardwaresBasicos;
    private MemoriaUSB memoriaUSB;

    public Computador(String marca, float preco, String nomeSO, int tipoSO, HardwareBasico[] hardwares) {
        this.marca = marca;
        this.preco = preco;
        this.sistemaOperacional = new SistemaOperacional(nomeSO, tipoSO);
        this.hardwaresBasicos = hardwares;
    }

    public void mostraPCConfigs() {
        System.out.println("Marca: " + marca + " || Preco: R$" + preco);
        System.out.println("SO: " + sistemaOperacional.getNome() + " (" + sistemaOperacional.getTipo() + " bits)");

        for (int i = 0; i < hardwaresBasicos.length; i++) {
            if (hardwaresBasicos[i] != null) {
                System.out.println("- " + hardwaresBasicos[i].getNome() + " (" + hardwaresBasicos[i].getCapacidade() + ")");
            }
        }

        if (memoriaUSB != null) {
            System.out.println("+ Brinde: " + memoriaUSB.getNome() + " " + memoriaUSB.getCapacidade() + "Gb");
        }
    }

    public void addMemoriaUSB(MemoriaUSB musb) {
        this.memoriaUSB = musb;
    }

    public float getPreco() {
        return preco;
    }
}

