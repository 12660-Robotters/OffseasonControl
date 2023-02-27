package org.firstinspires.ftc.teamcode.Robot.commands;

import com.arcrobotics.ftclib.command.CommandBase;
import com.qualcomm.hardware.lynx.LynxModule;

import org.firstinspires.ftc.teamcode.Robot.Subsystems.BulkReading;

public class BulkReadingClear extends CommandBase {
    private final BulkReading bulkReading;

    public BulkReadingClear(BulkReading bulkReading) {
        this.bulkReading = bulkReading;
    }

    @Override
    public void execute() {
        for (LynxModule module : bulkReading.getAllHubs()) {
            module.clearBulkCache();
        }
    }
}
