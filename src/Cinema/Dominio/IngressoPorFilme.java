package Cinema.Dominio;

public class IngressoPorFilme extends BaseIdentificador{
    private int codigoFilme;
    private int codigoIngreco;
    
    public int getCodigoFilme() {
        return codigoFilme;
    }
    public void setCodigoFilme(int codigoFilme) {
        this.codigoFilme = codigoFilme;
    }
    public int getCodigoIngreco() {
        return codigoIngreco;
    }
    public void setCodigoIngreco(int codigoIngreco) {
        this.codigoIngreco = codigoIngreco;
    }

    public IngressoPorFilme(int codigo, int codigoFilme, int codigoIngreco) {
        super(codigo);
        this.codigoFilme = codigoFilme;
        this.codigoIngreco = codigoIngreco;
    }
    
}
