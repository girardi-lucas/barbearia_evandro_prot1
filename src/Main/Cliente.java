package Main;

public class Cliente extends Pessoa {

    private boolean isVip;


    //Chamando construtores:

    public Cliente() {
    }

    public Cliente(String nome, boolean isVip) {
        super(nome);
        this.isVip = isVip;
    }


    //Chamando interface:

    @Override
    public void realizarServico() {

    }
    @Override
    public void realizarServico(String nomeDoCliente) {

    }
    @Override
    public void realizarServico(String nomeDoCliente, TipoServico tipoServico) {

    }

    //Sobrescrever toString:
    public String toString() {
        return "Main.Cliente: " + getNome() + "\nStatus do vip: " + isVip;
    }


}
