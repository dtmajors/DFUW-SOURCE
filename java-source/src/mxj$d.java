import java.util.Map;

class mxj$d implements Runnable {
   private Map<ldv, dta> haz;
   private int ETM;

   public mxj$d(mxj var1, Map var2) {
      this.ETL = var1;
      this.haz = null;
      this.ETM = 0;
      this.haz = var2;
   }

   @Override
   public void run() {
      while (mje.DBA) {
         try {
            Thread.sleep(50L);
         } catch (InterruptedException var3) {
            var3.printStackTrace();
         }

         synchronized (this.haz) {
            if (this.ETM != this.haz.size() || mxj.f(this.ETL)) {
               this.ETM = this.haz.size();
               mxj.g(this.ETL);
            }
         }
      }
   }
}
