package Cinema.Repositorio;

import Cinema.Dominio.SessaoPorSala;
import Cinema.Fakedb.SessaoPorSalaFakedb;

public class SessaoPorSalaRepositorio extends BaseGenericaRepositorio<SessaoPorSalaFakedb, SessaoPorSala>{
    public SessaoPorSalaRepositorio()
    {
        this.db = new SessaoPorSalaFakedb(dataset);
        this.dataset = this.db.getTabela();
    }
    @Override
    public SessaoPorSala Create(SessaoPorSala instancia) {
       int pos = this.dataset.size()-1;
       int novoCodigo = this.dataset.get(pos).getCodigo()+1;
       instancia.setCodigo(novoCodigo);
       return instancia;
    }

    @Override
    public SessaoPorSala Read(int codigo) {
       for (SessaoPorSala sessaoPorSala : dataset) {
        if (sessaoPorSala.getCodigo() == codigo) {
            return sessaoPorSala;
        }
       }
       return null;
    }

    @Override
    public SessaoPorSala Update(SessaoPorSala instancia) {
       SessaoPorSala alteracao = this.Read(instancia.getCodigo());
       if (alteracao == null) {
        return null;
       }else
       alteracao.setCodigoFilme(instancia.getCodigoFilme());
       alteracao.setCodigoSessao(instancia.getCodigoSessao());
       return alteracao;
    }

    @Override
    public SessaoPorSala Delete(int codigo) {
        SessaoPorSala del = this.Read(codigo);
        if (del == null) {
            return null;
        }else{
            this.dataset.remove(del);
            return del;
        }
    }
}
