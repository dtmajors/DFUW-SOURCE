import java.util.LinkedList;
import java.util.List;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class cu$a {
   public static final int kP = 1;
   public static final int kQ = 2;
   public static final int kR = 4;
   public static final int kS = 8;
   public static final int kT = 16;
   public static final int kU = 32;
   public final int kV;
   public final String kW;

   public cu$a(int var1, String var2) {
      this.kV = var1;
      this.kW = var2.toLowerCase();
   }

   public boolean d(String var1, String var2) {
      if (var1 != null && (this.kV & 1) != 0) {
         var1 = var1.toLowerCase();
         if ((this.kV & 16) != 0 && var1.contains(this.kW)) {
            return true;
         }

         if ((this.kV & 4) != 0 && var1.startsWith(this.kW)) {
            return true;
         }

         if ((this.kV & 8) != 0 && var1.endsWith(this.kW)) {
            return true;
         }

         if ((this.kV & 32) != 0 && var1.equals(this.kW)) {
            return true;
         }
      }

      if (var2 != null && (this.kV & 2) != 0) {
         var2 = var2.toLowerCase();
         if ((this.kV & 16) != 0 && var2.contains(this.kW)) {
            return true;
         }

         if ((this.kV & 4) != 0 && var2.startsWith(this.kW)) {
            return true;
         }

         if ((this.kV & 8) != 0 && var2.endsWith(this.kW)) {
            return true;
         }

         if ((this.kV & 32) != 0 && var2.equals(this.kW)) {
            return true;
         }
      }

      return false;
   }

   private static int a(Element var0, String var1, boolean var2, int var3) {
      if (var0.hasAttribute(var1)) {
         return Boolean.parseBoolean(var0.getAttribute(var1)) ? var3 : 0;
      } else {
         return var2 ? var3 : 0;
      }
   }

   public static List<cu$a> b(Document var0) {
      boolean var1 = false;
      boolean var2 = false;
      boolean var3 = false;
      boolean var4 = false;
      boolean var5 = false;
      boolean var6 = false;
      LinkedList var7 = new LinkedList();
      Element var8 = var0.getDocumentElement();
      NodeList var9 = var8.getChildNodes();
      int var10 = 0;

      for (int var11 = var9.getLength(); var10 < var11; var10++) {
         Node var12 = var9.item(var10);
         if (var12 instanceof Element) {
            Element var13 = (Element)var12;
            if (var13.getNodeName().equals("Defaults")) {
               var2 = Boolean.parseBoolean(var13.getAttribute("Begin"));
               var3 = Boolean.parseBoolean(var13.getAttribute("End"));
               var1 = Boolean.parseBoolean(var13.getAttribute("Middle"));
               var4 = Boolean.parseBoolean(var13.getAttribute("Exact"));
               var5 = Boolean.parseBoolean(var13.getAttribute("FirstName"));
               var6 = Boolean.parseBoolean(var13.getAttribute("LastName"));
               break;
            }
         }
      }

      var10 = 0;

      for (int var18 = var9.getLength(); var10 < var18; var10++) {
         Node var19 = var9.item(var10);
         if (var19 instanceof Element) {
            Element var20 = (Element)var19;
            if (var20.getNodeName().equals("Word")) {
               String var14 = var20.getAttribute("Value");
               if (var14 == null) {
                  assert false;
               } else {
                  int var15 = 0;
                  var15 |= a(var20, "Begin", var2, 4);
                  var15 |= a(var20, "End", var3, 8);
                  var15 |= a(var20, "Middle", var1, 16);
                  var15 |= a(var20, "Exact", var4, 32);
                  var15 |= a(var20, "FirstName", var5, 1);
                  var15 |= a(var20, "LastName", var6, 2);
                  cu$a var16 = new cu$a(var15, var14);
                  var7.add(var16);
               }
            }
         }
      }

      return var7;
   }
}
