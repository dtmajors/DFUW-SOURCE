import hoz.a;

class hdo$a$1 implements lbn {
   hdo$a$1(hdo$a var1) {
      this.kaC = var1;
   }

   @Override
   public void W() {
      hoz var1 = (hoz)hdo$a.a(this.kaC).cdh().csT();
      a var2 = var1.coZ();
      int var3 = -1;

      for (int var4 = 0; var4 < hdo$a.b(this.kaC).length; var4++) {
         if (var2 == hdo$a.b(this.kaC)[var4]) {
            var3 = var4;
            break;
         }
      }

      bdw var5 = new bdw(hdo$a.c(this.kaC), var3);
      hdo$a.d(this.kaC).cbP().kcp.a(var5);
   }
}
