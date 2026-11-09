package org.apache.commons.collections.map;

public class AbstractLinkedMap$LinkEntry extends AbstractHashedMap$HashEntry {
   protected AbstractLinkedMap$LinkEntry before;
   protected AbstractLinkedMap$LinkEntry after;

   protected AbstractLinkedMap$LinkEntry(AbstractHashedMap$HashEntry next, int hashCode, Object key, Object value) {
      super(next, hashCode, key, value);
   }
}
