package de.tiupe.config;

import de.tiupe.de.tiupe.cd.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class ZweiCDSpielerConfig {


    @Bean
    public CompactDisc annenMaiKantereitDisc(){
        return new AnnenMaiKantereit();
    }


    @Bean
    public CompactDisc sgtPeppersDisc(){
        return new SgtPeppers();
    }

    @Bean
    public MediaPlayer getCDPlayer1(@Qualifier("annenMaiKantereitDisc")CompactDisc aCD){
        return new CDPlayer(aCD);
    }

    @Bean MediaPlayer getCDPlayer2(@Qualifier("sgtPeppersDisc")CompactDisc aCD) {
        return new CDPlayer(aCD);
    }

}
