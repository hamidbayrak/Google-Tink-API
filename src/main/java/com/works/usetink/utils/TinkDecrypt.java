package com.works.usetink.utils;

import com.google.crypto.tink.subtle.AesGcmJce;

public class TinkDecrypt {

    public static String decryptFnc(String key128Bit, String ciphertext, String associatedData) {

        String decryptedString = "";
        try {

            byte[] convertEncodeBytes = ciphertext.getBytes("ISO-8859-1");
            AesGcmJce aesGcmJce = new AesGcmJce(key128Bit.getBytes());
            byte[] decryptBytes = aesGcmJce.decrypt(convertEncodeBytes, associatedData.getBytes());
            decryptedString = new String(decryptBytes);

        } catch (Exception e) {
            System.err.println("Decrypt Err : " + e);
        }
        return decryptedString;
    }

}
