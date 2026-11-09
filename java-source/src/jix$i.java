import java.util.HashMap;

class jix$i extends jix$a {
   @Override
   public String getText() {
      return lyz.trF.bD().exA();
   }

   @Override
   public void a(HashMap<hwm, jix$c> var1) {
      for (jix$c var3 : jix$d.a(this.nhz)) {
         var3.a(var1);
      }
   }

   @Override
   public void println(int var1) {
      for (int var2 = 0; var2 < var1; var2++) {
         System.out.print("    ");
      }

      this.nhz.println(var1 + 1);
   }

   private jix$i(jix var1) {
      super(var1, null, null, null);
      this.nhA = var1;
   }
}
