package org.jcoll.lib;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created on 26/08/16
 *
 * @author Jacobo Coll &lt;jacobo167@gmail.com&gt;
 */
public class UtilsTest {
    @Before
    public void setUp() throws Exception {
        System.out.println("set up");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("tear down");
    }

    @Test
    public void testOk() throws Exception {
        System.out.println("Test ok!");
    }

    @Test
    public void testFail() throws Exception {
        String env = System.getenv("FAIL");
        if (env != null) {
            System.out.println("Test nok!");
            assertTrue(false);
        } else {
            System.out.println("Test ok! FAIL undefined");
        }
    }

}