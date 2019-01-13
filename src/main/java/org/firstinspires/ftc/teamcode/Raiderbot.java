package org.firstinspires.ftc.teamcode;

import android.util.Log;

import static java.lang.Thread.sleep;
import static org.firstinspires.ftc.teamcode.SCHSConstants.*;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Raiderbot {

    private SCHSArm minArm;
    private SCHSArm landerArm;
    private SCHSMotor robotMotors;
    private SCHSSensor robotSensors;
    private SCHSObjectDetection robotTFlow;

    public void initialize(HardwareMap hardwareMap) {
        minArm = new SCHSArm();
        landerArm = new SCHSArm();

        robotSensors = new SCHSSensor();
        robotSensors.initialize(hardwareMap);

        robotMotors = new SCHSMotor();
        robotMotors.initialize(hardwareMap);

        robotTFlow = new SCHSObjectDetection();
        robotTFlow.initialize(hardwareMap);

        Log.d("Status" , " Raiderbot:initialize:after robotMotors initialized");
    }

    public void cleanShutDown() {
        robotMotors.cleanShutDown();

        //robotTFlow.cleanShutDown();
    }

    public void goToCrater() {

        //to be corrected
        //Log.d("Status" , "Raiderbot:goToCrater: inside go to crater");
        //robotMotors.moveToPosition(POWER_FULL_FORWARD, MOVE_FROM_LANDER_DIST);
    }

    public void orientRobot() {

    }

    public void depositMascot() throws InterruptedException {

        //move straight using gyro
        robotMotors.moveStraightWithGyro(POWER_FULL_FORWARD, MOVE_FROM_LANDER_DIST);
        Log.d("Status" , "SCHSRaiderbot:depositMascot: after move straight with gyro");
    }

    public void dropFromLander() throws InterruptedException {

    }

    public void senseBallAndSample() throws InterruptedException {

        // move straight after dropping from lander. Prepares for sampling maneuvers.
        robotMotors.moveStraightWithGyro(POWER_FULL_FORWARD, MOVE_FROM_LANDER_DIST);
        Log.d("Status" , "SCHSRaiderbot:senseBallAndSample: after move straight with gyro");


        sleep(2000);

        // Sense the gold cube. Record the angle of the mineral w/ respect to robot.
        robotTFlow.detectGoldMineral();
        Log.d("Status" , "SCHSRaiderbot:senseBallAndSample: after detect gold mineral");
        int turnToGoldAngle = robotTFlow.getMineralAngle();
        Log.d("Status" , "SCHSRaiderbot:senseBallAndSample: turn angle " + turnToGoldAngle);

        sleep(1000);

        // Turn robot to face the gold mineral.
        int turnToGoldDirection = 0;
        int reverseAngle = -turnToGoldAngle;
        int reverseDirection = 0;
        if (turnToGoldAngle < 0) {
            turnToGoldDirection = LEFT_TURN;
            Log.d("Status" , "SCHSRaiderbot:senseBallAndSample: left turn");
            robotMotors.turnWithGyro(0.25 , turnToGoldAngle, turnToGoldDirection);
            Log.d("Status" , "SCHSRaiderbot:senseBallAndSample: after turn");
            reverseDirection = RIGHT_TURN;
        } else if (turnToGoldAngle > 0){
            turnToGoldDirection = RIGHT_TURN;
            Log.d("Status" , "SCHSRaiderbot:senseBallAndSample: right turn");
            robotMotors.turnWithGyro(0.25 , turnToGoldAngle, turnToGoldDirection);
            Log.d("Status" , "SCHSRaiderbot:senseBallAndSample: after turn");
            reverseDirection = LEFT_TURN;
        } else {
            Log.d("Status" , "SCHSRaiderbot:senseBallAndSample: no turn");
        }

        sleep(1000);

        // Find distance to the mineral in inches.
        int moveDist = robotTFlow.getMineralDist();
        Log.d("Status" , "SCHSRaiderbot:senseBallAndSample: moveDist" + moveDist);

        // Move calculated distance to touch the gold mineral.
        robotMotors.moveStraightWithGyro(POWER_FULL_FORWARD, moveDist);
        Log.d("Status", "SCHSRaiderbot: after move to mineral");
        //robotTFlow.detectGoldMineral();
        //Log.d("Status", "SCHSRaiderbot: after detectGoldMineral");

        sleep(1000);

        // Move back to starting position
        // Turn to face forward (return to initial angle).
    }

    // Causes the current thread to wait a certain number of seconds. Used instead of given sleep function.
    public static void sleep(long sleepTime) {

        long wakeupTime = System.currentTimeMillis() + sleepTime;

        while (sleepTime > 0) {
            try
            {
                Thread.sleep(sleepTime);
            }
            catch (InterruptedException e)
            {
            }
            sleepTime = wakeupTime - System.currentTimeMillis();
        }
    }

}

