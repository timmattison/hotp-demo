import org.junit.Test;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

/**
 * Created by timmattison on 2/24/15.
 */
public abstract class AbstractOneTimePasswordAlgorithmTest {
    public abstract void innerTestHotpValue(int count, String expected) throws NoSuchAlgorithmException, InvalidKeyException;

    private static final String secret = "12345678901234567890";
    private static final byte[] secretBytes = secret.getBytes();

    /**
     * This value (-1) means we do dynamic truncation
     */
    public static final int DYNAMIC_TRUNCATION = -1;
    public static final int CODE_DIGITS = 6;

    @Test
    public void appendixDTable2Test0() throws InvalidKeyException, NoSuchAlgorithmException {
        int count = 0;
        String expected = "755224";
        innerTestHotpValue(count, expected);
    }

    @Test
    public void appendixDTable2Test1() throws InvalidKeyException, NoSuchAlgorithmException {
        int count = 1;
        String expected = "287082";
        innerTestHotpValue(count, expected);
    }

    @Test
    public void appendixDTable2Test2() throws InvalidKeyException, NoSuchAlgorithmException {
        int count = 2;
        String expected = "359152";
        innerTestHotpValue(count, expected);
    }

    @Test
    public void appendixDTable2Test3() throws InvalidKeyException, NoSuchAlgorithmException {
        int count = 3;
        String expected = "969429";
        innerTestHotpValue(count, expected);
    }

    @Test
    public void appendixDTable2Test4() throws InvalidKeyException, NoSuchAlgorithmException {
        int count = 4;
        String expected = "338314";
        innerTestHotpValue(count, expected);
    }

    @Test
    public void appendixDTable2Test5() throws InvalidKeyException, NoSuchAlgorithmException {
        int count = 5;
        String expected = "254676";
        innerTestHotpValue(count, expected);
    }

    @Test
    public void appendixDTable2Test6() throws InvalidKeyException, NoSuchAlgorithmException {
        int count = 6;
        String expected = "287922";
        innerTestHotpValue(count, expected);
    }

    @Test
    public void appendixDTable2Test7() throws InvalidKeyException, NoSuchAlgorithmException {
        int count = 7;
        String expected = "162583";
        innerTestHotpValue(count, expected);
    }

    @Test
    public void appendixDTable2Test8() throws InvalidKeyException, NoSuchAlgorithmException {
        int count = 8;
        String expected = "399871";
        innerTestHotpValue(count, expected);
    }

    @Test
    public void appendixDTable2Test9() throws InvalidKeyException, NoSuchAlgorithmException {
        int count = 9;
        String expected = "520489";
        innerTestHotpValue(count, expected);
    }

    protected int getTruncationValue() {
        return DYNAMIC_TRUNCATION;
    }

    protected int getCodeDigits() {
        return CODE_DIGITS;
    }

    protected byte[] getSecretBytes() {
        return secretBytes;
    }
}
