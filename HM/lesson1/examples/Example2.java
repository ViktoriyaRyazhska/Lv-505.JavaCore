package lesson1.examples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example2 {
	public static void main(String []args) throws IOException {
		 BufferedReader br = new BufferedReader(
					new InputStreamReader(System.in));
		System.out.println("�����! \n�� ���� �����?");
		String name = br.readLine();
		System.out.println("� ��� ��, ������ �������������\n");
		
		System.out.println(name + " � �� ������������ ������������ ��� ������� Java \n�����!");
	}
}
