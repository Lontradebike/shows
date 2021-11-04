package br.com.caelum.agenda.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import java.util.List;

import br.com.caelum.agenda.dao.ConnectionFactory;
import br.com.caelum.jdbc.modelo.Banda;

public class ContatoDao {
	
	
	private Connection connection;
	
	public ContatoDao() {
		
	this.connection = new ConnectionFactory().getConnection();
	
	}
	
	public void adiciona(Banda banda) 
	{
			String sql = "insert into bandas " +
			"(nome,genero)" +
			" values (?,?)";
			
			try 
		{
			
			PreparedStatement stmt = connection.prepareStatement(sql);

			stmt.setString(1, banda.getNome());
			stmt.setString(2, banda.getGenero());
			
			
			
			
			stmt.execute();
			stmt.close();

	} catch (SQLException e) {
		
	}
}

public List<Banda>getLista(){
	try {
		List<Banda>contatos=new ArrayList<Banda>();
		PreparedStatement stmt = this.connection.
                prepareStatement("select * from contatos");
        ResultSet rs = stmt.executeQuery();
      while(rs.next()) {
    	  Banda banda = new Banda();
    	  
    	  banda.setNome(rs.getString("nome"));
    	  banda.setGenero(rs.getString("email"));
    	  


    	  
    	  contatos.add(banda);
      }
    			  
      rs.close();
      stmt.close();
      return contatos;
	}catch(SQLException e) {
		throw new RuntimeException(e);
	}	
      }
	public void altera(Banda banda) {
	    String sql = "update contatos set nome=?, email=?, endereco=?," +
	            "dataNascimento=? where id=?";
	    try {
	        PreparedStatement stmt = connection.prepareStatement(sql);
	        stmt.setString(1, banda.getNome());
	        stmt.setString(2, banda.getGenero());
	        
	        
	        
	        stmt.execute();
	        stmt.close();
	    } catch (SQLException e) {
	        throw new RuntimeException(e);
	    }
	
	}
	  public void remove(Banda banda) {
	      try {
	          PreparedStatement stmt = connection
	                  .prepareStatement("delete from contatos where id=?");
	          stmt.setString(1, banda.getNome());
	          stmt.execute();
	          stmt.close();
	      } catch (SQLException e) {
	          throw new RuntimeException(e);
	      }
	  }
}
	


		 
	 

	  


