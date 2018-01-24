package edu.cnm.deepdive.taxonomy;

public abstract class Canis {//abstract tells compiler don't allow any class to make abstract
  
  public abstract void hunt(); //only abstract and have abstract
  
  public static void describe() {
    System.out.println("Canis is the genus of all dog-like carnivores.");
  }
}
