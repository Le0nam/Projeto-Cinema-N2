package Cinema.Dominio;

public class Ingresso extends BaseIdentificador{
    private String tipo;
    private String categoria;
    private int codigoFilme;
    private int codigoSessao;
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public int getCodigoFilme() {
        return codigoFilme;
    }
    public void setCodigoFilme(int codigoFilme) {
        this.codigoFilme = codigoFilme;
    }
    public int getCodigoSessao() {
        return codigoSessao;
    }
    public void setCodigoSessao(int codigoSessao) {
        this.codigoSessao = codigoSessao;
    }
    public Ingresso(int codigo, String tipo, String categoria, int codigoFilme, int codigoSessao) {
        super(codigo);
        this.tipo = tipo;
        this.categoria = categoria;
        this.codigoFilme = codigoFilme;
        this.codigoSessao = codigoSessao;
    }
    @Override
    public String toString() {
        return "Ingresso [codigo=" + codigo + " tipo=" + tipo + ", categoria=" + categoria + ", codigoFilme=" + codigoFilme
                + ", codigoSessao=" + codigoSessao + "]";
    }
        
}
