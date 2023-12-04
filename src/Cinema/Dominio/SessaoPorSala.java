package Cinema.Dominio;

public class SessaoPorSala extends BaseIdentificador{
    private int codigoSessao;
    private int codigoFilme;
    public int getCodigoSessao() {
        return codigoSessao;
    }
    public void setCodigoSessao(int codigoSessao) {
        this.codigoSessao = codigoSessao;
    }
    public int getCodigoFilme() {
        return codigoFilme;
    }
    public void setCodigoFilme(int codigoFilme) {
        this.codigoFilme = codigoFilme;
    }
    public SessaoPorSala(int codigo, int codigoSessao, int codigoFilme) {
        super(codigo);
        this.codigoSessao = codigoSessao;
        this.codigoFilme = codigoFilme;
    }
    
}
