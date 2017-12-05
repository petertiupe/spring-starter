package de.tiupe.config;

import de.tiupe.de.tiupe.cd.CDPlayer;
import de.tiupe.de.tiupe.cd.CompactDisc;
import de.tiupe.de.tiupe.cd.MediaPlayer;
import de.tiupe.de.tiupe.cd.SgtPeppers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "de.tiupe")
public class CDPlayerConfig {

    /* Dies ist ein Kommentar*/
    @Bean
    public MediaPlayer getMediaPlayer(CompactDisc aCD){
        return new CDPlayer(aCD);
    }


    @Bean
    public CompactDisc getCompactDisc(){
        return new SgtPeppers();
    }
}
