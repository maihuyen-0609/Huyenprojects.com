package katalontoselenium.com.utils;

import org.apache.commons.codec.binary.Base64;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public final class DecodeUtils {

    private DecodeUtils() {
    }

    //Encrypt and Decrypt data

    private static final String key1 = "AES";
    private static final String key2 = "AES/ECB/PKCS5Padding";

    private static String encryptionKeyString = "autotestselenium";
    private static final byte[] encryptionKeyBytes = encryptionKeyString.getBytes();

    private static SecretKey generateKey() {
        SecretKey key = new SecretKeySpec(encryptionKeyBytes, key1);
        return key;
    }}