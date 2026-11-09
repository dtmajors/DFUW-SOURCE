import java.awt.FlowLayout;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class msu extends mss implements msk {
   private JPanel EuD;
   private Vector Evi;
   private Vector Evj;
   private JTextField Evk;
   private JComboBox Evl;
   private JComboBox Evm;
   private JSpinner Evn;
   private JLabel Evo = new JLabel("Object Name");
   private JLabel Evp = new JLabel("Object Type");
   private JLabel Evq = new JLabel("Booster Group");
   private JLabel Evr = new JLabel("Booster Index");
   private JButton Eve = new JButton("Change Resource");
   private JPanel Evs = new JPanel(new FlowLayout(0));
   private JPanel Evt = new JPanel(new FlowLayout(0));
   private JPanel Evu = new JPanel(new FlowLayout(0));
   private JPanel Evv = new JPanel(new FlowLayout(0));
   private JPanel Evw = new JPanel(new FlowLayout(0));
   private JCheckBox Evx = new JCheckBox();
   private JLabel Evy = new JLabel("Ultimate");
   private JPanel Evz = new JPanel(new FlowLayout(0));
   private msj EsY = new msj();
   private chg EvA;

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public msu(msf var1) {
      super(var1);
      this.EvA = (chg)var1.eNq().eyU;
      this.Evi = new Vector();

      for (cgd var5 : cgd.values()) {
         this.Evi.add(var5);
      }

      this.Evl = new JComboBox(this.Evi);
      this.Evp.setPreferredSize(this.Eqd);
      this.Evt.add(this.Evp);
      this.Evt.add(this.Evl);
      this.Evu.add(this.Evt);
      this.Evj = new Vector();

      for (ckj var9 : ckj.values()) {
         this.Evj.add(var9);
      }

      this.Evm = new JComboBox(this.Evj);
      this.Evn = new JSpinner();
      this.Evk = new JTextField(32);
      this.a(this.EvA);
      this.Evo.setPreferredSize(this.Eqd);
      this.Evs.add(this.Evo);
      this.Evs.add(this.Evk);
      this.Evu.add(this.Evs);
      this.Evu.add(this.Eve);
      this.Evr.setPreferredSize(this.Eqd);
      this.Evw.add(this.Evr);
      this.Evw.add(this.Evn);
      this.Evq.setPreferredSize(this.Eqd);
      this.Evv.add(this.Evq);
      this.Evv.add(this.Evm);
      this.Evv.add(this.Evw);
      this.Evy.setPreferredSize(this.Eqd);
      this.Evz.add(this.Evy);
      this.Evz.add(this.Evx);
      this.add(this.Evu);
      this.add(this.Evz);
      this.add(this.Evv);
      this.eOd();
      switch (this.b(this.EvA)) {
         case ewS:
            this.Evm.setEnabled(true);
            this.Evn.setEnabled(true);
            this.Evx.setEnabled(false);
            break;
         case ewT:
            this.Evm.setEnabled(false);
            this.Evn.setEnabled(false);
            this.Evx.setEnabled(true);
            break;
         case ewU:
            this.Evm.setEnabled(false);
            this.Evn.setEnabled(false);
            this.Evx.setEnabled(false);
      }

      this.eOh();
   }

   private void eOh() {
      this.Eve.addActionListener(new msu$1(this));
      this.Evl.addItemListener(new msu$2(this));
      this.Evn.addChangeListener(new msu$3(this));
      this.Evm.addActionListener(new msu$4(this));
   }

   protected void eOi() {
      String var1 = this.Evk.getText().trim();

      for (int var2 = 0; var2 < this.Evm.getModel().getSize(); var2++) {
         if (this.Evm.getItemAt(var2).toString().equals(lea.epw().hz(var1).aQS().Name.toUpperCase())) {
            this.Evm.setSelectedIndex(var2);
            break;
         }
      }
   }

   protected void eOj() {
      String var1 = this.Evk.getText().trim();
      this.Evn.setValue(lea.epw().hz(var1).getIndex());
   }

   @Override
   public mss eOc() {
      return this;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void eOd() {
      if (cgd.getValueByOrdinal(this.EvA.ObjectType) == null) {
         this.EvA.ObjectType = 1;
      }

      this.a(this.Evl, this.EvA);
      switch (cgd.getValueByOrdinal(this.EvA.ObjectType)) {
         case ewS:
            this.Evk
               .setText(
                  this.EvA.bSL > -1
                     ? lea.epw().ro(this.EvA.bSL).getName()
                     : (this.EvA.ezM != null ? (this.EvA.ezN > -1 ? lea.epw().aW(this.EvA.ezM.ordinal(), this.EvA.ezN).getName() : "") : "")
               );
            if (this.EvA.ezM != null) {
               for (int var1 = 1; var1 < this.Evm.getModel().getSize(); var1++) {
                  if (this.Evm.getModel().getElementAt(var1).toString().equals(this.EvA.ezM.Name.toUpperCase())) {
                     this.Evm.setSelectedIndex(var1);
                     break;
                  }
               }
            } else {
               this.Evm.setSelectedIndex(0);
            }

            this.Evn.setValue(this.EvA.ezN);
            break;
         case ewT:
            this.Evk.setText(this.EvA.bSL > -1 ? lea.enZ().getName(this.EvA.bSL) : "");
            this.Evx.setSelected(this.EvA.ezO);
            break;
         case ewU:
            this.Evk.setText(this.EvA.bSL > -1 ? lea.enW().getName(this.EvA.bSL) : "");
      }
   }

   private void a(JComboBox var1, chg var2) {
      cgd var3 = cgd.getValueByOrdinal(var2.ObjectType);

      for (int var4 = 0; var4 < var1.getModel().getSize(); var4++) {
         if (var1.getModel().getElementAt(var4).toString() == var3.name()) {
            var1.setSelectedIndex(var4);
            break;
         }
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void a(chg var1) {
      cgd var2 = cgd.getValueByOrdinal(var1.ObjectType);
      if (var1.bSL > 0) {
         switch (var2) {
            case ewS:
               if (var1.bSL > -1) {
                  this.Evk.setText(lea.epw().ro(var1.bSL).getName());
               } else {
                  this.Evk.setText("");
               }
               break;
            case ewT:
               if (var1.bSL > -1) {
                  this.Evk.setText(lea.enZ().getName(var1.bSL));
               } else {
                  this.Evk.setText("");
               }
               break;
            case ewU:
               if (var1.bSL > -1) {
                  this.Evk.setText(lea.enW().getName(var1.bSL));
               } else {
                  this.Evk.setText("");
               }
         }
      }
   }

   private cgd b(chg var1) {
      return cgd.getValueByOrdinal(var1.ObjectType);
   }

   @Override
   public boolean eNC() {
      return super.eNC() || this.eOk();
   }

   private boolean eOk() {
      if (!cgd.getValueByOrdinal(this.EvA.ObjectType).name().equals(this.Evl.getSelectedItem().toString())) {
         return true;
      }

      if (this.Evl.getSelectedItem().toString().equals("SKILL")) {
         if (this.EvA.bSL > -1) {
            if (!lea.enZ().getName(this.EvA.bSL).equals(this.Evk.getText())) {
               return true;
            }
         } else if (this.EvA.ezO != this.Evx.isSelected()) {
            return true;
         }
      } else if (this.Evl.getSelectedItem().toString().equals("RESOURCE")) {
         if (!lea.enW().getName(this.EvA.bSL).equals(this.Evk.getText())) {
            return true;
         }
      } else if (this.Evl.getSelectedItem().toString().equals("BOOSTER")) {
         if (this.EvA.bSL > -1) {
            if (!lea.epw().ro(this.EvA.bSL).getName().equals(this.Evk.getText())) {
               return true;
            }
         } else if (!this.Evk.getText().equals("")) {
            return true;
         }

         if (this.EvA.ezM != null) {
            if (!this.EvA.ezM.equals(ckj.getValueByName(this.Evm.getSelectedItem().toString()))) {
               return true;
            }
         } else if (this.Evm.getSelectedIndex() != 0) {
            return true;
         }

         if (this.EvA.ezN != Integer.parseInt(this.Evn.getValue().toString())) {
            return true;
         }
      }

      return false;
   }

   @Override
   public void save() {
      super.save();
      this.EvA.ObjectType = cgd.getValueByName(this.Evl.getSelectedItem().toString()).ordinal();
      if (this.Evl.getSelectedItem().toString().equals("SKILL")) {
         this.EvA.ezM = null;
         this.EvA.ezN = -1;
         this.EvA.bSL = this.Evk.getText().trim().equals("") ? -1 : lea.enZ().zx(this.Evk.getText().trim()).getType();
         this.EvA.ezO = this.Evx.isSelected();
      } else if (this.Evl.getSelectedItem().toString().equals("RESOURCE")) {
         this.EvA.ezM = null;
         this.EvA.ezN = -1;
         this.EvA.bSL = this.Evk.getText().trim().equals("") ? -1 : lea.enW().zx(this.Evk.getText().trim()).getType();
      } else if (this.Evl.getSelectedItem().toString().equals("BOOSTER")) {
         this.EvA.bSL = this.Evk.getText().trim().equals("") ? -1 : lea.epw().hz(this.Evk.getText().trim()).getID();
         this.EvA.ezM = this.Evm.getSelectedItem().toString().equals("") ? null : ckj.getValueByName(this.Evm.getSelectedItem().toString());
         this.EvA.ezN = Integer.parseInt(this.Evn.getValue().toString()) > 0 ? Integer.parseInt(this.Evn.getValue().toString()) : -1;
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public Element c(Element var1, Document var2) {
      super.c(var1, var2);
      Element var3 = var2.createElement("Type");
      var3.setAttribute("Value", cgd.getValueByOrdinal(this.EvA.ObjectType).name());
      var1.appendChild(var3);
      switch (cgd.getValueByOrdinal(this.EvA.ObjectType)) {
         case ewS:
            if (!this.Evk.getText().trim().equals("")) {
               var3 = var2.createElement("ObjectName");
               var3.setAttribute("Value", lea.epw().ro(this.EvA.bSL).getName());
               var1.appendChild(var3);
            } else {
               if (this.Evm.getSelectedIndex() != 0) {
                  var3 = var2.createElement("Group");
                  var3.setAttribute("Value", this.EvA.ezM.Name.toUpperCase());
                  var1.appendChild(var3);
               }

               var3 = var2.createElement("Index");
               var3.setAttribute("Value", String.valueOf(this.EvA.ezN).toString());
               var1.appendChild(var3);
            }
            break;
         case ewT:
            var3 = var2.createElement("ObjectName");
            var3.setAttribute("Value", this.Evk.getText());
            var1.appendChild(var3);
            var3 = var2.createElement("Ulti");
            var3.setAttribute("Value", this.Evx.isSelected() ? "true" : "false");
            break;
         case ewU:
            var3 = var2.createElement("ObjectName");
            var3.setAttribute("Value", this.Evk.getText());
            var1.appendChild(var3);
      }

      return var1;
   }
}
