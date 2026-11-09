/*
 * Decompiled with CFR.
 */
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Rectangle;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;

public class kyx
extends JPanel {
    private kyy qlY = null;
    private JTextPane qnh = null;
    private kye qni = null;
    private JScrollPane qnj = null;
    private Style[] qnk = null;

    public kyx(kyy kyy2) {
        this.qlY = kyy2;
        this.init();
    }

    public kyy ejH() {
        return this.qlY;
    }

    public JTextPane ejI() {
        return this.qnh;
    }

    public kye ejJ() {
        return this.qni;
    }

    public void ejK() {
        try {
            this.qni.replace(0, this.qni.getLength(), "", null);
        }
        catch (BadLocationException badLocationException) {
            badLocationException.printStackTrace();
        }
    }

    public void b(kyg kyg2) {
        if (this.qlY.eiD() > kyg2.eiD()) {
            return;
        }
        if (this.qlY.ejS()) {
            this.qni.a(kyg2.eiH() + "    ", this.qnk[8]);
        }
        if (this.qlY.ejT() || this.qlY.ejR()) {
            if (this.qlY.ejT()) {
                this.qni.a(kyg2.eiE(), this.qnk[7]);
            }
            if (this.qlY.ejR()) {
                this.qni.a("  " + kyg2.eiF(), this.qnk[7]);
            }
            this.qni.a("  ", this.qnk[7]);
        }
        this.qni.a("(" + lfn.rkl[kyg2.eiD()] + ")  ", this.qnk[kyg2.eiD()]);
        this.qni.a(kyg2.eiG(), this.qnk[kyg2.eiD()]);
        this.qni.a(this.qnk[kyg2.eiD()]);
    }

    public void ejL() {
        this.qni.a(this.qnk[0]);
        this.qni.abi(this.qni.getLength());
        if (this.qlY.ejQ()) {
            this.qnh.scrollRectToVisible(new Rectangle(0, this.qni.getLength(), this.qnj.getViewport().getWidth(), this.qnj.getViewport().getHeight()));
        }
    }

    private void ejM() {
        Style style;
        this.qnk = new Style[9];
        this.qnk[7] = style = StyleContext.getDefaultStyleContext().getStyle("default");
        kyi kyi2 = this.qlY.ejN().eja();
        Style style2 = this.qnh.addStyle("DebugStyle", style);
        StyleConstants.setForeground(style2, kyi2.qjf);
        StyleConstants.setFontSize(style2, 12);
        this.qnk[0] = style2;
        Style style3 = this.qnh.addStyle("VerboseStyle", style);
        StyleConstants.setForeground(style3, kyi2.qjg);
        StyleConstants.setFontSize(style3, 12);
        this.qnk[1] = style3;
        Style style4 = this.qnh.addStyle("InfoStyle", style);
        StyleConstants.setForeground(style4, kyi2.qjh);
        StyleConstants.setFontSize(style4, 12);
        this.qnk[2] = style4;
        Style style5 = this.qnh.addStyle("NoticeStyle", style);
        StyleConstants.setForeground(style5, kyi2.qji);
        StyleConstants.setFontSize(style5, 12);
        this.qnk[3] = style5;
        Style style6 = this.qnh.addStyle("WarningStyle", style);
        StyleConstants.setForeground(style6, kyi2.qjj);
        StyleConstants.setFontSize(style6, 12);
        this.qnk[4] = style6;
        Style style7 = this.qnh.addStyle("ErrorStyle", style);
        StyleConstants.setForeground(style7, kyi2.qjk);
        StyleConstants.setFontSize(style7, 12);
        this.qnk[5] = style7;
        Style style8 = this.qnh.addStyle("FatalStyle", style);
        StyleConstants.setForeground(style8, kyi2.qjl);
        StyleConstants.setFontSize(style8, 12);
        this.qnk[6] = style8;
        Style style9 = this.qnh.addStyle("LineNumberStyle", style);
        StyleConstants.setForeground(style9, kyi2.qjn);
        StyleConstants.setFontSize(style9, 12);
        this.qnk[8] = style9;
    }

    private void init() {
        this.setBackground(this.qlY.ejN().eja().qjm);
        this.qnh = new JTextPane();
        this.qnh.setBackground(this.qlY.ejN().eja().qjo);
        this.qni = new kye();
        this.qnh.setDocument(this.qni);
        this.qnj = new JScrollPane(this.qnh);
        this.ejM();
        this.qnj.setVerticalScrollBarPolicy(20);
        this.qnj.setHorizontalScrollBarPolicy(30);
        this.qnj.setPreferredSize(new Dimension(500, 400));
        this.qnj.setMinimumSize(new Dimension(300, 300));
        GridBagLayout gridBagLayout = new GridBagLayout();
        this.setLayout(gridBagLayout);
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.anchor = 18;
        gridBagConstraints.fill = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new Insets(10, 10, 10, 10);
        gridBagLayout.setConstraints(this.qnj, gridBagConstraints);
        this.add(this.qnj);
    }
}

