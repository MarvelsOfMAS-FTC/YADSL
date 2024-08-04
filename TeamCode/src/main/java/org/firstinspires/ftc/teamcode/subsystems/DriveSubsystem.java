package org.firstinspires.ftc.teamcode.subsystems;

import com.arcrobotics.ftclib.command.SubsystemBase;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.utils.MotorConfig;
import org.firstinspires.ftc.teamcode.utils.MotorDirectionConfig;

public class DriveSubsystem extends SubsystemBase {
    DcMotorEx fr,fl,br,bl;
    public DriveSubsystem(final HardwareMap hMap, MotorConfig config, MotorDirectionConfig directionConfig) {
        this.fr=hMap.get(DcMotorEx.class,config.getFr());
        this.fl=hMap.get(DcMotorEx.class,config.getFl());
        this.br=hMap.get(DcMotorEx.class,config.getBr());
        this.bl=hMap.get(DcMotorEx.class,config.getBl());
        if(directionConfig.getFr()){
            this.fr.setDirection(DcMotorSimple.Direction.REVERSE);
        }
        if(directionConfig.getFl()){
            this.fl.setDirection(DcMotorSimple.Direction.REVERSE);
        }
        if(directionConfig.getBr()){
            this.br.setDirection(DcMotorSimple.Direction.REVERSE);
        }
        if(directionConfig.getBl()){
            this.bl.setDirection(DcMotorSimple.Direction.REVERSE);
        }
    }
    /*
     * y=-leftsticky
     * x=leftstickx
     * r=rightstickx
     */
    public void arcadeDrive(double x,double y,double r){
        fl.setPower(y+x+r);
        bl.setPower(y-x+r);
        fr.setPower(y-x-r);
        br.setPower(y+x-r);
    }

}
