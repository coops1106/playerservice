package org.hangfire.web;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ScoreControllerTest {

  @Test
  public void testScore() throws Exception {
    final ScoreController uut = new ScoreController();

    assertThat(uut.score(""), is(10));
  }
}