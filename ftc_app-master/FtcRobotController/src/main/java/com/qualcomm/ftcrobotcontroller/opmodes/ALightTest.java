package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.hardware.HiTechnicNxtLightSensor;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

/**
 * Created by Anisha on 10/29/2015.
 */
public class ALightTest extends LinearOpMode{

    DcMotor motorRight;
    DcMotor motorLeft;
    HiTechnicNxtLightSensor light;

    @Override
    public void runOpMode() throws InterruptedException {
        motorLeft = hardwareMap.dcMotor.get("motor_1");
        motorRight = hardwareMap.dcMotor.get("motor_2");

        int i = 1;

        while (i==1) (
                motorLeft.setPower(1);
                motorRight.setPower(1);

            if (light.getLightDetected()>60) (
                motorLeft.setPower(0);
                motorRight.setPower(0);
                i++;
                )

            else (
                motorLeft.setPower(1);
                motorRight.setPower(1);


                )

        )
}
