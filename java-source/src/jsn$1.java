import com.thoughtworks.xstream.core.util.QuickWriter;
import com.thoughtworks.xstream.io.xml.PrettyPrintWriter;
import java.io.Writer;

class jsn$1 extends PrettyPrintWriter {
   boolean nVn;

   jsn$1(jsn var1, Writer var2) {
      super(var2);
      this.nVo = var1;
      this.nVn = false;
   }

   @Override
   public void startNode(String var1) {
      super.startNode(var1);
      this.nVn = var1.equals("string");
   }

   @Override
   protected void writeText(QuickWriter var1, String var2) {
      if (this.nVn) {
         var1.write("<![CDATA[");
         var1.write(var2);
         var1.write("]]>");
      } else {
         var1.write(var2);
      }
   }
}
