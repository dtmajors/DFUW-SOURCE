import com.thoughtworks.xstream.annotations.XStreamAlias;
import java.util.Set;

@XStreamAlias("AIServerNode")
class amt$b implements Comparable<amt$b> {
   int Node;
   Set<String> Spawnpoints = lcn.emx();

   private amt$b() {
   }

   public int a(amt$b var1) {
      return this.equals(var1) ? 0 : this.Node - var1.Node;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      }

      if (var1 == null) {
         return false;
      }

      if (this.getClass() != var1.getClass()) {
         return false;
      }

      amt$b var2 = (amt$b)var1;
      return this.Node == var2.Node;
   }

   @Override
   public int hashCode() {
      byte var1 = 31;
      byte var2 = 1;
      return 31 * var2 + this.Node;
   }
}
