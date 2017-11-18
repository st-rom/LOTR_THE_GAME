import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SwordTest {
    private Character c1;
    private Character c2;
    private KickBehavior w;

    @Before
    public void setUp() throws Exception {
        c1 = new Elf();
        c2 = new Elf();
        w = new Sword();
        c2.setPower(c2.getPower() - 3);
        c2.setHP(c2.getHP() - 3);
    }

    @Test
    public void kick() throws Exception {
        w.kick(c1, c2);
        assertEquals(false, c2.isAlive());
    }
}