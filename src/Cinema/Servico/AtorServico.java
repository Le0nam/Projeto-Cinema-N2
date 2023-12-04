package Cinema.Servico;

import java.util.ArrayList;

import Cinema.Dominio.Ator;
import Cinema.Repositorio.AtorRepositorio;

public class AtorServico extends BaseGenericaServico<AtorRepositorio, Ator>{

    public AtorServico()
    {
        this.repo = new AtorRepositorio();
    }
    @Override
    public Ator Inserir(Ator tupla) {
      return this.repo.Create(tupla);
    }

    @Override
    public Ator Obter(int codigo) {
       return this.repo.Read(codigo);
    }

    @Override
    public ArrayList<Ator> Listar() {
        return this.repo.ReadAll();
    }

    @Override
    public Ator Atualizar(Ator tupla) {
        return this.repo.Update(tupla);
    }

    @Override
    public Ator Excluir(int codigo) {
       return this.repo.Delete(codigo);
    }
    
}
