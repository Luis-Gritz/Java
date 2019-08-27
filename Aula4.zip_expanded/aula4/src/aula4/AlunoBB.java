package aula4;

import java.io.Serializable;
import java.util.Vector;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named("alunoBB")
@SessionScoped
public class AlunoBB implements Serializable{
	@Inject
	private Aluno aluno;
	private Vector<Aluno> alunos;
	
	@PostConstruct
	public void init() {
		aluno =  new Aluno();
		this.alunos = new Vector<Aluno>();
	}
	
	public String adicionar() {
		this.alunos.add(aluno);
		aluno = new Aluno();
		return "resposta";
	}

	/**
	 * @return the aluno
	 */
	public Aluno getAluno() {
		return aluno;
	}

	/**
	 * @param aluno the aluno to set
	 */
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	/**
	 * @return the alunos
	 */
	public Vector<Aluno> getAlunos() {
		return alunos;
	}

	/**
	 * @param alunos the alunos to set
	 */
	public void setAlunos(Vector<Aluno> alunos) {
		this.alunos = alunos;
	}
	
	

}
