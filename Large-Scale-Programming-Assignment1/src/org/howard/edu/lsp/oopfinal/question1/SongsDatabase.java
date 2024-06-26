package org.howard.edu.lsp.oopfinal.question1;

//public class SongsDatabase {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub

	//}

//}
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SongsDatabase {
    private Map<String, Set<String>> map = new HashMap<>();

    /* methos for Adding song title */
    public void addSong(String genre, String songTitle) {
        map.computeIfAbsent(genre, k -> new HashSet<>()).add(songTitle);
    }
// method to return song title and genre
    public String getGenreOfSong(String songTitle) {
        for (Map.Entry<String, Set<String>> entry : map.entrySet()) {
            if (entry.getValue().contains(songTitle)) {
                return entry.getKey();
            }
        }
        return null; // Song title not found in genre
    }

    // method to return the bunch of songs in the given / requested genre 
    public Set<String> getSongs(String genre) {
        return map.getOrDefault(genre, new HashSet<>());
    }
}
