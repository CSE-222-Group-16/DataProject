
import java.util.*;

/** Implements the Queue interface using a single-linked list.
*   @author Koffman & Wolfgang
* */

public class ListQueue < E >
    extends AbstractQueue < E >
    implements Queue < E > {

  // Data Fields
  /** Reference to front of queue. */
  private Node < E > front;

  /** Reference to rear of queue. */
  private Node < E > rear;

  /** Size of queue. */
  private int size;

  /** A Node is the building block for a single-linked list. */
  private static class Node < E > {
    // Data Fields
    /** The reference to the data. */
    private E data;

    /** The reference to the next node. */
    private Node next;

    // Constructors
    /** Creates a new node with a null next field.
        @param dataItem The data stored
     */
    private Node(E dataItem) {
      data = dataItem;
      next = null;
    }

    /** Creates a new node that references another node.
        @param dataItem The data stored
        @param nodeRef The node referenced by new node
     */
    private Node(E dataItem, Node < E > nodeRef) {
      data = dataItem;
      next = nodeRef;
    }
  } //end class Node

  // Methods
  /** Insert an item at the rear of the queue.
      post: item is added to the rear of the queue.
      @param item The element to add
      @return true (always successful)
   */
  public boolean offer(E item) {
    // Check for empty queue.
    if (front == null) {
      rear = new Node < E > (item);
      front = rear;
    }
    else {
      // Allocate a new node at end, store item in it, and
      // link it to old end of queue.
      rear.next = new Node < E > (item);
      rear = rear.next;
    }
    size++;
    return true;
  }

  /** Remove the entry at the front of the queue and return it
      if the queue is not empty.
      post: front references item that was second in the queue.
      @return The item removed if successful, or null if not
   */
  public E poll() {
    E item = peek(); // Retrieve item at front.
    if (item == null)
      return null;
    // Remove item at front.
    front = front.next;
    size--;
    return item; // Return data at front of queue.
  }

  /** Return the item at the front of the queue without removing it.
      @return The item at the front of the queue if successful;
              return null if the queue is empty
   */
  public E peek() {
    if (size == 0)
      return null;
    else
      return front.data;
  }

  // Insert class Iter and other required methods.
  /**** BEGIN EXERCISE ****/
  public boolean add(E item) {
    return offer(item);
  }

  public E remove() {
    if (isEmpty())
      throw new NoSuchElementException();
    return poll();
  }

  public E element() {
    if (isEmpty())
      throw new NoSuchElementException();
    return peek();
  }

  public int size() {
    return size;
  }

  public boolean isEmpty() {
    return size == 0;
  }

  public Iterator < E > iterator() {
    return new Iter();
  }

  private class Iter
      implements Iterator < E > {
    Node < E > next = front;
    public boolean hasNext() {
      return next != null;
    }

    public E next() {
      E item = next.data;
      next = next.next;
      return item;
    }

    public void remove() {
      throw new UnsupportedOperationException();
    }
  }

  /**** END EXERCISE ****/
}
