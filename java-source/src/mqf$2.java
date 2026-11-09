import javax.swing.JFrame;

final class mqf$2 implements Runnable {
   @Override
   public void run() {
      mqf var1 = new mqf(new JFrame(), true);
      var1.addWindowListener(new mqf$2$1(this));
      var1.setVisible(true);
   }
}
