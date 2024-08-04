package org.firstinspires.ftc.teamcode.commands;

import com.arcrobotics.ftclib.command.CommandBase;
import com.arcrobotics.ftclib.gamepad.GamepadEx;
import com.arcrobotics.ftclib.gamepad.GamepadKeys;

import org.firstinspires.ftc.teamcode.subsystems.IntakeSubsystem;
import org.firstinspires.ftc.teamcode.subsystems.SlideSubsystem;

import java.util.function.DoubleSupplier;

/**
 * A command to drive the robot with joystick input
 * (passed in as {@link DoubleSupplier}s). Written
 * explicitly for pedagogical purposes.
 */
public class SlideCommand extends CommandBase {

    private final SlideSubsystem slide;
    private final GamepadEx gamepad;

    public SlideCommand(SlideSubsystem slide, GamepadEx gamepad) {
        this.slide=slide;
        this.gamepad = gamepad;
        addRequirements(slide);
    }

    @Override
    public void execute() {
        slide.set(gamepad.getTrigger(GamepadKeys.Trigger.RIGHT_TRIGGER)-gamepad.getTrigger(GamepadKeys.Trigger.LEFT_TRIGGER));
    }

}
