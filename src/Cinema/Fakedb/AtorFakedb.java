package Cinema.Fakedb;

import java.util.ArrayList;

import Cinema.Dominio.Ator;

public class AtorFakedb extends BaseFakedb<Ator>{

    @Override
    protected void CarregarDados() {
       this.tabela.add(new Ator(1, "Luizão", "Personagem Principal"));
       this.tabela.add(new Ator(2, "Leonam", "Figurante"));
       this.tabela.add(new Ator(3, "Alunos", "Vilão"));
    }
    
    public AtorFakedb(ArrayList<Ator> tabela) {
        super(tabela);

    }

}
