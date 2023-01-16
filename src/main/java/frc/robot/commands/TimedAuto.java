// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.DriveTrain;

public class TimedAuto extends CommandBase {
  Timer timer = new Timer();

  DriveTrain s_DriveTrain = new DriveTrain();
  /** Creates a new TimedAuto. */
  public TimedAuto(DriveTrain s_DriveTrain) {
    this.s_DriveTrain=s_DriveTrain;
    addRequirements(s_DriveTrain);
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    timer.start();
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    s_DriveTrain.auto(0.2, 0);
    timer.get();
    
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    s_DriveTrain.auto(0,0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return timer.get()>2;
  }
}
