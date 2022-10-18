import org.junit.*;

public class Test_calc
{
    private Calc calc;

    @Before
    public void setUp(){
        calc = new Calc(16,4);
    }
    @Test
    public void testSum() {
        Assert.assertEquals(20,calc.sum());
        calc.a=10;
        Assert.assertNotEquals(20,calc.sum());
    }
    @Test
    public void testSub() {
        Assert.assertEquals(12,calc.sub());
        calc.a=10;
        Assert.assertNotEquals(12,calc.sub());
    }
    @Test
    public void testMulti() {
        Assert.assertEquals(64,calc.multi());
        calc.a=10;
        Assert.assertNotEquals(64,calc.multi());
    }
    @Test
    public void testDiv() {
        Assert.assertEquals(5,calc.div());
        calc.a=10;
        Assert.assertNotEquals(111,calc.div());
    }

}
