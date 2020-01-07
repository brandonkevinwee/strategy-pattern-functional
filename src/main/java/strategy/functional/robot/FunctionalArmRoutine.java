package strategy.functional.robot;

public class FunctionalArmRoutine {

  public void executeRoutine(Runnable routine) {
    routine.run();
  }

  public static void makeOmelette() {
    System.out.println("Egg omelette served through higher-order function and strategy pattern");
  }
}