package www.greatlearning.model;

import java.util.Arrays;
import java.util.Scanner;
import www.greatlearning.service.Mergesort;
import www.greatlearning.service.NotesCount;
	public class Driver {

		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Mergesort mergeSort = new Mergesort();
		NotesCount notesCount = new NotesCount();
		System.out.println("Enter the total no of denominations");
		int totalNoOfDenominations = sc.nextInt();
		int [] notes = new int[totalNoOfDenominations];
		System.out.println("Enter the Currency denominations value");
		for(int i=0; i<totalNoOfDenominations;i++) {
			notes[i] = sc.nextInt();
		}
		System.out.println("Enter the amount you want to Pay");
		int amount = sc.nextInt();
		mergeSort.sort(notes, 0, notes.length-1);
		System.out.println(Arrays.toString(notes));
		notesCount.notesCountImplementation(notes, amount);
		}
		
	}
