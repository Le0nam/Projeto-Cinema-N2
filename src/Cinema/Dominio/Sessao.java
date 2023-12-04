package Cinema.Dominio;

import java.sql.Date;

public class Sessao extends BaseIdentificador{
    private String statusDaSessao;
    private Date data;
    private Date horario;
    public String getStatusDaSecao() {
        return statusDaSessao;
    }
    public void setStatusDaSecao(String statusDaSecao) {
        this.statusDaSessao = statusDaSecao;
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
    public Sessao(int codigo, String statusDaSecao, Date data, Date horario) {
        super(codigo);
        this.statusDaSessao = statusDaSecao;
        this.data = data;
        this.horario = horario;
    }
    @Override
    public String toString() {
        return "Sessao [codigo=" + codigo + " statusDaSessao=" + statusDaSessao + ", data=" + data + ", horario=" + horario + "]";
    }
    
}
