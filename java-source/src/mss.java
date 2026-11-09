/*
 * Decompiled with CFR.
 */
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.Vector;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public abstract class mss
extends JPanel
implements msk {
    private JSpinner EuO = new JSpinner();
    private JList EuP = new JList();
    private JLabel EuQ = new JLabel("Counter");
    protected final che eyU;
    private final JPanel EuR = new JPanel();
    private JPanel EuS = new JPanel(new FlowLayout(0));
    private JLabel EuT = new JLabel("Trigger Type");
    private Vector EuU = new Vector();
    private JComboBox EuV;
    protected Dimension Eqd = new Dimension(100, 30);
    protected Dimension Eqe = new Dimension(100, 30);
    private cgr EuW;
    private msm EuX = new msm();
    private cgi[] EuY = cgi.values();
    private msf EuZ;

    public mss(msf msf2) {
        this.EuZ = msf2;
        this.eyU = msf2.eNq().eyU;
        this.EuW = msf2.eNq();
        this.setLayout(new BoxLayout(this, 3));
        this.setBorder(BorderFactory.createTitledBorder("Feat Trigger Details"));
        this.EuO.setPreferredSize(new Dimension(50, 20));
        this.add(this.EuR);
        this.EuR.setLayout(new FlowLayout(0));
        this.EuQ.setPreferredSize(this.Eqd);
        this.EuR.add(this.EuQ);
        this.EuR.add(this.EuO);
        this.EuO.setValue(Float.valueOf(this.eyU.aFv));
        for (cgi cgi2 : this.EuY) {
            if (cgi2.equals((Object)cgi.BASE)) continue;
            this.EuU.add(cgi2.name());
        }
        this.EuV = new JComboBox(this.EuU);
        this.EuS.setOpaque(false);
        this.EuS.add(this.EuT);
        this.EuT.setOpaque(false);
        this.EuT.setPreferredSize(this.Eqd);
        this.EuS.add(this.EuV);
        this.b(this.eyU);
        this.eNv();
    }

    private void eNv() {
        this.EuO.addChangeListener(new ChangeListener(this){
            final /* synthetic */ mss Eva;
            {
                this.Eva = mss2;
            }

            public void stateChanged(ChangeEvent changeEvent) {
                if ((Integer)mss.a(this.Eva).getModel().getValue() < 0) {
                    mss.a(this.Eva).getModel().setValue(0);
                }
            }
        });
    }

    public abstract void eOd();

    public mss eOc() {
        return this;
    }

    public che eOf() {
        return this.eyU;
    }

    private void b(che che2) {
        String string = che2.aOG().toString();
        for (int i = 0; i < this.EuV.getModel().getSize(); ++i) {
            if (this.EuV.getModel().getElementAt(i).toString() != string) continue;
            this.EuV.setSelectedIndex(i);
            break;
        }
    }

    public boolean eNC() {
        cgi cgi2 = cgi.getFeatTriggerType(this.EuV.getSelectedItem().toString());
        return Float.parseFloat(this.EuO.getValue().toString()) != this.eyU.aFv || this.eyU.aOG() != cgi2;
    }

    @Override
    public void save() {
        this.eyU.aFv = Float.parseFloat(this.EuO.getValue().toString());
    }

    @Override
    public Element c(Element element, Document document) {
        Element element2 = document.createElement("Counter");
        element2.setAttribute("Value", Integer.toString(Math.round(this.eyU.aFv)));
        element.appendChild(element2);
        return element;
    }

    @Override
    public /* synthetic */ JPanel eNX() {
        return this.eOc();
    }

    static /* synthetic */ JSpinner a(mss mss2) {
        return mss2.EuO;
    }
}

