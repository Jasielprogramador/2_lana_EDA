package proiektua;

import java.io.FileNotFoundException;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class HitzZerrenda {

	UnorderedCircularLinkedList<String> Hitzak = new UnorderedCircularLinkedList<String>("First"); 
	
	public void listaKargatu() {
		try {
			Scanner sarrera=new Scanner(new FileReader("words.txt"));
			String lerroa;
			int kont=0;
			while(sarrera.hasNextLine() && kont<10) {
				lerroa=sarrera.nextLine();
				Hitzak.addToRear(lerroa);
			}
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
