import java.util.List;

class aux$7 extends mjg {
   aux$7(aux var1, List var2) {
      this.DDk = var1;
      this.DDv = var2;
   }

   @Override
   public Object Hv() {
      nac var1 = new nac();
      var1.Enz = this.DDv;
      var1.EXy = true;
      var1.EXw = 1.0F;
      var1.EXv = true;
      var1.EXz = true;
      var1.jqY = 2048;
      gzw var2 = (gzw)this.DDk.d(4124);
      var2.on(lcr.qAE);
      var2.jvM = var1;
      this.DDk.a(var2);
      return "done";
   }

   @Override
   public void finished() {
      String var1 = "[" + this.DDv.size() + "] Structure(s) Processed.";
      this.DDk.Ca(var1);
   }
}
