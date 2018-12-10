package org.firstinspires.ftc.teamcode;

public final class SCHSConstants {

    // distance measurements for each movement
    static final int MOVE_FROM_LANDER_DIST= 100;
    static final int GO_TO_WALL_DIST = 10;
    static final int GO_TO_PICTURE_DIST = 10;
    static final int GO_TO_DEPOT_DIST = 10;
    static final int GO_TO_CRATER_DIST = 10;

    // angle measurements for each turn
    static final int TURN_TO_WALL_ANGLE = 90;
    static final int TURN_TO_PICTURE_ANGLE = 90;
    static final int DEPOT_ZONE_TURN_ANGLE = 90;
    static final int CRATER_ZONE_TURN_ANGLE = 90;

    //left or right direction for each turn - int where 1 = left and 2 = right
    static final int TURN_TO_WALL_DIRECTION = 1;
    static final int TURN_TO_PICTURE_DIRECTION = 2;
    static final int DEPOT_ZONE_TURN_DIRECTION = 2;
    static final int CRATER_ZONE_TURN_DIRECTION = 1;
    static final int LEFT_TURN = 1;
    static final int RIGHT_TURN = 2;

    // blue values as that the color sensor would detect from each picture - may be changed to red/green values
    static final int picCraters = 5;
    static final int picRover = 4;
    static final int picMoon = 3;
    static final int picStars = 2;

    // power constants
    static final double POWER_FULL_FORWARD = 1;
    static final double POWER_FULL_BACKWARD = -1;
    static final double POWER_HALF_FORWARD = 0.5;
    static final double POWER_HALF_BACKWARD = -0.5;

    //core hex motor constants
    static final int CHMOTOR_COUNTS_PER_REVOLUTION = 288;
    static final int REAR_WHEEL_BASE_= 12; //inches
    static final double TRACTION_WHEEL_DIAMETER = 90 * 0.0393701; //90mm converted to inches
}