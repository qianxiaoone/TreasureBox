package service;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @author wang-hc
 */
public class Sha256Hash {
    public static StringBuilder getHash(String key) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        StringBuilder sb = new StringBuilder();
        MessageDigest object = MessageDigest.getInstance("SHA-256");
        byte[] encrypted = object.digest(key.getBytes("UTF-8"));
        for (byte b : encrypted) {
            sb.append(String.format("%02x", b));
        }
        return sb;
    }
}
