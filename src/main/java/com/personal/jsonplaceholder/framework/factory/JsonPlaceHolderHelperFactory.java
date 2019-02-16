package com.personal.jsonplaceholder.framework.factory;

import com.personal.jsonplaceholder.framework.base.BaseFacotry;
import com.personal.jsonplaceholder.framework.helper.JsonPlaceHolderHelper;
import java.net.URISyntaxException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JsonPlaceHolderHelperFactory extends BaseFacotry {

  private static final Logger LOG = LoggerFactory.getLogger(JsonPlaceHolderHelperFactory.class);

  private static JsonPlaceHolderHelperFactory instance;
  private JsonPlaceHolderHelper placeHolderHelper;

  private JsonPlaceHolderHelperFactory() throws URISyntaxException {
    this.placeHolderHelper = new JsonPlaceHolderHelper();
  }

  public static JsonPlaceHolderHelperFactory getInstance() throws URISyntaxException {
    if (instance == null) {
      instance = new JsonPlaceHolderHelperFactory();
    }
    return instance;
  }

  @Override
  public void doHealthCheck() throws Exception {
  }

  public JsonPlaceHolderHelper getPlaceHolderHelper() {
    return this.placeHolderHelper;
  }
}
