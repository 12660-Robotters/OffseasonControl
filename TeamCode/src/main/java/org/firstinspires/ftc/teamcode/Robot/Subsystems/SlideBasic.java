package org.firstinspires.ftc.teamcode.Robot.Subsystems;

import com.arcrobotics.ftclib.command.SubsystemBase;
import com.arcrobotics.ftclib.command.button.Trigger;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.DcMotor;

public class SlideBasic extends SubsystemBase {
    DcMotor DcMotor;

    public SlideBasic(HardwareMap hardwareMap) {
        DcMotor = hardwareMap.get(DcMotor.class, "linearSlide");
    }

    public void setMotorPower(double power) {
        DcMotor.setPower(power);
    }
}