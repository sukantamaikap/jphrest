package com.personal.jsonplaceholder.tests;

import com.personal.jsonplaceholder.base.BaseTest;
import com.personal.jsonplaceholder.framework.pojo.builder.UserBuilder;
import com.personal.jsonplaceholder.framework.pojo.object.User;
import com.personal.jsonplaceholder.framework.util.TestUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

/**
 * Tests all functionality of comments for jsonplaceholder
 */
public class CommentTests extends BaseTest {
    private static final Logger LOG = LoggerFactory.getLogger(CommentTests.class);

    private UserBuilder userBuilder;

    public CommentTests() {
        this.userBuilder = new UserBuilder();
    }


    @Test
    public void testCreateComments() {
        LOG.info("CREATE USER AND RELATED DETAILS");
        final User user = this.userBuilder.buildCompleteUser();

        LOG.info("CREATE COMMENT");

        LOG.info("VALIDATE COMMENT IS PERSISTED");
    }

}
