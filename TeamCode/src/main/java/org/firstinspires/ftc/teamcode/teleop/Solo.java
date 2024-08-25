package org.firstinspires.ftc.teamcode.teleop;

import com.arcrobotics.ftclib.command.CommandOpMode;
import com.arcrobotics.ftclib.command.button.GamepadButton;
import com.arcrobotics.ftclib.gamepad.GamepadEx;
import com.arcrobotics.ftclib.gamepad.GamepadKeys;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

import org.firstinspires.ftc.teamcode.Constants;
import org.firstinspires.ftc.teamcode.commands.DriveCommand;
import org.firstinspires.ftc.teamcode.commands.DroneCommand;
import org.firstinspires.ftc.teamcode.commands.HandCommand;
import org.firstinspires.ftc.teamcode.commands.IntakeCommand;
import org.firstinspires.ftc.teamcode.commands.SlideArmCommand;
import org.firstinspires.ftc.teamcode.commands.TransferCommand;
import org.firstinspires.ftc.teamcode.subsystems.Drive;
import org.firstinspires.ftc.teamcode.subsystems.DroneSubsystem;
import org.firstinspires.ftc.teamcode.subsystems.HandSubsystem;
import org.firstinspires.ftc.teamcode.subsystems.IntakeSubsystem;
import org.firstinspires.ftc.teamcode.subsystems.SlideSubsystem;
import org.firstinspires.ftc.teamcode.subsystems.TransferSubsystem;
import org.firstinspires.ftc.teamcode.utils.MotorConfig;
import org.firstinspires.ftc.teamcode.utils.MotorDirectionConfig;
@TeleOp
public class Solo extends CommandOpMode {
    @Override
    public void initialize() {
        GamepadEx base = new GamepadEx(gamepad1);

        IntakeSubsystem intake = new IntakeSubsystem(hardwareMap, Constants.intake);
        Drive drive = new Drive(hardwareMap, Constants.imu,new MotorConfig(Constants.fr,Constants.fl,Constants.br,Constants.bl),new MotorDirectionConfig(false,true,false,true));
        DroneSubsystem drone = new DroneSubsystem(hardwareMap, Constants.drone);
        HandSubsystem hand = new HandSubsystem(hardwareMap, Constants.hand);
        SlideSubsystem slide = new SlideSubsystem(hardwareMap, Constants.rSlide, Constants.lSlide, DcMotorSimple.Direction.REVERSE, DcMotorSimple.Direction.FORWARD);
        TransferSubsystem transfer = new TransferSubsystem(hardwareMap, Constants.transfer);



        //Default Commands
        drive.setDefaultCommand(new DriveCommand(drive,base));
        intake.setDefaultCommand(new IntakeCommand(intake, 0));
        drone.setDefaultCommand(new DroneCommand(drone, Constants.load));
        hand.setDefaultCommand(new HandCommand(hand, Constants.in));
        slide.setDefaultCommand(new SlideArmCommand(slide, base));

        //Binding Commands
        new GamepadButton(base, GamepadKeys.Button.A).toggleWhenPressed(new HandCommand(hand, Constants.out), new HandCommand(hand, Constants.in));
        new GamepadButton(base, GamepadKeys.Button.B).toggleWhenPressed(new DroneCommand(drone, Constants.launch), new DroneCommand(drone, Constants.load));
        new GamepadButton(base, GamepadKeys.Button.RIGHT_BUMPER).whenPressed(new IntakeCommand(intake, 1)).whenPressed(new TransferCommand(transfer, -1)).whenReleased(new IntakeCommand(intake, 0)).whenReleased(new TransferCommand(transfer, 0));
        new GamepadButton(base, GamepadKeys.Button.LEFT_BUMPER).whenPressed(new IntakeCommand(intake, -1)).whenReleased(new IntakeCommand(intake, 0));

        //Telemetry
        telemetry.addData("Intake Velocity: ", intake.get());
        telemetry.addData("Right Slide Velocity: ", slide.getRight());
        telemetry.addData("Left Slide Velocity: ", slide.getLeft());
        telemetry.addData("Transfer Power: ", transfer.get());
        telemetry.addData("Hand Position: ", hand.get());
        telemetry.addData("Drone position: ", drone.get());
    }
}
