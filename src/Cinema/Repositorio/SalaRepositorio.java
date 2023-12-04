package Cinema.Repositorio;

import Cinema.Dominio.Sala;
import Cinema.Fakedb.SalaFakedb;

public class SalaRepositorio extends BaseGenericaRepositorio<SalaFakedb, Sala>{
public SalaRepositorio()
    {
        this.db = new SalaFakedb(dataset);
        this.dataset = this.db.getTabela();
    }
    @Override
    public Sala Create(Sala instancia) {
       int pos = this.dataset.size()-1;
       int novoCodigo = this.dataset.get(pos).getCodigo()+1;
       instancia.setCodigo(novoCodigo);
       return instancia;
    }

    @Override
    public Sala Read(int codigo) {
       for (Sala sala : dataset) {
        if (sala.getCodigo() == codigo) {
            return sala;
        }
       }
       return null;
    }

    @Override
    public Sala Update(Sala instancia) {
       Sala alteracao = this.Read(instancia.getCodigo());
       if (alteracao == null) {
        return null;
       }else
       alteracao.setLocalizacao(instancia.getLocalizacao());
       alteracao.setNumAssentos(instancia.getNumAssentos());
       alteracao.setTipoTela(instancia.getTipoTela());
       return alteracao;
    }

    @Override
    public Sala Delete(int codigo) {
        Sala del = this.Read(codigo);
        if (del == null) {
            return null;
        }else{
            this.dataset.remove(del);
            return del;
        }
    }
}
