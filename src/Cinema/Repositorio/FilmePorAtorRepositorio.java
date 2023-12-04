package Cinema.Repositorio;

import Cinema.Dominio.FilmesPorAtor;
import Cinema.Fakedb.FilmesPorAtorFakedb;

public class FilmePorAtorRepositorio extends BaseGenericaRepositorio<FilmesPorAtorFakedb, FilmesPorAtor>{
    public FilmePorAtorRepositorio()
    {
        this.db = new FilmesPorAtorFakedb(dataset);
        this.dataset = this.db.getTabela();
    }
    @Override
    public FilmesPorAtor Create(FilmesPorAtor instancia) {
       int pos = this.dataset.size()-1;
       int novoCodigo = this.dataset.get(pos).getCodigo()+1;
       instancia.setCodigo(novoCodigo);
       return instancia;
    }

    @Override
    public FilmesPorAtor Read(int codigo) {
       for (FilmesPorAtor filmesPorAtor : dataset) {
        if (filmesPorAtor.getCodigo() == codigo) {
            return filmesPorAtor;
        }
       }
       return null;
    }

    @Override
    public FilmesPorAtor Update(FilmesPorAtor instancia) {
       FilmesPorAtor alteracao = this.Read(instancia.getCodigo());
       if (alteracao == null) {
        return null;
       }else
       alteracao.setCodigoAtor(instancia.getCodigoAtor());
       alteracao.setCodigoFilme(instancia.getCodigoFilme());
       return alteracao;
    }

    @Override
    public FilmesPorAtor Delete(int codigo) {
        FilmesPorAtor del = this.Read(codigo);
        if (del == null) {
            return null;
        }else{
            this.dataset.remove(del);
            return del;
        }
    }
}
