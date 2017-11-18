import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ElfTest {
    private Character c1;
    private Character c2;

    @Before
    public void setUp() throws Exception {
        c1 = new Elf();
        c2 = new Elf();
    }

    @Test
    public void getPower() throws Exception {
        assertEquals(10, c2.getPower());
    }

    @Test
    public void setPower() throws Exception {
        c2.setPower(3);
        assertEquals(7, c2.getPower());
    }

    @Test
    public void getHP() throws Exception {
        assertEquals(10, c1.getHP());
    }

    @Test
    public void setHP() throws Exception {
        c1.setHP(7);
        assertEquals(3, c1.getHP());
    }

    @Test
    public void isAlive() throws Exception {
        assertEquals(true, c2.isAlive());
    }

    @Test
    public void kick() throws Exception {
        c2.setPower(3);
        c2.setHP(3);
        c1.kick(c2);
        assertEquals(false, c2.isAlive());
    }

    @Test
    public void death() throws Exception {
        c2.death();
        assertEquals(0, c2.getHP());
    }
}