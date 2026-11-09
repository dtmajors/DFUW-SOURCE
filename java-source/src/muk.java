/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  aux
 */
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class muk
extends mlc {
    private btk EGs = null;
    private aux DEC = null;
    private mvk EGt = null;
    private mkt EGu = null;
    private mkn EGv = null;
    private mkn EGw = null;
    private mkn EGx = null;
    private JPanel EGy = null;
    private mkg EGz = null;
    private JPanel EGA = null;
    private JButton EGB = null;
    private mku EGC = null;
    private mku DNu = null;

    public muk(btk btk2) {
        super(false);
        this.setTitle("Logicbject properties");
        this.setPreferredSize(new Dimension(450, 300));
        this.EGs = btk2;
        this.ePH();
        this.setClosable(true);
        this.pack();
    }

    public void p(aux aux2) {
        this.DEC = aux2;
    }

    private void ePH() {
        JPanel jPanel = null;
        jPanel = new JPanel();
        jPanel.setLayout(new FlowLayout(0));
        this.j(jPanel);
        this.addTab("General", jPanel);
    }

    private void j(JPanel jPanel) {
        mkn mkn2 = null;
        String string = this.EGs.getObjectDescriptionFilename();
        if (string == null) {
            string = "n/a";
        }
        mkn2 = new mkn("Object Name", string);
        jPanel.add(mkn2);
        this.EGw = new mkn("GUID", this.EGs.getGUID().toString());
        jPanel.add(this.EGw);
        this.EGv = new mkn("Type", amh.bxE[this.EGs.getObjectType()]);
        jPanel.add(this.EGv);
        this.EGx = new mkn("XML SFFile:", this.EGs.getObjectDescriptionFilename());
        jPanel.add(this.EGx);
        mkn mkn3 = new mkn("Active", Boolean.toString(this.EGs.isActive()));
        jPanel.add(mkn3);
        Object object = new mkn("ClassName ", this.EGs.getClass().getName());
        jPanel.add((Component)object);
        object = this.EGs.getObserverObjects();
        if (object != null && !object.isEmpty()) {
            mkg mkg2 = new mkg(object.toArray(), "Observers");
            jPanel.add(mkg2);
        }
    }

    @Override
    protected void eDD() {
    }
}

