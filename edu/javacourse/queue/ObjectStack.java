package edu.javacourse.queue;

public class ObjectStack
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
            tail.setNext(ob);
            ob.setPrev(tail);
        }

        tail = ob;
        size++;
    }

    public Object pull()
    {
        if (size == 0)
        {
            return null;
        }

        Object obj = tail.getObject();
        tail = tail.getPrev();

        if (size > 1)
        {
            tail.setNext(null);
        }

        if (tail == null)
        {
            head = null;
        }

        size--;
        return obj;
    }

    public Object get(int index)
    {
        if (size == 0 || index >= size || index < 0)
        {
            return null;
        }

        ObjectBox current = new ObjectBox();

        if (index < size / 2)
        {
            current = head;
            for (int i = 1; i <= index; i++)
            {
                current = current.getNext();
            }
        }
        else
        {
            current = tail;
            for (int i = size - 1; i > index; i--)
            {
                current = current.getPrev();
            }
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
