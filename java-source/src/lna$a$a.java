import java.lang.reflect.Field;

public class lna$a$a extends lmw$a$a {
   public final Field rFm;

   public lna$a$a(lmu var1, Field var2) {
      super(var1, var2.getName());
      this.rFm = var2;
   }

   @Override
   public String toString() {
      return super.toString() + "@" + this.rFm.getDeclaringClass().getName();
   }
}
