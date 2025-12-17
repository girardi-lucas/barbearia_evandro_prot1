package ServicosEMetodos;

public enum TipoServico {

    // Serviços disponíveis:

    CORTE(35.0),
    BARBA(25.0),
    CORTE_E_BARBA(50.0);

    private double preco;


    // Construtores:

    TipoServico() {
    }

    TipoServico(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }
}
