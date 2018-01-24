package edu.cnm.deepdive.taxonomy;

public class CanisLupus extends Canis {

  @Override
  public void hunt() {
    System.out.println("Hunt animals in packs");

  }

  public void speak() {
    System.out.println("Holw!");
    
  }
  public static void describe() { //static are not polymorus
    System.out.println("Canis lupus is the species of gray wolves");
  }
}
