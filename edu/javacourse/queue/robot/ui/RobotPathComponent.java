package edu.javacourse.queue.robot.ui;

import edu.javacourse.queue.robot.Robot;
import edu.javacourse.queue.robot.RobotLine;
import java.awt.Graphics;
import javax.swing.JComponent;

public class RobotPathComponent extends JComponent
{
    private Robot robot;

    public RobotPathComponent(Robot robot)
    {
        this.robot = robot;
    }

    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        for (int i = 0; i < robot.getLinesQueue().size(); i++)
        {
            RobotLine rl;
            rl = (RobotLine) robot.getLinesQueue().pull();
            int x1 = (int) Math.round(rl.getX1());
            int y1 = (int) Math.round(rl.getY1());
            int x2 = (int) Math.round(rl.getX2());
            int y2 = (int) Math.round(rl.getY2());

            g.drawLine(x1, y1, x2, y2);
        }
    }
}
