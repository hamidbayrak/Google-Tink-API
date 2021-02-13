package com.works.usetink.utils;

import com.google.crypto.tink.subtle.AesGcmJce;

public class TinkEncrypt {


    public static String encryptFnc(String key128Bit, String plainText, String associatedData) {

        String encryptedString = "";
        try {
            AesGcmJce aesGcmJce = new AesGcmJce(key128Bit.getBytes());
            byte[] encryptedBytes = aesGcmJce.encrypt(plainText.getBytes(), associatedData.getBytes());
            encryptedString = new String(encryptedBytes, "ISO-8859-1");

        } catch (Exception e) {
            System.err.println("Encrypt Err : " + e);
        }

        return encryptedString;
    }

}
