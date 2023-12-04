package Cinema.Dominio;

public class Ingresso extends BaseIdentificador{
    private String tipo;
    private String categoria;
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
    public Ingresso(int codigo, String tipo, String categoria) {
        super(codigo);
        this.tipo = tipo;
        this.categoria = categoria;
    }
    
}
