package app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import app.entity.Cliente;
import app.entity.Produto;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{
	
	/*O sistema deve ser capaz de listar os clientes com idade entre 18 e 35 anos.*/
	
	@Query(value = "SELECT * FROM Cliente WHERE idade BETWEEN 18 AND 35", nativeQuery = true) 
	public List<Cliente> findByIdade();
	
}
