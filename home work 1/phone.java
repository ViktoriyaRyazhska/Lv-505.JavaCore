package les1;

import java.util.Scanner;

public class phone {
	static Scanner sc = new Scanner(System.in);
	   public static void main(String args[])
	   {
	      System.out.print("скількі хвелин розмовляли з Польшею (9,50 грт/хв)- ");
	     	      double c1 = sc.nextDouble();
	     	     System.out.print("скількі хвелин розмовляли з Китаем (18 грт/хв)- ");
	     	      double c2 = sc.nextDouble();
	     	     System.out.print("скількі хвелин розмовляли з КНДР (120,50 грт/хв)- ");
	     	      double c3 = sc.nextDouble();
	      	      double t1 = (9.50 * c1);
	      System.out.println("Ціна за розмову з Поляком = " + t1);
	      double t2 = (18 * c2);
	      System.out.println("Ціна за розмову з Китайцем = " + t2);
	      double t3 = (120.50 * c3);
	      System.out.println("Ціна за розмову з Повстанцем КНДР = " + t3);
	    	      double suma= (t1 + t2 + t3);
	      System.out.println("Загальний борг становить = " + suma) ;
	   }
	}

