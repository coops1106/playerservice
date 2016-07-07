package org.hangfire.domain;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class PlayerTest {

  @Test
  public void testGetters() throws Exception {
    final Player uut = new Player(1, "Audie", 20);

    assertThat(uut.getId(), is(1));
    assertThat(uut.getName(), is("Audie"));
    assertThat(uut.getScore(), is(20));
  }
}