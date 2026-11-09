import java.util.ArrayList;

class hrh$b<ROW> extends hrm {
   private final ArrayList<hrh$a<ROW>> lag = new ArrayList<>();
   private boolean Changed;

   private hrh$b() {
   }

   @Override
   public int getSize() {
      return this.lag.size();
   }

   public final hrh$a<ROW> NX(int var1) {
      return this.lag.get(var1);
   }

   public final hrh$a<ROW> NY(int var1) {
      hrh$a var2;
      if (var1 < this.lag.size()) {
         var2 = this.lag.get(var1);
      } else {
         var2 = new hrh$a(null);
         this.lag.add(var2);
         this.Changed = true;
      }

      return var2;
   }

   public final hrh$a<ROW> cwE() {
      hrh$a var1 = new hrh$a(null);
      this.lag.add(var1);
      return var1;
   }

   public final void NZ(int var1) {
      while (this.lag.size() > var1) {
         this.lag.remove(this.lag.size() - 1);
         this.Changed = true;
      }

      if (this.Changed) {
         this.lak.enp();
      }

      this.Changed = false;
   }

   public final int K(ROW var1) {
      if (var1 == null) {
         return this.lag.size();
      }

      for (int var2 = 0; var2 < this.lag.size(); var2++) {
         if (this.lag.get(var2).kWe == var1) {
            return var2;
         }
      }

      return -1;
   }
}
