package org.firstinspires.ftc.teamcode.teleop;

import com.arcrobotics.ftclib.command.CommandOpMode;
import com.arcrobotics.ftclib.command.button.Button;
import com.arcrobotics.ftclib.command.button.GamepadButton;
import com.arcrobotics.ftclib.gamepad.GamepadEx;
import com.arcrobotics.ftclib.gamepad.GamepadKeys;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.Constants;
import org.firstinspires.ftc.teamcode.commands.IntakeCommand;
import org.firstinspires.ftc.teamcode.commands.SlideCommand;
import org.firstinspires.ftc.teamcode.subsystems.Drive;
import org.firstinspires.ftc.teamcode.subsystems.DroneSubsystem;
import org.firstinspires.ftc.teamcode.subsystems.HandSubsystem;
import org.firstinspires.ftc.teamcode.subsystems.IntakeSubsystem;
import org.firstinspires.ftc.teamcode.subsystems.SlideSubsystem;

public class Solo extends CommandOpMode {
    @Override
    public void initialize() {
        GamepadEx drive = new GamepadEx(gamepad1);
        /*
        IntakeSubsystem intake = new IntakeSubsystem(HardwareMap, Constants.intake);
        DroneSubsystem drone = new DroneSubsystem();
        HandSubsystem hand = new HandSubsystem();
        SlideSubsystem slide = new SlideSubsystem();
        */
        Button a1 = new GamepadButton(
                drive, GamepadKeys.Button.A
        );
        Button b1 = new GamepadButton(
                drive, GamepadKeys.Button.B
        );
        Button x1 = new GamepadButton(
                drive, GamepadKeys.Button.X
        );
        Button y1 = new GamepadButton(
                drive, GamepadKeys.Button.Y
        );
        Button up1 = new GamepadButton(
                drive, GamepadKeys.Button.DPAD_UP
        );
        Button left1 = new GamepadButton(
                drive, GamepadKeys.Button.DPAD_LEFT
        );
        Button right1 = new GamepadButton(
                drive, GamepadKeys.Button.DPAD_RIGHT
        );
        Button down1 = new GamepadButton(
                drive, GamepadKeys.Button.DPAD_DOWN
        );
        Button rightB1 = new GamepadButton(
                drive, GamepadKeys.Button.RIGHT_BUMPER
        );
        Button leftB1 = new GamepadButton(
                drive, GamepadKeys.Button.LEFT_BUMPER
        );
        Button leftS1 = new GamepadButton(
                drive, GamepadKeys.Button.LEFT_STICK_BUTTON
        );
        Button rightS1 = new GamepadButton(
                drive, GamepadKeys.Button.RIGHT_BUMPER
        );
        rightB1.whenPressed(new IntakeCommand(intake, 1))
    }
}
