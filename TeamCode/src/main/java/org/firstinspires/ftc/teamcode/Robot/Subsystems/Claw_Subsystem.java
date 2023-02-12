package org.firstinspires.ftc.teamcode.Robot.Subsystems;

import com.arcrobotics.ftclib.command.SubsystemBase;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class Claw_Subsystem extends SubsystemBase {
    Servo clawServo;

    double claw_open_position = 1;
    double claw_closed_position = 0;

    public Claw_Subsystem(HardwareMap hardwareMap) {
        clawServo = hardwareMap.get(Servo.class, "clawservo");
    }

    public void grab() {
        clawServo.setPosition(claw_closed_position);
    }

    public void release() {
        clawServo.setPosition(claw_open_position);
    }

}
