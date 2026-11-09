import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mtt$19 implements ActionListener {
   mtt$19(mtt var1) {
      this.EDj = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      switch (mtt.f(this.EDj)) {
         case 1:
            mtt.h(this.EDj).remove(mtt.g(this.EDj));
            mtt.h(this.EDj).add(mtt.i(this.EDj), "Center");
            mtt.b(this.EDj, 1);
            mtt.j(this.EDj).setVisible(false);
            mtt.h(this.EDj).revalidate();
            break;
         case 2:
            mtt.h(this.EDj).remove(mtt.i(this.EDj));
            mtt.h(this.EDj).add(mtt.g(this.EDj), "Center");
            mtt.b(this.EDj, 2);
            mtt.j(this.EDj).setVisible(false);
            mtt.h(this.EDj).revalidate();
      }
   }
}
