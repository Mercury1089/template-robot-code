package org.usfirst.frc.team1089.robot;

/**
 * The RobotSettings is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 * <p>
 * For example to map the left and right motors, you could define the
 * following variables to use with your drivetrain subsystem.
 * <pre>
 * public static int leftMotor = 1;
 * public static int rightMotor = 2;
 * </pre>
 * <p>
 * If you are using multiple modules, make sure to define both the port
 * number and the module. For example, with a rangefinder:
 * <pre>
 * public static int rangefinderPort = 1;
 * public static int rangefinderModule = 1;
 * </pre>
 */
public class RobotMap {
	/**
	 * Class containing constants for the ports of all CAN devices.
	 */

	public static class CAN {
		public static final int
            DRIVETRAIN_ML = 1,
			DRIVETRAIN_MR = 2,
			DRIVETRAIN_SL = 3,
			DRIVETRAIN_SR = 4,
			PCM = 5;

		private CAN() { } // Should never be constructed.
	}

	/**
	 * Class containing constants for AIO device channels
	 */
	public static class AIO {

		private AIO() { } // Should never be constructed.
	}

	/**
	 * Class containing constants for PID loop indicies
	 */
	public static class PID {
		public static final int
				PRIMARY_PID_LOOP = 0;

		private PID() { } // Should never be constructed.
	}

	/**
	 * Class containing constants for PWM device channels
	 */
	public static class PWM {

		private PWM() { } // Should never be constructed.
	}

	/**
	 * Class containing constants for Digital Input channels
	 */
	public static class DIGITAL_INPUT {

		private DIGITAL_INPUT() { } // Should never be constructed.
	}

	/**
	 * Class containing constants for ports of the devices on the USB interface of the Driver Station.
	 * Good for OI joystick ports and of the like.
	 */
	public static class DS_USB {
		public static final int 
			LEFT_STICK = 0,
			RIGHT_STICK = 1,
			GAMEPAD = 2;
		
		private DS_USB() { } // Should never be constructed.
	}

	/**
	 * 
	 */
	public static class PCM {
		public static final int PISTON_ACTUATE = 0,
			PISTON_RETRACT = 1; 

		private PCM() { } // Should never be constructed
	}

	public static class GAMEPAD_BUTTONS {
		public static final int A = 1;
		public static final int B = 2;
		public static final int X = 3;
		public static final int Y = 4;
		public static final int LB = 5;
		public static final int RB = 6;
		public static final int BACK = 7;
		public static final int START = 8;
		public static final int L3 = 9;
		public static final int R3 = 10;

		private GAMEPAD_BUTTONS() { }
	}

	public static class JOYSTICK_BUTTONS {
		public static final int BTN1 = 1;
		public static final int BTN2 = 2;
		public static final int BTN3 = 3;
		public static final int BTN4 = 4;
		public static final int BTN5 = 5;
		public static final int BTN6 = 6;
		public static final int BTN7 = 7;
		public static final int BTN8 = 8;
		public static final int BTN9 = 9;
		public static final int BTN10 = 10;
		public static final int BTN11 = 11;

		public JOYSTICK_BUTTONS() {
		}
	}
}
