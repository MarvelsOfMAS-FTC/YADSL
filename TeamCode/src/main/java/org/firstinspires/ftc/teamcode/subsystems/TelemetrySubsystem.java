package org.firstinspires.ftc.teamcode.subsystems;

import org.firstinspires.ftc.robotcore.external.Telemetry;
import org.firstinspires.ftc.teamcode.teleop.Solo;
import org.firstinspires.ftc.teamcode.utils.SimpleLogger;


public class TelemetrySubsystem {
    SimpleLogger log;
    Telemetry telemetry;

    public TelemetrySubsystem(SimpleLogger log, Telemetry telemetry){
        this.log = log;
        this.telemetry = telemetry;

    }
    public void addHeadings(){
        log.add("Intake Velocity")
                .add("Right Slide Velocity")
                .add("Left Slide Velocity")
                .add("Transfer Power")
                .add("Hand Position")
                .add("Drone Position")
                .add("Front Right Velocity")
                .add("Front Left Velocity")
                .add("Back Right Velocity")
                .add("Back Left Velocity")
                .add("Heading (Degrees)")
                .headerLine();
    }
    public void addData(){
        
    }

    public void update(){ //use Solo.Subsystem.Method()
        log.add(Solo.intake.get())
                .add(Solo.slide.getRight())
                .add(Solo.slide.getLeft())
                .add(Solo.transfer.get())
                .add(Solo.hand.get())
                .add(Solo.drone.get())
                .add(Solo.drive.getFR())
                .add(Solo.drive.getFL())
                .add(Solo.drive.getBR())
                .add(Solo.drive.getBL())
                .add(Solo.drive.getHeading());

    }
}
