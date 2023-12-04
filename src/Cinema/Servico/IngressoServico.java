package Cinema.Servico;

import java.util.ArrayList;

import Cinema.Dominio.Ingresso;
import Cinema.Repositorio.IngressoRepositorio;

public class IngressoServico extends BaseGenericaServico<IngressoRepositorio, Ingresso>{
    public IngressoServico()
    {
        this.repo = new IngressoRepositorio();
    }
    @Override
    public Ingresso Inserir(Ingresso tupla) {
      return this.repo.Create(tupla);
    }

    @Override
    public Ingresso Obter(int codigo) {
       return this.repo.Read(codigo);
    }

    @Override
    public ArrayList<Ingresso> Listar() {
        return this.repo.ReadAll();
    }

    @Override
    public Ingresso Atualizar(Ingresso tupla) {
        return this.repo.Update(tupla);
    }

    @Override
    public Ingresso Excluir(int codigo) {
       return this.repo.Delete(codigo);
    }
}
