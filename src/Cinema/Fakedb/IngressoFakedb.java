package Cinema.Fakedb;

import java.util.ArrayList;

import Cinema.Dominio.Ingresso;

public class IngressoFakedb extends BaseFakedb<Ingresso>{

    @Override
    protected void CarregarDados() {
        this.tabela.add(new Ingresso(1, "Meia", "Adulto"));
        this.tabela.add(new Ingresso(2, "Inteira", "Livre"));
        this.tabela.add(new Ingresso(3, "Meia", "Livre"));
    }
    public IngressoFakedb(ArrayList<Ingresso> tabela) {
        super(tabela);
    }


    
}
