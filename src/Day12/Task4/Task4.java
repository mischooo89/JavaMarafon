package Day12.Task4;


import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {

        List<String> members1 = new ArrayList<>();
        members1.add("John Lennon");
        members1.add("Freddie Mercury");
        members1.add ("Chester Bennington");
        members1.add("Corey Taylor");
        members1.add("Fred Durst");

        MusicBand band1 = new MusicBand ("U2", 1976, members1);

        List<String> members2 = new ArrayList<>();
        members2.add("Till Lindemann");
        members2.add("Dan Reynolds");
        members2.add("Adam Levine");
        members2.add("Brandon Flowers");
       // members2.add("Patrick Vaughn Stump");

        MusicBand band2 = new MusicBand("Glashaus", 2001, members2);

        band1.printMembers();
        band2.printMembers();

        MusicBand.transferMembers(band1, band2);

        band1.printMembers();
        band2.printMembers();



    }

}
