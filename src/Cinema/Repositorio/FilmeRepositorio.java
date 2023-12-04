package Cinema.Repositorio;

import Cinema.Dominio.Filme;
import Cinema.Fakedb.FilmeFakedb;

public class FilmeRepositorio extends BaseGenericaRepositorio<FilmeFakedb, Filme>{
    public FilmeRepositorio()
    {
        this.db = new FilmeFakedb(dataset);
        this.dataset = this.db.getTabela();
    }
    @Override
    public Filme Create(Filme instancia) {
       int pos = this.dataset.size()-1;
       int novoCodigo = this.dataset.get(pos).getCodigo()+1;
       instancia.setCodigo(novoCodigo);
       return instancia;
    }

    @Override
    public Filme Read(int codigo) {
       for (Filme filme : dataset) {
        if (filme.getCodigo() == codigo) {
            return filme;
        }
       }
       return null;
    }

    @Override
    public Filme Update(Filme instancia) {
       Filme alteracao = this.Read(instancia.getCodigo());
       if (alteracao == null) {
        return null;
       }else
       alteracao.setDuracao(instancia.getDuracao());
       alteracao.setGenero(instancia.getGenero());
       alteracao.setTitulo(instancia.getTitulo());
       return alteracao;
    }

    @Override
    public Filme Delete(int codigo) {
        Filme del = this.Read(codigo);
        if (del == null) {
            return null;
        }else{
            this.dataset.remove(del);
            return del;
        }
    }
}
