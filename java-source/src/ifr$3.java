import java.util.Comparator;

class ifr$3 implements Comparator<ign> {
   ifr$3(ifr var1) {
      this.lRZ = var1;
   }

   public int a(ign var1, ign var2) {
      if (var1.cTq().eyG < var2.cTq().eyG) {
         return -1;
      } else if (var1.cTq().eyG > var2.cTq().eyG) {
         return 1;
      } else if (var1.cTq().eyL < var2.cTq().eyL) {
         return -1;
      } else if (var1.cTq().eyL > var2.cTq().eyL) {
         return 1;
      } else if (var1.cTq().adk < var2.cTq().adk) {
         return -1;
      } else {
         return var1.cTq().adk > var2.cTq().adk ? 1 : 0;
      }
   }
}
