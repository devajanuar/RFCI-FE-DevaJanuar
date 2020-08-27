package iFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class FactoryTest {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int inputLenght = 7;
		int[] array = new int[7];
		int temporer,index = 1;
		
		for (int i = 0; i < inputLenght; i++) {
			System.out.print("Masukan nilai Array - "+(i+1)+" : ");
			array[i] = scan.nextInt();
		}
		System.out.println();
		
		for (int i = 0; i < array.length; i++) {
			for (int j = i+1; j < array.length; j++) {
				List<Integer> list = new ArrayList<>();
				if (array[i] > array[j]) {
					list.add(array[j]);
					list.add(array[i]);
					temporer = array[i];
					array[i] = array[j];
					array[j] = temporer;
					System.out.println((index++)+". "+ list + " -> " + Arrays.toString(array));
					
					if(i == 0) {
						System.out.println();
						System.out.println("Jumlah swap: "+(index - 1));
						System.exit(0);
					}else {
						i--;
					}
					j = i;
				}else {
					i++;
				}
			}
		}
		
	}

}
