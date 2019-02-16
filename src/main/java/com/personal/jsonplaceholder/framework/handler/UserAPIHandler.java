package com.personal.jsonplaceholder.framework.handler;

import com.personal.jsonplaceholder.framework.pojo.object.User;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.testng.Assert;

public class UserAPIHandler extends JsonPlaceHolderAPIHandler {

  public Response createUser(final String url, final User user) {
    final Response createUserResponse = this.getAutomationHttpClient()
        .postRequest(url, ContentType.JSON, this.getGsonInstance().toJson(user));
    Assert.assertEquals(createUserResponse.getStatusCode(), HttpStatus.SC_CREATED,
        "Create user operation was not successful!!");
    return createUserResponse;
  }
}
