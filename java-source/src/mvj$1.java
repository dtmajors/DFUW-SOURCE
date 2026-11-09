import javax.swing.JFrame;

final class mvj$1 implements Runnable {
   @Override
   public void run() {
      mvj var1 = new mvj(new JFrame(), true);
      var1.addWindowListener(new mvj$1$1(this));
      var1.setVisible(true);
   }
}
