import java.util.Comparator;

class lij$b<NODE> implements Comparator<lij$a<NODE>> {
   private final Comparator<NODE> roy;

   public lij$b(Comparator<NODE> var1) {
      this.roy = var1;
   }

   public int a(lij$a<NODE> var1, lij$a<NODE> var2) {
      return this.roy.compare(var1.rox, var2.rox);
   }

   @Override
   public boolean equals(Object var1) {
      return this == var1;
   }
}
