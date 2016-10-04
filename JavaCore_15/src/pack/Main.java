package pack;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		
		
	/*	int [] array = new int [10];
		Scanner scanner = new Scanner(System.in);
		
		try{
			array [12] = 2;
			System.out.println("enter some number");
			int number = scanner.nextInt();
			System.out.println("some");
			Integer i = null;
			int a = i;
			
		}catch (ArrayIndexOutOfBoundsException e){
			System.out.println("index out");
		}catch(InputMismatchException i){
			i.printStackTrace();
		}catch (Exception e){
			System.out.println("all exception");
		}finally{
			scanner.close();
			System.out.println("finally");
		}
		
		try(Scanner scan = new Scanner(System.in);Scanner scan1 = new Scanner(System.in)){
			
		}catch(Exception e){
			
		}*/
		
		
		/*FileInputStream fis = FileInputStream("test.txt");*/
		
		
		
		MyException myException = new MyException();
		
		myException.three();

		System.out.println("end of code");
	
	
	
	
	
	
	}

}
