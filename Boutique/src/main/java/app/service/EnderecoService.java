package app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.entity.Endereco;
import app.repository.EnderecoRepository;

@Service
public class EnderecoService {
	@Autowired 
	private EnderecoRepository enderecoRepository;
	
	/*C - CREATE - POST - save() - RETORNA STRING*/
	public String save(Endereco endereco){
		this.enderecoRepository.save(endereco);
		return "Endereco salvo com sucesso!";
	}
	
	/*R - READ - GET - findById() - RETORNA O ENDERECO*/
	public Endereco findById(long id) {
		Optional<Endereco> optional = this.enderecoRepository.findById(id); 
			if(optional.isPresent()) {
				return optional.get();
			}else
				return null;
		}

	/*R - READ - GET - findAll()*/
	public List<Endereco> findAll(){
		return this.enderecoRepository.findAll();
	}

	/*U - UPDATE - PUT - update() - RETORNA STRING*/
	public String update(Endereco endereco, long id) {
		endereco.setId(id); 
		this.enderecoRepository.save(endereco);
		return "Endereço com ID de numero: "+id+" foi atualizado com sucesso!";
	}
	
	/*D - DELETE - DELETE - delete() - RETORNA STRING*/
	public String delete(long id) {
		this.enderecoRepository.deleteById(id);
		return "Endereço com ID de numero: "+id+" foi deletado com sucesso!";
		
	}
}
