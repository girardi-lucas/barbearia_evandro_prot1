public class Barbeiro extends Pessoa implements TrabalhoBarbeiro {


    private TipoServico tipoServico;
    //Chamando os construtores:



    public Barbeiro() {
    }

    public Barbeiro(String nome) {
        super(nome);
    }

    //Chamando a interface TrabalhoBarbeiro:

    @Override
    public void realizarServico() {
        System.out.println("Realizando o serviço....");
    }

    @Override
    public void realizarServico(String nomeDoCliente) {

    }

    public void realizarServico(String nomeDoCliente, TipoServico tipoServico) {
        System.out.println("Barbeiro: " + this.getNome() + " está atendendo o " + nomeDoCliente);
        double valor = tipoServico.getPreco();
        System.out.println("Valor a cobrar do " + nomeDoCliente + ": R$" + valor);
    }
}
