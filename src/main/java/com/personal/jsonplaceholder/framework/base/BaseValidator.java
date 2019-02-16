package com.personal.jsonplaceholder.framework.base;

import com.google.gson.Gson;

public abstract class BaseValidator {

  private Gson gson;

  public BaseValidator() {
    this.gson = new Gson();
  }

  protected Gson getGsonInstance() {
    return this.gson;
  }
}
