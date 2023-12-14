package Day12.Task5;



import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {


        List<MusicArtist> members1 = new ArrayList<>();
        members1.add(new MusicArtist("John Lennon", 1980));
        members1.add(new MusicArtist("Freddie Mercury", 42));
        members1.add(new MusicArtist("Chester Bennington",35));
        members1.add(new MusicArtist("Corey Taylor", 45));
        members1.add(new MusicArtist("Fred Durst", 50));

        MusicBand band1 = new MusicBand("U2", 1976, members1 );

        List<MusicArtist> members2 = new ArrayList<>();
        members2.add(new MusicArtist("Till Lindemann", 55));
        members2.add(new MusicArtist("Dan Reynolds", 50));
        members2.add(new MusicArtist("Adam Levine",42));
        members2.add(new MusicArtist("Brandon Flowers", 41));
        members2.add(new MusicArtist("Patrick Vaughn Stump", 40));

         MusicBand band2 = new MusicBand("Glashaus", 2001, members2);

        band1.printMembers();
        band2.printMembers();

        MusicBand.transferMembers(band1, band2);

        band1.printMembers();
        band2.printMembers();
    }
}
