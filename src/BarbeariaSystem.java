public class BarbeariaSystem {
    public static void main(String[] args) {

        int gavetasAbertas = 5;

        //Criando o array de barbeiros e clientes:

        Barbeiro[] barbeiros = new Barbeiro[2];
        barbeiros[0] = new Barbeiro("Evandro Nunes");
        barbeiros[1] = new Barbeiro("Paulo Pruença");

        Cliente[] clientes = new Cliente[2];
        clientes[0] = new Cliente("Lucas Girardi", false);
        clientes[1] = new Cliente("Murilo De Pruença", true);
        System.out.println("--------------------------");


        for(Cliente c : clientes) {
            System.out.println(c);
            Barbeiro barbeiroDaVez = barbeiros[0];
            TipoServico tipoServico = TipoServico.CORTE_E_BARBA;
            barbeiroDaVez.realizarServico(c.getNome(), tipoServico);
            System.out.println("--------------------------");
        }

        while(gavetasAbertas > 0) {
            gavetasAbertas--;
            System.out.println("Fechando gaveta: " + gavetasAbertas);

        }


        System.out.println("--------------------------");
        System.out.println("ENCERRANDO EXPEDIENTE DA BARBEARIA.....");





    }
}
