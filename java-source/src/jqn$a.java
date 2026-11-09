import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class jqn$a {
   private double nSL;
   private final int nuz;
   private final ArrayList<jqn$a$a> nuA;
   private final List<jqn$a$a> nuB;

   public jqn$a(jqn var1, int var2, int var3) {
      this.nSM = var1;
      this.nuA = new ArrayList<>();
      this.nuB = new LinkedList<>();
      this.nSL = 0.0;
      this.nuz = var2;
      this.nuA.add(new jqn$a$a(this, 0, var3));
   }

   public void fE(int var1, int var2) {
      if (!this.nuA.isEmpty()) {
         assert var2 > this.nuA.get(this.nuA.size() - 1).nuD;
      }

      this.nuA.add(new jqn$a$a(this, var1 - this.nuz, var2));
   }

   public double dRi() {
      this.dRj();
      this.dRk();
      this.dLO();
      if (this.nuB.isEmpty()) {
         return 0.0;
      }

      double var1 = 0.0;

      for (jqn$a$a var4 : this.nuB) {
         var1 += this.a(var4);
      }

      if (var1 <= 0.0) {
         return 0.0;
      }

      assert var1 > 0.0;
      double var7 = 0.0;

      for (jqn$a$a var6 : this.nuB) {
         var7 += this.a(var6) * (var6.PC / var1);
      }

      if (jqn.a(this.nSM)) {
         double var9 = var7 - this.nSL;
         this.nSL = var7;
         return var9;
      } else {
         double var8 = this.nuB.get(this.nuB.size() - 1).PC - this.nSL;
         this.nSL = this.nuB.get(this.nuB.size() - 1).PC;
         return var8;
      }
   }

   private void dRj() {
      double var1 = this.nSM.kAz.emc();

      for (jqn$a$a var4 : this.nuB) {
         var4.nuC += var1;
      }
   }

   private void dRk() {
      if (!this.nuA.isEmpty()) {
         int var1 = this.nuA.size();

         for (int var2 = 0; var2 < var1; var2++) {
            jqn$a$a var3 = this.nuA.get(var2);
            double var4 = (double)(var1 - var2 - 1) / var1;
            var3.nuC = var4 * this.nSM.kAz.emc();
            this.nuB.add(var3);
         }

         this.nuA.clear();
      }
   }

   private void dLO() {
      LinkedList var1 = new LinkedList();

      for (jqn$a$a var3 : this.nuB) {
         if (var3.nuC > jqn.b(this.nSM)) {
            var1.add(var3);
         }
      }

      this.nuB.removeAll(var1);
   }

   private double a(jqn$a$a var1) {
      assert var1.nuC >= 0.0;
      assert var1.nuC <= jqn.b(this.nSM);
      double var2 = lew.c(var1.nuC / jqn.b(this.nSM), 0.0, 1.0);
      return lew.c(0.5 * (1.0 + Math.cos(Math.PI * var2)), 0.0, 1.0);
   }
}
