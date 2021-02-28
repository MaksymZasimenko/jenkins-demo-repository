package utils;


import org.apache.commons.codec.binary.Base64;

public class EncryptionUtils {

    public static String encrypt(String property){
        String encryptedStr = Base64.encodeBase64String(property.getBytes());
        return encryptedStr;
    }

    public static String decrypt(String encryptedProperty){
        String decryptedStr = new String(Base64.decodeBase64(encryptedProperty));
        return decryptedStr;
    }

    public static void main(String[] args) {
       String encryptedPass = encrypt("");
        System.out.println("encrypted: " + encryptedPass);

    }



}













