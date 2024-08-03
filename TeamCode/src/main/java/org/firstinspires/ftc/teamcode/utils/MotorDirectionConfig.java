package org.firstinspires.ftc.teamcode.utils;

public class MotorDirectionConfig {
    boolean fr,fl,br,bl = false;
    public MotorDirectionConfig(boolean fr, boolean fl, boolean br, boolean bl){
        this.fl = fl;
        this.fr = fr;
        this.br = br;
        this.bl = bl;
    }
    public boolean getFr(){
        return fr;
    }
    public boolean getFl(){
        return fl;
    }
    public boolean getBr(){
        return br;
    }
    public boolean getBl(){
        return bl;
    }

}
