import java.io.File;

class mrb$1 extends Thread {
   mrb$1(mrb var1) {
      this.EhQ = var1;
   }

   @Override
   public void run() {
      mrb.a(this.EhQ, new File(lcw.qLb + "xml/"));
   }
}
