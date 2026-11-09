package org.apache.commons.collections;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

class DefaultMapBag$BagIterator implements Iterator {
   private DefaultMapBag _parent = null;
   private Iterator _support = null;
   private Object _current = null;
   private int _mods = 0;

   public DefaultMapBag$BagIterator(DefaultMapBag parent, Iterator support) {
      this._parent = parent;
      this._support = support;
      this._current = null;
      this._mods = DefaultMapBag.access$000(parent);
   }

   public boolean hasNext() {
      return this._support.hasNext();
   }

   public Object next() {
      if (DefaultMapBag.access$000(this._parent) != this._mods) {
         throw new ConcurrentModificationException();
      }

      this._current = this._support.next();
      return this._current;
   }

   public void remove() {
      if (DefaultMapBag.access$000(this._parent) != this._mods) {
         throw new ConcurrentModificationException();
      }

      this._support.remove();
      this._parent.remove(this._current, 1);
      this._mods++;
   }
}
