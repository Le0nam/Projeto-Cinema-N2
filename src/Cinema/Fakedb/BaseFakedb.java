package Cinema.Fakedb;

import java.util.ArrayList;

public abstract class BaseFakedb<TDominio> {
    protected ArrayList<TDominio> tabela;

    public ArrayList<TDominio> getTabela() {
       if (this.tabela == null) {
        this.tabela = new ArrayList<TDominio>();
        }
        return this.tabela;
    }
    protected abstract void CarregarDados();
    public BaseFakedb(ArrayList<TDominio> tabela) {
        this.tabela = new ArrayList<TDominio>();
        this.CarregarDados();
    }
    
}
