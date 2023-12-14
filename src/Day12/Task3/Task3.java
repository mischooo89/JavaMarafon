package Day12.Task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<MusicBand> bands = new ArrayList<>();
        bands.add(new MusicBand("The Beatles", 1960));
        bands.add(new MusicBand("Queen", 1970));
        bands.add(new MusicBand("Linkin Park", 1996));
        bands.add(new MusicBand("Slipknot", 1995));
        bands.add(new MusicBand("Limp Bizkit", 1994));
        bands.add(new MusicBand("Rammstein", 1994));
        bands.add(new MusicBand("Imagine Dragons", 2008));
        bands.add(new MusicBand("Maroon 5", 2001));
        bands.add(new MusicBand("The Killers", 2001));
        bands.add(new MusicBand("Fall Out Boy", 2005));

        Collections.shuffle(bands);

        for (MusicBand band : bands) {
            System.out.println(band);
        }
        List<MusicBand> after2000Bands = groupsAfter2000(bands);
        System.out.println("\nGroups formed after 2000:");
        for (MusicBand band : after2000Bands) {
            System.out.println(band);
        }
    }




    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands){
        List<MusicBand> after2000bands = new ArrayList<>();
        for(MusicBand band : bands){
            if(band.getYear() > 2000){
                after2000bands.add(band);
            }
        }
        return after2000bands;
    }
}
