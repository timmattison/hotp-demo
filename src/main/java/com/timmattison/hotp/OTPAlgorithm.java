package com.timmattison.hotp;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

/**
 * Created by timmattison on 3/4/15.
 */
public interface OTPAlgorithm {
    public int calcChecksum(long num, int digits);

    public byte[] hmacSha1(byte[] keyBytes, byte[] text) throws NoSuchAlgorithmException, InvalidKeyException;

    public String generateOTP(byte[] secret, long movingFactor, int codeDigits, boolean addChecksum, int truncationOffset) throws NoSuchAlgorithmException, InvalidKeyException;
}
