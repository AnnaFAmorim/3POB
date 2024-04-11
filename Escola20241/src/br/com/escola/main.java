package br.com.escola;

public class main {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
			
		aluno.setCpf("11111111110");
		aluno.setMatricula("2025123456");
		aluno.setNome("Jose da silva");
		aluno.setEmail("ze@gmail.com");
		
		System.out.println(aluno.getMatricula());
		System.out.println(aluno.getNome());
		System.out.println(aluno.getEmail());
		System.out.println(aluno.getCpf());
		

	}	
}
