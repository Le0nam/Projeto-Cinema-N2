package Cinema.Fakedb;

import java.util.ArrayList;

import Cinema.Dominio.SessaoPorSala;

public class SessaoPorSalaFakedb extends BaseFakedb<SessaoPorSala>{

    public SessaoPorSalaFakedb(ArrayList<SessaoPorSala> tabela) {
        super(tabela);
    }

    @Override
    protected void CarregarDados() {
        this.tabela.add(new SessaoPorSala(1, 1, 1));
        this.tabela.add(new SessaoPorSala(2, 3, 1));
        this.tabela.add(new SessaoPorSala(3, 2, 3));
    }
    
}
