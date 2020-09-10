package no.alightyearaway.bookbingo.dao;

public class User {
  private String name;
  private String hairColor;
  private int age;
  private int height;

  public User(String name, String hairColor, int age, int height) {
    this.name = name;
    this.hairColor = hairColor;
    this.age = age;
    this.height = height;
  }

    
    public String getName() {
        return name;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    
    public String getHairColor() {
        return hairColor;
    }

    
    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    
    public int getAge() {
        return age;
    }

    
    public void setAge(int age) {
        this.age = age;
    }

    
    public int getHeight() {
        return height;
    }

    
    public void setHeight(int height) {
        this.height = height;
    }

}
