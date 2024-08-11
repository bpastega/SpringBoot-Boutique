package app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.entity.Venda;
import app.repository.VendaRepository;

@Service
public class VendaService {
	@Autowired 
	private VendaRepository vendaRepository;
	
	/*C - CREATE - POST - save() - RETORNA STRING*/
	public String save(Venda venda){
		this.vendaRepository.save(venda);
		return "Venda salva com sucesso! Total da venda:"+vendaRepository.getTotalPrecoByVendaId(venda.getId());
	}
	
	/*R - READ - GET - findById() - RETORNA O ENDERECO*/
	public Venda findById(long id) {
		Optional<Venda> optional = this.vendaRepository.findById(id); 
			if(optional.isPresent()) {
				return optional.get();
			}else
				return null;
		}

	/*R - READ - GET - findAll()*/
	public List<Venda> findAll(){
		return this.vendaRepository.findAll();
	}

	/*U - UPDATE - PUT - update() - RETORNA STRING*/
	public String update(Venda venda, long id) {
		venda.setId(id); 
		this.vendaRepository.save(venda);
		return "Venda com ID de numero: "+id+" foi atualizada com sucesso!";
	}
	
	/*D - DELETE - DELETE - delete() - RETORNA STRING*/
	public String delete(long id) {
		this.vendaRepository.deleteById(id);
		return "Venda com ID de numero: "+id+" foi deletada com sucesso!";
		
	}
	
	public Float getTotalPrecoByVendaId(long id) {
		float valor = this.vendaRepository.getTotalPrecoByVendaId(id);
		return valor;
	}
	
	public List<Venda> findByCliente(String nome) {
		return this.vendaRepository.findByCliente(nome);
	}
	//DEU ERRADO! Reformulada usando JPQL dentro do VendaRepository
	/*public Float totalVenda(Venda venda) {
		List<Produto> produtos = venda.getProduto();
		float valorTotal = 0;
		
		for(int i=0;i<produtos.size();i++) {
			valorTotal = valorTotal + produtos.get(i).getPreco();
		}
		return valorTotal;
	}*/
	
	public List<Venda> findByFuncionario(String nome){
		return this.vendaRepository.findByFuncionario(nome);
	}
	
	/*public List<Venda> findByTotais(){
		return this.vendaRepository.findByTotais();
	}*/
	

	public List<Venda> findTop10ByTotalPreco(){
		return this.vendaRepository.findTop10ByTotalPreco();
	}

}
