package com.personal.jsonplaceholder.framework.helper;

import com.personal.jsonplaceholder.framework.constants.ServiceConstants;
import com.personal.jsonplaceholder.framework.handler.UserAPIHandler;
import com.personal.jsonplaceholder.framework.pojo.object.User;
import io.restassured.response.Response;
import java.net.URISyntaxException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserHelper extends JsonPlaceHolderHelper {

  private static final Logger LOG = LoggerFactory.getLogger(UserHelper.class);
  private UserAPIHandler userAPIHandler;

  public UserHelper() throws URISyntaxException {
    this.userAPIHandler = new UserAPIHandler();
  }

  public Response createUser(final User user) {
    final String createUserUri = this.getBaseUrl() + ServiceConstants.RestResources.USER;
    LOG.info("URI for create user : {}", createUserUri);

    final Response response = this.userAPIHandler.createUser(createUserUri, user);
    user.setId(response.getBody().as(User.class).getId());
    return response;
  }
}
