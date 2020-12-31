import org.junit.Assert;
import org.junit.Test;
import service.Sha256Hash;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

public class Sha256HashTest {
    @Test
    public void getHashTest() throws UnsupportedEncodingException, NoSuchAlgorithmException {
        String key = "1234567890122";
        String value = Sha256Hash.getHash(key).toString();
        Assert.assertEquals(64, value.length());
    }
}
