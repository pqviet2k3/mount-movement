package com.company.mousemovement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.awt.*;
import java.util.Random;

@SpringBootApplication
public class MouseMovementApplication {

    public static void main(String[] args) {
        try {
            Robot robot = new Robot();
            Random random = new Random();
            while (true) {
                // Get the current screen size
                Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
                int height = screenSize.height;
                int width = screenSize.width;

                // Move the mouse to a random position on the screen
                int x = random.nextInt(width);
                int y = random.nextInt(height);
                robot.mouseMove(x, y);

                // Print the new cursor location
                System.out.println("Mouse moved to: (" + x + ", " + y + ")");

                // Wait for 10 minutes before moving the mouse again
                Thread.sleep( 600000); // 600000 milliseconds = 10 minutes
            }
        } catch (AWTException | InterruptedException e) {
            e.printStackTrace();
        }
    }

}
