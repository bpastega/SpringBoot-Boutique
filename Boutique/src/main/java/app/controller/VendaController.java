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

import app.entity.Venda;
import app.service.VendaService;

@RestController
@RequestMapping("/api/venda")
public class VendaController {
	@Autowired 
	VendaService vendaService;
	
	/*C - CREATE - POST - save() - RETORNA STRING*/
	@PostMapping("/save")
	ResponseEntity <String> save(@RequestBody Venda venda){
		try {
			String mensagem = this.vendaService.save(venda);
			return new ResponseEntity<>(mensagem, HttpStatus.OK);
		} catch (Exception e) { 
			return new ResponseEntity<>("Erro ao criar Venda! Dados do erro:"+e.getMessage(), HttpStatus.BAD_REQUEST);
		}
	}
	
	
	/*R - READ - GET - findById() - RETORNA CLIENTE*/
	@GetMapping("/findById/{id}")
	ResponseEntity <Venda> findById(@PathVariable long id){
		try {
			Venda venda = this.vendaService.findById(id);
			return new ResponseEntity<>(venda, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}
	}
	
	/*R - READ - GET - findAll() - RETORNA LISTA*/
	@GetMapping("/findAll")
	ResponseEntity <List<Venda>> findAll(){
		try {
			List<Venda> lista = this.vendaService.findAll();
			return new ResponseEntity<>(lista, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}
	}
	
	
	/*U - UPDATE - PUT - update() - RETORNA STRING */
	@PutMapping("/update/{id}")
	ResponseEntity <String> update(@RequestBody Venda venda, @PathVariable long id){
		try {
			String mensagem = this.vendaService.update(venda, id);
			return new ResponseEntity<>(mensagem, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>("Erro ao atualizar Venda! Dados do erro:"+e.getMessage(), HttpStatus.BAD_REQUEST );
		}
	}
	
	/*D - DELETE - DELETE - delete() - RETORNA STRING*/
	@DeleteMapping("/delete/{id}")
	ResponseEntity <String> delete(@PathVariable long id){
		try {
			String mensagem = this.vendaService.delete(id);
			return new ResponseEntity<>(mensagem, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>("Erro ao deletar Venda! Dados do erro:"+e.getMessage(), HttpStatus.BAD_REQUEST );
			
		}
	}
	
	/*Encontra o total de uma Venda (soma todos os valores dos produtos)*/
	@GetMapping("/getTotal/{id}")
	public ResponseEntity<Float> getTotalPrecoByVendaId(@PathVariable Long id) {
	    try {
	        Float valor = this.vendaService.getTotalPrecoByVendaId(id);
	         return new ResponseEntity<>(valor, HttpStatus.OK);
	    } catch (Exception e) {
	        return new ResponseEntity<>(HttpStatus.BAD_REQUEST); 
	    }
	}

	/*TODO: NÃO ADICIONA!! tentar de novo*/
	
	/*@GetMapping("/clienteNome/{nome}")
	ResponseEntity <List<Venda>> findByCliente(@PathVariable String nome){
		try {
			 List<Venda> todasVendas = vendaService.findAll();
		        List<Venda> nomesEncontrados = new ArrayList<>(); 

		        for (Venda vendaAnalisada : todasVendas) { 
		            if (vendaAnalisada.getCliente() != null && vendaAnalisada.getCliente().getNome() != null
		                    && vendaAnalisada.getCliente().getNome().equalsIgnoreCase(nome)) { 
		                nomesEncontrados.add(vendaAnalisada);
		            }
		        }
			
			return new ResponseEntity<>(nomesEncontrados, HttpStatus.OK);
			
		} catch(Exception e) {
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}
	}*/
	
	@GetMapping("/findByCliente/{nome}")
	public ResponseEntity<List<Venda>> findByCliente(@PathVariable String nome){
		try {
			List<Venda> lista = this.vendaService.findByCliente(nome);
			return new ResponseEntity<>(lista, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}
	}
	
	@GetMapping("/findByFuncionario/{nome}")
	public ResponseEntity<List<Venda>> findByFuncionario(@PathVariable String nome){
		try {
			List<Venda> lista = this.vendaService.findByFuncionario(nome);
			return new ResponseEntity<>(lista, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}
	}
	
	@GetMapping("/findByTotal")
	public ResponseEntity<List<Venda>> findTop10ByTotalPreco(){
		try {
			List<Venda> lista = this.vendaService.findTop10ByTotalPreco();
			return new ResponseEntity<>(lista, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}
	}
	/*@GetMapping("/findByTotal")
	public ResponseEntity<List<Venda>> findTop10ByTotalPreco(){
		try {
			List<Venda> lista = this.vendaService.findTop10ByTotalPreco();
			return new ResponseEntity<>(lista, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}
	}	*/
	
	/*@GetMapping("/findByTotais")
	public ResponseEntity<List<Venda>> findByTotais(){
		try {
			List<Venda> todasVendas = this.vendaService.findAll();
			List<Float> totais = null;
			
			for (Venda vendaAnalisada: todasVendas){
				float valor = vendaService.getTotalPrecoByVendaId(vendaAnalisada.getId());
				totais.add(valor);
			}
			
			//Bubble sort??
			for(int i=0; i<totais.size() - 1;i++) {
				for(int j=0;j<totais.size()-1-i;j++) {
					if (totais.get(j)>totais.get(j+1)) {
						float aux = totais.get(j);
						totais[j] = totais.get(j+1);
						
					}
				}
			}
			
		} catch(Exception e) {
			
		}
	}*/
	
	/*@GetMapping("/findByTotais")
	public ResponseEntity<List<Venda>> findByTotais() {
	    try {
	        // Step 1: Fetch all Vendas
	        List<Venda> todasVendas = this.vendaService.findAll();

	        // Step 2: Create a map to hold total prices for each Venda
	        Map<Venda, Float> vendaTotalMap = new HashMap<>();

	        // Step 3: Calculate total price for each Venda and add to map
	        for (Venda vendaAnalisada : todasVendas) {
	            float valor = vendaService.getTotalPrecoByVendaId(vendaAnalisada.getId());
	            vendaTotalMap.put(vendaAnalisada, valor);
	        }

	        // Step 4: Convert the map to a list for sorting
	        List<Map.Entry<Venda, Float>> vendaList = new ArrayList<>(vendaTotalMap.entrySet());

	        // Step 5: Bubble Sort based on total prices (descending order)
	        int n = vendaList.size();
	        for (int i = 0; i < n - 1; i++) {
	            for (int j = 0; j < n - 1 - i; j++) {
	                if (vendaList.get(j).getValue() < vendaList.get(j + 1).getValue()) {
	                    // Swap vendaList[j] and vendaList[j+1]
	                    Map.Entry<Venda, Float> temp = vendaList.get(j);
	                    vendaList.set(j, vendaList.get(j + 1));
	                    vendaList.set(j + 1, temp);
	                }
	            }
	        }

	        // Step 6: Extract the top 10 most expensive Vendas
	        List<Venda> top10Vendas = vendaList.stream()
	                                           .limit(10)
	                                           .map(Map.Entry::getKey)
	                                           .collect(Collectors.toList());

	        return new ResponseEntity<>(top10Vendas, HttpStatus.OK);
	    } catch (Exception e) {
	        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	    }
	}*/
	

}
