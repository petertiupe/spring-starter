package de.tiupe;

import de.tiupe.config.CDPlayerConfig;
import de.tiupe.config.ProfileConfig;
import de.tiupe.de.tiupe.cd.CompactDisc;
import de.tiupe.de.tiupe.cd.MediaPlayer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ProfileConfig.class)
@ActiveProfiles("amk")
public class ActiveProfilesTest {

    @Autowired
    private MediaPlayer player;

    @Autowired
    private CompactDisc cd;

    @Test
    public void play() {
        player.playCD();
    }

}
