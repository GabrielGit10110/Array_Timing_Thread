package view;

import controller.VetorController;

public class Main {

	public static void main(String[] args) {
		int[] array = new int[1000];
		
		fillArray(array);
		
		VetorController op1 = new VetorController(array, 1);
		VetorController op2 = new VetorController(array, 2);
		
		op1.start();
		op2.start();

	}
	
	private static void fillArray(int[] array) {
		int limit = array.length;
		
		for (int i = 0; i < limit; i++) {
			array[i] = (int)(Math.random() * 100) + 1;
		}
	}
	
}
