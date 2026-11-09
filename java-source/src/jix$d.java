import java.util.ArrayList;

public class jix$d {
   private ArrayList<jix$c> nhD;
   private int nhE;

   public jix$d(jix var1) {
      this.nhA = var1;
      this.nhD = new ArrayList<>();
      this.nhE = 0;
   }

   public void println(int var1) {
      for (jix$c var3 : this.nhD) {
         var3.println(var1);
      }
   }

   public int getLength() {
      return this.nhD.size();
   }

   public jix$c UQ(int var1) {
      return this.nhD.get(var1);
   }

   private void cWh() {
      this.nhD.clear();
   }

   private jix$c b(ler var1) {
      for (jix$c var3 : this.nhD) {
         if (jix$c.b(var3) == var1) {
            return var3;
         }
      }

      return null;
   }

   private jix$c UR(int var1) {
      for (jix$c var3 : this.nhD) {
         if (var3 instanceof jix$h) {
            if (jix$h.a((jix$h)var3).zg() == var1) {
               return var3;
            }
         } else if (var3 instanceof jix$g) {
            jix$c var4 = ((jix$g)var3).nhz.UR(var1);
            if (var4 != null) {
               return var4;
            }
         }
      }

      return null;
   }

   int a(les var1, ler var2) {
      ler var3 = var1.i(var2);
      if (var3 == null) {
         return -1;
      }

      int var4 = 0;

      for (ler var5 = var1.g(var3); var5 != var2; var4++) {
         var5 = var1.h(var5);
      }

      return var4;
   }

   private <T> int a(ArrayList<jix$c> var1, les var2, ler var3, ArrayList<T> var4, int var5) {
      return var5 < var4.size() - 1 ? this.a(var2, var3) : var1.size();
   }

   private void a(jix$a var1, brt var2, ArrayList<lgw> var3, int var4) {
      lgw var5 = (lgw)var3.get(var4);
      jix$c var6 = this.b(var5);
      if (var4 > 0) {
         jix$e var7;
         if (var6 != null) {
            var7 = (jix$e)var6;
         } else {
            var7 = new jix$e(this.nhA, var5, null);
            var7.nhC = var1;
            jix.a(this.nhA).add(var7);
            int var8 = this.a(this.nhD, lea.enW(), var5, var3, var4);
            this.nhD.add(Math.min(var8, this.nhE), var7);
            this.nhE++;
         }

         var7.nhz.a(var7, var2, var3, var4 - 1);
      } else {
         jix$f var9 = new jix$f(this.nhA, var5, var2, null);
         var9.nhC = var1;
         jix.a(this.nhA).add(var9);
         int var10 = this.a(this.nhD, lea.enW(), var5, var3, var4);
         this.nhD.add(Math.min(var10, this.nhE), var9);
         this.nhE++;
      }
   }

   private void a(jix$a var1, bsc var2, ArrayList<ldy> var3, int var4) {
      ldy var5 = (ldy)var3.get(var4);
      jix$c var6 = this.b(var5);
      if (var4 > 0) {
         jix$g var7;
         if (var6 != null) {
            var7 = (jix$g)var6;
         } else {
            var7 = new jix$g(this.nhA, var5, null);
            var7.nhC = var1;
            jix.a(this.nhA).add(var7);
            int var8 = this.a(this.nhD, lea.eob(), var5, var3, var4);
            this.nhD.add(Math.min(this.nhE + var8, this.nhD.size()), var7);
         }

         var7.nhz.a(var7, var2, var3, var4 - 1);
      } else {
         jix$h var9 = new jix$h(this.nhA, var5, var2, null);
         jix.a(this.nhA).add(var9);
         var9.nhC = var1;
         this.nhD.add(var9);
      }
   }
}
