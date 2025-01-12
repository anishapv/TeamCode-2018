package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.Servo;

public final class SCHSConstants {

    // distance measurements for each movement in inches
    static final int MOVE_FROM_LANDER_DIST = 2;
    static final int GO_TO_WALL_DIST = 24;
    static final int GO_TO_PICTURE_DIST = 30;
    static final int GO_TO_DEPOT_DIST = 48;
    static final int GO_TO_CRATER_DIST = -75;
    static final int MOVE_TO_BALL = 28; //013019 changed from 18
    static final int MOVE_BACK_FROM_BALL = -17; //013019 changed from -7
    static final int GO_TO_PICTURE_LEFT_DIST = 34; //013019 changed from 30
    static final int GO_TO_PICTURE_RIGHT_DIST = 42;
    static final int GO_TO_PICTURE_CENTER_DIST = 38;

    //measurements and values for dropping from lander
    static final int DROP_FROM_LANDER_DIST = 100; //encoder value for now, other unit tbd
    static final int ARM_MOVE_UP_DIRECTION = 1;
    static final int ARM_MOVE_DOWN_DIRECTION = 2;

    // angle measurements for each turn
    static final double TURN_TO_WALL_ANGLE = 180;
    static final double TURN_TO_PICTURE_ANGLE = 50;
    static final double DEPOT_ZONE_TURN_ANGLE = 90;
    static final double CRATER_ZONE_TURN_ANGLE = 90;
    static final double TURN_TO_DEPOT_ANGLE = 58;
    static final double BALL_ANGLE_ERROR = 0.75;
    static final double TURN_TO_PICTURE_LEFT_ANGLE = 60;
    static final double TURN_TO_PICTURE_RIGHT_ANGLE = 61;
    static final double TURN_TO_PICTURE_CENTER_ANGLE = 57;
    static final double TURN_MASCOT_SERVO_ANGLE = 0.5; //from 0 to 1, where 1 is 180 degrees
    static final int CAMERA_ANGLE_ERROR = 15; ////013119 changing 10 to 25
    static final int CAMERA_ANGLE_SMALL_ERROR = 0; //013119 changing 10 to 25

    //left or right direction for each turn - int where 1 = left and 2 = right
    static final int TURN_TO_WALL_DIRECTION = 1;
    static final int TURN_TO_PICTURE_DIRECTION = 1;
    static final int DEPOT_ZONE_TURN_DIRECTION = 2;
    static final int CRATER_ZONE_TURN_DIRECTION = 1;
    static final int LEFT_TURN = 1;
    static final int RIGHT_TURN = 2;

    //servo constants - direction, increment
    static final int SERVO_DIRECTION_LEFT = 1;
    static final int SERVO_DIRECTION_RIGHT = 2;
    static final double INCREMENT   = 0.01;
    static final int    CYCLE_MS    =   50;

    // color values as that the color sensor would detect from each picture - may be changed to red/green/blue/alpha values
    static final int PIC_CRATERS = 5;
    static final int PIC_ROVER = 4;
    static final int PIC_MOON = 3;
    static final int PIC_STARS = 2;

    // power constants between 1 and -1
    static final double POWER_FULL_FORWARD = 1;
    static final double POWER_FULL_BACKWARD = -1;
    static final double POWER_HALF_FORWARD = 0.5;
    static final double POWER_HALF_BACKWARD = -0.5;
    static final double POWER_TURN_SPEED = 0.25;

    //Tensor Flow Object detection
    static final String TFOD_MODEL_ASSET = "RoverRuckus.tflite";
    static final String LABEL_GOLD_MINERAL = "Gold Mineral";
    static final String LABEL_SILVER_MINERAL = "Silver Mineral";
    static final String VUFORIA_KEY = "AUnX7nP/////AAABmZjfOTd2skx4p/r+LBA29VQAFar5mbPnEfGtcl78mMIqK+EtsUOR33zwyiDCmj1oYMUx0P4eWZGi6EMhZgTM66/5llx5azKwGGxGmTJUGotbAekyZgxYR7SWDme6xMYGR68jZcR9rkvJxfB1ZKFytPXWeRpwzSAQJ0VACF/hdguUyfA6SSkF2dnc/iH76TkSV3hA4zz0v3wjHfQmmNBvrtgPklvfOTX2f+G5tBfBq75PEx52LaX+tOPTtBajR9MFwVT26kcqFz2GJCEBgjO3PX1St0xNJBqbbudKvZ+B/6xWuVhwHVqwOgy/RsuHLBFskh4n9Ec1xnuB9uCnQXrrliEtcR1TbnmIEYTX6FZtxF5H";
    static final int FOCAL_LENGTH = 27; //mm
    static final int REAL_HEIGHT_GOLD = 50; //mm
    static final int IMG_HEIGHT = 2448; //pixels
    static final int CAMERA_HEIGHT = 264; //mm, previous value 35
    static final int SCAN_BALLS_TIME = 5000; // milliseconds

    //Vuforia Picture Detection
    static final int CAMERA_FORWARD_DISPLACEMENT  = 110;   // eg: Camera is 110 mm in front of robot center
    static final int CAMERA_VERTICAL_DISPLACEMENT = 200;   // eg: Camera is 200 mm above ground
    static final int CAMERA_LEFT_DISPLACEMENT     = 0;     // eg: Camera is ON the robot's center line
    static final int SCAN_PICTURE_TIME = 3000; // milliseconds
    static final String ROVER_PIC = "Blue-Rover";
    static final String CRATERS_PIC = "Front-Craters";
    static final String FOOT_PIC = "Red-Footprint";
    static final String SPACE_PIC = "Back-Space";

    //core hex motor constants
    static final double CHMOTOR_COUNTS_PER_REVOLUTION = 288;
    static final double REAR_WHEEL_BASE_= 12; //inches
    static final double TRACTION_WHEEL_DIAMETER = 90 * 0.0393701; //90mm converted to inches

    //formula for inches to counts (encoder value): 288 counts/revolution
    //1 revolution = 90pi mm = 3.54331pi inches
    //total counts = 288*rev
    //x inches / 3.54331pi = # rev
    //encoder value = (288*x)/(3.54331pi) = 310.466 at x = 12 inches

    //formula for degrees (encoder value): (a/360)*(3.54331pi) = y inches
    //encoder value = (288*y)/(12pi) = 310.466 at y inches for a degrees
    //at a = 90 degrees, encoder value = 243.839
}
