import javax.swing.JFrame;

final class amr$2 implements Runnable {
   @Override
   public void run() {
      amr var1 = new amr(new JFrame(), true);
      var1.addWindowListener(new amr$2$1(this));
      var1.setLocationRelativeTo(null);
      var1.setVisible(true);
   }
}
