package app.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String cep;
	private String numero; //leva em conta endereços com informações como 4B
	private String logradouro;
	private String cidade;
	private String estado;
	private String pais;
}
