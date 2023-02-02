import org.example.Main;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CheckTest {
    @Test
    public void addCheck(){
        Main m1=new Main();
        assertEquals(6,m1.addNumber(3,3));
    }
    @Test
    public void subCheck(){
        Main m1=new Main();
        assertEquals(0,m1.subNumber(3,3));
    }
    @Test
    public void multiplyNumber(){
        Main m1=new Main();
        assertEquals(9,m1.multiplyNumber(3,3));
    }
    @Test
    public void divideNumber(){
        Main m1=new Main();
        assertEquals(1,m1.divideNumber(3,3));
    }
    @Test
    public void moduloNumber(){
        Main m1=new Main();
        assertEquals(0,m1.moduloNumber(3,3));
    }
}
