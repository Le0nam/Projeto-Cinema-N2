package Cinema.Fakedb;

import java.util.ArrayList;

import Cinema.Dominio.Ingresso;

public class IngressoFakedb extends BaseFakedb<Ingresso>{

    @Override
    protected void CarregarDados() {
        this.tabela.add(new Ingresso(1, "Meia", "Adulto", 0, 0));
        this.tabela.add(new Ingresso(2, "Inteira", "Livre", 0, 0));
        this.tabela.add(new Ingresso(3, "Meia", "Livre", 0, 0));
    }
    public IngressoFakedb(ArrayList<Ingresso> tabela) {
        super(tabela);
    }


    
}
