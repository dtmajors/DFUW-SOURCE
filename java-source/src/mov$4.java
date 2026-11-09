import javax.swing.JFrame;

final class mov$4 implements Runnable {
   @Override
   public void run() {
      new mov(new JFrame(), true).setVisible(true);
   }
}
