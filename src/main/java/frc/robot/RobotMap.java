/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
  // For example to map the left and right motors, you could define the
  // following variables to use with your drivetrain subsystem.
  public static int leftMotor = 22;
  public static int rightMotor = 20;

  // If you are using multiple modules, make sure to define both the port
  // number and the module. For example you with a rangefinder:
  // public static int rangefinderPort = 1;
  // public static int rangefinderModule = 1;

  public static int leftStick = 1;
  public static int rightStick = 4;
  public static int driveJoystick = 0;
  public static int OPERATOR_JOYSTICK = 1;
  public static int TURBO_BUTTON = 1;

  //Drivetrain Characteristics
  public final static double DRIVE_TOP_SPEED_FORWARD = 0.8;
  public final static double DRIVE_TOP_SPEED_TURNING = 0.8;
  public final static double DRIVE_LOW_SPEED_FORWARD = 0.6;
  public final static double DRIVE_LOW_SPEED_TURNING = 0.6;
}
