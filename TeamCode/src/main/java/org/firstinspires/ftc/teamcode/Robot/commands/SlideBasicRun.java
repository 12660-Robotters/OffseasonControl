package org.firstinspires.ftc.teamcode.Robot.commands;

import com.arcrobotics.ftclib.command.CommandBase;
import com.arcrobotics.ftclib.gamepad.GamepadEx;

import org.firstinspires.ftc.teamcode.Robot.Subsystems.SlideBasic;

public class SlideBasicRun extends CommandBase {
    private final SlideBasic slideBasic;
    private final GamepadEx drivertwo;

    public SlideBasicRun(SlideBasic slideBasic, GamepadEx drivertwo) {
        this.slideBasic = slideBasic;
        this.drivertwo = drivertwo;
        addRequirements(slideBasic);
    }

    @Override
    public void execute() {
        slideBasic.setMotorPower(drivertwo.getLeftY());
    }
}
