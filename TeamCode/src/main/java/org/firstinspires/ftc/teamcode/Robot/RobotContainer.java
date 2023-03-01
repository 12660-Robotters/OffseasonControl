package org.firstinspires.ftc.teamcode.Robot;


import com.arcrobotics.ftclib.command.CommandScheduler;
import com.arcrobotics.ftclib.command.RunCommand;
import com.arcrobotics.ftclib.command.button.Button;
import com.arcrobotics.ftclib.gamepad.GamepadEx;
import com.arcrobotics.ftclib.gamepad.GamepadKeys;
import com.qualcomm.hardware.lynx.LynxModule;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.Robot.Subsystems.Claw_Subsystem;
import org.firstinspires.ftc.teamcode.Robot.Subsystems.SlideBasic;
import org.firstinspires.ftc.teamcode.Robot.commands.SlideBasicRun;
import org.firstinspires.ftc.teamcode.util.Robot;

import java.util.List;

public class RobotContainer extends Robot {
    CommandScheduler commandScheduler;

    List<LynxModule> lynxModuleList;

    GamepadEx driverone;
    GamepadEx drivertwo;
    public enum OpModeType {
        TELEOP, AUTO
    }

    Claw_Subsystem claw_subsystem;
    SlideBasic slideBasic;

    public RobotContainer(HardwareMap hardwareMap, OpModeType type, Gamepad driverone, Gamepad drivertwo) {
        claw_subsystem = new Claw_Subsystem(hardwareMap);
        register(claw_subsystem);
        commandScheduler = CommandScheduler.getInstance();

        lynxModuleList = hardwareMap.getAll(LynxModule.class);



        switch (type) {
            case AUTO:
                initAuto();

            case TELEOP:

                slideBasic = new SlideBasic(hardwareMap);
                register(slideBasic);
                this.driverone = new GamepadEx(driverone);
                this.drivertwo = new GamepadEx(drivertwo);
                initTeleop();


        }

    }

    private void initAuto() {

    }

    private void initTeleop() {
        bindGrabbers();
        bindSlideBasic();




    }


    private void bindGrabbers() {
        Button LEFT_BUMPER = drivertwo.getGamepadButton(GamepadKeys.Button.LEFT_BUMPER);
        LEFT_BUMPER.whenPressed(new RunCommand(claw_subsystem::grab, claw_subsystem));
        LEFT_BUMPER.whenReleased(new RunCommand(claw_subsystem::release, claw_subsystem));
    }

    private void bindSlideBasic() {
        commandScheduler.setDefaultCommand(slideBasic, new SlideBasicRun(slideBasic, drivertwo));
    }

    private void bindHubBulkReads() {
        for (LynxModule module : lynxModuleList) {
            module.setBulkCachingMode(LynxModule.BulkCachingMode.MANUAL);
        }
    }

    private void clearBulkCache() {
        for(LynxModule module : lynxModuleList) {
            module.clearBulkCache();
        }
    }
}
