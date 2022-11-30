import org.junit.*;


public class CilnineTest {
    Cilnine c;
    Vanilla v;

    @Before
    public void setup() {
        c = new Cilnine(0);
        v = new Vanilla(10);
    }

    @Test
    public void testAtacar() {
        c.atacar(v);
        Assert.assertEquals(v.saludActual, 24);
    }

    @Test
    public void testRecibirAtaque() {
        v.atacar(c);
        Assert.assertEquals(c.saludActual, 76 - 10 * 2 / 3);
    }

    @Test
    public void testDescansar() {
        c.saludActual = 10;
        c.descansar();
        Assert.assertEquals(c.saludActual, 43);
        Assert.assertFalse(c.puedeAtacar);
        Assert.assertEquals(c.saludMaxima, 76 + 33);
    }

} 