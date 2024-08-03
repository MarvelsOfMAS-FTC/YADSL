package org.firstinspires.ftc.teamcode.subsystems;

import com.arcrobotics.ftclib.command.SubsystemBase;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.utils.MotorDirectionConfig;

public class Drive extends SubsystemBase {
    DcMotorEx fr,fl,br,bl;
    public Drive(final HardwareMap hMap, final String fr, String fl, String br, String bl, MotorDirectionConfig directionConfig) {
        this.fr=hMap.get(DcMotorEx.class,fr);
        this.fl=hMap.get(DcMotorEx.class,fl);
        this.br=hMap.get(DcMotorEx.class,br);
        this.bl=hMap.get(DcMotorEx.class,bl);
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
