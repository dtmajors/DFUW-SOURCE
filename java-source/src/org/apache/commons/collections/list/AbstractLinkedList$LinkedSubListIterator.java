package org.apache.commons.collections.list;

public class AbstractLinkedList$LinkedSubListIterator extends AbstractLinkedList$LinkedListIterator {
   protected final AbstractLinkedList$LinkedSubList sub;

   protected AbstractLinkedList$LinkedSubListIterator(AbstractLinkedList$LinkedSubList sub, int startIndex) {
      super(AbstractLinkedList$LinkedSubList.access$000(sub), startIndex + AbstractLinkedList$LinkedSubList.access$100(sub));
      this.sub = sub;
   }

   public boolean hasNext() {
      return this.nextIndex() < AbstractLinkedList$LinkedSubList.access$200(this.sub);
   }

   public boolean hasPrevious() {
      return this.previousIndex() >= 0;
   }

   public int nextIndex() {
      return super.nextIndex() - AbstractLinkedList$LinkedSubList.access$100(this.sub);
   }

   public void add(Object obj) {
      super.add(obj);
      AbstractLinkedList$LinkedSubList.access$302(this.sub, super.parent.modCount);
      AbstractLinkedList$LinkedSubList.access$208(this.sub);
   }

   public void remove() {
      super.remove();
      AbstractLinkedList$LinkedSubList.access$302(this.sub, super.parent.modCount);
      AbstractLinkedList$LinkedSubList.access$210(this.sub);
   }
}
