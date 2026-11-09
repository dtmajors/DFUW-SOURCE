package org.apache.commons.collections.list;

public class AbstractLinkedList$Node {
   protected AbstractLinkedList$Node previous;
   protected AbstractLinkedList$Node next;
   protected Object value;

   protected AbstractLinkedList$Node() {
      this.previous = this;
      this.next = this;
   }

   protected AbstractLinkedList$Node(Object value) {
      this.value = value;
   }

   protected AbstractLinkedList$Node(AbstractLinkedList$Node previous, AbstractLinkedList$Node next, Object value) {
      this.previous = previous;
      this.next = next;
      this.value = value;
   }

   protected Object getValue() {
      return this.value;
   }

   protected void setValue(Object value) {
      this.value = value;
   }

   protected AbstractLinkedList$Node getPreviousNode() {
      return this.previous;
   }

   protected void setPreviousNode(AbstractLinkedList$Node previous) {
      this.previous = previous;
   }

   protected AbstractLinkedList$Node getNextNode() {
      return this.next;
   }

   protected void setNextNode(AbstractLinkedList$Node next) {
      this.next = next;
   }
}
