import java.util.List;

class aux$6 extends mjg {
   aux$6(aux var1, boolean var2, boolean var3, float var4, mjd var5, boolean var6, boolean var7, boolean var8, List var9) {
      this.DDk = var1;
      this.DDn = var2;
      this.DDo = var3;
      this.DDp = var4;
      this.DDq = var5;
      this.DDr = var6;
      this.DDs = var7;
      this.DDt = var8;
      this.DDu = var9;
   }

   @Override
   public Object Hv() {
      aux.a(this.DDk, this.DDn, this.DDo, this.DDp, this.DDq, this.DDr, this.DDs, this.DDt, this.DDu);
      return "done";
   }

   @Override
   public void finished() {
      String var1 = "[" + this.DDu.size() + "] File(s) Processed.";
      this.DDk.Ca(var1);
   }
}
