// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.DriveTrain;
import edu.wpi.first.wpilibj.Joystick;

public class Drive extends CommandBase {
  Joystick rightStick;
  Joystick leftStick;

private final DriveTrain s_DriveTrain;
  /** Creates a new Drive. */
  public Drive(DriveTrain s_DriveTrain, Joystick leftStick, Joystick rightStick) {
   this.s_DriveTrain=s_DriveTrain;
   this.leftStick = leftStick;
   this.rightStick =rightStick;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(s_DriveTrain);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    s_DriveTrain.joystickDrive(leftStick, rightStick);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
