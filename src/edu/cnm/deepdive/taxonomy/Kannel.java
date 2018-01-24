/*
 * 4th class for polymoris example
 */
package edu.cnm.deepdive.taxonomy;

/**
 * this class demonstrate <b>inheritance and polymorphism</b> 
 * for the {@link Canis} {@link CanisLupus} {@link CanisLupusFamiliaris} classes.
 * this model binomal taxonomy of genus and species, as well as sub-species.
 * 
 * @author vovo
 */
public class Kannel {

  /**
   * Runs a test using the {@link CanisLupus} and {@link CanisLupusFamiliaris} classes. 
   * @param args    Command line arguments are (ignored).
   */
  public static void main(String[] args) {
    CanisLupus whiteFang = new CanisLupus();
    CanisLupus spot = new CanisLupusFamiliaris(false);
    CanisLupus fido = new CanisLupusFamiliaris(true);
//  ((CanisLupusFamiliaris) spot).setGoodBoy(true); //don't need this as initialize in the constructor already
    System.out.println("White Fang:");
    showOff(whiteFang);
    System.out.println("Spot:");
    showOff(spot);
    System.out.println("Fido:");
    showOff(fido);
  }

  /** 
   * Invokes a number of methods on the {@link CanisLupus} instance passed to it as a parameter.
   * If the instance type is actually {@link CanisLupusFamiliaris},
   * then the {@link CanisLupusFamiliaris#isGoodBoy()} method is also invoked.
   * @param wolf    instance exercise
   */
  public static void showOff(CanisLupus wolf) {//wolf can be pass as aany canis class
    wolf.describe(); //static method is not polymoris
    wolf.hunt();
    wolf.speak();
    if (wolf instanceof CanisLupusFamiliaris) {//for instance if wolf is CanisLupusFamiliaris 
      System.out.printf("is a good boy: %b%n", ((CanisLupusFamiliaris) wolf).isGoodBoy() ); //((cast)wolf.reference)
    }
  }
}
