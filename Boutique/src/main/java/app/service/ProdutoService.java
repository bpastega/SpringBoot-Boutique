package app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.entity.Produto;
import app.repository.ProdutoRepository;

@Service
public class ProdutoService {
	
	@Autowired 
	private ProdutoRepository produtoRepository;
	
	/*C - CREATE - POST - save() - RETORNA STRING*/
	public String save(Produto produto){
		this.produtoRepository.save(produto);
		return "Produto salvo com sucesso!";
	}
	
	/*R - READ - GET - findById() - RETORNA O PRODUTO*/
	public Produto findById(long id) {
		Optional<Produto> optional = this.produtoRepository.findById(id); 
			if(optional.isPresent()) {
				return optional.get();
			}else
				return null;
		}

	/*R - READ - GET - findAll()*/
	public List<Produto> findAll(){
		return this.produtoRepository.findAll();
	}

	/*U - UPDATE - PUT - update() - RETORNA STRING*/
	public String update(Produto produto, long id) {
		produto.setId(id); 
		this.produtoRepository.save(produto);
		return "Produto com ID de numero: "+id+" foi atualizado com sucesso!";
	}
	
	/*D - DELETE - DELETE - delete() - RETORNA STRING*/
	public String delete(long id) {
		this.produtoRepository.deleteById(id);
		return "Produto com ID de numero: "+id+" foi deletado com sucesso!";
		
	}
	
	public List<Produto> findByDezMaioresPrecos(){
		return this.produtoRepository.findByDezMaioresPrecos();
	}
}
