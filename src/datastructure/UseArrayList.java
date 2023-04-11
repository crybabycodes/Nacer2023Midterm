package datastructure;

import java.util.ArrayList;
import java.util.Iterator;

public class UseArrayList {

	public static void space(){
		System.out.println();
	}
	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 *
		 */
		ArrayList <String> narutoShippuden = new ArrayList<>();

		narutoShippuden.add("Naruto");
		narutoShippuden.add("Sasuke");
		narutoShippuden.add("Sakura");
		narutoShippuden.add("Kakashi");
		narutoShippuden.add("Obito");
		narutoShippuden.add("Itachi");
		narutoShippuden.add("Hinata");
		narutoShippuden.add("Madara");
		narutoShippuden.add("Gaara");
		narutoShippuden.add("Jiraiya");
		narutoShippuden.add("Minato");

		System.out.println("ArrayList: "+ narutoShippuden);

		System.out.println("Peek: "+ narutoShippuden.get(5));

		String remove = narutoShippuden.remove(7);
		System.out.println("Remove: " + remove);

		System.out.print("For each loop: ");

		Iterator<String> nineTales = narutoShippuden.iterator();

		for(String str : narutoShippuden){
			System.out.print(str + ", ");
		}
		space();
		System.out.print("While each loop: ");
		while(nineTales.hasNext()){
			System.out.print(nineTales.next()+ ", ");
		}
	}
}