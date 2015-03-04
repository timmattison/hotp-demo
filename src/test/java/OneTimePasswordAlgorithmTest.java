import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import static org.hamcrest.CoreMatchers.is;

/**
 * Created by timmattison on 2/24/15.
 */
public class OneTimePasswordAlgorithmTest {
    private static final String secret = "12345678901234567890";
    private static final byte[] secretBytes = secret.getBytes();

    /**
     * This value (-1) means we do dynamic truncation
     */
    public static final int DYNAMIC_TRUNCATION = -1;
    public static final int CODE_DIGITS = 6;

    @Before
    public void setup() {
    }

    @Test
    public void test0() throws InvalidKeyException, NoSuchAlgorithmException {
        int value = 0;
        String expected = "755224";
        innerTest(value, expected);
    }

    @Test
    public void test1() throws InvalidKeyException, NoSuchAlgorithmException {
        int value = 1;
        String expected = "287082";
        innerTest(value, expected);
    }

    @Test
    public void test2() throws InvalidKeyException, NoSuchAlgorithmException {
        int value = 2;
        String expected = "359152";
        innerTest(value, expected);
    }

    @Test
    public void test3() throws InvalidKeyException, NoSuchAlgorithmException {
        int value = 3;
        String expected = "969429";
        innerTest(value, expected);
    }

    @Test
    public void test4() throws InvalidKeyException, NoSuchAlgorithmException {
        int value = 4;
        String expected = "338314";
        innerTest(value, expected);
    }

    @Test
    public void test5() throws InvalidKeyException, NoSuchAlgorithmException {
        int value = 5;
        String expected = "254676";
        innerTest(value, expected);
    }

    @Test
    public void test6() throws InvalidKeyException, NoSuchAlgorithmException {
        int value = 6;
        String expected = "287922";
        innerTest(value, expected);
    }

    @Test
    public void test7() throws InvalidKeyException, NoSuchAlgorithmException {
        int value = 7;
        String expected = "162583";
        innerTest(value, expected);
    }

    @Test
    public void test8() throws InvalidKeyException, NoSuchAlgorithmException {
        int value = 8;
        String expected = "399871";
        innerTest(value, expected);
    }

    @Test
    public void test9() throws InvalidKeyException, NoSuchAlgorithmException {
        int value = 9;
        String expected = "520489";
        innerTest(value, expected);
    }

    private void innerTest(int value, String expected) throws NoSuchAlgorithmException, InvalidKeyException {
        Assert.assertThat(OneTimePasswordAlgorithm.generateOTP(secretBytes, value, CODE_DIGITS, false, DYNAMIC_TRUNCATION), is(expected));
    }
}
