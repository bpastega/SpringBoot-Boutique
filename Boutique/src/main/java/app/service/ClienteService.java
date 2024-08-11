package app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.entity.Cliente;
import app.repository.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired 
	private ClienteRepository clienteRepository;
	
	/*C - CREATE - POST - save() - RETORNA STRING*/
	public String save(Cliente cliente){
		this.clienteRepository.save(cliente);
		return "Cliente salvo com sucesso!";
	}
	
	/*R - READ - GET - findById() - RETORNA O CLIENTE*/
	public Cliente findById(long id) {
		Optional<Cliente> optional = this.clienteRepository.findById(id); 
			if(optional.isPresent()) {
				return optional.get();
			}else
				return null;
		}

	/*R - READ - GET - findAll()*/
	public List<Cliente> findAll(){
		return this.clienteRepository.findAll();
	}

	/*U - UPDATE - PUT - update() - RETORNA STRING*/
	public String update(Cliente cliente, long id) {
		cliente.setId(id); 
		this.clienteRepository.save(cliente);
		return "Cliente com ID de numero: "+id+" foi atualizado com sucesso!";
	}
	
	/*D - DELETE - DELETE - delete() - RETORNA STRING*/
	public String delete(long id) {
		this.clienteRepository.deleteById(id);
		return "Cliente com ID de numero: "+id+" foi deletado com sucesso!";
		
	}
	
	public List<Cliente> findByIdade(){
		return this.clienteRepository.findByIdade();
		
		}
	}