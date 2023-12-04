package Cinema.Repositorio;

import Cinema.Dominio.IngressoPorFilme;
import Cinema.Fakedb.IngressosPorFilmeFakedb;

public class IngressoPorFilmeRepositorio extends BaseGenericaRepositorio<IngressosPorFilmeFakedb, IngressoPorFilme>{
public IngressoPorFilmeRepositorio()
    {
        this.db = new IngressosPorFilmeFakedb(dataset);
        this.dataset = this.db.getTabela();
    }
    @Override
    public IngressoPorFilme Create(IngressoPorFilme instancia) {
       int pos = this.dataset.size()-1;
       int novoCodigo = this.dataset.get(pos).getCodigo()+1;
       instancia.setCodigo(novoCodigo);
       return instancia;
    }

    @Override
    public IngressoPorFilme Read(int codigo) {
       for (IngressoPorFilme IngressoPorFilme : dataset) {
        if (IngressoPorFilme.getCodigo() == codigo) {
            return IngressoPorFilme;
        }
       }
       return null;
    }

    @Override
    public IngressoPorFilme Update(IngressoPorFilme instancia) {
       IngressoPorFilme alteracao = this.Read(instancia.getCodigo());
       if (alteracao == null) {
        return null;
       }else
       alteracao.setCodigoFilme(instancia.getCodigoFilme());
       alteracao.setCodigoIngreco(instancia.getCodigoIngreco());
       return alteracao;
    }

    @Override
    public IngressoPorFilme Delete(int codigo) {
        IngressoPorFilme del = this.Read(codigo);
        if (del == null) {
            return null;
        }else{
            this.dataset.remove(del);
            return del;
        }
    }
}