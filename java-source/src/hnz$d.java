import java.util.EnumMap;

public final class hnz$d {
   public final int kQC;
   public final int kQD;
   public final int kQE;
   public final int kQF;
   public final int kQG;
   public final int kQH;
   public final int kQI;
   public final int kQJ;
   private final EnumMap<hnz$f, hnz$e$a> kQK;

   public hnz$d(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, hnz$e$a[] var9) {
      this.kQD = var1;
      this.kQC = var2;
      this.kQE = var3;
      this.kQF = var4;
      this.kQI = var5;
      this.kQJ = var6;
      this.kQH = var7;
      this.kQG = var8;
      this.kQK = new EnumMap<>(hnz$f.class);

      for (int var10 = 0; var10 < var9.length; var10++) {
         assert this.kQK.get(var9[var10].kQM) == null;
         this.kQK.put(var9[var10].kQM, var9[var10]);
      }
   }

   public hnz$e$a b(hnz$f var1) {
      return this.kQK.get(var1);
   }

   public int ctn() {
      return this.b(hnz$f.kQT).dzN.kLY.rmN;
   }

   public int cto() {
      return this.b(hnz$f.kQT).dzN.kLY.H;
   }

   public int ctp() {
      return this.b(hnz$f.kRb).dzN.kLY.rmN;
   }

   public int ctq() {
      return this.b(hnz$f.kRb).dzN.kLY.H;
   }

   public final lhf ctr() {
      return new lhf(this.ctn() + this.ctp(), this.cto() + this.ctq());
   }

   public final lhf cts() {
      int var1 = Math.min(this.kQD + this.kQE, this.kQI + this.kQH);
      int var2 = Math.min(this.kQC + this.kQJ, this.kQF + this.kQG);
      return new lhf(this.ctn() + var1 + this.ctp(), this.cto() + var2 + this.ctq());
   }

   public final boolean ctt() {
      for (hnz$e$a var2 : this.kQK.values()) {
         if (var2.kQO == hnz$e$a$a.kQQ) {
            return true;
         }
      }

      return false;
   }

   public final boolean isResizable() {
      for (hnz$e$a var2 : this.kQK.values()) {
         if (var2.kQO == hnz$e$a$a.kQR) {
            return true;
         }
      }

      return false;
   }

   private void a(hnz$f var1, int var2, int var3) {
   }

   private void a(hnz$f var1, int var2) {
   }

   private void b(hnz$f var1, int var2) {
   }

   private void c(hnz$f var1, int var2) {
   }

   private void d(hnz$f var1, int var2) {
   }

   public final lhf ctu() {
      return new lhf(this.ctv(), this.ctw());
   }

   public final int ctv() {
      int var1 = this.kQD + this.kQE;
      int var2 = this.kQI + this.kQH;
      return this.ctn() + Math.max(var1, var2) + this.ctp();
   }

   public final int ctw() {
      int var1 = this.kQC + this.kQJ;
      int var2 = this.kQF + this.kQG;
      return this.cto() + Math.max(var1, var2) + this.ctq();
   }
}
