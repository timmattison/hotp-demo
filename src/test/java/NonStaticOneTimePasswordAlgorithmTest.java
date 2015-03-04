import com.timmattison.hotp.NonStaticOneTimePasswordAlgorithm;
import org.junit.Assert;
import org.junit.Before;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import static org.hamcrest.CoreMatchers.is;

/**
 * Created by timmattison on 2/24/15.
 */
public class NonStaticOneTimePasswordAlgorithmTest extends AbstractOneTimePasswordAlgorithmTest {
    private NonStaticOneTimePasswordAlgorithm nonStaticOneTimePasswordAlgorithm;

    @Before
    public void setup() {
        nonStaticOneTimePasswordAlgorithm = new NonStaticOneTimePasswordAlgorithm();
    }

    @Override
    public void innerTestHotpValue(int count, String expected) throws NoSuchAlgorithmException, InvalidKeyException {
        Assert.assertThat(nonStaticOneTimePasswordAlgorithm.generateOTP(getSecretBytes(), count, getCodeDigits(), false, getTruncationValue()), is(expected));
    }

}
