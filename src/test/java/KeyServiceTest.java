import entity.KeyOfBox;
import entity.TreasureBox;
import org.junit.Assert;
import org.junit.Test;
import service.BoxGeneration;
import service.KeyService;

import java.util.List;

public class KeyServiceTest {
    @Test
    public void getKeysTest() {
        BoxGeneration boxGeneration = new BoxGeneration();
        List<TreasureBox> boxes = boxGeneration.generationBoxes();
        KeyService keyService = new KeyService();
        List<KeyOfBox> keys = keyService.getKeys(boxes);
        for (KeyOfBox keyOfBox : keys) {
            System.out.println(keyOfBox);
        }
        Assert.assertEquals(10, keys.size());
    }
}
