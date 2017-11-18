import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RingTest {
    private Character c1;
    private Character c2;
    private KickBehavior w;

    @Before
    public void setUp() throws Exception {
        c1 = new Elf();
        c2 = new Elf();
        w = new Ring();
    }

    @Test
    public void kick() throws Exception {
        w.kick(c1, c2);
        assertEquals(false, c2.isAlive());
    }
}