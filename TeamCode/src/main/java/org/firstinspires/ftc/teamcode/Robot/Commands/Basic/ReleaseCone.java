package org.firstinspires.ftc.teamcode.Robot.Commands.Basic;

import com.arcrobotics.ftclib.command.CommandBase;

import org.firstinspires.ftc.teamcode.Robot.Subsystems.Claw_Subsystem;

public class ReleaseCone extends CommandBase {
    public final Claw_Subsystem claw_subsystem;


    public ReleaseCone(Claw_Subsystem claw_subsystem) {
        this.claw_subsystem = claw_subsystem;
        addRequirements(claw_subsystem);
    }

    @Override
    public void initialize() {
        claw_subsystem.release();
    }

    @Override
    public boolean isFinished() {
        return true;
    }
}
