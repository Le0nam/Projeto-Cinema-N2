package Cinema.Fakedb;

import java.util.ArrayList;

import Cinema.Dominio.IngressoPorFilme;

public class IngressosPorFilmeFakedb extends BaseFakedb<IngressoPorFilme>{

    @Override
    protected void CarregarDados() {
        this.tabela.add(new IngressoPorFilme(1, 3, 3));
        this.tabela.add(new IngressoPorFilme(2, 1, 2));
        this.tabela.add(new IngressoPorFilme(2, 1, 2));

    }
    public IngressosPorFilmeFakedb(ArrayList<IngressoPorFilme> tabela) {
        super(tabela);
    }
}
