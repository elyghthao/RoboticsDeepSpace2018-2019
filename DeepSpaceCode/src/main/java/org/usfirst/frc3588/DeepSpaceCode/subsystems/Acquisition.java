// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.

package org.usfirst.frc3588.DeepSpaceCode.subsystems;

import org.usfirst.frc3588.DeepSpaceCode.commands.*;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.PIDOutput;
import edu.wpi.first.wpilibj.PIDSource;

import java.awt.Robot;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.DoubleSolenoid;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS

    import edu.wpi.first.wpilibj.Counter;

/**
 *
 */
public class Acquisition extends Subsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private WPI_TalonSRX configMotor;
    private WPI_TalonSRX armMotor;
    private DoubleSolenoid acquisitionSolenoid;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public final double STOP = 0.0, MOVE = 1.0;
    // private Counter acquisitionCounter;
    public Acquisition() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        configMotor = new WPI_TalonSRX(13);
        
        
        
        armMotor = new WPI_TalonSRX(12);
        
        
        
        acquisitionSolenoid = new DoubleSolenoid(0, 4, 5);
        addChild("AcquisitionSolenoid",acquisitionSolenoid);
        
        

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        // acquisitionCounter = new Counter();
        // acquisitionCounter.setUpSource(6);
        // acquisitionCounter.setUpDownCounterMode();
    }

    @Override
    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND


        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }

    @Override
    public void periodic() {
        // Put code here to be run every loop

    }


    //ALERT: 90 IS JUST A PLACEHOLDER UNTIL WE TEST THE ENCODER 
    // public boolean toGameConfig() {
    //     /*
    //     *if the encoder value is less than the set point for game config and greater than or equal to the starting point
    //     *then start the motor to move the acquisition mechanism to game configuration
    //     *When the encoder gets within the desired range, stop the motor and return true to end the command
    //     */
    //     if ((armEncoder.get() >= 89 && armEncoder.get() <= 91) && !armLimitSwitch.get()) {
    //         configMotor.set(0.0);
    //         return true;
    //     }
    //     else if (armEncoder.get() < 90 && armEncoder.get() >= 0) {
    //         configMotor.set(0.2);
    //     }
    //     return false;
    // }

    // public double getArmEncoder() {
    //     return armEncoder.get();
    // }

    // public void resetArmEncoder() {
    //     armEncoder.reset();
    // }

    // public boolean getArmLimitSwitch() {
    //     return armLimitSwitch.get();
    //}

    // public double getConfigMotorSpeed() {
    //     return configMotor.get();
    // }
    
    public void setConfigMotorSpeed(double speed) {
        configMotor.set(speed);
    }

    // public double getArmMotor() {
    //     return armMotor.get();
    // }

    // public void setArmMotorSpeed(double speed) {
    //     armMotor.set(speed);
    // }
    // public double getAcquisitionCounter() {
    //     return acquisitionCounter.getDistance();
    // }
    // public void resetAcquisitionCounter() {
    //     acquisitionCounter.reset();
    // }
    

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CMDPIDGETTERS


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CMDPIDGETTERS

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    // public void pullLeftWheels(double power) {
    //     leftAcquisitionWheels.set(power);
    // }
    // public void pullRightWheels(double power) {
    //     rightAcquisitionWheels.set(-power);
    // }
    // public void pushLeftWheels(double power) {
    //     leftAcquisitionWheels.set(-power);
    // }
    // public void pushRightWheels(double power) {
    //     rightAcquisitionWheels.set(power);
    // }

    public void openCloseMethod(DoubleSolenoid.Value state){
        acquisitionSolenoid.set(state);
    }
    public DoubleSolenoid.Value getOpenClose(){
        return acquisitionSolenoid.get();
    }
}

