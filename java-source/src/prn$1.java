import mjj.a;

class prn$1 implements a {
   prn$1(prn var1) {
      this.EYw = var1;
   }

   @Override
   public void a(ktv var1, Object var2) {
      if (!(var2 instanceof haa)) {
         lfn.b(5, this.getClass().getName(), "handleResponse() : data received is not SFWorldbuilderEngineRequestMessage");
      } else {
         haa var3 = (haa)var2;
         var3.e(var1);
         this.EYw.y(var3);
      }
   }
}
