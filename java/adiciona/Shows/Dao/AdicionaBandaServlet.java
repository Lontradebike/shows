package adiciona.Shows.Dao;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import adiciona.Shows.Dao.ContatoDao;
import br.com.modelo.Banda;

@WebServlet("/adicionaBanda")
public class AdicionaBandaServlet extends HttpServlet {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request,
            HttpServletResponse response)
            throws IOException, ServletException {

        PrintWriter out = response.getWriter();

        
        String nome = request.getParameter("nome");
        String genero = request.getParameter("genero");
        

     

        
        Banda banda = new Banda();
        banda.setNome(nome);
        banda.setGenero(genero);

        

        
        Connection connection = (Connection) request.getAttribute("conexao");
		ContatoDao dao = new ContatoDao();
		

		RequestDispatcher rd = request
				.getRequestDispatcher("/WEB-INF/jsp/Banda-adicionada.jsp");
		rd.forward(request, response);
        dao.adiciona(banda);

       
    }
}