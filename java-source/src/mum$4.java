import javax.swing.JFrame;

final class mum$4 implements Runnable {
   @Override
   public void run() {
      new mum(new JFrame(), true).setVisible(true);
   }
}
