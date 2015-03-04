import org.junit.Assert;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import static org.hamcrest.CoreMatchers.is;

/**
 * Created by timmattison on 2/24/15.
 */
public class OneTimePasswordAlgorithmTest extends AbstractOneTimePasswordAlgorithmTest {
    @Override
    public void innerTestHotpValue(int count, String expected) throws NoSuchAlgorithmException, InvalidKeyException {
        Assert.assertThat(OneTimePasswordAlgorithm.generateOTP(getSecretBytes(), count, getCodeDigits(), false, getTruncationValue()), is(expected));
    }
}
