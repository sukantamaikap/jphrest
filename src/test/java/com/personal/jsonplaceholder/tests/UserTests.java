package com.personal.jsonplaceholder.tests;

import com.personal.jsonplaceholder.base.BaseTest;
import com.personal.jsonplaceholder.framework.helper.UserHelper;
import com.personal.jsonplaceholder.framework.pojo.builder.UserBuilder;
import com.personal.jsonplaceholder.framework.pojo.object.User;
import com.personal.jsonplaceholder.framework.validator.UserValidator;
import io.restassured.response.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import java.net.URISyntaxException;

public class UserTests extends BaseTest {
    private static final Logger LOG = LoggerFactory.getLogger(UserTests.class);

    private UserBuilder userBuilder;
    private UserHelper userHelper;
    private UserValidator userValidator;

    public UserTests() throws URISyntaxException {
        this.userBuilder = new UserBuilder();
        this.userHelper = new UserHelper();
        this.userValidator = new UserValidator();
    }

    @Test
    public void testCreateUser() {
        LOG.info("CREATE USER AND RELATED DETAILS");
        final User user = this.userBuilder.buildCompleteUser();
        final Response createUserResponse = this.userHelper.createUser(user);

        LOG.info("VALIDATE USER!!");
        this.userValidator.validateUser(user, createUserResponse);

    }
}
