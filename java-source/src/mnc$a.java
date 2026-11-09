import com.jgraph.graph.BasicMarqueeHandler;
import com.jgraph.graph.GraphConstants;
import com.jgraph.graph.Port;
import com.jgraph.graph.PortView;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import javax.swing.SwingUtilities;

public class mnc$a extends BasicMarqueeHandler {
   protected Point start;
   protected Point DOk;
   protected PortView DOl;
   protected PortView DOm;

   public mnc$a(mnc var1) {
      this.DOj = var1;
   }

   public boolean isForceMarqueeEvent(MouseEvent var1) {
      if (SwingUtilities.isRightMouseButton(var1)) {
         return true;
      }

      this.DOl = this.f(var1.getPoint());
      return this.DOl != null && this.DOj.isPortsVisible() ? true : super.isForceMarqueeEvent(var1);
   }

   public void mousePressed(MouseEvent var1) {
      if (SwingUtilities.isRightMouseButton(var1)) {
         Point var2 = this.DOj.fromScreen(var1.getPoint());
         Object var3 = this.DOj.getFirstCellForLocation(var2.x, var2.y);
      } else if (this.DOl != null && !var1.isConsumed() && this.DOj.isPortsVisible()) {
         this.start = this.DOj.toScreen(this.DOl.getLocation(null));
         this.DOm = this.DOl;
         var1.consume();
      } else {
         super.mousePressed(var1);
      }
   }

   public void mouseDragged(MouseEvent var1) {
      if (this.start != null && !var1.isConsumed()) {
         Graphics var2 = this.DOj.getGraphics();
         this.a(Color.black, this.DOj.getBackground(), var2);
         this.DOl = this.g(var1.getPoint());
         if (this.DOl != null) {
            this.DOk = this.DOj.toScreen(this.DOl.getLocation(null));
         } else {
            this.DOk = this.DOj.snap(var1.getPoint());
         }

         this.a(this.DOj.getBackground(), Color.black, var2);
         var1.consume();
      }

      super.mouseDragged(var1);
   }

   public PortView f(Point var1) {
      Point var2 = this.DOj.fromScreen(new Point(var1));
      return this.DOj.getPortViewAt(var2.x, var2.y);
   }

   protected PortView g(Point var1) {
      Object var2 = this.DOj.getFirstCellForLocation(var1.x, var1.y);
      lfn.print("Getting Cell: " + var2);
      int var3 = 0;

      for (int var4 = this.DOj.getModel().getChildCount(var2); var3 < var4; var3++) {
         PortView var5 = (PortView)this.DOj.getModel().getChild(var2, var3);
         var5 = this.DOj.getGraphLayoutCache().getMapping(var5, false);
         if (var5 instanceof PortView && var5 != this.DOm) {
            return var5;
         }
      }

      lfn.print("No Portview found for Cell: " + var2);
      return this.f(var1);
   }

   public void mouseReleased(MouseEvent var1) {
      if (var1 != null && !var1.isConsumed() && this.DOl != null && this.DOm != null && this.DOm != this.DOl) {
         lfn.print("<> MouseReleased: Connecting FirstPort[" + this.DOm.getParentView().getCell() + "] and port[" + this.DOl.getParentView().getCell() + "]");
         lfn.print("<> MouseReleased: Connecting FirstPort[" + this.DOm.getClass().getName() + "] and port[" + this.DOl.getClass().getName() + "]");
         this.DOj.a((Port)this.DOm.getCell(), (Port)this.DOl.getCell());
         var1.consume();
      } else {
         this.DOj.repaint();
      }

      this.DOm = this.DOl = null;
      this.start = this.DOk = null;
      super.mouseReleased(var1);
   }

   public void mouseMoved(MouseEvent var1) {
      if (var1 != null && this.f(var1.getPoint()) != null && !var1.isConsumed() && this.DOj.isPortsVisible()) {
         this.DOj.setCursor(new Cursor(12));
         var1.consume();
      }

      super.mouseReleased(var1);
   }

   protected void a(Color var1, Color var2, Graphics var3) {
      var3.setColor(var1);
      var3.setXORMode(var2);
      this.c(this.DOj.getGraphics());
      if (this.DOm != null && this.start != null && this.DOk != null) {
         var3.drawLine(this.start.x, this.start.y, this.DOk.x, this.DOk.y);
      }
   }

   protected void c(Graphics var1) {
      if (this.DOl != null) {
         boolean var2 = GraphConstants.getOffset(this.DOl.getAttributes()) != null;
         Rectangle var3 = var2 ? this.DOl.getBounds() : this.DOl.getParentView().getBounds();
         var3 = this.DOj.toScreen(new Rectangle(var3));
         var3.setBounds(var3.x - 3, var3.y - 3, var3.width + 6, var3.height + 6);
         this.DOj.getUI().paintCell(var1, this.DOl, var3, true);
      }
   }
}
