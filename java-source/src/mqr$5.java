import javax.swing.JFrame;

final class mqr$5 implements Runnable {
   @Override
   public void run() {
      new mqr(new JFrame(), true).setVisible(true);
   }
}
