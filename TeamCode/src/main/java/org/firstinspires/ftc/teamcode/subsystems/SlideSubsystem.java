package org.firstinspires.ftc.teamcode.subsystems;
import com.arcrobotics.ftclib.command.SubsystemBase;
import com.qualcomm.robotcore.hardware.DcMotorSimple.Direction;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class SlideSubsystem extends SubsystemBase {
    /**
     * Creates a new ExampleSubsystem.
     */
    private final DcMotorEx right, left;
    public SlideSubsystem(HardwareMap h, String right, String left, Direction rightD, Direction leftD) {
        this.right = h.get(DcMotorEx.class, right);
        this.left = h.get(DcMotorEx.class, left);
        this.right.setDirection(rightD);
        this.left.setDirection(leftD);
    }
    public void set(double speed) {
        this.right.setPower(speed);
        this.left.setPower(speed);
    }

    @Override
    public void periodic() {
        // This method will be called once per scheduler run
    }
}