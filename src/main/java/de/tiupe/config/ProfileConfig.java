package de.tiupe.config;

import de.tiupe.de.tiupe.cd.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

public class ProfileConfig {
    @Profile("amk")
    @Bean
    public CompactDisc getAnnenMaiKantereitDisc(){
        return new AnnenMaiKantereit();
    }

    @Profile("sp")
    @Bean
    public CompactDisc getSgtPeppersDisc(){
        return new SgtPeppers();
    }

    @Bean
    public MediaPlayer getMediaPlayer(CompactDisc aCD){
        return new CDPlayer(aCD);
    }

}
