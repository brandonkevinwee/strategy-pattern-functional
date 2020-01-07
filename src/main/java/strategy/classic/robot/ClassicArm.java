package strategy.classic.robot;

import strategy.classic.robot.routines.ClassicArmRoutine;

public class ClassicArm {

  private ClassicArmRoutine armRoutine;

  public void setRoutine(ClassicArmRoutine armRoutine) {
    this.armRoutine = armRoutine;
  }

  public void executeRoutine() {
    if(armRoutine == null) {
      System.out.println("Please set routine for robotic arm");
    } else {
      armRoutine.executeRoutine();
    }
  }
}