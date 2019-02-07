package com.personal.jsonplaceholder.framework.util;

import java.security.SecureRandom;

public final class TestUtils {

  private static SecureRandom random = new SecureRandom();

  private TestUtils() {
  }

  public static int generateRandomNumber(final int bound) {
    return random.nextInt(bound);
  }
}
