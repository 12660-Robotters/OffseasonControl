package org.firstinspires.ftc.teamcode.Robot.Commands.Basic;

import com.arcrobotics.ftclib.command.CommandBase;

import org.firstinspires.ftc.teamcode.Robot.Subsystems.Claw_Subsystem;

public class GrabCone extends CommandBase {

    private final Claw_Subsystem claw_subsystem;

    public GrabCone(Claw_Subsystem claw_subsystem) {
        this.claw_subsystem = claw_subsystem;
        addRequirements(claw_subsystem);
    }

    @Override
    public void initialize() {
        claw_subsystem.grab();
    }

    @Override
    public boolean isFinished() {
        return true;
    }
}
