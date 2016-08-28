package org.jcoll.lib;

/**
 * Created on 26/08/16
 *
 * @author Jacobo Coll &lt;jacobo167@gmail.com&gt;
 */
public class Utils {

    public static final String MESSAGE = "Hello world!";
    private final String message;

    public Utils() {
        message = MESSAGE;
    }

    public void helloWorld() {
        System.out.println(message);
    }

}
