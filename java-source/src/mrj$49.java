import haa.a;

class mrj$49 implements a {
   mrj$49(mrj var1) {
      this.EkK = var1;
   }

   @Override
   public void a(ktv var1, Object var2) {
      kxa var3 = (kxa)var1;

      for (int var4 = 0; var4 < var3.ehX().length; var4++) {
         int var5 = var3.ehX()[var4];
         if (var5 >= 2000) {
            var5 -= 2000;
         }

         if (var5 >= 1000) {
            var5 -= 1000;
         }

         if (var5 != 950) {
            mrj.f(this.EkK).add(var5);
         }
      }

      this.EkK.dmd--;
      if (this.EkK.dmd == 0) {
         mrj.j(this.EkK).updateUI();
      }
   }
}
