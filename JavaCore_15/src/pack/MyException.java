package pack;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class MyException extends Exception{
	
	public MyException() throws FileNotFoundException{
		throw new FileNotFoundException();
	}
	
	public void one() throws FileNotFoundException{
		/*FileInputStream fis = new FileInputStream("test.txt");*/
		throw new FileNotFoundException();
	}
	
	public void two() throws FileNotFoundException{
		one();
	}
	
	public void three() throws FileNotFoundException{
		two();
	}

}
