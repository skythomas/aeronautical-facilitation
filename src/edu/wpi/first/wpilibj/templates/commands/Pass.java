/*----------------------------------------------------------------------------*/
/* Copyright (c) 2014 FIRST Team 2035. All Rights Reserved.                  */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/
package edu.wpi.first.wpilibj.templates.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.templates.subsystems.Launcher;
import edu.wpi.first.wpilibj.templates.AeronauticalFacilitation;

/**
 *
 * @author Team 2035
 */
public class Pass extends CommandBase {

    private final Launcher launcher;
    private Timer delayTimer;

    /**
     *
     */
    public Pass() {
        super("Launch");
        launcher = AeronauticalFacilitation.getLauncher();
        requires(launcher);
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        delayTimer = new Timer();
        delayTimer.start();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        launcher.pass();

    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        if (delayTimer.get() > 2.0) {
            return true;
        }
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
        launcher.retract();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
        launcher.retract();
    }
}
