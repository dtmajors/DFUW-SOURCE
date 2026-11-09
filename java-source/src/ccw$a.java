abstract class ccw$a {
   public ez emp;
   public boolean Active;
   public int Rl;

   public ccw$a(ccw var1) {
      this.emq = var1;
      this.emp = null;
      this.Active = true;
      this.Rl = 0;
   }

   public final boolean fV() {
      assert this.emp != null;
      assert this.emp.fS() != null;
      return this.emp.fN() == this.emp.fX();
   }

   public final boolean aJq() {
      return this.emp.getType() == 352;
   }

   public void b(boolean var1, String var2) {
      if (var1) {
         this.Rl++;
      } else {
         this.Rl--;
      }

      this.Active = this.Rl >= 0;
      if (this.Rl > 0) {
         assert false;
      }
   }
}
