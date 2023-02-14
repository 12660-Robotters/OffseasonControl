package org.firstinspires.ftc.teamcode.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;

import org.firstinspires.ftc.teamcode.Robot.RobotContainer;

public class Teleop extends LinearOpMode {
    @Override
    public void runOpMode() throws InterruptedException {
        RobotContainer robotContainer = new RobotContainer(hardwareMap, org.firstinspires.ftc.teamcode.Robot.RobotContainer.OpModeType.TELEOP, gamepad1, gamepad2);

        waitForStart();

        while (opModeIsActive() && !isStopRequested()) {
            robotContainer.run();
        }

        robotContainer.reset();
    }
}