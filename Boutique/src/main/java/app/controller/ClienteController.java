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

import app.entity.Cliente;
import app.service.ClienteService;

@RestController
@RequestMapping("/api/cliente")
public class ClienteController {
	
	@Autowired ClienteService clienteService;
	
	/*C - CREATE - POST - save() - RETORNA STRING*/
	@PostMapping("/save")
	ResponseEntity <String> save(@RequestBody Cliente cliente){
		try {
			String mensagem = this.clienteService.save(cliente);
			return new ResponseEntity<>(mensagem, HttpStatus.OK);
		} catch (Exception e) { 
			return new ResponseEntity<>("Erro ao criar Cliente! Dados do erro:"+e.getMessage(), HttpStatus.BAD_REQUEST);
		}
	}
	
	
	/*R - READ - GET - findById() - RETORNA CLIENTE*/
	@GetMapping("/findById/{id}")
	ResponseEntity <Cliente> findById(@PathVariable long id){
		try {
			Cliente cliente = this.clienteService.findById(id);
			return new ResponseEntity<>(cliente, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}
	}
	
	/*R - READ - GET - findAll() - RETORNA LISTA*/
	@GetMapping("/findAll")
	ResponseEntity <List<Cliente>> findAll(){
		try {
			List<Cliente> lista = this.clienteService.findAll();
			return new ResponseEntity<>(lista, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}
	}
	
	
	/*U - UPDATE - PUT - update() - RETORNA STRING */
	@PutMapping("/update/{id}")
	ResponseEntity <String> update(@RequestBody Cliente cliente, @PathVariable long id){
		try {
			String mensagem = this.clienteService.update(cliente, id);
			return new ResponseEntity<>(mensagem, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>("Erro ao atualizar Cliente! Dados do erro:"+e.getMessage(), HttpStatus.BAD_REQUEST );
		}
	}
	
	/*D - DELETE - DELETE - delete() - RETORNA STRING*/
	@DeleteMapping("/delete/{id}")
	ResponseEntity <String> delete(@PathVariable long id){
		try {
			String mensagem = this.clienteService.delete(id);
			return new ResponseEntity<>(mensagem, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>("Erro ao deletar Cliente! Dados do erro:"+e.getMessage(), HttpStatus.BAD_REQUEST );
		}
	}
	
	@GetMapping("/findByIdade")
	ResponseEntity <List<Cliente>> findByIdade(){
		try {
			List<Cliente> lista = this.clienteService.findByIdade();
			return new ResponseEntity<>(lista, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}
	}
}


/*C - CREATE - POST - save() - RETORNA STRING*/
/*R - READ - GET - findById() - RETORNA ENDEREÇO*/
/*R - READ - GET - findAll() - RETORNA LISTA*/
/*U - UPDATE - PUT - update() - RETORNA STRING */
/*D - DELETE - DELETE - delete() - RETORNA STRING*/
