package edu.com;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.*;
public class Task1 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 System.out.println("Enter the radius:");
		 float Radius = Float.parseFloat(br.readLine());
		 double p = 3.14;
		 
		 double Perimetr = Radius * 2*p; 
		 double Area = p*Radius*Radius;
		 System.out.println("Perimetr = " +Perimetr );
		 System.out.println("Area = " +Area ); 
		
		  


	}



	}


