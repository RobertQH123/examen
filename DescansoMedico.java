package pecera;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;


public class DescansoMedico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array;
		int numero = 0;
	    try {
	        FileInputStream fichero = new FileInputStream("C:\\input.txt");
	
	        InputStreamReader osw = new InputStreamReader(fichero);
	        BufferedReader br = new BufferedReader(osw);
	        while(br.ready()) {
	            String linea = br.readLine();
	            System.out.print(linea);
	        }

	    }catch(FileNotFoundException e) {
	        e.getMessage();
	    }catch(IOException e) {
	        e.getMessage();
	    }

	}

}
