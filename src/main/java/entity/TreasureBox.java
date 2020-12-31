package entity;

public class TreasureBox {
    private int boxNum;
    private long timestamp;
    private String hashStr;
    private String foreHashStr;
    private int mysteriousNum;

    public TreasureBox() {
    }

    public TreasureBox(int boxNum, long timestamp, String hashStr, String foreHashStr, int mysteriousNum) {
        this.boxNum = boxNum;
        this.timestamp = timestamp;
        this.hashStr = hashStr;
        this.foreHashStr = foreHashStr;
        this.mysteriousNum = mysteriousNum;
    }

    public int getBoxNum() {
        return boxNum;
    }

    public void setBoxNum(int boxNum) {
        this.boxNum = boxNum;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
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
