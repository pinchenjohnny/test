import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @program: test
 * @description:
 * @author: Pin Chen
 * @create: 2022-04-12 11:15
 **/
public class CalcuatorTest {
    @Test
    public void shouldReturn2When1Plus1(){
        Calcuator calcuator = new Calcuator();
        int actualResult = calcuator.compute(1,1,'+');
        int expectResult = 2;
        Assert.assertEquals(expectResult, actualResult);
    }

    @Test
    public void shouldReturn0When1Sub1(){
        Calcuator calcuator = new Calcuator();
        int actualResult = calcuator.compute(1,1,'-');
        int expectResult = 0;
        Assert.assertEquals(expectResult, actualResult);
    }
}