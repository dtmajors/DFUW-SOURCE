import javax.swing.JFrame;

final class mqv$1 implements Runnable {
   @Override
   public void run() {
      new mqv(new JFrame(), true).setVisible(true);
   }
}
