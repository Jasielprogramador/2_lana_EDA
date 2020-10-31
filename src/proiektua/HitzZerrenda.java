package proiektua;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class HitzZerrenda {

	UnorderedCircularLinkedList<String> Hitzak = new UnorderedCircularLinkedList<String>("First",0); 
	
	public void listaKargatu() {
		try {
			Scanner sarrera=new Scanner(new FileReader("words.txt"));
			String lerroa;
			
			while(sarrera.hasNextLine()) {
				lerroa=sarrera.nextLine();
				//Gakoa g=new Gakoa(lerroa);
				//this.lista.add(g);
			}
			sarrera.close();
		}
		catch (FileNotFoundException e)
	    {
	      System.out.println("There was an exception!  The file was not found!");
	    } 
	    catch (IOException e)
	    {
	      System.out.println("There was an exception handling the file!");
	    }
	}
	
}
