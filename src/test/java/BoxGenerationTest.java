import entity.TreasureBox;
import org.junit.Assert;
import org.junit.Test;
import service.BoxGeneration;

import java.util.List;

public class BoxGenerationTest {
    @Test
    public void generationBoxesTest(){
        BoxGeneration  generation = new BoxGeneration();
        List<TreasureBox> boxes = generation.generationBoxes();
        Assert.assertEquals(10, boxes.size());
        Assert.assertEquals(1, boxes.get(0).getBoxNum());

    }
}
