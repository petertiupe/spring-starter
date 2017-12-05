package de.tiupe;

import de.tiupe.config.ZweiCDSpielerConfig;
import de.tiupe.de.tiupe.cd.BlankDisc;
import de.tiupe.de.tiupe.cd.CompactDisc;
import de.tiupe.de.tiupe.cd.MediaPlayer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ZweiCDSpielerConfig.class)
public class ReadPropsTest {

    @Autowired
    @Qualifier("getCDPlayer1")
    private MediaPlayer playerAMK;

    @Autowired
    @Qualifier("getCDPlayer2")
    private MediaPlayer playerSgtPepper;

    @Autowired
    @Qualifier("bd")
    private CompactDisc blankDisc;


    @Test
    public void play() {
        playerAMK.playCD();
        playerSgtPepper.playCD();
    }

    @Test
    public void writeTitle(){
        System.out.println(((BlankDisc)(blankDisc)).title);
        System.out.println(((BlankDisc)(blankDisc)).artist);
    }



}
