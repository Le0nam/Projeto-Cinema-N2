package Cinema.Fakedb;

import java.util.ArrayList;

import Cinema.Dominio.Sala;

public class SalaFakedb extends BaseFakedb<Sala>{

    public SalaFakedb(ArrayList<Sala> tabela) {
        super(tabela);
    }

    @Override
    protected void CarregarDados() {
       this.tabela.add(new Sala(1, 33, "6D", "Final do Corredor"));
       this.tabela.add(new Sala(2, 40, "Full HD", "Começo do correrdor"));
       this.tabela.add(new Sala(3, 44, "3D", "Meio Do Corredor"));
    }
    
}
