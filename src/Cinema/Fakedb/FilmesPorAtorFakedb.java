package Cinema.Fakedb;

import java.util.ArrayList;

import Cinema.Dominio.FilmesPorAtor;

public class FilmesPorAtorFakedb extends BaseFakedb<FilmesPorAtor>{
    @Override
    protected void CarregarDados() {
        this.tabela.add(new FilmesPorAtor(1, 1, 3));
        this.tabela.add(new FilmesPorAtor(2, 1, 1));
        this.tabela.add(new FilmesPorAtor(3, 3, 2));
    }
    public FilmesPorAtorFakedb(ArrayList<FilmesPorAtor> tabela) {
        super(tabela);
    }


    
}
