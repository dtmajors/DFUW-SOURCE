import java.util.ListIterator;
import java.util.NoSuchElementException;

class leq$b implements ListIterator<E> {
   public leq<E>.b rjl;
   public leq<E>.b rjm;
   private leq$a<E> rjj;

   leq$b(leq var1) {
      this.rjn = var1;
      if (leq.a(var1) == 0) {
         this.rjj = null;
      } else {
         this.rjj = leq.b(var1).rjj;
         leq.a(var1, this);
      }
   }

   public void dispose() {
      this.rjj = null;
      leq.b(this.rjn, this);
   }

   @Override
   public boolean hasNext() {
      return this.rjj != null;
   }

   @Override
   public Object next() {
      if (this.rjj == null) {
         throw new NoSuchElementException();
      }

      Object var1 = this.rjj.rji;
      this.rjj = this.rjj.rjj;
      if (this.rjj == leq.b(this.rjn)) {
         this.dispose();
      }

      return var1;
   }

   @Override
   public boolean hasPrevious() {
      assert false;
      return false;
   }

   @Override
   public Object previous() {
      assert false;
      return null;
   }

   @Override
   public int nextIndex() {
      assert false;
      return 0;
   }

   @Override
   public int previousIndex() {
      assert false;
      return 0;
   }

   @Override
   public void remove() {
      assert false;
   }

   @Override
   public void set(Object var1) {
      assert lda.by(var1);
      assert false;
   }

   @Override
   public void add(Object var1) {
      assert lda.by(var1);
      assert false;
   }

   final void b(leq$a<E> var1) {
      assert var1 != null;
      if (leq.a(this.rjn) == 1) {
         this.dispose();
      } else if (var1 == this.rjj) {
         this.rjj = this.rjj.rjj;
         if (this.rjj == leq.b(this.rjn)) {
            this.dispose();
         }
      }
   }
}
