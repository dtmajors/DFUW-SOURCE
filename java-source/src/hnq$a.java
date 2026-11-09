import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum hnq$a {
   kPj,
   kPk,
   kPl,
   kPm;

   private static final int kPn = 2;
   public static final List<hnq$a> ListOfValue = Collections.unmodifiableList(Arrays.asList(hnq$a.class.getEnumConstants()));

   public final hnq$a csL() {
      return ListOfValue.get(this.ordinal() | 2);
   }

   public final hnq$a csM() {
      return ListOfValue.get(this.ordinal() & -3);
   }

   public final boolean csI() {
      return (this.ordinal() & 2) != 0;
   }
}
