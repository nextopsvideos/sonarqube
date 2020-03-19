package com.acme;

import org.junit.Test;
import greetingApp.Server;

import static org.junit.Assert.assertNotNull;

public class AppTest {
  @Test
  public void testAppHasAGreeting() {
    App classUnderTest = new App();
    assertNotNull("app should have a greeting", classUnderTest.getGreeting());

    Server jv8ClassUnderTest = new Server();
    assertNotNull("app should have a greeting", jv8ClassUnderTest.hi());
  }
}
