package adiciona.Shows.Dao;


import adiciona.Shows.Dao.ContatoDao;
import br.com.modelo.Banda;


public class TestaInsere {
	public static void main(String[] args) {
		Banda banda = new Banda();
		banda.setNome("desejo de menina");
         banda.setGenero("forro");
		
		
		
		ContatoDao add = new ContatoDao();
		
		add.adiciona(banda);
		
		System.out.println("Gravado!");
	}

}
