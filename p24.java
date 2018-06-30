review
//  Mark Villa
//  4/20/18
//  Revers Linked List
//  O(n) time, O(1) space. in place traversal. the list with a prev, current and next node switching the direction throughout. https://www.youtube.com/watch?v=sYcOK51hl-A

class LinkedList {
  public Node head;
  public class Node {
    public int value;
    public Node next;
    public Node(int value) {
      this.value = value;
    }
  }
}

public LinkedList reverseLinkedList(LinkedList list) {
  LinkedListNode prev = null;
  LinkedListNode curr = list.head;
  LinkedListNode next = null;
  
  while(curr!=null) {
    next = curr.next;
    curr.next = prev;
    prev = curr;
    curr = next;
  }
  LinkedListNode firstNode.head = prev;
  return firstNode;
}
