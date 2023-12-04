package Cinema.Servico;

import java.util.ArrayList;

import Cinema.Dominio.IngressoPorFilme;
import Cinema.Repositorio.IngressoPorFilmeRepositorio;

public class IngressosPorFimeServico extends BaseGenericaServico<IngressoPorFilmeRepositorio, IngressoPorFilme>{
    public IngressosPorFimeServico()
    {
        this.repo = new IngressoPorFilmeRepositorio();
    }
    @Override
    public IngressoPorFilme Inserir(IngressoPorFilme tupla) {
      return this.repo.Create(tupla);
    }

    @Override
    public IngressoPorFilme Obter(int codigo) {
       return this.repo.Read(codigo);
    }

    @Override
    public ArrayList<IngressoPorFilme> Listar() {
        return this.repo.ReadAll();
    }

    @Override
    public IngressoPorFilme Atualizar(IngressoPorFilme tupla) {
        return this.repo.Update(tupla);
    }

    @Override
    public IngressoPorFilme Excluir(int codigo) {
       return this.repo.Delete(codigo);
    }
}
