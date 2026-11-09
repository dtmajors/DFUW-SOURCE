import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class lai$4 extends AbstractAction {
   lai$4(lai var1, String var2) {
      super(var2);
      this.qrW = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      if (lai.g(this.qrW) > 0 && lai.h(this.qrW) != null && lai.c(this.qrW) != null) {
         lai.a(this.qrW, lai.h(this.qrW), lai.c(this.qrW), lai.b(this.qrW));
      }
   }
}
