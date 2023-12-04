package Cinema.Servico;

import java.util.ArrayList;

import Cinema.Dominio.FilmesPorAtor;
import Cinema.Repositorio.FilmePorAtorRepositorio;

public class FilmesPorAtorServico extends BaseGenericaServico<FilmePorAtorRepositorio, FilmesPorAtor>{
public FilmesPorAtorServico()
    {
        this.repo = new FilmePorAtorRepositorio();
    }
    @Override
    public FilmesPorAtor Inserir(FilmesPorAtor tupla) {
      return this.repo.Create(tupla);
    }

    @Override
    public FilmesPorAtor Obter(int codigo) {
       return this.repo.Read(codigo);
    }

    @Override
    public ArrayList<FilmesPorAtor> Listar() {
        return this.repo.ReadAll();
    }

    @Override
    public FilmesPorAtor Atualizar(FilmesPorAtor tupla) {
        return this.repo.Update(tupla);
    }

    @Override
    public FilmesPorAtor Excluir(int codigo) {
       return this.repo.Delete(codigo);
    }
}
