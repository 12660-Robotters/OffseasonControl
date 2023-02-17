package org.firstinspires.ftc.teamcode.Robot.Subsystems;

import com.arcrobotics.ftclib.command.SubsystemBase;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.DcMotor;

public class Slide_Subsystem extends SubsystemBase {
    DcMotor motorLeft;
    DcMotor motorRight;

    public Slide_Subsystem(HardwareMap hardwareMap) {
        motorLeft = hardwareMap.get(DcMotor.class, "motorLeft");
        motorRight= hardwareMap.get(DcMotor.class, "motorRight");
    }
}
