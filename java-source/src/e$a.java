class e$a implements Runnable {
   private boolean bU;

   private e$a(e var1) {
      this.bT = var1;
      this.bU = true;
   }

   @Override
   public void run() {
      while (this.bU) {
         if (e.a(this.bT) != null && e.a(this.bT).egz() != null) {
            e.b(this.bT).setText(e.a(this.bT).eLw());
            String var1 = e.a(this.bT).egz();
            if (!var1.equals("")) {
               e.c(this.bT).setText(var1);
               e.d(this.bT).setText("");
            }

            try {
               Thread.sleep(20L);
            } catch (InterruptedException var3) {
               var3.printStackTrace();
            }
         }
      }
   }
}
