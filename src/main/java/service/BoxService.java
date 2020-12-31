package service;

import entity.OpenBoxParam;
import entity.TreasureBox;

import java.util.List;

/**
 * @author wang-hc
 */
public class BoxService {
    public boolean open(OpenBoxParam param) throws Exception {
        int boxNum = param.getBoxNum();
        int key = param.getKey();
        List<TreasureBox> boxes = param.getBoxes();
        TreasureBox box = null;
        try {
            box = getBoxByNum(boxes, boxNum);
        } catch (Exception e) {
            e.printStackTrace();
        }
        box.setMysteriousNum(key);
        if (boxNum == 1) {
            box.setForeHashStr("0");
        } else {
            box.setForeHashStr(getBoxByNum(boxes, boxNum - 1).getHashStr());
        }
        StringBuilder keyStr = new StringBuilder();
        keyStr.append(boxNum).append(box.getForeHashStr()).append(key);
        StringBuilder hashStr = new StringBuilder();
        try {
            hashStr = Sha256Hash.getHash(keyStr.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        box.setHashStr(hashStr.toString());
        if (startWithFiveZero(hashStr.toString())) {
            return true;
        }
        return false;
    }

    public TreasureBox getBoxByNum(List<TreasureBox> boxes, int num) throws Exception {
        for (TreasureBox box : boxes) {
            if (box.getBoxNum() == num) {
                return box;
            }
        }
        throw new Exception("未找到该序号的宝箱");
    }

    public boolean startWithFiveZero(String str) {
        String startStr = "00000";
        int endIndex = 5;
        if (startStr.equals(str.substring(0, endIndex))) {
            return true;
        }
        return false;
    }

}
