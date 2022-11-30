import java.util.PriorityQueue;
import java.util.Queue;

public class ProbandoColaPrioridad {

	public static void main(String[] args) {
		Queue<Paciente> colaP=new PriorityQueue<Paciente>();
		Paciente p1=new Paciente(23);
		Paciente p2=new Paciente(34);
		Paciente p3=new Paciente(50);
		Paciente p4=new Paciente(65);
		Paciente p5=new Paciente(80);
		
		colaP.add(p1);
		colaP.add(p2);
		colaP.add(p3);
		colaP.add(p4);
		colaP.add(p5);
		
		///System.out.println(colaP.poll().toString()); /// remueve el primer elemento de la cola
		System.out.println(colaP);
		System.out.println(colaP.peek().toString());///Me muestra el primer elemento de la cola sin remover
		System.out.println(colaP);
		System.out.println(colaP.offer(new Paciente(95)));///AGREGA UN ELEMENTO EN LA COLA
		System.out.println(colaP);
	}

}
