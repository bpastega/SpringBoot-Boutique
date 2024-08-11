package app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.entity.Funcionario;
import app.repository.FuncionarioRepository;

@Service
public class FuncionarioService {
	@Autowired 
	private FuncionarioRepository funcionarioRepository;
	
	/*C - CREATE - POST - save() - RETORNA STRING*/
	public String save(Funcionario funcionario){
		this.funcionarioRepository.save(funcionario);
		return "Funcionário salvo com sucesso!";
	}
	
	/*R - READ - GET - findById() - RETORNA O FUNCIONARIO*/
	public Funcionario findById(long id) {
		Optional<Funcionario> optional = this.funcionarioRepository.findById(id); 
			if(optional.isPresent()) {
				return optional.get();
			}else
				return null;
		}

	/*R - READ - GET - findAll()*/
	public List<Funcionario> findAll(){
		return this.funcionarioRepository.findAll();
	}

	/*U - UPDATE - PUT - update() - RETORNA STRING*/
	public String update(Funcionario funcionario, long id) {
		funcionario.setId(id); 
		this.funcionarioRepository.save(funcionario);
		return "Funcionário com ID de numero: "+id+" foi atualizado com sucesso!";
	}
	
	/*D - DELETE - DELETE - delete() - RETORNA STRING*/
	public String delete(long id) {
		this.funcionarioRepository.deleteById(id);
		return "Funcionário com ID de numero: "+id+" foi deletado com sucesso!";
		
	}
}
