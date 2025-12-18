package Main;

import java.util.ArrayList;
import java.util.List;

public class BarbeariaSystem {
    public static void main(String[] args) {

        int gavetasAbertas = 5;

        //Criando o arrayList de barbeiros e clientes:

        List<Barbeiro> barbeiros = new ArrayList<>();
        barbeiros.add(new Barbeiro("Evandro Nunes"));
        barbeiros.add(new Barbeiro("Paulo Pruença"));

        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("Lucas Girardi", false));
        clientes.add(new Cliente("Murilo Pruença", true));

        System.out.println("--------------------------");


        for(Cliente c : clientes) {
            System.out.println(c);
            Barbeiro barbeiroDaVez = barbeiros.getFirst();
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
