package BarbeirosEClientes;

import ServicosEMetodos.TipoServico;
import ServicosEMetodos.TrabalhoBarbeiro;

public abstract class Pessoa implements TrabalhoBarbeiro {
    private String nome;

    //Construtores:

    public Pessoa() {
    }

    public Pessoa(String nome) {
        this.nome = nome;
    }

    // Chamando GET e SET
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract void realizarServico(String nomeDoCliente, TipoServico tipoServico);
}
