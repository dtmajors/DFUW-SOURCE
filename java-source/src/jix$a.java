import java.util.ArrayList;
import java.util.HashMap;

public abstract class jix$a extends jix$c {
   jix$d nhz;

   @Override
   public void sort() {
      for (jix$c var2 : jix$d.a(this.nhz)) {
         var2.sort();
      }
   }

   public jix$d dHK() {
      return this.nhz;
   }

   public ArrayList<jix$c> dHL() {
      return jix$d.a(this.nhz);
   }

   @Override
   public void a(HashMap<hwm, jix$c> var1) {
      super.a(var1);

      for (jix$c var3 : jix$d.a(this.nhz)) {
         var3.a(var1);
      }
   }

   @Override
   public jix$c f(bsf var1) {
      for (jix$c var3 : jix$d.a(this.nhz)) {
         jix$c var4 = var3.f(var1);
         if (var4 != null) {
            return var4;
         }
      }

      return null;
   }

   public void a(jix$c var1) {
      if (var1.dHN() != this) {
         throw new RuntimeException("invalid node to remove from a vendor buy inventory");
      }

      jix$d.a(this.nhz).remove(var1);
      var1.nhC = null;
   }

   @Override
   public void println(int var1) {
      super.println(var1);
      this.nhz.println(var1 + 1);
   }

   @Override
   protected void dHJ() {
      for (int var1 = 0; var1 < jix$d.a(this.nhz).size(); var1++) {
         jix$c var2 = (jix$c)jix$d.a(this.nhz).get(var1);
         var2.dHJ();
         if (var2 instanceof jix$a && jix$d.a(((jix$a)var2).nhz).size() == 1) {
            jix$a var3 = (jix$a)var2;
            jix$c var4 = (jix$c)jix$d.a(var3.nhz).get(0);
            var4.nhC = this;
            jix$d.a(this.nhz).remove(var1);
            jix$d.a(this.nhz).add(var1, var4);
            jix.a(this.nhA).remove(var2);
         }
      }
   }

   private jix$a(jix var1, ler var2, hwm var3) {
      super(var1, var2, var3, null);
      this.nhA = var1;
      this.nhz = new jix$d(this.nhA);
   }
}
