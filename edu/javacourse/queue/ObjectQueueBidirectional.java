package edu.javacourse.queue;

public class ObjectQueueBidirectional
{
    private ObjectBox head = null;
    private ObjectBox tail = null;
    private int size = 0;

    public void push(Object obj)
    {
        ObjectBox ob = new ObjectBox();
        ob.setObject(obj);

        if (head == null)
        {
            head = ob;
        }
        else
        {
            ob.setPrev(tail);
            tail.setNext(ob);
        }

        tail = ob;
        size++;
    }

    private class ObjectBox
    {
        private Object object;
        private ObjectBox next;
        private ObjectBox prev;

        public Object getObject()
        {
            return object;
        }

        public void setObject(Object object)
        {
            this.object = object;
        }

        public ObjectBox getNext()
        {
            return next;
        }

        public void setNext(ObjectBox next)
        {
            this.next = next;
        }

        public ObjectBox getPrev()
        {
            return prev;
        }

        public void setPrev(ObjectBox prev)
        {
            this.prev = prev;
        }
    }
}
