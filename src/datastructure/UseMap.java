package datastructure;

import java.util.*;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */

		Map <String,List<String>> videoGames = new HashMap<>();

		videoGames.put("VideoGame1",Arrays.asList("Valorant"));
		videoGames.put("VideoGame2",Arrays.asList("Fortnite"));
		videoGames.put("VideoGame3",Arrays.asList("Destiny"));
		videoGames.put("VideoGame4",Arrays.asList("Supermario"));

		Iterator<List<String>> gameStop = videoGames.values().iterator();

		System.out.print("For each loop: ");
		for (List<String> valuesOfVideoGames : videoGames.values()){
			System.out.print(valuesOfVideoGames+",");
		}
		UseArrayList.space();
		UseArrayList.space();

			System.out.print("While each loop: ");
		while (gameStop.hasNext()){
			List<String> valuesOfVideoGames = gameStop.next();
			System.out.print(valuesOfVideoGames +",");
		}

	}

}
