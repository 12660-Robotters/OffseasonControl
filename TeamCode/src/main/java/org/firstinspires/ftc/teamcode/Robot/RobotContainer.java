package org.firstinspires.ftc.teamcode.Robot;


import com.arcrobotics.ftclib.gamepad.GamepadEx;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.Robot.Subsystems.Claw_Subsystem;
import org.firstinspires.ftc.teamcode.util.Robot;

public class RobotContainer extends Robot {

    GamepadEx driverone;
    GamepadEx drivertwo;
    public enum OpModeType {
        TELEOP, AUTO
    }

    Claw_Subsystem claw_subsystem;

    public RobotContainer(HardwareMap hardwareMap, OpModeType type, Gamepad driverone, Gamepad drivertwo) {
        claw_subsystem = new Claw_Subsystem(hardwareMap);


        switch (type) {
            case AUTO:
                initAuto();

            case TELEOP:

                this.driverone = new GamepadEx(driverone);
                this.drivertwo = new GamepadEx(drivertwo);
                initTeleop();


        }

    }

    public void initAuto() {

    }

    public void initTeleop() {

    }
}
