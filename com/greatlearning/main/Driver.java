package com.greatlearning.main;

import java.util.Scanner;

import com.greatlearning.service.TransactionTargetAlgo;

public class Driver {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		TransactionTargetAlgo transactionTargetAlgo = new TransactionTargetAlgo();
	    System.out.println("enter the transactions of transaction array");
	    int Trans=scanner.nextInt();
	    int[] transactions= new int[Trans];
	    System.out.println("enter values of transactions");
	    for (int i=0;i<Trans;i++)
	    	transactions[i]=scanner.nextInt();
	    System.out.println("enter the total number of targets that needs to be achieved");
	    int targetcount=scanner.nextInt();
	    System.out.println("enter the value of targets");
	    int target;
	    for (int i=0; i<targetcount; i++) {
	    	target=scanner.nextInt();
	    	transactionTargetAlgo.processTransactions(transactions,target);
	    }
	    	
	    
		

	}

}
