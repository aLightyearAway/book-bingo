package no.alightyearaway.bookbingo.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import no.alightyearaway.bookbingo.dao.User;

@RestController("users")
public class UserController {

  @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
  public User getUsers() {
    User user = new User("aLightYearAway", "blonde", 35, 186);
    return user;
  }
}
