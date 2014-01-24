package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static final int leftMotor = 1;
    // public static final int rightMotor = 2;
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static final int rangefinderPort = 1;
    // public static final int rangefinderModule = 1;
    
    /*
    * DIGITAL SIDECAR
    */
    
    public static final int frontLeftMotor = 1;
    public static final int rearLeftMotor = 2;
    public static final int frontRightMotor = 3;
    public static final int rearRightMotor = 4;
    
    public static final int AnalogSidecar = 1; // Analog sidecar possibly connected to cRIO Slot 1, check later
    public static final int DigitalSidecar = 2; // Digital possibly connected to Slot 2, check later
    
    public static final int DriveTrainGyroInput = 1; // Gyro Analog input is on channel 1
    
    private static boolean JoystickEnabled = true;
    
    public static final int DriverJoystickNumber = 1;
    
    public static final Joystick sticky =  new Joystick(DriverJoystickNumber);
    public static final JoystickButton trigger = new JoystickButton(sticky, 1);

    public static final boolean shifterDriveTrainDirection = false;
    
    /* 
    * SOLENOIDS
    */
    public static final Solenoid shifter = new Solenoid(1);
    public static final Solenoid powerTakeOff = new Solenoid(2);
    
    public static final boolean shifterLowGear = true;
    public static final boolean shifterHighGear = false;
}
