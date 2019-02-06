package com.personal.jsonplaceholder.framework.handler;

import com.personal.jsonplaceholder.framework.pojo.object.User;
import io.restassured.response.Response;

public class UserAPIHandler extends JsonPlaceHolderAPIHandler {

    public Response createUser(final String url, final User user) {
        return this.getAutomationHttpClient().postRequest(url, this.getGsonInstance().toJson(user));
    }
}
