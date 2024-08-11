package app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import app.entity.Venda;

public interface VendaRepository extends JpaRepository<Venda, Long>{
	
	/*Soma os valores dos produtos de UMA venda*/
	@Query("SELECT SUM(p.preco) FROM Venda v JOIN v.produto p WHERE v.id = :vendaId") //soma do preço dos produtos da venda 
    Float getTotalPrecoByVendaId(@Param("vendaId") Long vendaId);
	/*TODO: perguntar ao professor por que usar @Param aqui*/
	

	/*O sistema deve ser capaz de listar vendas filtradas por parte do nome do cliente.*/
	
	@Query("SELECT v FROM Venda v JOIN v.cliente c WHERE c.nome LIKE CONCAT('%', :nomeCliente, '%')")
	List<Venda> findByCliente(@Param("nomeCliente") String nomeCliente);

	/*NÃO FUNCIONA!!*/
	/*@Query("SELECT * FROM Venda v JOIN v.cliente c WHERE c.nome = :nomeCliente")
	public List<Venda> findByCliente(String nomeCliente);*/
	
	/*O sistema deve ser capaz de listar vendas filtradas por parte do nome do funcionário.*/
	@Query("SELECT v FROM Venda v JOIN v.funcionario f WHERE f.nome LIKE CONCAT('%', :nomeFuncionario, '%')")
	public List<Venda> findByFuncionario(@Param("nomeFuncionario")String nomeFuncionario);
	
	/*O sistema deve ser capaz de listar as 10 vendas com totais mais altos.*/ //TENTAR USAR BUBBLE SORT??
	//public List<Venda> findByTotais();

	@Query("SELECT v FROM Venda v JOIN v.produto p GROUP BY v.id ORDER BY SUM(p.preco) DESC")
	List<Venda> findTop10ByTotalPreco();


	
	/*@Query(value = "SELECT * FROM Venda v ORDER BY (SUM v.preco) DESC LIMIT 10", nativeQuery = true)
	public List<Venda> findByTotais();*/
}
