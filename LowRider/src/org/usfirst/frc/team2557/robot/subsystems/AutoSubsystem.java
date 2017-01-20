package org.usfirst.frc.team2557.robot.subsystems;

import org.usfirst.frc.team2557.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class AutoSubsystem extends Subsystem {
	
	public void AutoSub(){
		RobotMap.rightDriveEncoder.reset();
		
		while(RobotMap.rightDriveEncoder.get() >= -500){
			RobotMap.robotDrive.arcadeDrive(0,0.5);
			SmartDashboard.putNumber("encoderCount", RobotMap.rightDriveEncoder.get());
		}
		
		}
	
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

