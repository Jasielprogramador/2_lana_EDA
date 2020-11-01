package proiektua;

import java.io.FileNotFoundException;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.*;

public class HitzZerrenda {
	
	UnorderedCircularLinkedList<String> Hitzak = new UnorderedCircularLinkedList<String>("Head");
	OrderedCircularLinkedList<String> hitz=new OrderedCircularLinkedList<String>("Head");
	OrderedCircularLinkedList<String> alo=new OrderedCircularLinkedList<String>("Head");

	public void listaKargatu() {
		try {
			Scanner sarrera=new Scanner(new FileReader("words.txt"));
			String lerroa="";
			
			
			boolean a=false;
			String bilatu="";
			
			while(sarrera.hasNextLine()) {
				lerroa=sarrera.nextLine();
				Hitzak.addToRear(lerroa);
				hitz.add(lerroa);
				alo.add(lerroa);
				if(!a) {
					a=true;
					bilatu=lerroa;
				}
			}
			
			hitz.merge(alo);
			
			int kont=0;
			Node<String> unekoa=hitz.last;
			while(kont<10) {
				System.out.println(unekoa.data);
				unekoa=unekoa.next;
				kont++;
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

	public static void main(String[] args) {
		HitzZerrenda a=new HitzZerrenda();
		a.listaKargatu();
	}
}
