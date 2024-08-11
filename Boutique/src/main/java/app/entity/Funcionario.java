package app.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//Declara que a classe abaixo é uma Entity
	@Entity
//Getters e Setters
	@Getter
	@Setter
//Gera os constructors
	@NoArgsConstructor
	@AllArgsConstructor

public class Funcionario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String nome;
	private String email;
	private String telefone; 
	private int idade;
	private String funcao;
}
