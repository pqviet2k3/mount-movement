package com.company.mousemovement;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.awt.*;
import java.util.Random;

@SpringBootApplication
public class MouseMovementApplication {

    public static void main(String[] args) {
        try {
            Robot robot = new Robot();

            while (true) {
                // Get the current mouse cursor location
                Point cursorPos = MouseInfo.getPointerInfo().getLocation();

                // Define the offset for how much to move the cursor (1 or 2 units)
                int xOffset = 1; // Change this to 2 if needed
                int yOffset = 1; // Change this to 2 if needed

                int newX = cursorPos.x + xOffset;
                int newY = cursorPos.y + yOffset;

                robot.mouseMove(newX, newY);

                // Print the new cursor location
                System.out.println("Mouse moved to: (" + newX + ", " + newY + ")");

                // Wait for 10 minutes before moving the mouse again
                Thread.sleep(600000); // 600000 milliseconds = 10 minutes
            }
        } catch (AWTException | InterruptedException e) {
            e.printStackTrace();
        }
    }

}
