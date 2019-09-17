/*
package org.usfirst.frc.team1089.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team1089.robot.Robot;
//import org.usfirst.frc.team1089.robot.subsystems.TemplateDoubleSolenoid.DoubleSolenoidPosition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MovePiston extends Command {
    private final Logger LOG = LogManager.getLogger(MoveLegs.class);
    private DoubleSolenoidPosition position;
    
    public MovePiston(DoubleSolenoidPosition position){
        requires(Robot.templateDoubleSolenoid);
        setName("MovePiston Command");
        LOG.info(getName() + " Constructed");

        this.position = position;
    }

    // Called just before this Command runs the first time
    // Moves the piston to desired position(out or in)
    @Override
    protected void initialize() {
        LOG.info(getName() + " Initialized");
        Robot.templateDoubleSolenoid.actuateDoubleSolenoid(position);
    }               

    // Called repeatedly when this Command is scheduled to run
    @Override
    protected void execute() {
        LOG.info(getName() + " Executed");
    }

    // Make this return true when this Command no longer needs to run execute()
    @Override
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    @Override
    protected void end() {
        LOG.info(getName() + " Ended");
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    @Override
    protected void interrupted() {
        LOG.info(getName() + " Interrupted");
    }
}*/