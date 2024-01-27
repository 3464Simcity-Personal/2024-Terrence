package frc.robot.Subsystems;

import com.revrobotics.CANSparkMax;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotMap;
/* This Subsystem is for the flywheel ONLY, not the entire shooting process
*  
*/
public class ShooterSubsystem extends SubsystemBase {
  //get shooter from RobotMap
  CANSparkMax shooter = RobotMap.shooter;

  // Creates a variable called Instance, which is used later in getInstance
  private static ShooterSubsystem instance = null;


  public static ShooterSubsystem getInstance() {
    if (instance == null) {
      instance = new ShooterSubsystem();
    }

    return instance;
  }

  //turn flywheel at specified speed
  public void shoot(double speed){
    shooter.set(speed);
  }

  //turns flywheel off
  public void stopShooter() {
    // Stops all motors
    shooter.set(0);
  }
  //reverses flywheel at 60% power
  public void reverse(){
    shooter.set(.6);
  }

  //returns current speed of motor
  public double getSpeed(){
    return shooter.get();
  }
}
