package practice.javaprograms1;

import java.util.Arrays;

public class ForEachString {

	public static void main(String[] args) {
		 String[] arraystr = {"Arief", "Petchi", "Navas", "Delta", "Sigma"};
		    //The conventional approach of using the for loop
		    System.out.println("Using conventional For Loop:");
		   
		    
		    for (int i = 0; i <= arraystr.length-1; i++) {
				System.out.println(arraystr[i]);
			}
		    
		    
		    System.out.println("\nUsing Foreach loop:");
		    //The optimized method of using the for loop - also called the foreach loop
		   for (String text : arraystr) {
			   System.out.println(text);
		}
		  }
		}
