package service;

import entity.KeyOfBox;
import entity.OpenBoxParam;
import entity.TreasureBox;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wang-hc
 */
public class KeyService {
    public List<KeyOfBox> getKeys(List<TreasureBox> boxes) {
        List<KeyOfBox> keys = new ArrayList<>();
        OpenBoxParam openBoxParam = new OpenBoxParam();
        openBoxParam.setBoxes(boxes);
        for (int boxIndex = 0; boxIndex < boxes.size(); boxIndex++) {
            openBoxParam.setBoxNum(boxIndex + 1);
            try {
                keys.add(new KeyOfBox(boxIndex + 1, getKeyOfBox(openBoxParam)));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return keys;
    }


    Integer getKeyOfBox(OpenBoxParam param) throws Exception {
        BoxService boxService = new BoxService();
        for (Integer keyAttempt = 1; keyAttempt < Integer.MAX_VALUE; keyAttempt++) {
            param.setKey(keyAttempt);
            if (boxService.open(param)) {
                System.out.println(keyAttempt);
                return keyAttempt;
            }
        }
        throw new Exception("未找到key");
    }


}
