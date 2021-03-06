/*----------------------------------------------------------------------------*/
/* Copyright (c) 2014 FIRST Team 2035. All Rights Reserved.                  */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/
package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.templates.RobotMap;

/**
 *
 * @author Team 2035
 */
public class Roller extends Subsystem {

    private final Solenoid extendPiston;
    private final Solenoid retractPiston;
    private final Victor rollermotor;

    /**
     *
     */
    public Roller() {
        rollermotor = new Victor(RobotMap.RollerMotorPWM);
        extendPiston = new Solenoid(RobotMap.RollerExtensionSolenoid);
        retractPiston = new Solenoid(RobotMap.RollerRetractSolenoid);
    }

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }

    public void raiseRoller() {
        extendPiston.set(true);
        retractPiston.set(false);
    }

    public void lowerRoller() {
        extendPiston.set(false);
        retractPiston.set(true);
    }

    public void setretrievalRoller() {
        rollermotor.set(RobotMap.RollerRetrievalMotorSpeed);

    }

    public void setRolleroff() {
        rollermotor.set(RobotMap.RollerOffMotorSpeed);
    }

    public void setRelease() {
        rollermotor.set(RobotMap.RollerReleaseMotorSpeed);
    }

}
