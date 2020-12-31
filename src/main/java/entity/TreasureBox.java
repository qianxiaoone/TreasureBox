package entity;

/**
 * @author wang-hc
 */
public class TreasureBox {
    private int boxNum;
    private String hashStr;
    private String foreHashStr;
    private int mysteriousNum;

    public TreasureBox() {
    }

    public int getBoxNum() {
        return boxNum;
    }

    public void setBoxNum(int boxNum) {
        this.boxNum = boxNum;
    }

    public String getHashStr() {
        return hashStr;
    }

    public void setHashStr(String hashStr) {
        this.hashStr = hashStr;
    }

    public String getForeHashStr() {
        return foreHashStr;
    }

    public void setForeHashStr(String foreHashStr) {
        this.foreHashStr = foreHashStr;
    }

    public int getMysteriousNum() {
        return mysteriousNum;
    }

    public void setMysteriousNum(int mysteriousNum) {
        this.mysteriousNum = mysteriousNum;
    }
}
