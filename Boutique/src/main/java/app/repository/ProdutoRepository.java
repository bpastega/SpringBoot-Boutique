package app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import app.entity.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	
	/*O sistema deve ser capaz de listar os 10 produtos mais caros do cadastro*/
	
	@Query(value = "SELECT * FROM Produto ORDER BY preco DESC LIMIT 10", nativeQuery = true) /*https://www.baeldung.com/spring-data-jpa-query*/
	public List<Produto> findByDezMaioresPrecos();
	
	
}
