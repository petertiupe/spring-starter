package de.tiupe.de.tiupe.cd;


public class BlankDisc implements CompactDisc{

    public BlankDisc(String title, String artist){
        super();
        this.title = title;
        this.artist = artist;
    }

    public String title;

    public String artist;

    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}

