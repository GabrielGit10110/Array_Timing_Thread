package controller;

public class VetorController extends Thread {

	private int[] array;
	private final int valorNumerico;
	
	
	public VetorController(int[] array, int valorNumerico) {
		this.array = array;
		this.valorNumerico = valorNumerico;
	}
	
	@Override
	public void run() {
		callOperations();

	}
	
	private void callOperations() {
		// verificacao de par ou impar
		if (valorNumerico % 2 == 0) {
			forStructure(this.array);
		} else {
			forEachStructure(this.array);
		}
		
	}
	
	
	// caso par
	private static void forStructure(int[] array) {
		double tempoInicial;
		double tempoFinal;
		double tempoSegundos;

		tempoInicial = System.nanoTime();


		for (int i = 0; i < array.length; i++) {

		}

		tempoFinal = System.nanoTime();
		
		tempoSegundos = (tempoFinal - tempoInicial)/Math.pow(10, 9);
		System.out.println("Tempo gasto com for clássico: " + tempoSegundos);
		
	}
	
	// caso impar
	private static void forEachStructure(int[] array) {
		double tempoInicial;
		double tempoFinal;
		double tempoSegundos;

		tempoInicial = System.nanoTime();

		for (int i : array) {
			
		}
		tempoFinal = System.nanoTime();
		
		tempoSegundos = (tempoFinal - tempoInicial)/Math.pow(10, 9);
		System.out.println("Tempo gasto com forEach: " + tempoSegundos);
		
	}
	
}
