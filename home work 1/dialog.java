package les1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class dialog {
	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	    System.out.println("�����, �� ���� �����?");
		String name = br.readLine();
		System.out.println("�� ��� ������ �� �����?");
		String live = br.readLine();
		System.out.println("���� ����� �������?");
		int age = Integer.parseInt(br.readLine());

		System.out.println("������� " + name); 
		System.out.println("�� ����� �� " + live);
		System.out.println("� ������� �" + age);

		}
}