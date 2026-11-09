class jfz$2 extends iur {
   jfz$2(jfz var1) {
      this.mYB = var1;
   }

   @Override
   public void cLq() {
      jey var1 = (jey)jfz.b(this.mYB).getValue();
      if (var1 == null) {
         var1 = jfz.c(this.mYB).dzY();
      }

      this.mYB.b(jfz.d(this.mYB).getText(), var1);
      this.mYB.close();
   }
}
