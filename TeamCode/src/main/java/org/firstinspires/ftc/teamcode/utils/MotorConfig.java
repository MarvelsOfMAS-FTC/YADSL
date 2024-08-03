package org.firstinspires.ftc.teamcode.utils;

public class MotorConfig {
    String fr,fl,br,bl="NO_CONFIG_SET_FOR_DRIVE_MOTORS_IN_CODE";
    public MotorConfig(String fr,String fl,String br,String bl){
        this.fr = fr;
        this.fl=fl;
        this.br=br;
        this.bl=bl;
    }

    public String getBl() {
        return bl;
    }

    public String getBr() {
        return br;
    }

    public String getFl() {
        return fl;
    }

    public String getFr() {
        return fr;
    }
}
