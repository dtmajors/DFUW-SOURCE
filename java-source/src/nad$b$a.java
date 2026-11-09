import bdl.a;
import java.util.ArrayList;
import java.util.List;

class nad$b$a {
   List<a> EYa;
   ljq Position;
   ljq my;

   private nad$b$a(nad$b var1) {
      this.EYb = var1;
      this.EYa = lcn.emv();
      this.Position = null;
      this.my = null;
   }

   public void saveState() {
      if (this.EYa.size() > 0) {
         this.EYa.clear();
      }

      bdl var1 = nad.c(this.EYb.EXX).eb();

      for (a var3 : var1.alY()) {
         this.EYa.add(var3);
      }

      this.Position = var1.av();
      this.my = var1.aw().eqT();
   }

   public void restoreState() {
      dtc var1 = nad.a(this.EYb.EXX);
      bdl var2 = nad.c(this.EYb.EXX).eb();
      nad.c(this.EYb.EXX).a(var2.getGUID(), "shaderdefault.xml", true);
      ArrayList var3 = lcn.emv();

      while (var2.ame().size() > 0) {
         amf var4 = var2.ame().get(0);
         var3.add(var4);
         var2.hd(var4.getGUID());
      }

      var2.amj();

      for (a var5 : this.EYa) {
         amf var6 = var1.d(var5.amk());
         var2.a(var6, false);
         var2.a(var5.amk(), var5.aml(), var5.amm());
         var3.remove(var6);
      }

      if (var2.getGUID().equals(mje.ezC())) {
         nad.c(this.EYb.EXX).a(var2.getGUID(), "ShaderSelected.xml", false);
      }

      var2.m(this.Position, this.my);

      for (amf var9 : var3) {
         if (var9 instanceof dqk) {
            dqk var10 = (dqk)var9;
            var10.m(var10.av(), var10.aw().eqT());
         }
      }
   }
}
