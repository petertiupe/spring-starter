package de.tiupe.de.tiupe.cd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.inject.Inject;


public class CDPlayer implements MediaPlayer {

    private CompactDisc cd;

   
    public CDPlayer(CompactDisc cd) {
        this.cd = cd;
    }


    public void setCD(CompactDisc cd){
        this.cd = cd;
    }

    public void playCD() {
        cd.play();
    }

}
