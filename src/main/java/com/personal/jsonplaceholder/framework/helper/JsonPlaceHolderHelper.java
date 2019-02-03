package com.personal.jsonplaceholder.framework.helper;

import com.personal.jsonplaceholder.framework.base.BaseHelper;
import com.personal.jsonplaceholder.framework.handler.JsonPlaceHolderAPIUtil;
import com.personal.jsonplaceholder.framework.testconfig.object.GenericServer;
import java.net.URISyntaxException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

public class JsonPlaceHolderHelper extends BaseHelper {
  private static final Logger LOG = LoggerFactory.getLogger(JsonPlaceHolderHelper.class);

  private JsonPlaceHolderAPIUtil apiUtil;
  private GenericServer server;
  private String baseUrl;

  public JsonPlaceHolderHelper() throws URISyntaxException {
    this.apiUtil = new JsonPlaceHolderAPIUtil();

    LOG.info("get service configuration details");
    this.server = this.getTestConfigParser().getCompleteTestConfiguration().getServer();

    this.isServicePresent();

    LOG.info("construct base url from \"TestConfig.json\"");
    this.baseUrl =
        this.buildBaseURI(
            this.server.getProtocol(), this.server.getHost(), this.server.getPorts()[0]);

    LOG.info("base url found {}", this.baseUrl);
  }

  @Override
  protected void isServicePresent() {
    LOG.info("check if server is present in \"TestConfig.json\"");
    Assert.assertNotNull(this.server, "server is not present in \"TestConfig.json\"");
  }
}
