import java.util.Iterator;

class laz$a implements Iterator<E> {
   private final Iterator<B> qvv;

   public laz$a(laz var1) {
      this.qvw = var1;
      this.qvv = laz.a(var1).iterator();
   }

   private Object W(Object var1) {
      return var1;
   }

   @Override
   public boolean hasNext() {
      return this.qvv.hasNext();
   }

   @Override
   public Object next() {
      Object var1 = this.qvv.next();
      return this.W(var1);
   }

   @Override
   public void remove() {
      this.qvv.remove();
   }
}
