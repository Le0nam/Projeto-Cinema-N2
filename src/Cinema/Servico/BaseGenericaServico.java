package Cinema.Servico;

import java.util.ArrayList;

public abstract class BaseGenericaServico<TRepositorio, TDominio> {
    protected TRepositorio repo;
    public abstract TDominio Inserir(TDominio tupla);
    public abstract TDominio Obter(int codigo);
    public abstract ArrayList<TDominio>Listar();
    public abstract TDominio Atualizar(TDominio tupla);
    public abstract TDominio Excluir(int codigo);
    public BaseGenericaServico(){}
}
