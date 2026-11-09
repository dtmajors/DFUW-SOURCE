public class jac$e extends izw {
   protected jac$e(jac var1) {
      this.mFq = var1;
   }

   @Override
   public void c(int var1, boolean var2, boolean var3, boolean var4, boolean var5) {
      if (var2 && var1 == 13) {
         if (this.mFq.mFn != null) {
            this.mFq.mFn.rF(false);
         }

         if (this.mFq.mFp != null) {
            this.mFq.mFp.dqb().rF(false);
         }

         this.mFq.duo();
      }
   }
}
