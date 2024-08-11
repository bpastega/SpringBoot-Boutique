package app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.entity.Funcionario;
import app.service.FuncionarioService;

@RestController
@RequestMapping("/api/funcionario")
public class FuncionarioController {

	@Autowired FuncionarioService funcionarioService;
	
	/*C - CREATE - POST - save() - RETORNA STRING*/
	@PostMapping("/save")
	ResponseEntity <String> save(@RequestBody Funcionario funcionario){
		try {
			String mensagem = this.funcionarioService.save(funcionario);
			return new ResponseEntity<>(mensagem, HttpStatus.OK);
		} catch (Exception e) { 
			return new ResponseEntity<>("Erro ao criar Funcionário! Dados do erro:"+e.getMessage(), HttpStatus.BAD_REQUEST);
		}
	}
	
	
	/*R - READ - GET - findById() - RETORNA CLIENTE*/
	@GetMapping("/findById/{id}")
	ResponseEntity <Funcionario> findById(@PathVariable long id){
		try {
			Funcionario funcionario = this.funcionarioService.findById(id);
			return new ResponseEntity<>(funcionario, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}
	}
	
	/*R - READ - GET - findAll() - RETORNA LISTA*/
	@GetMapping("/findAll")
	ResponseEntity <List<Funcionario>> findAll(){
		try {
			List<Funcionario> lista = this.funcionarioService.findAll();
			return new ResponseEntity<>(lista, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}
	}
	
	
	/*U - UPDATE - PUT - update() - RETORNA STRING */
	@PutMapping("/update/{id}")
	ResponseEntity <String> update(@RequestBody Funcionario funcionario, @PathVariable long id){
		try {
			String mensagem = this.funcionarioService.update(funcionario, id);
			return new ResponseEntity<>(mensagem, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>("Erro ao atualizar Funcionário! Dados do erro:"+e.getMessage(), HttpStatus.BAD_REQUEST );
		}
	}
	
	/*D - DELETE - DELETE - delete() - RETORNA STRING*/
	@DeleteMapping("/delete/{id}")
	ResponseEntity <String> delete(@PathVariable long id){
		try {
			String mensagem = this.funcionarioService.delete(id);
			return new ResponseEntity<>(mensagem, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>("Erro ao deletar Funcionário! Dados do erro:"+e.getMessage(), HttpStatus.BAD_REQUEST );
			
		}
	}
	
}
