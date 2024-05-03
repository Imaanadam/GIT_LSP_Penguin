package org.howard.edu.lsp.oopfinal.question1;

//public class SongsDatabaseTest {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub

	//}

//}
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import java.util.Set;

import org.junit.Before;
import org.junit.Test;

public class SongsDatabaseTest {

    private SongsDatabase db;
// set up method 
    @Before
    public void setUp() {
        db = new SongsDatabase();
    }
// test method for add song
    @Test
    public void testAddSong() {
        db.addSong("pop", "Houdini");
        Set<String> popSongs = db.getSongs("pop");
        assertTrue(popSongs.contains("Houdini"));
    }
// testing method for getting the genre
    @Test
    public void testGetGenreOfSong() {
        db.addSong("kpop", "DNA");
        db.addSong("house", "hyperreal");

        assertEquals("kpop", db.getGenreOfSong("DNA"));
        assertEquals("house", db.getGenreOfSong("hyperreal"));
        assertNull(db.getGenreOfSong("Carnival")); // Non-existing song
    }
// testing method to get songs 
    @Test
    public void testGetSongs() {
        db.addSong("House", "Latch");
        db.addSong("spanish", "Loca");

        Set<String> spanishSongs = db.getSongs("spanish");
        assertFalse(spanishSongs.contains("Savage"));
        assertTrue(spanishSongs.contains("Loca"));

        Set<String> jazzSongs = db.getSongs("Jazz");
        assertTrue(jazzSongs.isEmpty()); // No songs in Jazz genre
    }
}
