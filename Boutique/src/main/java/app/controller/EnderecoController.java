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

import app.entity.Endereco;
import app.service.EnderecoService;

@RestController
@RequestMapping("/api/endereco")
public class EnderecoController {
	
	@Autowired
	EnderecoService enderecoService;
	
	/*C - CREATE - POST - save() - RETORNA STRING*/
	@PostMapping("/save")
	ResponseEntity <String> save(@RequestBody Endereco endereco){
		try {
			String mensagem = this.enderecoService.save(endereco);
			return new ResponseEntity<>(mensagem, HttpStatus.OK);
		} catch (Exception e) { 
			return new ResponseEntity<>("Erro ao criar Endereço! Dados do erro:"+e.getMessage(), HttpStatus.BAD_REQUEST);
		}
	}
	
	
	/*R - READ - GET - findById() - RETORNA CLIENTE*/
	@GetMapping("/findById/{id}")
	ResponseEntity <Endereco> findById(@PathVariable long id){
		try {
			Endereco endereco = this.enderecoService.findById(id);
			return new ResponseEntity<>(endereco, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}
	}
	
	/*R - READ - GET - findAll() - RETORNA LISTA*/
	@GetMapping("/findAll")
	ResponseEntity <List<Endereco>> findAll(){
		try {
			List<Endereco> lista = this.enderecoService.findAll();
			return new ResponseEntity<>(lista, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}
	}
	
	
	/*U - UPDATE - PUT - update() - RETORNA STRING */
	@PutMapping("/update/{id}")
	ResponseEntity <String> update(@RequestBody Endereco endereco, @PathVariable long id){
		try {
			String mensagem = this.enderecoService.update(endereco, id);
			return new ResponseEntity<>(mensagem, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>("Erro ao atualizar Endereço! Dados do erro:"+e.getMessage(), HttpStatus.BAD_REQUEST );
		}
	}
	
	/*D - DELETE - DELETE - delete() - RETORNA STRING*/
	@DeleteMapping("/delete/{id}")
	ResponseEntity <String> delete(@PathVariable long id){
		try {
			String mensagem = this.enderecoService.delete(id);
			return new ResponseEntity<>(mensagem, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>("Erro ao deletar Endereço! Dados do erro:"+e.getMessage(), HttpStatus.BAD_REQUEST );
			
		}
	}
}
