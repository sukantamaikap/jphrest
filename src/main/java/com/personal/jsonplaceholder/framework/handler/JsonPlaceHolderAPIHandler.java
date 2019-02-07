package com.personal.jsonplaceholder.framework.handler;

import com.personal.jsonplaceholder.framework.api.http.AutomationHttpClient;
import com.personal.jsonplaceholder.framework.base.BaseAPIHelper;

public class JsonPlaceHolderAPIHandler extends BaseAPIHelper {

  private AutomationHttpClient automationHttpClient;

  public JsonPlaceHolderAPIHandler() {
    this.automationHttpClient = new AutomationHttpClient();
  }

  @Override
  protected AutomationHttpClient getAutomationHttpClient() {
    return this.automationHttpClient;
  }
}
