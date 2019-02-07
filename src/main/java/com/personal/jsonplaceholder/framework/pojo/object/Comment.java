package com.personal.jsonplaceholder.framework.pojo.object;

import com.google.gson.annotations.SerializedName;

/**
 * POJO for Comment, represents a comment in
 */
public class Comment {

  @SerializedName("PostID")
  private int postId;

  @SerializedName("Id")
  private int id;

  @SerializedName("Name")
  private String name;

  @SerializedName("Email")
  private String email;

  @SerializedName("Body")
  private String body;

  public Comment() {
  }

  public int getPostId() {
    return postId;
  }

  public void setPostId(int postId) {
    this.postId = postId;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }
}
