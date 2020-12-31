import org.junit.Assert;
import org.junit.Test;
import service.BoxService;

public class BoxServiceTest {
    @Test
    public void startWithFiveZeroTest(){
        BoxService boxService = new BoxService();
        boolean b1 = boxService.startWithFiveZero("00000111");
        boolean b2 = boxService.startWithFiveZero("00001111");
        Assert.assertEquals(true, b1);
        Assert.assertEquals(false, b2);
    }
}
