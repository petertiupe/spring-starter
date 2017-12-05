package de.tiupe.de.tiupe.cd;

import org.springframework.stereotype.Component;


public class AnnenMaiKantereit implements CompactDisc{

    private String title = "Zuhause";

    private String artist = "Annen Mai Kantereit";

    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}

