package ClasesGenericas;

public class Notas <T>{
	
	private T nota1,nota2,nota3;
		
	public Notas(){
		nota1=nota2=nota3=null;
	}
	public Notas(T nota1, T nota2,T nota3){
		this.nota1=nota1;
		this.nota2=nota2;
		this.nota3=nota3;
	}
	public T getNota1(){
		return this.nota1;
	}
	public T getNota2(){
		return this.nota2;
	}
	public T getNota3(){
		return this.nota3;
	}
	public void setNota1(T valor) {
		this.nota1=valor;
	}
	public void setNota2(T valor) {
		this.nota2=valor;
	}
	public void setNota3(T valor) {
		this.nota3=valor;
	}
	public String toString(){
		return "Las notas del alumno son: \n Primera evaluación: "+nota1
				+"\nSegunda evaluación: "+nota2+"\nTercera Evaluación: "
				+nota3;
	}
}
