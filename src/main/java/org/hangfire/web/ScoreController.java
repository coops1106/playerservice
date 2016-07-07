package org.hangfire.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ScoreController {

  @RequestMapping(value="/score", method=RequestMethod.GET)
  public Integer score(@RequestParam(value="name") final String name) {
    return 10;
  }
}
