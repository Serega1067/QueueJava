package edu.javacourse.queue.robot;

public class Robot
{
    private double x = 0;
    private double y = 0;
    protected double course = 0;
    private ObjectQueue<RobotLine> linesQueue = new ObjectQueue<RobotLine>();

    public Robot (double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public void forward(int distance)
    {
        double oldX = x;
        double oldY = y;

        x += distance * Math.cos(course / 180 * Math.PI());
        y += distance * Math.sin(course / 180 * Math.PI());

        linesQueue.push(new RobotLine(oldX, oldY, x, y));
    }

    public double getX()
    {
        return x;
    }

    public double getY()
    {
        return y;
    }

    public double getCourse()
    {
        return course;
    }

    public void setX(double x)
    {
        this.x = x;
    }

    public void setY(double y)
    {
        this.y = y;
    }

    public void setCourse(double course)
    {
        this.course = course;
    }

    public ObjectQueue<RobotLine> getLinesQueue()
    {
        return linesQueue;
    }
}

