class jqx$3 implements jpj {
   jqx$3(jqx var1) {
      this.nTG = var1;
   }

   @Override
   public jpi tb(String var1) {
      assert jqx.m(this.nTG);
      jqk var2 = this.nTG.tf(var1);
      return var2 == null ? null : var2;
   }

   @Override
   public jpi dPp() {
      return this.nTG.nTq;
   }

   @Override
   public jpi dPq() {
      return this.nTG.nTr;
   }

   @Override
   public jpi dPr() {
      return this.nTG.nTs;
   }

   @Override
   public jpf ta(String var1) {
      assert jqx.m(this.nTG);
      String var2 = null;
      int var3 = var1.indexOf(58);
      if (var3 != -1) {
         var2 = var1.substring(0, var3);
         var1 = var1.substring(var3 + 1);
      } else {
         for (jqj var5 : jqx.n(this.nTG)) {
            if (var5 instanceof jqk) {
               jqk var6 = (jqk)var5;
               if (var6.ta(var1) != null) {
                  var2 = var6.Name;
                  break;
               }
            }
         }

         if (var2 == null) {
            return null;
         }
      }

      jqk var7 = this.nTG.tf(var2);
      return var7 == null ? null : var7.ta(var1);
   }

   @Override
   public jpf a(jpb var1) {
      jqm var2 = this.nTG.nTq;
      return var2 == null ? null : var2.ta(var1.Name);
   }

   @Override
   public jpb b(jpf var1) {
      return (jpb)jqx.o(this.nTG).get(var1);
   }
}
