/*
 * Decompiled with CFR.
 */
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JPanel;

public class mnk
extends mkx {
    mkg DOM;
    JButton DON = new JButton("Clear Log");

    public mnk() {
        super(false);
        this.setPreferredSize(new Dimension(800, 230));
        this.setTitle("Debug Message Log Dialog");
        this.initialize();
        this.setLayer(-1);
        this.pack();
    }

    private void initialize() {
        this.DGa.setLayout(new BorderLayout());
        Vector vector = new Vector();
        this.DOM = new mkg(vector, "Debug Message Log", false);
        this.DGa.add((Component)this.DOM, "Center");
        JPanel jPanel = new JPanel(new FlowLayout(0));
        this.DON.addActionListener(new ActionListener(this){
            final /* synthetic */ mnk DOO;
            {
                this.DOO = mnk2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                this.DOO.aC(actionEvent);
            }
        });
        jPanel.add(this.DON);
        this.DGa.add((Component)jPanel, "South");
    }

    public void aC(ActionEvent actionEvent) {
        this.DOM.clear();
    }

    public void c(gqn gqn2) {
        this.DOM.addItem(gqn2.bWM());
    }

    public void d(haz haz2) {
        this.DOM.addItem(haz2);
    }

    public void CE(String string) {
        this.DOM.addItem(string);
    }
}

