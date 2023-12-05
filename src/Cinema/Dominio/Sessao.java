package Cinema.Dominio;

import java.sql.Date;

public class Sessao extends BaseIdentificador{
    private String statusDaSessao;
    private Date data;
    private Date horario;
    private int codigoIngresso;
    public String getStatusDaSessao() {
        return statusDaSessao;
    }
    public void setStatusDaSessao(String statusDaSessao) {
        this.statusDaSessao = statusDaSessao;
    }
    public Date getData() {
        return data;
    }
    public void setData(Date data) {
        this.data = data;
    }
    public Date getHorario() {
        return horario;
    }
    public void setHorario(Date horario) {
        this.horario = horario;
    }
    public int getCodigoIngresso() {
        return codigoIngresso;
    }
    public void setCodigoIngresso(int codigoIngresso) {
        this.codigoIngresso = codigoIngresso;
    }
    public Sessao(int codigo, String statusDaSessao, Date data, Date horario, int codigoIngresso) {
        super(codigo);
        this.statusDaSessao = statusDaSessao;
        this.data = data;
        this.horario = horario;
        this.codigoIngresso = codigoIngresso;
    }
    @Override
    public String toString() {
        return "Sessao [codigo=" + codigo + " statusDaSessao=" + statusDaSessao + ", data=" + data + ", horario=" + horario
                + ", codigoIngresso=" + codigoIngresso + "]";
    }
    
}
