public class Compra {
    private TipoVeiculo tipo;
    private String marcaCarro;
    private String modeloCarro;
    private int precoCarro;

    public Compra(TipoVeiculo tipo, String marcaCarro,String modeloCarro, int precoCarro) {
        this.tipo = tipo;
        this.marcaCarro = marcaCarro;
        this.modeloCarro = modeloCarro;
        this.precoCarro = precoCarro;
    }

    public String getMarcaCarro() {
        return marcaCarro;
    }

    public int getPrecoCarro() {
        return precoCarro;
    }

    @Override
    public String toString() {
        return  "nome:" + tipo  + ", " +
                "numero:" + marcaCarro + ", " +
                "idade:" + modeloCarro + ", " +
                "profissao:" + precoCarro + " ";
    }

}

