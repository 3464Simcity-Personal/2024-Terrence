
package frc.robot.Commands;

import edu.wpi.first.wpilibj2.command.Command;

import frc.robot.Subsystems.IntakeSubsystem;

/**
   * Enables only the bottom intake motor, spinning the bottom 3 rollers
   *
   * @param IntakeSubsystem The subsystem used by this command.
   */
   
public class IntakeBottom extends Command {
  //@SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})
  private IntakeSubsystem intakeSub;

  public IntakeBottom() {
    intakeSub = IntakeSubsystem.getInstance();
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(intakeSub);
  }

  @Override
  public void initialize() {
        
  }
  @Override
  public void execute() {
    intakeSub.intakeBottom(-.75);
  }

 @Override
  public boolean isFinished() {
      return true;
  }
}
