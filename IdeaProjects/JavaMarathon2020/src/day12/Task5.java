package day12;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> membersBand10 = new ArrayList<>();
        membersBand10.add(new MusicArtist("Mark Mumford",27));
        membersBand10.add(new MusicArtist("Winston Marshall", 32));
        membersBand10.add(new MusicArtist("Ben Lowett", 31));
        membersBand10.add(new MusicArtist("Ted Dwain",28));
        membersBand10.add(new MusicArtist("Rob Mus", 26));
        MusicBand band10 = new MusicBand("Mumford&Sons",2007, membersBand10);

        List<MusicArtist> membersBand9 = new ArrayList<>();
        membersBand9.add(new MusicArtist("Patric Stamp",38));
        membersBand9.add(new MusicArtist("Pit Wentz",42));
        membersBand9.add(new MusicArtist("Endi Gerly", 40));
        MusicBand band9 = new MusicBand("Fall Out Boy",2001, membersBand9);

        band9.printMembers();
        band10.printMembers();

        MusicBand.transferMembers(band9,band10);

        band9.printMembers();
        band10.printMembers();
    }
}
