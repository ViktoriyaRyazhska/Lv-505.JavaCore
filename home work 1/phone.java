package les1;

import java.util.Scanner;

public class phone {
	static Scanner sc = new Scanner(System.in);
	   public static void main(String args[])
	   {
	      System.out.print("����� ������ ���������� � ������� (9,50 ���/��)- ");
	     	      double c1 = sc.nextDouble();
	     	     System.out.print("����� ������ ���������� � ������ (18 ���/��)- ");
	     	      double c2 = sc.nextDouble();
	     	     System.out.print("����� ������ ���������� � ���� (120,50 ���/��)- ");
	     	      double c3 = sc.nextDouble();
	      	      double t1 = (9.50 * c1);
	      System.out.println("ֳ�� �� ������� � ������� = " + t1);
	      double t2 = (18 * c2);
	      System.out.println("ֳ�� �� ������� � �������� = " + t2);
	      double t3 = (120.50 * c3);
	      System.out.println("ֳ�� �� ������� � ���������� ���� = " + t3);
	    	      double suma= (t1 + t2 + t3);
	      System.out.println("��������� ���� ��������� = " + suma) ;
	   }
	}

