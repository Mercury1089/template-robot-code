package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team1089.robot.RobotMap.CAN;
import org.usfirst.frc.team1089.robot.RobotMap.PCM;
/**
 * Template class controlling a DoubleSolenoid which controls piston extension and retraction.
 * Needs a pneumatics control module(PCM)
 */
public class TemplateDoubleSolenoid extends Subsystem {

  private DoubleSolenoid doubleSolenoid;
  private boolean isOut;

/**
 * Creates a DoubleSolenoid and declares its position. 
 */    
  public TemplateDoubleSolenoid(){
    isOut = false;
    doubleSolenoid = new DoubleSolenoid(CAN.PCM, PCM.PISTON_ACTUATE, PCM.PISTON_RETRACT);
    //Ensures piston(s) are retracted
    doubleSolenoid.set(DoubleSolenoid.Value.kReverse);
  }

  @Override
  public void initDefaultCommand() {

  }

  /**
   * @return if the piston is extended(true) or retracted(false)
   */
  public boolean getIsOut(){
    return isOut;
  }

  /**
   * @param postion whether you want piston extended or retracted
   * sets isOut to whether the piston is out or in 
   */
  public void actuateDoubleSolenoid(DoubleSolenoidPosition position){
    switch (position) {
      case OUT:
        doubleSolenoid.set(DoubleSolenoid.Value.kForward);
        break;
      case IN:
        doubleSolenoid.set(DoubleSolenoid.Value.kReverse);
        break;
    }

    isOut = position == DoubleSolenoidPosition.OUT;
  }

  //Enum to control doubleSolenoid state
  public enum DoubleSolenoidPosition {
    IN,
    OUT;
  }
}
