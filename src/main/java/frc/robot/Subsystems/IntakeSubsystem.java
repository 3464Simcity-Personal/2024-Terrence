package frc.robot.Subsystems;

import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotMap;
/**
 * 
 * 
 */
public class IntakeSubsystem extends SubsystemBase {
  

  private Spark 
    intakeBottom = RobotMap.intakeBottom, 
    intakeTop = RobotMap.intakeTop; 

  //turn on both bottom and top intake
  
  private static IntakeSubsystem instance = null;


  public static IntakeSubsystem getInstance() {
    if (instance == null) {
      instance = new IntakeSubsystem();
    }
    return instance;
  }
  
  public void intakeBoth() {
      intakeBottom.set(-.75);
      intakeTop.set(-.65);
    
  }

  
  public void intakeBottom(double speed) {
    // Turn on motor for intake bottom
      intakeBottom.set(speed);    
  }
  public void intakeTop(double speed) {
    // Turn on motor for intake bottom
      intakeTop.set(speed);    
  }




  public void stopIntakes() {
    // Stops all motors
    intakeBottom.set(0);
    intakeTop.set(0);
  }

  public void reverse(){
    //reverses both intakes
    intakeBottom.set(.75);
    intakeTop.set(.65);
  }
}
