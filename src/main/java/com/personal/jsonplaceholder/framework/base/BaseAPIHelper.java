package com.personal.jsonplaceholder.framework.base;

import com.google.gson.Gson;
import com.personal.jsonplaceholder.framework.api.http.AutomationHttpClient;

public abstract class BaseAPIHelper {
    private Gson gson;

    public BaseAPIHelper() {
        this.gson = new Gson();
    }

    public Gson getGsonInstance() {
        return this.gson;
    }

    abstract protected AutomationHttpClient   getAutomationHttpClient();
}
