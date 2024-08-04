package org.firstinspires.ftc.teamcode.teleop;

import com.arcrobotics.ftclib.command.CommandOpMode;
import com.arcrobotics.ftclib.command.RunCommand;
import com.arcrobotics.ftclib.gamepad.GamepadEx;

import org.firstinspires.ftc.teamcode.commands.DriveCommand;
import org.firstinspires.ftc.teamcode.subsystems.Drive;
import org.firstinspires.ftc.teamcode.utils.MotorConfig;
import org.firstinspires.ftc.teamcode.utils.MotorDirectionConfig;

public class Base extends CommandOpMode {

    @Override
    public void initialize() {
        GamepadEx base = new GamepadEx(gamepad1);
        Drive drive = new Drive(hardwareMap,"imu",new MotorConfig("fr","fl","br","bl"),new MotorDirectionConfig(false,false,false,false));
        drive.setDefaultCommand(new DriveCommand(drive,base));
    }
}
