package org.firstinspires.ftc.teamcode.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.Robot.RobotContainer;

@Autonomous
public class Auto extends LinearOpMode {
    @Override
    public void runOpMode() throws InterruptedException {
        RobotContainer robotContainer = new RobotContainer(hardwareMap, RobotContainer.OpModeType.AUTO, gamepad1, gamepad2);


        waitForStart();

        while (opModeIsActive() && !isStopRequested()) {
            robotContainer.run();
        }

        robotContainer.reset();
    }
}
