import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

class Playlist {

    public static void main(String[] args){
        String[] favoriteSongs = {"Wings", "Till I Die 2", "I Can Feel It", "Changed", "Broadway Girls", "Girlfriend", "The Other Side", "Turn the Music Up", "Snooze", "One Foot in the Grave"};
        System.out.println(favoriteSongs[0]);
        System.out.println(favoriteSongs[1]);
        System.out.println(favoriteSongs[2]);

        ArrayList<String> desertIslandPlaylist = new ArrayList<>();
        desertIslandPlaylist.add("Run This Town");
        desertIslandPlaylist.add("Throne");
        desertIslandPlaylist.add("Legends Falling");
        desertIslandPlaylist.add("Shine On");
        desertIslandPlaylist.add("Only One");
        System.out.println(desertIslandPlaylist);

        Arrays.asList(favoriteSongs);
        desertIslandPlaylist.addAll(Arrays.asList(favoriteSongs));
        System.out.println(desertIslandPlaylist.size());

        desertIslandPlaylist.remove("Changed");
        desertIslandPlaylist.remove("One Foot in the Grave");
        desertIslandPlaylist.remove("Throne");
        desertIslandPlaylist.remove("Snooze");
        desertIslandPlaylist.remove("I Can Feel It");

        System.out.println(desertIslandPlaylist);
        int Song_A = desertIslandPlaylist.indexOf("Wings");
        int Song_B = desertIslandPlaylist.indexOf("Till I Die 2");
        String tempA = "Wings";
        desertIslandPlaylist.set(Song_A, "Till I Die 2");
        System.out.println(desertIslandPlaylist);
        desertIslandPlaylist.set(Song_B, tempA);
        System.out.println(desertIslandPlaylist);

        reverseArrayList(desertIslandPlaylist);
        System.out.print("Reversed List: ");
        System.out.println(desertIslandPlaylist);

        shuffleArrayList(desertIslandPlaylist);
        System.out.print("Shuffled List: ");
        System.out.println(desertIslandPlaylist);
    }
    public static void reverseArrayList(ArrayList<String> list){
        Collections.reverse(list);
    }

    public static void shuffleArrayList(ArrayList<String> list){
        Collections.shuffle(list);
    }

}