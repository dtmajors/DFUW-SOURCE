package org.apache.commons.collections.list;

import java.util.ListIterator;
import org.apache.commons.collections.iterators.AbstractListIteratorDecorator;

public class TransformedList$TransformedListIterator extends AbstractListIteratorDecorator {
   protected TransformedList$TransformedListIterator(TransformedList this$0, ListIterator iterator) {
      super(iterator);
      this.this$0 = this$0;
   }

   public void add(Object object) {
      object = TransformedList.access$001(this.this$0, object);
      super.iterator.add(object);
   }

   public void set(Object object) {
      object = TransformedList.access$101(this.this$0, object);
      super.iterator.set(object);
   }
}
