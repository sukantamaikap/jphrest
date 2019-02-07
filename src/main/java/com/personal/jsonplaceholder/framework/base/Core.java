package com.personal.jsonplaceholder.framework.base;

import com.personal.jsonplaceholder.framework.testconfig.parser.TestConfigParser;

public class Core {

  private TestConfigParser testConfigParser;

  public Core() {
    this.testConfigParser = TestConfigParser.getInstance();
  }

  protected TestConfigParser getTestConfigParser() {
    return this.testConfigParser;
  }
}
