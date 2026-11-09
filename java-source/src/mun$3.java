import javax.swing.JFrame;

final class mun$3 implements Runnable {
   @Override
   public void run() {
      new mun(new JFrame(), true).setVisible(true);
   }
}
