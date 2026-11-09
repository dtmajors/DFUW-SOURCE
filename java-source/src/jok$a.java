import java.util.Arrays;
import lmx.a;

public class jok$a extends a {
   private static final lni.a nKj = new lni.a(1.0E-5, 0.01);
   private static final lni.a nKk = new lni.a(1.0E-4, 0.2);
   private static final lni.a nKl = new lni.a(1.0E-5, 0.01);
   public static final jok$a nKm = new jok$a();

   public jok$a() {
      super(
         jok.class,
         Arrays.asList(
            new lmx.a.a(nKj, "MouseXSensitivity", new lni(0.0025)),
            new lmx.a.a(nKj, "MouseYSensitivity", new lni(0.0025)),
            new lmx.a.a(lne.a.rFu, "MouseYInvert", new lne(false)),
            new lmx.a.a(lne.a.rFu, "MouseSmoothingEnabled", new lne(true)),
            new lmx.a.a(nKk, "MouseSmoothingAmount", new lni(0.05)),
            new lmx.a.a(nKl, "JoystickXSensitivity", new lni(5.0E-5)),
            new lmx.a.a(nKl, "JoystickYSensitivity", new lni(5.0E-5)),
            new lmx.a.a(nKl, "JoystickZSensitivity", new lni(5.0E-5))
         )
      );
   }

   @Override
   protected String ccJ() {
      return "Input Options";
   }
}
