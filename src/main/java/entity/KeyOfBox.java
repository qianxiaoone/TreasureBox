package entity;

/**
 * @author wang-hc
 */
public class KeyOfBox {
    private int boxNum;
    private int key;

    public KeyOfBox(int boxNum, int key) {
        this.boxNum = boxNum;
        this.key = key;
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

    @Override
    public String toString() {
        return "KeyOfBox{" +
                "boxNum=" + boxNum +
                ", key=" + key +
                '}';
    }
}
