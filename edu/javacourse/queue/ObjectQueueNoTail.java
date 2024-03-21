package edu.javacourse.queue;

public class ObjectQueueNoTail
{
    private ObjectBox head = null;
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
            ObjectBox current = head;

            for (int i = 1; i < size; i++)
            {
                current = current.getNext();
            }

            current.setNext(ob);
        }

        size++;
    }

    public Object pull()
    {
        if (size == 0)
        {
            return null;
        }

        Object obj = head.getObject();
        head = head.getNext();
        size--;

        return obj;
    }

    public Object get(int index)
    {
        if (size == 0 || index >= size || index < 0)
        {
            return null;
        }

        ObjectBox current = head;

        for (int i = 1; i < index; i++)
        {
            current = current.getNext();
        }

        Object obj = current.getObject();

        return obj;
    }

    public int size()
    {
        return size;
    }

    private class ObjectBox
    {
        private Object object;
        private ObjectBox next;

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
    }
}
