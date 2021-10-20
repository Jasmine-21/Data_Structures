public class ArrayQueue<E> implements Queue<E>
{
  // instance variables
  /** Default array capacity. */
  public static final int CAPACITY = 1000;      // default array capacity

  /** Generic array used for storage of queue elements. */
  private E[] data;                             // generic array used for storage

  /** Index of the top element of the queue in the array. */
  private int f = 0;                            // index of the front element

  /** Current number of elements in the queue. */
  private int sz = 0;                           // current number of elements

  // constructors
  /** Constructs an empty queue using the default array capacity. */
  public ArrayQueue()
  {
    data= (E[]) new Object[CAPACITY];

  }         // constructs queue with default capacity

  /**
   * Constructs and empty queue with the given array capacity.
   * @param capacity length of the underlying array
   */
  @SuppressWarnings({"unchecked"})
  public ArrayQueue(int capacity)
  {
    data= (E[]) new Object[capacity];

  }

  // methods
  /**
   * Returns the number of elements in the queue.
   * @return number of elements in the queue
   */
  @Override
  public int size()
  {
    return sz;
  }

  /** Tests whether the queue is empty. */
  @Override
  public boolean isEmpty()
  {
    return sz==0;
  }

  /**
   * Inserts an element at the rear of the queue.
   * This method runs in O(1) time.
   * @param e   new element to be inserted
   * @throws IllegalStateException if the array storing the elements is full
   */
  @Override
  public void enqueue(E e) throws IllegalStateException
  {
    if(sz==data.length)
    {
      return;
    }
    data[sz]=e;
    sz++;
  }

  /**
   * Returns, but does not remove, the first element of the queue.
   * @return the first element of the queue (or null if empty)
   */
  @Override
  public E first()
  {
    if(isEmpty())
    return null;
    return data[f];
  }

  /**
   * Removes and returns the first element of the queue.
   * @return element removed (or null if empty)
   */
  @Override
  public E dequeue()
  {
    if(isEmpty())
    return null;
    E item=data[f];
    sz--;
    f++;
    return item;
  }

  /**
   * Returns a string representation of the queue as a list of elements.
   * This method runs in O(n) time, where n is the size of the queue.
   * @return textual representation of the queue.
   */
  public String toString()
  {
    StringBuilder sb = new StringBuilder("(");
    for(int i=0;i<=sz;i++)
    {
      sb.append(data[i]);
      sb.append(", ");

    }
    sb.append(")");
    return sb.toString();

  }

  public static void main(String[] args)
  {
    Queue<Integer> S = new ArrayQueue<>();  // contents: ()
    S.enqueue(5);                              // contents: (5)
    S.enqueue(3);                              // contents: (5, 3)
    System.out.println(S.size());// contents: (5, 3)     outputs 2
    System.out.println(S.toString());
    System.out.println(S.dequeue());            // contents: (3)        outputs 5
    System.out.println(S.isEmpty());        // contents: (3)        outputs false
    System.out.println(S.toString());
    System.out.println(S.dequeue());            // contents: ()         outputs 3
    System.out.println(S.isEmpty());        // contents: ()         outputs true
    System.out.println(S.dequeue());            // contents: ()         outputs null
    S.enqueue(7);                              // contents: (7)
    S.enqueue(9);                              // contents: (7, 9)
    System.out.println(S.toString());
    System.out.println(S.first());            // contents: (7, 9)     outputs 7

    S.enqueue(4);                              // contents: (7, 9, 4)
    System.out.println(S.size());           // contents: (7, 9, 4)  outputs 3
    System.out.println(S.toString());
    System.out.println(S.dequeue());            // contents: (9, 4)     outputs 7
    S.enqueue(6);                              // contents: (9, 4, 6)
    S.enqueue(8);                              // contents: (9, 4, 6, 8)
    System.out.println(S.dequeue());   // 9
    System.out.println(S.toString()); // 4,6,8
  }
}
