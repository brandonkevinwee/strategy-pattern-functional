package strategy;

import strategy.classic.robot.ClassicArm;
import strategy.classic.robot.routines.ClassicOmeletteRoutine;
import strategy.functional.robot.FunctionalArm;
import strategy.functional.robot.FunctionalArmRoutine;

public class Controller {

  public static void main(String[] args) {
  }

  private static void classicStrategy() {
    ClassicArm classicArm = new ClassicArm();
    classicArm.setRoutine(new ClassicOmeletteRoutine());
    classicArm.executeRoutine();
  }
  
  private static void functionalStrategy() {
    FunctionalArm functionalArm = new FunctionalArm();
    functionalArm.executeRoutine(FunctionalArmRoutine::makeOmelette);
  }
  
  private static void lambdaStrategy() {
    FunctionalArm functionalArm = new FunctionalArm();
    functionalArm.executeRoutine(() -> System.out.println("Raw eggs served through lambda function and strategy pattern"));
  }
}
