class jpz$1 implements Runnable {
   jpz$1(jpz var1) {
      this.nRb = var1;
   }

   @Override
   public void run() {
      try {
         Thread.sleep(1500L);
      } catch (InterruptedException var2) {
      }

      while (!this.nRb.dQf().aEP().aEG()) {
      }

      this.nRb.VD(cxd.fHy);
      efd var1 = (efd)jpz.b(this.nRb).h(12809, jpz.a(this.nRb), this.nRb.ayp());
      var1.SkillType = cxd.fHy;
      var1.ios = 3;
      var1.ioe = cdy.eod;
      jpz.c(this.nRb).F(var1);
      jpz.a(this.nRb, null);
   }
}
