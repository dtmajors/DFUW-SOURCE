import lna.a;

class hjp$2 implements lbi<fju> {
   hjp$2(hjp var1) {
      this.kAd = var1;
   }

   public void a(fju var1) {
      if (var1.lu != null) {
         int var2 = this.kAd.kzZ.eve().AN(var1.Name);
         if (var2 != -1) {
            a var3 = (a)this.kAd.kzZ.eve().evf().get(var2).kza;
            lna var4 = (lna)this.kAd.kzZ.ewx().get(var2);
            lna var5 = var3.at(var1.lu);
            if (var4 == null) {
               this.kAd.kzZ.a(var2, var5);
            } else {
               if (var4.rFi == var1.lu) {
                  return;
               }

               var4.c(var5);
            }
         }
      }
   }
}
