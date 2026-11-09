import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;

class mqj$b extends JComponent {
   private boolean Edr;
   private boolean Eds;

   public mqj$b(mqj var1) {
      this.Edp = var1;
      this.Edr = false;
      this.Eds = false;
      this.addMouseMotionListener(new mqj$b$1(this, var1));
      this.addMouseListener(new mqj$b$2(this, var1));
   }

   @Override
   public void paint(Graphics var1) {
      super.paint(var1);
      int var2 = this.getWidth();
      int var3 = this.getHeight();
      var1.clearRect(0, 0, var2, var3);

      for (int var4 = 0; var4 < 500; var4++) {
         var1.drawLine(var4, var3, var4, var3 - mqj.h(this.Edp)[var4]);
      }

      var1.setColor(Color.RED);
      var1.drawLine(mqj.f(this.Edp), 0, mqj.f(this.Edp), var3);
      var1.drawLine(mqj.g(this.Edp), 0, mqj.g(this.Edp), var3);
      int var6 = mqj.i(this.Edp) * mqj.f(this.Edp) / 500;
      int var5 = mqj.i(this.Edp) * mqj.g(this.Edp) / 500;
      var1.drawString(String.valueOf(var6), mqj.f(this.Edp) + 2, 40);
      var1.drawString(String.valueOf(var5), mqj.g(this.Edp) + 2, 20);
   }
}
