package com.personal.jsonplaceholder.framework.helper;

import com.personal.jsonplaceholder.framework.base.BaseHelper;
import com.personal.jsonplaceholder.framework.handler.JsonPlaceHolderAPIHandler;
import com.personal.jsonplaceholder.framework.testconfig.object.GenericServer;
import java.net.URISyntaxException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JsonPlaceHolderHelper extends BaseHelper {
  private static final Logger LOG = LoggerFactory.getLogger(JsonPlaceHolderHelper.class);

  private JsonPlaceHolderAPIHandler apiUtil;
  private GenericServer server;
  private String baseUrl;

  public JsonPlaceHolderHelper() throws URISyntaxException {
    this.apiUtil = new JsonPlaceHolderAPIHandler();

    LOG.info("get service configuration details");
    this.server = this.getTestConfigParser().getCompleteTestConfiguration().getServer();

    LOG.info("construct base url from \"TestConfig.json\"");
    if (this.server.getPorts() == null) {
      this.baseUrl =
              this.buildBaseURI(this.server.getProtocol(), this.server.getHost());
    } else {
      this.baseUrl =
              this.buildBaseURI(
                      this.server.getProtocol(), this.server.getHost(), this.server.getPorts()[0]);
    }

    LOG.info("base url found {}", this.baseUrl);
  }

  protected String getBaseUrl() {
    return this.baseUrl;
  }
}
