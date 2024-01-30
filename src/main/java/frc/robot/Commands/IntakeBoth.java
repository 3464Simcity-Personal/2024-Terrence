
package frc.robot.Commands;

import edu.wpi.first.wpilibj2.command.Command;

import frc.robot.Subsystems.IntakeSubsystem;

/**
   * Enables top and bottom intake motors, spinning all 5 rollers
   *
   * @param IntakeSubsystem The subsystem used by this command.
   */

public class IntakeBoth extends Command {
  //@SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})
  private IntakeSubsystem intakeSub;

  public IntakeBoth() {
    intakeSub = IntakeSubsystem.getInstance();
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(intakeSub);
  }

  @Override
  public void initialize() {
        
  }
  @Override
  public void execute() {
    intakeSub.intakeBoth();
  }

 @Override
  public boolean isFinished() {
      return true;
  }

}
