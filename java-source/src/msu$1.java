import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class msu$1 implements ActionListener {
   msu$1(msu var1) {
      this.EvB = var1;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void actionPerformed(ActionEvent var1) {
      msu.a(this.EvB, new msj(msu.a(this.EvB)));
      switch (cgd.getValueByName(msu.b(this.EvB).getSelectedItem().toString())) {
         case ewS:
            msu.c(this.EvB).g(msu.a(this.EvB));
            this.EvB.eOi();
            this.EvB.eOj();
            msu.d(this.EvB).revalidate();
            msu.d(this.EvB).repaint();
            msu.e(this.EvB).revalidate();
            msu.e(this.EvB).repaint();
            break;
         case ewT:
            msu.c(this.EvB).f(msu.a(this.EvB));
            break;
         case ewU:
            msu.c(this.EvB).e(msu.a(this.EvB));
      }
   }
}
