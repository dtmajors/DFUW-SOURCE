/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.io.IOException;
import javax.swing.JEditorPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class mox
extends mkx {
    Dimension bV = new Dimension(300, 350);

    public mox() {
        super(false);
        this.setClosable(true);
        this.setTitle("-Information-");
        this.setDefaultCloseOperation(2);
        this.eIa();
        this.setPreferredSize(this.bV);
        this.setLayer(-1);
        this.pack();
    }

    private void eIa() {
        JPanel jPanel = new JPanel(new BorderLayout());
        JEditorPane jEditorPane = null;
        String string = "file://localhost/" + lcw.qLb + "xml-files/worldbuilder/buildlog.html";
        try {
            jEditorPane = new JEditorPane(string);
        }
        catch (IOException iOException) {
            return;
        }
        jEditorPane.setEditable(false);
        JScrollPane jScrollPane = new JScrollPane(jEditorPane);
        jPanel.add(jScrollPane);
        this.DGa.add(jPanel);
    }
}

