import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GameManagerTest {
    private Character c1;
    private Character c2;
    private GameManager m;

    @Before
    public void setUp() throws Exception {
        c1 = new Dwarf();
        c2 = new Elf();
        m = new GameManager();
        c2.setPower(c2.getPower() - 3);
        c2.setHP(c2.getHP() - 3);
    }

    @Test
    public void fight() throws Exception {
        assertEquals("Dwarf", m.fight(c1, c2).getClass().getSimpleName());
    }
}