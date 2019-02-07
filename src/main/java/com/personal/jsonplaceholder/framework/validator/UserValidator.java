package com.personal.jsonplaceholder.framework.validator;

import com.personal.jsonplaceholder.framework.base.BaseValidator;
import com.personal.jsonplaceholder.framework.pojo.object.User;
import io.restassured.response.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

public class UserValidator extends BaseValidator {

  private static final Logger LOG = LoggerFactory.getLogger(UserValidator.class);

  public UserValidator() {
  }

  public void validateUser(final User pojo, final Response response) {
    LOG.info("validate user with parameters set");
    final User responseUser = response.getBody().as(User.class);
    Assert.assertTrue(responseUser.equals(pojo), "Created user does not match pojo!!");
  }
}
