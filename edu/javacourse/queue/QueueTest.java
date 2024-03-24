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

        System.out.println("Get -1 " + queue.get(-1));
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

        System.out.println();
        System.out.println("Start");

        ObjectQueueNoTail queueNoTail = new ObjectQueueNoTail();

        for (int i = 0; i < 10; i++)
        {
            queueNoTail.push("new object:" + i);
        }

        System.out.println("Get 15 " + queueNoTail.get(15));
        System.out.println("Get 3 " + queueNoTail.get(3));
        System.out.println("Get 6 " + queueNoTail.get(6));
        System.out.println("Get 9 " + queueNoTail.get(9));
        System.out.println();

        while (queueNoTail.size() > 0)
        {
            System.out.println(queueNoTail.pull());
            System.out.println("Строк в очереди:" + queueNoTail.size());
        }

        System.out.println("End");

        System.out.println("Start");

        ObjectQueueBidirectional queueBidirectional = new ObjectQueueBidirectional();

        for (int i = 0; i < 10; i++)
        {
            queueBidirectional.push("Строка:" + i);
        }

        System.out.println("Get -10 " + queueBidirectional.get(-10));
        System.out.println("Get 4 " + queueBidirectional.get(4));
        System.out.println("Get 5 " + queueBidirectional.get(5));
        System.out.println("Get 9 " + queueBidirectional.get(9));
        System.out.println();

        while (queueBidirectional.size() > 0)
        {
            String s = (String) queueBidirectional.pull();
            System.out.println(s);
            System.out.println("Строк в очереди:" + queueBidirectional.size());
        }

        System.out.println("End");

        System.out.println();
        System.out.println("Start");

        ObjectStack stack = new ObjectStack();

        for (int i = 0; i < 15; i++)
        {
            stack.push("new object:" + i);
        }

        System.out.println("Get -15 " + stack.get(-15));
        System.out.println("Get 3 " + stack.get(3));
        System.out.println("Get 14 " + stack.get(14));
        System.out.println("Get 9 " + stack.get(9));
        System.out.println();

        while (stack.size() > 0)
        {
            System.out.println(stack.pull());
            System.out.println("Строк в стеке:" + stack.size());
        }

        System.out.println("End");
    }
}
