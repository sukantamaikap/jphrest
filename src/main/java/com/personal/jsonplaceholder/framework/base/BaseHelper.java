package com.personal.jsonplaceholder.framework.base;

import java.net.URISyntaxException;

import org.apache.http.client.utils.URIBuilder;

public abstract class BaseHelper extends Core {

  protected String buildBaseURI(final String protocol,
                                final String host,
                                final int port)
      throws URISyntaxException {
    return new URIBuilder().setScheme(protocol).setHost(host).setPort(port).build().toString();
  }

  protected String buildBaseURI(final String protocol,
                                final String host)
          throws URISyntaxException {
    return new URIBuilder().setScheme(protocol).setHost(host).build().toString();
  }
}
