package com.personal.jsonplaceholder.framework.util;

import java.security.SecureRandom;

public final class TestUtils {
    private static SecureRandom random = new SecureRandom();

    private TestUtils() {}

    public static String generateRandomAlphaNumericString(final int length) {
        final byte[] placeholder = new byte[length];
        random.nextBytes(placeholder);
        return placeholder.toString();
    }


    public static int generateRandomNumber(final int bound) {
        return random.nextInt(bound);
    }
}
