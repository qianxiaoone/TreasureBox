package entity;
import java.util.List;

/**
 * @author wang-hc
 */
public class OpenBoxParam {
    private int boxNum;
    private int key;
    private List<TreasureBox> boxes;

    public OpenBoxParam(int boxNum, int key, List<TreasureBox> boxes) {
        this.boxNum = boxNum;
        this.key = key;
        this.boxes = boxes;
    }

    public int getBoxNum() {
        return boxNum;
    }

    public void setBoxNum(int boxNum) {
        this.boxNum = boxNum;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public List<TreasureBox> getBoxes() {
        return boxes;
    }

    public void setBoxes(List<TreasureBox> boxes) {
        this.boxes = boxes;
    }
}
