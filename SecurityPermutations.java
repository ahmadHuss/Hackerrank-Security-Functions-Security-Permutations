import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SecurityPermutations {

		public static void main(String[] args) {

			
			Scanner s = new Scanner(System.in);
			int n = s.nextInt();
			//Array index start from 1
			int function[] = new int[n+1];
			int temp =0;
			for (int i = 1; i <=n; i++) {
				function[i] = s.nextInt();
			}
		      //Print Permutation
			for (int i = 1; i <=n; i++) {
				
				System.out.println(function[function[i]]);
				
			}
		}
		
			
		
	}
