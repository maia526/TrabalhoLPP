import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private String numero;
    private int idade;
    private String profissao;
    private List<Compra> compras;

    public Cliente(String nome, String numero, int idade, String profissao, List<Compra> compras) {
        this.nome = nome;
        this.numero = numero;
        this.idade = idade;
        this.profissao = profissao;
        this.compras = compras;
    }

    public String retornaDados(){
        return this.toString();
    }
    public String getNome() {
        return nome;
    }

    public String getNumero() {
        return numero;
    }

    public int getIdade() {
        return idade;
    }

    public String getProfissao() {
        return profissao;
    }

    public List<Compra> getCompras() {
        return compras;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return  "nome:" + nome + "\n" +
                "numero:" + numero + "\n" +
                "idade:" + idade + "\n" +
                "profissao:" + profissao + "\n" +
                "compras:" + compras;
    }
}
