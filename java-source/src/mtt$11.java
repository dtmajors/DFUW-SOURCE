import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mtt$11 implements ActionListener {
   mtt$11(mtt var1) {
      this.EDj = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mtt.h(this.EDj).remove(mtt.i(this.EDj));
      mtt.h(this.EDj).remove(mtt.g(this.EDj));
      mtt.j(this.EDj).setVisible(true);
      mtt.h(this.EDj).revalidate();
      mtt.h(this.EDj).updateUI();
   }
}
