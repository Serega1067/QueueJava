package edu.javacourse.queue;

public class QueueTest
{
    public static void main(String[] args)
    {
        System.out.println("Start");

        ObjectQueue queue = new ObjectQueue();
        for (int i = 0; i < 10; i++)
        {
            queue.push("Строка:" + i);
        }

        System.out.println("Get 5 " + queue.get(5));
        System.out.println("Get 8 " + queue.get(8));
        System.out.println("Get 9 " + queue.get(9));
        System.out.println();

        while (queue.size() > 0)
        {
            String s = (String) queue.pull();
            System.out.println(s);
            System.out.println("Строк в очереди:" + queue.size());
        }

        System.out.println("End");
    }
}
