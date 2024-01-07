package TestingCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise3Test {

    @Test
    public void crushingBlow() {
        String output = Exercise3.spoonerize("Crushing blow");
        assertEquals("Blushing crow", output);
    }

    @Test
    public void soundBite() {
        String output = Exercise3.spoonerize("Sound bite");
        assertEquals("Bound site", output);
    }

    @Test
    public void flatCap() {
        String output = Exercise3.spoonerize("Flat cap");
        assertEquals("Cat flap", output);
    }

    @Test
    public void sadBallad() {
        String output = Exercise3.spoonerize("Sad ballad");
        assertEquals("Bad sallad", output);
    }

    @Test
    public void masterPlan() {
        String output = Exercise3.spoonerize("Master plan");
        assertEquals("Plaster man", output);
    }

    @Test
    public void trailSnacks() {
        String output = Exercise3.spoonerize("Trail snacks");
        assertEquals("Snail tracks", output);
    }
}
