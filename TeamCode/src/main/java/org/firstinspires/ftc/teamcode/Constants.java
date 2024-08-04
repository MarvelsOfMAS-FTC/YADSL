package org.firstinspires.ftc.teamcode;

import com.acmerobotics.dashboard.config.Config;
import com.qualcomm.hardware.rev.RevHubOrientationOnRobot;
import com.qualcomm.robotcore.hardware.IMU;

@Config
public class Constants {
    public static final IMU.Parameters IMU_ORIENTATION = new IMU.Parameters(new RevHubOrientationOnRobot(
            RevHubOrientationOnRobot.LogoFacingDirection.UP,
            RevHubOrientationOnRobot.UsbFacingDirection.FORWARD));

    //Names for motors and servos
    public static final String drone = "drone", rSlide = "rightSlide", lSlide = "leftSlide", fr = "frontRight", fl = "frontLeft", br = "backRight", bl = "backLeft", hand = "hand", intake = "intake", imu = "imu";
    //Hand Pos
    public static final double out = 0, in = 0;
    //Drone Pos
    public static final double launch = 0, load = 0;

}
