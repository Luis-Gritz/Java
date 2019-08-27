/**
 * 
 */
package aula4;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;


@Named
@RequestScoped
public class Aluno {
	
	private String matricula;
	private String nome;
	private String sobrenome;

	public String getMatricula() {
		return matricula;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	
	public String getNome() {
		return nome;
	}
	
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public String getSobrenome() {
		return sobrenome;
	}
	
	
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
}
