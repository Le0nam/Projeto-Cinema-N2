package Cinema.Servico;

import java.util.ArrayList;

import Cinema.Dominio.Filme;
import Cinema.Repositorio.FilmeRepositorio;

public class FilmeServico extends BaseGenericaServico<FilmeRepositorio, Filme>{
    public FilmeServico()
    {
        this.repo = new FilmeRepositorio();
    }
    @Override
    public Filme Inserir(Filme tupla) {
      return this.repo.Create(tupla);
    }

    @Override
    public Filme Obter(int codigo) {
       return this.repo.Read(codigo);
    }

    @Override
    public ArrayList<Filme> Listar() {
        return this.repo.ReadAll();
    }

    @Override
    public Filme Atualizar(Filme tupla) {
        return this.repo.Update(tupla);
    }

    @Override
    public Filme Excluir(int codigo) {
       return this.repo.Delete(codigo);
    }
}
