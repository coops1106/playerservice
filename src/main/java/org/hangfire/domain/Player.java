package org.hangfire.domain;

public class Player {

  private final Integer id;
  private final String name;
  private final Integer score;

  public Player(final Integer id, final String name, final Integer score) {
    this.id = id;
    this.name = name;
    this.score = score;
  }

  public Integer getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public Integer getScore() {
    return score;
  }
}
