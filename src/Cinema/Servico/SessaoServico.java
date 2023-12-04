package Cinema.Servico;

import java.util.ArrayList;

import Cinema.Dominio.Sessao;
import Cinema.Repositorio.SessaoRepositorio;

public class SessaoServico extends BaseGenericaServico<SessaoRepositorio, Sessao> {
    public SessaoServico()
    {
        this.repo = new SessaoRepositorio();
    }
    @Override
    public Sessao Inserir(Sessao tupla) {
      return this.repo.Create(tupla);
    }

    @Override
    public Sessao Obter(int codigo) {
       return this.repo.Read(codigo);
    }

    @Override
    public ArrayList<Sessao> Listar() {
        return this.repo.ReadAll();
    }

    @Override
    public Sessao Atualizar(Sessao tupla) {
        return this.repo.Update(tupla);
    }

    @Override
    public Sessao Excluir(int codigo) {
       return this.repo.Delete(codigo);
    }
    
}