package com.personal.jsonplaceholder.tests;

import com.personal.jsonplaceholder.base.BaseTest;
import com.personal.jsonplaceholder.framework.helper.UserHelper;
import com.personal.jsonplaceholder.framework.pojo.builder.UserBuilder;
import com.personal.jsonplaceholder.framework.pojo.object.User;
import java.net.URISyntaxException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

/**
 * Tests all functionality of comments for jsonplaceholder
 */
public class CommentTests extends BaseTest {

  private static final Logger LOG = LoggerFactory.getLogger(CommentTests.class);

  private UserBuilder userBuilder;
  private UserHelper userHelper;

  public CommentTests() throws URISyntaxException {
    this.userBuilder = new UserBuilder();
    this.userHelper = new UserHelper();
  }

  @Test
  public void testCreateComments() {
    LOG.info("CREATE USER AND RELATED DETAILS");
    final User user = this.userBuilder.buildCompleteUser();
    this.userHelper.createUser(user);

    LOG.info("CREATE COMMENT");

    LOG.info("VALIDATE COMMENT IS PERSISTED");
  }

}
