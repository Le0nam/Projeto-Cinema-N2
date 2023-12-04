package Cinema.Repositorio;

import Cinema.Dominio.Ingresso;
import Cinema.Fakedb.IngressoFakedb;

public class IngressoRepositorio extends BaseGenericaRepositorio<IngressoFakedb, Ingresso>{
    public IngressoRepositorio()
    {
        this.db = new IngressoFakedb(dataset);
        this.dataset = this.db.getTabela();
    }
    @Override
    public Ingresso Create(Ingresso instancia) {
       int pos = this.dataset.size()-1;
       int novoCodigo = this.dataset.get(pos).getCodigo()+1;
       instancia.setCodigo(novoCodigo);
       return instancia;
    }

    @Override
    public Ingresso Read(int codigo) {
       for (Ingresso ingresso : dataset) {
        if (ingresso.getCodigo() == codigo) {
            return ingresso;
        }
       }
       return null;
    }

    @Override
    public Ingresso Update(Ingresso instancia) {
       Ingresso alteracao = this.Read(instancia.getCodigo());
       if (alteracao == null) {
        return null;
       }else
       alteracao.setCategoria(instancia.getCategoria());
       alteracao.setTipo(instancia.getTipo());
       return alteracao;
    }

    @Override
    public Ingresso Delete(int codigo) {
        Ingresso del = this.Read(codigo);
        if (del == null) {
            return null;
        }else{
            this.dataset.remove(del);
            return del;
        }
    }
}
