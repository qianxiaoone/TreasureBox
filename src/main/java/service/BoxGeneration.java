package service;

import entity.TreasureBox;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wang-hc
 */
public class BoxGeneration {
    public List<TreasureBox> generationBoxes() {
        List<TreasureBox> boxes = new ArrayList<TreasureBox>();
        int num = 10;
        for (int i = 0; i < num; i++) {
            TreasureBox box = new TreasureBox();
            box.setBoxNum(i + 1);
            boxes.add(box);
        }
        return boxes;
    }


}
