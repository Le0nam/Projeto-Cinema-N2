package Cinema.Servico;

import java.util.ArrayList;

import Cinema.Dominio.Sala;
import Cinema.Repositorio.SalaRepositorio;

public class SalaServico extends BaseGenericaServico<SalaRepositorio, Sala>{
    public SalaServico()
    {
        this.repo = new SalaRepositorio();
    }
    @Override
    public Sala Inserir(Sala tupla) {
      return this.repo.Create(tupla);
    }

    @Override
    public Sala Obter(int codigo) {
       return this.repo.Read(codigo);
    }

    @Override
    public ArrayList<Sala> Listar() {
        return this.repo.ReadAll();
    }

    @Override
    public Sala Atualizar(Sala tupla) {
        return this.repo.Update(tupla);
    }

    @Override
    public Sala Excluir(int codigo) {
       return this.repo.Delete(codigo);
    }
}
