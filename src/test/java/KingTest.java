import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class KingTest {
    private Character c1;
    private Character c2;

    @Before
    public void setUp() throws Exception {
        c1 = new King();
        c2 = new King();
    }

    @Test
    public void setPower() throws Exception {
        c2.setPower(c2.getPower() - 3);
        assertEquals(3, c2.getPower());
    }

    @Test
    public void setHP() throws Exception {
        c1.setHP(c1.getHP() - 3);
        assertEquals(3, c1.getHP());
    }

    @Test
    public void isAlive() throws Exception {
        assertEquals(true, c2.isAlive());
    }

    @Test
    public void kick() throws Exception {
        c2.setPower(c2.getPower() - 3);
        c2.setHP(c2.getHP() - 3);
        c1.kick(c2);
        assertEquals(false, c2.isAlive());
    }

    @Test
    public void death() throws Exception {
        c2.death();
        assertEquals(0, c2.getHP());
    }
}