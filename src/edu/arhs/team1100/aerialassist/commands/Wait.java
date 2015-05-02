package edu.arhs.team1100.aerialassist.commands.manipulatorcommands;

import edu.arhs.team1100.aerialassist.OI;
import edu.arhs.team1100.aerialassist.commands.CommandBase;
import edu.arhs.team1100.aerialassist.subsystems.ManipulatorSubsystem;
import edu.arhs.team1100.aerialassist.subsystems.ShooterSubsystem;
import edu.wpi.first.wpilibj.DriverStationEnhancedIO;


/**
 *
 * @author Team 1100
 */
public class Wait extends CommandBase {
    /**
     * Constructs a DriveSubsystem object
     */
    public Wait() throws DriverStationEnhancedIO.EnhancedIOException {
    }

    /**
     * Called just before this Command runs the first time
     */
    protected void initialize() {
      
    }

    /**
     * Called repeatedly when this Command is scheduled to run
     */
    protected void execute() {
  
    }

    /**
     * Make this return true when this Command no longer needs to run execute()
     *
     * @return false
     */
    protected boolean isFinished() {
        return false;
    }

    /**
     * Called once after isFinished returns true
     */
    protected void end() {
    }

    /**
     * Called when another command which requires one or more of the same
     * subsystems is scheduled to run
     */
    protected void interrupted() {
        end();
    }
}
