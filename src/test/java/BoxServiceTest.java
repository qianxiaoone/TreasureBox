import entity.TreasureBox;
import org.junit.Assert;
import org.junit.Test;
import service.BoxGeneration;
import service.BoxService;

import java.util.List;

public class BoxServiceTest {
    @Test
    public void startWithFiveZeroTest(){
        BoxService boxService = new BoxService();
        boolean b1 = boxService.startWithFiveZero("00000111");
        boolean b2 = boxService.startWithFiveZero("00001111");
        Assert.assertEquals(true, b1);
        Assert.assertEquals(false, b2);
    }

    @Test(expected= Exception.class)
    public void getBoxByNumTest() throws Exception {
        BoxGeneration boxGeneration = new BoxGeneration();
        List<TreasureBox> boxes = boxGeneration.generationBoxes();
        BoxService boxService = new BoxService();
        boxService.getBoxByNum(boxes, 12);

    }
}
