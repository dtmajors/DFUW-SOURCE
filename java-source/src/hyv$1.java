import cfz.a;

class hyv$1 extends isy {
   hyv$1(hyv var1) {
      this.lqw = var1;
   }

   @Override
   public void od(String var1) {
      if (hyv.a(this.lqw).aNP() != a.ewl) {
         hyv.b(this.lqw).setText(String.valueOf(hyv.a(this.lqw).aNM()));
         assert false;
      } else {
         int var2 = 0;

         try {
            var2 = Integer.parseInt(var1);
            if (var2 > hyv.a(this.lqw).aNL()) {
               var2 = 0;
               hyv.b(this.lqw).setText(String.valueOf(var2));
            }
         } catch (NumberFormatException var4) {
            var2 = hyv.a(this.lqw).aNM();
            hyv.b(this.lqw).setText(String.valueOf(var2));
         }

         hyv.a(this.lqw).pQ(var2);
      }
   }
}
