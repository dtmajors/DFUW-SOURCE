import java.awt.Dimension;
import java.awt.Point;
import javax.swing.JInternalFrame;

class nul$a {
   private Point DDD;
   private Dimension DDE;
   private String ejK;

   private nul$a(nul var1) {
      this.DDF = var1;
      this.DDD = null;
      this.DDE = null;
      this.ejK = null;
   }

   public nul$a(nul var1, JInternalFrame var2) {
      this.DDF = var1;
      this.DDD = null;
      this.DDE = null;
      this.ejK = null;
      this.DDD = var2.getLocation();
      this.DDE = var2.getSize();
      this.ejK = var2.getClass().getName();
   }

   public String getClassName() {
      return this.ejK;
   }

   public void b(JInternalFrame var1) {
      var1.setLocation(this.DDD);
      var1.setSize(this.DDE);
   }
}
