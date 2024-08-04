package org.firstinspires.ftc.teamcode.commands;

import com.arcrobotics.ftclib.command.CommandBase;

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
    private final double speed;

    public SlideCommand(SlideSubsystem slide, double speed) {
        this.slide=slide;
        this.speed=speed;
        addRequirements(slide);
    }

    @Override
    public void execute() {
        slide.set(speed);
    }

}
