
package database;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MoviesDB<T extends Comparable<T>> {

	private String fileName;

	private Map<String, RedBlackTree<T, HashSet<Integer>>> indexTreeMap = new HashMap<String, RedBlackTree<T, HashSet<Integer>>>();

	private Movie[] db;
	private int n;

	// load the array with the data given in the csv file
	public MoviesDB(String fileName) throws FileNotFoundException {
		int j = 0; //iterating through the db array
		Movie movie; // change from null to initalize
		String token1 = "";
		Scanner inFile1 = new Scanner(new File(fileName)).useDelimiter("\\r?\\n");
		List<String> temps = new ArrayList<String>();
		while (inFile1.hasNext()) {
			// find next line
			token1 = inFile1.next();
			temps.add(token1);
		}
		inFile1.close();
		String[] tempsArray = temps.toArray(new String[temps.size()]);
				String movieDetails; 
		Pattern moviePattern = Pattern.compile("(.*?),(.*?),\"(.*?)\" ,(.*?),(.*?),(.*?),(.*?),(.*?),(.*?),(.*?),(.*?),(.*?),(.*?),(.*)");
		Matcher matcher;
		String[] movieDetailsArray;
		db = new Movie[10]; //need to change the movie size //
		
		for (int i = 0; i < tempsArray.length; i++) {
			movieDetails = tempsArray[i];
			matcher = moviePattern.matcher(movieDetails);
			matcher = moviePattern.matcher(movieDetails);
			if (matcher.find()) {
				movie = new Movie(Integer.parseInt(matcher.group(1)), matcher.group(2), matcher.group(3),
						Integer.parseInt(matcher.group(4)), matcher.group(5), matcher.group(6), matcher.group(7),
						matcher.group(8), matcher.group(9), matcher.group(10), matcher.group(11), matcher.group(12),
						Long.parseLong(matcher.group(13)), Float.parseFloat(matcher.group(14)));
				
				db[j] = movie; //add the new movie object to the db array
				j++; //increment j 

			} else {
				movieDetailsArray = movieDetails.split(","); //takes in all movie objects 
				//System.out.println(movieDetailsArray[13]);
				
				movie = new Movie(Integer.parseInt(movieDetailsArray[0]),movieDetailsArray[1],movieDetailsArray[2],
						Integer.parseInt(movieDetailsArray[3]),movieDetailsArray[4],movieDetailsArray[5],movieDetailsArray[6],
						movieDetailsArray[7],movieDetailsArray[8],movieDetailsArray[9],movieDetailsArray[10],
						movieDetailsArray[11],Long.parseLong(movieDetailsArray[12]),Float.parseFloat(movieDetailsArray[13]));
				
				db[j] = movie;
				j++;
			}

		}
		
		for (Movie s : db) {
			System.out.println(s.toString());
		}
		

	}

	// create a new red black tree by field
	public void addFieldIndex(String field) {
		if(field.equals("color")){
			
		}else if(field.equals("title")) {
		
		}else if(field.equals("director_name")) {
			
		}else if(field.equals("act1")) {
			
		}else if(field.equals("act2")) {
			
		}else if(field.equals("act3")) {
			
		}else if(field.equals("movie_imdb_link")) {
			
		}else if(field.equals("language")) {
			
		}else if(field.equals("country")) {
			
		}else if(field.equals("content_rating")){
			
			
		}

	}

	// returns the hash map for index trees (red black trees)
	public Map<String, RedBlackTree<T, HashSet<Integer>>> getIndexTreeMap() {
		return indexTreeMap;
	}

	// sample text case
	public static void main(String[] args) throws FileNotFoundException {

		MoviesDB movieDB = new MoviesDB("simple.txt"); //
//		movieDB.addFieldIndex("year");
//		movieDB.addFieldIndex("imdb_score");
//		Query<Integer> query = new And(new Equal("year", 2012), new Equal("imdb_score", 6.1));
//		HashSet<Integer> result = (HashSet<Integer>) query.execute(movieDB.getIndexTreeMap());
//		if (result != null) {
//			System.out.println(result);
//		}
//		Iterator<Integer> idIterator = result.iterator();
//		while (idIterator.hasNext()) {
//			int id = idIterator.next();
//			movieDB.print(id);
//		}

		// MoviesDB("simple.txt");

	}
}