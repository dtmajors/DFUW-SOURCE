import java.util.Iterator;

class bcb$a implements Iterator<bca> {
   private int cVl;
   private bca[] cVm;

   public bcb$a(bcb var1, bca[] var2) {
      this.cVn = var1;
      this.cVl = 0;
      this.cVm = null;
      this.cVm = var2;
   }

   @Override
   public boolean hasNext() {
      return this.cVm == null ? false : this.cVl < this.cVm.length;
   }

   public bca ala() {
      return this.cVm == null ? null : this.cVm[this.cVl++];
   }

   @Override
   public void remove() {
   }
}
