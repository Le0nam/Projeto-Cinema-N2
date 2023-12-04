package Cinema.Fakedb;

import java.util.ArrayList;

import Cinema.Dominio.Sessao;

public class SessaoFekedb extends BaseFakedb<Sessao>{

    public SessaoFekedb(ArrayList<Sessao> tabela) {
        super(tabela);
    }

    @Override
    protected void CarregarDados() {
        this.tabela.add(new Sessao(1, "Boa", null, null));
        this.tabela.add(new Sessao(2, "Boa", null, null));
        this.tabela.add(new Sessao(3, "Ruim", null, null));
    }
    
}
