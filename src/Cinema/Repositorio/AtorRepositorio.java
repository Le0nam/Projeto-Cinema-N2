package Cinema.Repositorio;

import Cinema.Dominio.Ator;
import Cinema.Fakedb.AtorFakedb;

public class AtorRepositorio extends BaseGenericaRepositorio<AtorFakedb, Ator>{

    public AtorRepositorio()
    {
        this.db = new AtorFakedb(dataset);
        this.dataset = this.db.getTabela();
    }
    @Override
    public Ator Create(Ator instancia) {
       int pos = this.dataset.size()-1;
       int novoCodigo = this.dataset.get(pos).getCodigo()+1;
       instancia.setCodigo(novoCodigo);
       return instancia;
    }

    @Override
    public Ator Read(int codigo) {
       for (Ator ator : dataset) {
        if (ator.getCodigo() == codigo) {
            return ator;
        }
       }
       return null;
    }

    @Override
    public Ator Update(Ator instancia) {
       Ator alteracao = this.Read(instancia.getCodigo());
       if (alteracao == null) {
        return null;
       }else
       alteracao.setNome(instancia.getNome());
       alteracao.setPapelDoAtor(instancia.getPapelDoAtor());
       return alteracao;
    }

    @Override
    public Ator Delete(int codigo) {
        Ator del = this.Read(codigo);
        if (del == null) {
            return null;
        }else{
            this.dataset.remove(del);
            return del;
        }
    }
    
}
