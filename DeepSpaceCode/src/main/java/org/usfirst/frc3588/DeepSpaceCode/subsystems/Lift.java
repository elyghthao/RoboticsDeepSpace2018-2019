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
// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.DigitalInput;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS


/**
 *
 */
public class Lift extends Subsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private WPI_TalonSRX liftMotor;
    private DigitalInput hatchLineBreakerTransmitter;
    private DigitalInput hatchLineBreakerReceiver;
    private DigitalInput cargoLineBreakerTransmitter;
    private DigitalInput cargoLineBreakerReceiver;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public Lift() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        liftMotor = new WPI_TalonSRX(9);
        
        
        
        hatchLineBreakerTransmitter = new DigitalInput(2);
        addChild("HatchLineBreakerTransmitter",hatchLineBreakerTransmitter);
        
        
        hatchLineBreakerReceiver = new DigitalInput(4);
        addChild("HatchLineBreakerReceiver",hatchLineBreakerReceiver);
        
        
        cargoLineBreakerTransmitter = new DigitalInput(9);
        addChild("CargoLineBreakerTransmitter",cargoLineBreakerTransmitter);
        
        
        cargoLineBreakerReceiver = new DigitalInput(5);
        addChild("CargoLineBreakerReceiver",cargoLineBreakerReceiver);
        
        

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
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

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CMDPIDGETTERS


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CMDPIDGETTERS

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    public void moveLift(double power) {
        liftMotor.set(power);
    }
    public boolean hatchIsNotInterrupted(){
        return hatchLineBreakerReceiver.get();
    }
    public boolean cargoIsNotInterrupted(){
        return cargoLineBreakerReceiver.get();
    }
}

