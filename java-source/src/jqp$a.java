import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum jqp$a {
   nSR(0),
   nSS(1),
   nST(2),
   nSU(3),
   nSV(4),
   nSW(5),
   nSX(6),
   nSY(7),
   nSZ(8),
   nTa(9),
   nTb(10);

   public static final List<jqp$a> ListOfValue = Collections.unmodifiableList(Arrays.asList(jqp$a.class.getEnumConstants()));
   public final int PC;

   jqp$a(int var3) {
      this.PC = var3;
   }
}
