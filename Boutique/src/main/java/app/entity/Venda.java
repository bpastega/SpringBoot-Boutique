package app.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Venda {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	/*Várias vendas podem estar ligadas a UM cliente*/
	@ManyToOne(cascade = CascadeType.ALL) 
	@JoinColumn(name = "cliente_id", referencedColumnName = "id") 
	private Cliente cliente;
	
	/*Várias vendas podem estar ligadas a UM funcionario*/
	@ManyToOne(cascade = CascadeType.ALL) 
	@JoinColumn(name = "funcionario_id", referencedColumnName = "id") 
	private Funcionario funcionario;
		
	
	@ManyToMany(cascade = CascadeType.ALL) 
	@JoinTable(name="venda_produtos") 
	//@JsonIgnoreProperties("carros")
	private List<Produto> produto;
	
}
