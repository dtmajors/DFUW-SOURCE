/*
 * Decompiled with CFR.
 */
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class msy
extends mss
implements msk {
    private Vector EwA;
    private JList EwB;
    private JLabel EwC = new JLabel("Feats Required");
    private JPanel EwD = new JPanel(new FlowLayout(0));
    private JPanel EwE = new JPanel(new FlowLayout(0));
    private JButton EwF = new JButton("Add");
    private JButton EwG = new JButton("Remove");
    private JTextField EwH = new JTextField();
    private msf EuZ;
    private msj Evf;
    chk EwI;

    public msy(msf msf2) {
        super(msf2);
        this.EuZ = msf2;
        this.EwI = (chk)msf2.eNq().eyU;
        this.EwA = new Vector();
        if (this.EwI.ezZ != null && !this.EwI.ezZ.isEmpty()) {
            for (String string : this.EwI.ezZ) {
                this.EwA.add(lea.eps().hm((String)string).Name);
            }
        }
        this.EwB = new JList(this.EwA);
        this.EwC.setPreferredSize(this.Eqd);
        this.EwD.add(this.EwC);
        this.EwD.add(this.EwB);
        this.EwE.add(this.EwF);
        this.EwE.add(this.EwG);
        this.add(this.EwD);
        this.add(this.EwE);
        this.eOd();
        this.eOg();
    }

    @Override
    public mss eOc() {
        return this;
    }

    @Override
    public void eOd() {
    }

    @Override
    public boolean eNC() {
        return super.eNC() || !(this.EwI.ezZ == null ? this.EwB.getModel().getSize() == 0 : this.EwI.ezZ.size() == this.EwB.getModel().getSize()) || !this.a(this.EwI.ezZ, this.EwB);
    }

    private boolean a(List<String> list, JList jList) {
        boolean bl = false;
        if (list == null && jList.getModel().getSize() == 0) {
            return true;
        }
        if (list == null) {
            return false;
        }
        if (jList.getModel().getSize() == list.size()) {
            for (int i = 0; i < jList.getModel().getSize(); ++i) {
                bl = false;
                for (int j = 0; j < list.size(); ++j) {
                    if (!jList.getModel().getElementAt(i).toString().equals(list.get(j))) continue;
                    bl = true;
                }
                if (bl) continue;
                return false;
            }
        }
        return true;
    }

    public void eOg() {
        this.EwF.addActionListener(new ActionListener(this){
            final /* synthetic */ msy EwJ;
            {
                this.EwJ = msy2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                msy.a(this.EwJ, new msj(msy.a(this.EwJ)));
                String string = msy.b((msy)this.EwJ).eNq().Name;
                msy.c(this.EwJ).i(msy.a(this.EwJ));
                if (string.equals(msy.a(this.EwJ).getText())) {
                    JOptionPane.showMessageDialog(null, "A feat can not have itself as a prerequisite.");
                    return;
                }
                if (msy.a(this.EwJ).getText() != null && !msy.a(this.EwJ).getText().equals("") && !msy.d(this.EwJ).contains(msy.a(this.EwJ).getText())) {
                    msy.d(this.EwJ).add(msy.a(this.EwJ).getText());
                    msy.e(this.EwJ).setListData(msy.d(this.EwJ));
                    msy.e(this.EwJ).revalidate();
                    msy.e(this.EwJ).repaint();
                }
            }
        });
        this.EwG.addActionListener(new ActionListener(this){
            final /* synthetic */ msy EwJ;
            {
                this.EwJ = msy2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                if (msy.e(this.EwJ).getSelectedIndex() != -1) {
                    msy.d(this.EwJ).remove(msy.e(this.EwJ).getSelectedIndex());
                    msy.e(this.EwJ).setListData(msy.d(this.EwJ));
                    msy.e(this.EwJ).revalidate();
                    msy.e(this.EwJ).repaint();
                }
            }
        });
    }

    @Override
    public void save() {
        super.save();
        if (this.EwI.ezZ != null) {
            this.EwI.ezZ.clear();
        }
        if (this.EwI.ezZ != null && this.EwB.getModel().getSize() != 0) {
            for (int i = 0; i < this.EwB.getModel().getSize(); ++i) {
                this.EwI.ezZ.add(lea.eps().hm((String)this.EwB.getModel().getElementAt((int)i).toString()).Name);
            }
        }
    }

    @Override
    public Element c(Element element, Document document) {
        super.c(element, document);
        if (this.EwI.ezZ != null) {
            for (int i = 0; i < this.EwI.ezZ.size(); ++i) {
                Element element2 = document.createElement("Feat");
                element2.setAttribute("Name", lea.eps().hm((String)this.EwI.ezZ.get((int)i)).Name);
                element.appendChild(element2);
            }
        }
        return element;
    }

    @Override
    public /* synthetic */ JPanel eNX() {
        return this.eOc();
    }

    static /* synthetic */ msj a(msy msy2, msj msj2) {
        msy2.Evf = msj2;
        return msy2.Evf;
    }

    static /* synthetic */ JTextField a(msy msy2) {
        return msy2.EwH;
    }

    static /* synthetic */ msf b(msy msy2) {
        return msy2.EuZ;
    }

    static /* synthetic */ msj c(msy msy2) {
        return msy2.Evf;
    }

    static /* synthetic */ Vector d(msy msy2) {
        return msy2.EwA;
    }

    static /* synthetic */ JList e(msy msy2) {
        return msy2.EwB;
    }
}

