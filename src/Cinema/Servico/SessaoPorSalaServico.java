package Cinema.Servico;

import java.util.ArrayList;

import Cinema.Dominio.SessaoPorSala;
import Cinema.Repositorio.SessaoPorSalaRepositorio;

public class SessaoPorSalaServico extends BaseGenericaServico<SessaoPorSalaRepositorio, SessaoPorSala>{
    public SessaoPorSalaServico()
    {
        this.repo = new SessaoPorSalaRepositorio();
    }
    @Override
    public SessaoPorSala Inserir(SessaoPorSala tupla) {
      return this.repo.Create(tupla);
    }

    @Override
    public SessaoPorSala Obter(int codigo) {
       return this.repo.Read(codigo);
    }

    @Override
    public ArrayList<SessaoPorSala> Listar() {
        return this.repo.ReadAll();
    }

    @Override
    public SessaoPorSala Atualizar(SessaoPorSala tupla) {
        return this.repo.Update(tupla);
    }

    @Override
    public SessaoPorSala Excluir(int codigo) {
       return this.repo.Delete(codigo);
    }
}
