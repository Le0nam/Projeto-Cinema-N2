import Cinema.Dominio.Ator;
import Cinema.Repositorio.AtorRepositorio;

import Cinema.Servico.AtorServico;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        AtorRepositorio repo = new AtorRepositorio();
        // for (Ator string : repo.ReadAll()) {
        //     System.out.println(string.toString());
        // }
    // Ator at = repo.Read(1);
    
      AtorServico ser = new AtorServico();
        for (Ator string : ser.Listar()) {
            System.out.println(string.toString());
        }
//     at = ser.Obter(1);
//     System.out.println(at.toString());
    }
}
 