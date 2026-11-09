import hby.a;

class hjs$1 implements lbi<ffb> {
   hjs$1(hjs var1) {
      this.kAM = var1;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void a(ffb var1) {
      switch (var1.iKO) {
         case iKR:
            if (hjs.a(this.kAM).containsKey(var1.dbx)) {
               hjs.b(this.kAM).rnh.m(ffc.e(hjs.b(this.kAM).rng, var1.aO()));
               return;
            }

            hei var4 = new hei(var1.dbx, hdw.LW(var1.ResourceType));
            hjs.a(this.kAM).put(var1.dbx, var4);
            hjs.b(var4, var1);
            hjs.c(this.kAM).enp();
            hjs.d(this.kAM).b(a.jEC, var4);
            break;
         case iKT:
            hei var3 = (hei)hjs.a(this.kAM).get(var1.dbx);
            if (var3 == null) {
               hjs.b(this.kAM).rnh.m(ffc.e(hjs.b(this.kAM).rng, var1.aO()));
               return;
            }

            hjs.a(this.kAM).remove(var1.dbx);
            hjs.c(this.kAM).enp();
            hjs.d(this.kAM).b(a.jED, var3);
            break;
         case iKS:
            hei var2 = (hei)hjs.a(this.kAM).get(var1.dbx);
            if (var2 == null) {
               hjs.b(this.kAM).rnh.m(ffc.e(hjs.b(this.kAM).rng, var1.aO()));
               return;
            }

            hjs.b(var2, var1);
            hjs.c(this.kAM).enp();
            hjs.d(this.kAM).b(a.jEE, var2);
            break;
         default:
            hjs.b(this.kAM).rnh.m(ffc.e(hjs.b(this.kAM).rng, var1.aO()));
            return;
      }
   }
}
