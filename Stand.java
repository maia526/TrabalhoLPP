import java.util.ArrayList;
import java.util.List;

public class Stand {
    private String cidade;
    private List<Cliente> clientes;

    public Stand(String cidade, List<Cliente> clientes) {
        this.cidade = cidade;
        this.clientes = clientes;
    }

    public String retornaCarros(){
        List<String> listaCarros = new ArrayList<>();
        for (Cliente c: clientes){
            for (Compra compra : c.getCompras()){
                String marca = compra.getMarcaCarro();
                if (!listaCarros.contains(marca))
                    listaCarros.add(marca);
            }
        }

        String s= "";
        for (String marca : listaCarros){
            s += marca + "\n";
        }
        return s;
    }

    public String retornaClientes(){
        String s = "";

        for (Cliente c : clientes){
            s += c.getNome() + "\n";
        }
        return s;
    }

    public String retornarAdvogados(){
        String s = "";
        for (Cliente c : clientes){
            if (c.getProfissao().equals("Advogado"))
                s += "\n" + c.getNome();
        }
        return s;
    }

    public Double retornaPrecoMedio(){
        double total = 0;
        int cont = 0;
        for (Cliente c : clientes){
            for (Compra compra : c.getCompras()){
                total += compra.getPrecoCarro();
                cont ++;
            }
        }

        return total/cont;
    }

    public boolean alteraId(int idade, String numero){
        for (Cliente c : clientes){
            if (c.getNumero().equals(numero)) {
                c.setIdade(idade);
                return true;
            }
        }
        return false;
    }

    public String retornaDadosCliente(String nomeCliente){
        for (Cliente c : clientes){
            if (c.getNome().equals(nomeCliente)){
                return c.retornaDados();
            }
        }
        return "";
    }

    public String getCidade() {
        return cidade;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }
}
