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

import app.entity.Produto;
import app.service.ProdutoService;

@RestController
@RequestMapping("/api/produto")
public class ProdutoController {
	
	@Autowired 
	ProdutoService produtoService;
	
	/*C - CREATE - POST - save() - RETORNA STRING*/
	@PostMapping("/save")
	ResponseEntity <String> save(@RequestBody Produto produto){
		try {
			String mensagem = this.produtoService.save(produto);
			return new ResponseEntity<>(mensagem, HttpStatus.OK);
		} catch (Exception e) { 
			return new ResponseEntity<>("Erro ao criar Produto! Dados do erro:"+e.getMessage(), HttpStatus.BAD_REQUEST);
		}
	}
	
	
	/*R - READ - GET - findById() - RETORNA CLIENTE*/
	@GetMapping("/findById/{id}")
	ResponseEntity <Produto> findById(@PathVariable long id){
		try {
			Produto produto = this.produtoService.findById(id);
			return new ResponseEntity<>(produto, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}
	}
	
	/*R - READ - GET - findAll() - RETORNA LISTA*/
	@GetMapping("/findAll")
	ResponseEntity <List<Produto>> findAll(){
		try {
			List<Produto> lista = this.produtoService.findAll();
			return new ResponseEntity<>(lista, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}
	}
	
	
	/*U - UPDATE - PUT - update() - RETORNA STRING */
	@PutMapping("/update/{id}")
	ResponseEntity <String> update(@RequestBody Produto produto, @PathVariable long id){
		try {
			String mensagem = this.produtoService.update(produto, id);
			return new ResponseEntity<>(mensagem, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>("Erro ao atualizar Produto! Dados do erro:"+e.getMessage(), HttpStatus.BAD_REQUEST );
		}
	}
	
	/*D - DELETE - DELETE - delete() - RETORNA STRING*/
	@DeleteMapping("/delete/{id}")
	ResponseEntity <String> delete(@PathVariable long id){
		try {
			String mensagem = this.produtoService.delete(id);
			return new ResponseEntity<>(mensagem, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>("Erro ao deletar Produto! Dados do erro:"+e.getMessage(), HttpStatus.BAD_REQUEST );
			
		}
	}
	
	@GetMapping("/maioresPrecos")
	ResponseEntity <List<Produto>> caros(){
		try {
			List<Produto> produto = this.produtoService.findByDezMaioresPrecos();
			return new ResponseEntity<>(produto, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}
	}
}
