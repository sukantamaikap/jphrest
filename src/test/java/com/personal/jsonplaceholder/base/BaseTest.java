package com.personal.jsonplaceholder.base;

import com.personal.jsonplaceholder.framework.factory.JsonPlaceHolderHelperFactory;
import com.personal.jsonplaceholder.framework.testconfig.parser.TestConfigParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeSuite;

import java.net.URISyntaxException;

public class BaseTest extends AbstractTest {

  private static final Logger LOG = LoggerFactory.getLogger(BaseTest.class);
  private JsonPlaceHolderHelperFactory jsonPlaceHolderHelperFactory;

  public BaseTest() {
    try {
      this.jsonPlaceHolderHelperFactory = JsonPlaceHolderHelperFactory.getInstance();
    } catch (URISyntaxException e) {
      LOG.error("Malformed URI : %s", e.getStackTrace());
    }
  }

  @BeforeSuite(alwaysRun = true)
  @Override
  protected void performHealthCheck() throws Exception {
    String instanceName = TestConfigParser.getInstance().getCompleteTestConfiguration().getTitle();
    LOG.info("RUNNING TEST ON {} INSTANCE", instanceName);

    LOG.info("DOING HEALTH CHECK FOR ALL RE-TARGETING COMPONENTS");
    this.jsonPlaceHolderHelperFactory.doHealthCheck();
  }
}
