import java.util.Iterator;
import java.util.NoSuchElementException;

class lba$b implements Iterator<E> {
   private final Iterator<E> qvv;
   private Object qvy;

   public lba$b(lba var1) {
      this.qvz = var1;
      this.qvv = lba.a(var1).iterator();
   }

   @Override
   public boolean hasNext() {
      this.ema();
      return this.qvy != null;
   }

   @Override
   public Object next() {
      if (this.qvy == null) {
         throw new NoSuchElementException();
      } else {
         return this.qvy;
      }
   }

   @Override
   public void remove() {
      this.qvv.remove();
   }

   private void ema() {
      while (this.qvv.hasNext()) {
         Object var1 = this.qvv.next();
         if (lba.b(this.qvz).D(var1)) {
            this.qvy = var1;
            return;
         }
      }

      this.qvy = null;
   }
}
