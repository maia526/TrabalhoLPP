import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Banco {
    public List<Stand> stands;

    public Banco (){
        this.stands = popularStands();
    }

    public List<Stand> popularStands(){
        Stand vegas = new Stand("Vegas", retornaClientesVegas());
        Stand miami = new Stand("Miami", retornaClientesMiami());

        return new ArrayList<>(Arrays.asList(vegas, miami));
    }

    public List<Cliente> retornaClientesVegas(){
        Compra compra1Rui = new Compra(TipoVeiculo.CARRO, "Audi", "A2", 20000);
        Compra compra2Rui = new Compra(TipoVeiculo.CARRO, "BMW", "Series 3", 30000);
        List<Compra> comprasRui = new ArrayList<>(Arrays.asList(compra1Rui, compra2Rui));
        Cliente rui = new Cliente("Rui", "2324", 23, "Médico", comprasRui);

        Compra compraRita = new Compra(TipoVeiculo.CARRO, "Audi", "A3", 30000);
        List<Compra> comprasRita = new ArrayList<>(Arrays.asList(compraRita));
        Cliente rita = new Cliente("Rita", "2325", 32, "Advogado", comprasRita);

        Compra compraJoao = new Compra(TipoVeiculo.MOTO, "Honda", "GL1800", 26000);
        List<Compra> comprasJoao = new ArrayList<>(Arrays.asList(compraJoao));
        Cliente joao = new Cliente("João", "2326", 26, "Professor", comprasJoao);

        Compra compraAna = new Compra(TipoVeiculo.CARRO, "Audi", "A4", 32000);
        Compra compraAna2 = new Compra(TipoVeiculo.CARRO, "BMW", "Serie 3", 32000);
        Compra compraAna3 = new Compra(TipoVeiculo.CARRO, "Ford", "Focus", 24000);
        List<Compra> comprasAna = new ArrayList<>(Arrays.asList(compraAna, compraAna2, compraAna3));
        Cliente ana = new Cliente("Ana", "2327", 49, "Médico", comprasAna);

        return new ArrayList<>(Arrays.asList(rui, rita, joao, ana));
    }


    public List<Cliente> retornaClientesMiami(){
        Compra compraRui2 = new Compra(TipoVeiculo.CARRO, "Fiat", "Panda", 12000);
        List<Compra> comprasRui2 = new ArrayList<>(Arrays.asList(compraRui2));
        Cliente rui2 = new Cliente("Rui", "3333", 33, "Operário", comprasRui2);

        Compra compraPaulo = new Compra(TipoVeiculo.CARRO, "Audi", "A4", 36000);
        List<Compra> comprasPaulo = new ArrayList<>(Arrays.asList(compraPaulo));
        Cliente paulo = new Cliente("Paulo", "3334", 22, "Advogado", comprasPaulo);

        Compra compraPedro = new Compra(TipoVeiculo.CARRO, "Honda", "Accord", 32000);
        List<Compra> comprasPedro = new ArrayList<>(Arrays.asList(compraPedro));
        Cliente pedro = new Cliente("Pedro", "3335", 46, "Advogado", comprasPedro);

        return new ArrayList<>(Arrays.asList(rui2, paulo, pedro));
    }

    public void listarClientes(String cidadeStand){
        for (Stand s : stands) {
            if (s.getCidade().equals(cidadeStand))
                System.out.println(s.retornaClientes());
        }
    }

    public void listarDados(String cidadeStand, String nomeCliente){
        for (Stand s : stands) {
            if (s.getCidade().equals(cidadeStand))
                System.out.println(s.retornaDadosCliente(nomeCliente));
        }
    }

    public void listarCarros(String cidadeStand){
        for (Stand s : stands) {
            if (s.getCidade().equals(cidadeStand))
                System.out.println(s.retornaCarros());
        }

    }

    public void listarAdvogados(){
        for (Stand s : stands){
            System.out.println(s.retornarAdvogados());
        }
    }

    public void precoMedio(String cidadeStand){
        for (Stand s : stands){
            if (s.getCidade().equals(cidadeStand))
                System.out.println(s.retornaPrecoMedio());
        }
    }

    public void alteraId(int idade, String numero, String cidade){
        for (Stand s : stands){
            if (s.getCidade().equals(cidade)){
                s.alteraId(idade, numero);
            }
        }
    }
}
