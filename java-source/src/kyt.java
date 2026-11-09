/*
 * Decompiled with CFR.
 */
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.text.BadLocationException;

public class kyt
extends kyy {
    private int qmV = 0;
    private boolean qmW = false;

    public kyt(kyr kyr2) {
        super(kyr2);
    }

    public int getPortNumber() {
        return this.qmV;
    }

    public void setPortNumber(int n) {
        this.qmV = n;
    }

    public boolean ejA() {
        return this.qmW;
    }

    public void ejB() {
        assert (!this.qmW);
        if (this.qkM.eiZ().a(this)) {
            lfn.b(5, "SFLoggerViewSession", "createSocket() A loggerviewsession is already bound to port " + this.qmV);
            return;
        }
        if (this.qmV < 10000) {
            this.ejF();
        } else {
            this.qkM.eiZ().b(this);
            this.qmW = true;
            this.qkM.b(this);
        }
    }

    @Override
    public String cgO() {
        String string = lfp.acD(this.qmV);
        if (string == null) {
            return "Logger: " + this.qmV;
        }
        return "Logger: " + string;
    }

    public void ejC() {
        String string = "####################################################################################";
        this.h(6, "Separator", string);
        this.h(6, "Separator", string);
        this.h(6, "Separator", string);
    }

    public void xS(boolean bl) {
        if (!this.qnn) {
            return;
        }
        if (bl) {
            this.qnl.repaint();
        } else {
            this.ejV();
        }
    }

    public void ejD() {
        assert (this.qmW);
        if (!this.qkM.eiZ().a(this)) {
            lfn.b(5, "SFLoggerViewSession", "removeSocket() A loggerviewsession is not bound to port " + this.qmV);
            return;
        }
        this.qkM.eiZ().abk(this.qmV);
        this.qmW = false;
        this.qkM.b(this);
    }

    public void ejE() {
        JFileChooser jFileChooser = new JFileChooser();
        jFileChooser.setFileSelectionMode(0);
        jFileChooser.setFileFilter(new kyf());
        jFileChooser.setApproveButtonText("Save");
        jFileChooser.setDialogTitle("Save Log");
        jFileChooser.setCurrentDirectory(new jrw(System.getProperty("user.dir")));
        jFileChooser.setSelectedFile(new jrw(kyj.qjD));
        int n = jFileChooser.showOpenDialog(this.qnl);
        if (n == 0) {
            String string = jFileChooser.getSelectedFile().getParentFile().getAbsolutePath();
            String string2 = jFileChooser.getSelectedFile().getName();
            try {
                String string3 = this.qnl.ejJ().getText(0, this.qnl.ejJ().getLength());
                string3 = this.xP(string3);
                this.an(string + "/" + string2, string3);
            }
            catch (BadLocationException badLocationException) {
                badLocationException.printStackTrace();
            }
        }
    }

    public void ejF() {
        try {
            String string = JOptionPane.showInputDialog(this.qnl, "Select PortNumber", "" + this.qmV);
            if (string == null) {
                return;
            }
            int n = Integer.parseInt(string);
            if (n < 10000) {
                lfn.b(5, "SFLoggerViewSession", "selectPortNumber() PortNumber is invalid. Must be >= 10000");
                return;
            }
            this.abm(n);
        }
        catch (NumberFormatException numberFormatException) {
            lfn.b(5, "SFLoggerViewSession", "selectPortNumber() " + numberFormatException);
        }
    }

    public void ejG() {
        try {
            String string = "Select application to receive debug from";
            Object[] objectArray = lfp.eqy();
            String string2 = (String)JOptionPane.showInputDialog(this.qnl, "Select Reserved PortNumber", string, 3, null, objectArray, objectArray[0]);
            if (string2 == null) {
                return;
            }
            for (int i2 = 0; i2 < objectArray.length; ++i2) {
                if (!((String)objectArray[i2]).equals(string2)) continue;
                int n = lfp.acE(i2);
                if (n < 10000) {
                    lfn.b(5, "SFLoggerViewSession", "selectReservedPortNumber() PortNumber is invalid. Must be >= 10000");
                    return;
                }
                this.abm(n);
                return;
            }
        }
        catch (NumberFormatException numberFormatException) {
            lfn.b(5, "SFLoggerViewSession", "selectReservedPortNumber() " + numberFormatException);
        }
    }

    private void abm(int n) {
        if (this.qkM.eiZ().a(this)) {
            if (this.qmV != n) {
                this.qkM.eiZ().abk(this.qmV);
                this.ejU();
                this.qmV = n;
                this.qkM.eiZ().b(this);
                this.qkM.b(this);
            }
        } else {
            this.qmV = n;
            this.qkM.eiZ().b(this);
            this.qmW = true;
            this.qkM.b(this);
        }
    }

    @Override
    protected kyy ejz() {
        kyt kyt2 = new kyt(this.qkM);
        kyt2.setPortNumber(this.qmV);
        return kyt2;
    }
}

