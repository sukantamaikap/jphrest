package com.personal.jsonplaceholder.framework.constants;

/**
 * This class represents all the services constants.
 */
public final class ServiceConstants {

  private ServiceConstants() {
  }

  public static final class RestResources {

    public static final String POSTS = "/posts";
    public static final String POST_ID = "/posts/%s";
    public static final String COMMENTS = "/comments";
    public static final String COMMENT_ID = "/comment/%s";
    public static final String USER = "/users";
    public static final String USER_ID = "/users/%s";
    private RestResources() {
    }
  }
}
