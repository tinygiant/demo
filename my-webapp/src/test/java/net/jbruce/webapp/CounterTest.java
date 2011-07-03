package net.jbruce.webapp;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by IntelliJ IDEA.
 * User: SG0891064
 * Date: Jul 2, 2011
 * Time: 8:29:35 PM
 * To change this template use File | Settings | File Templates.
 */
public class CounterTest {
    @Test
    public void testInit() {
        Counter counter=new Counter();
        assertNotNull(counter);
    }
}