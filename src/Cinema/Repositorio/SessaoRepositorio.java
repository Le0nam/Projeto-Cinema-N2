package Cinema.Repositorio;

import Cinema.Dominio.Sessao;
import Cinema.Fakedb.SessaoFekedb;

public class SessaoRepositorio extends BaseGenericaRepositorio<SessaoFekedb, Sessao>{
public SessaoRepositorio()
    {
        this.db = new SessaoFekedb(dataset);
        this.dataset = this.db.getTabela();
    }
    @Override
    public Sessao Create(Sessao instancia) {
       int pos = this.dataset.size()-1;
       int novoCodigo = this.dataset.get(pos).getCodigo()+1;
       instancia.setCodigo(novoCodigo);
       return instancia;
    }

    @Override
    public Sessao Read(int codigo) {
       for (Sessao sessao : dataset) {
        if (sessao.getCodigo() == codigo) {
            return sessao;
        }
       }
       return null;
    }

    @Override
    public Sessao Update(Sessao instancia) {
       Sessao alteracao = this.Read(instancia.getCodigo());
       if (alteracao == null) {
        return null;
       }else
       alteracao.setData(instancia.getData());
       alteracao.setHorario(instancia.getHorario());
       alteracao.setStatusDaSessao(instancia.getStatusDaSessao());
       return alteracao;
    }

    @Override
    public Sessao Delete(int codigo) {
        Sessao del = this.Read(codigo);
        if (del == null) {
            return null;
        }else{
            this.dataset.remove(del);
            return del;
        }
    }
}
