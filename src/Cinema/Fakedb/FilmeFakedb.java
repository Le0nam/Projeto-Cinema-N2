package Cinema.Fakedb;

import java.util.ArrayList;

import Cinema.Dominio.Filme;

public class FilmeFakedb extends BaseFakedb<Filme>{

    @Override
    protected void CarregarDados() {
        this.tabela.add(new Filme(1, "Homem aranha", 160, "Ação", 0));
        this.tabela.add(new Filme(2, "It A Coisa", 120, "Terror", 0));
        this.tabela.add(new Filme(3, "Gente Gramde", 90, "Comedia", 0));
    }
    public FilmeFakedb(ArrayList<Filme> tabela) {
        super(tabela);
    }

}
