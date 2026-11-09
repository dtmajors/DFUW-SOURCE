import java.util.ArrayList;
import java.util.HashMap;

public abstract class jix$c {
   private ler nhB;
   private hwm mqd;
   jix$a nhC;

   public abstract void sort();

   public ler dHM() {
      return this.nhB;
   }

   public hwm cQm() {
      return this.mqd;
   }

   public jix$a dHN() {
      return this.nhC;
   }

   public int getDepth() {
      int var1 = 0;

      for (jix$a var2 = this.dHN(); var2 != null; var2 = var2.dHN()) {
         var1++;
      }

      return var1;
   }

   public ArrayList<jix$c> dHO() {
      ArrayList var1 = new ArrayList();

      for (jix$a var2 = this.dHN(); var2 != null; var2 = var2.dHN()) {
         var1.add(var2);
      }

      ArrayList var4 = new ArrayList();

      for (int var3 = var1.size() - 1; var3 >= 0; var3--) {
         var4.add(var1.get(var3));
      }

      return var4;
   }

   public String getText() {
      return this.cQm().cBj().text;
   }

   public void a(HashMap<hwm, jix$c> var1) {
      var1.put(this.mqd, this);
   }

   public abstract jix$c f(bsf var1);

   public void println(int var1) {
      for (int var2 = 0; var2 < var1; var2++) {
         System.out.print("    ");
      }
   }

   protected abstract void dHJ();

   private jix$c(jix var1, ler var2, hwm var3) {
      this.nhA = var1;
      this.nhB = var2;
      this.mqd = var3;
   }
}
