package org.firstinspires.ftc.teamcode.commands;

import com.arcrobotics.ftclib.command.CommandBase;

import org.firstinspires.ftc.teamcode.subsystems.Drive;

public class DriveCommand extends CommandBase {
    private final Drive drive;
    private double x, y, r;

    public DriveCommand(Drive drive, double x, double y, double r){
        this.drive = drive;
        this.x=x;
        this.y=y;
        this.r=r;
        addRequirements(drive);
    }
    @Override
    public void execute(){
        drive.robotCentricDrive(x, y, r);
        //drive.fieldCentricDrive(x,y,r);
    }

}
