package com.softserve.edu.train10;

public class ApplExcep {
	public static void myTime() throws InterruptedException, Exception {
		Thread.sleep(500);
		//System.out.println("myTime()");
		for (int i = 0; i < 10; i++) {
			System.out.print(i + "  ");
			if (i == 5) {
				//break;
				//System.exit(0);
				//throw new RuntimeException("hahaha");
				throw new Exception("hahaha");
			}
		}
		System.out.println("\nmyTime()");
	}

	public static void main(String[] args) {
		int i = 0;
		try {
			System.out.println("res = " + 10 / i);
			// System.exit(0);
		} 
//		catch (NullPointerException e) { // ArithmeticException
//			System.out.println("Oh, error found");
//		} catch (Exception e) {
//			System.out.println("All Exception");
//		}
		catch (NullPointerException | ArithmeticException  e) {
			System.out.println("All Exception");
		}
		finally {
			System.out.println("finally");
		}
		//
		try {
			myTime();
		} 
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("+++Exception info = " + e.getMessage());
			//e.printStackTrace();
		}
	}
}
