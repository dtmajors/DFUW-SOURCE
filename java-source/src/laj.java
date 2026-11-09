/*
 * Decompiled with CFR.
 */
import java.awt.Color;
import java.awt.GridBagConstraints;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JTextField;

public class laj {
    private duj qoj = null;
    private Object qrm = null;
    private JComponent qrX = null;
    private Color qqH = Color.white;

    public laj(duj duj2, Object object) {
        assert (duj2 != null);
        assert (object != null);
        this.qoj = duj2;
        this.qrm = object;
        this.init();
    }

    public laj(duj duj2, Object object, int[] nArray, String[] stringArray) {
        assert (duj2 != null);
        assert (duj2.bBb() == 1 || duj2.bBb() == 4);
        assert (object != null);
        assert (nArray != null);
        assert (stringArray != null);
        assert (nArray.length == stringArray.length);
        this.qoj = duj2;
        this.qrm = object;
        switch (duj2.bBb()) {
            case 1: {
                kze kze2 = new kze(0, nArray, stringArray, true);
                this.qrX = kze2;
                break;
            }
            case 4: {
                kze kze3 = new kze(0, nArray, stringArray, false);
                this.qrX = kze3;
                break;
            }
        }
    }

    public String getName() {
        return this.qoj.getName();
    }

    public int bBb() {
        return this.qoj.bBb();
    }

    public int bBf() {
        return this.qoj.bBf();
    }

    public Object getValue() {
        return this.qrm;
    }

    public void setValue(Object object) {
        this.qrm = object;
        if (this.qrm == null) {
            // empty if block
        }
        switch (this.qoj.bBb()) {
            case 1: 
            case 4: {
                Integer n = (Integer)object;
                ((kze)this.qrX).abn(n);
                break;
            }
            case 2: {
                ((JCheckBox)this.qrX).setSelected((Boolean)this.qrm);
                break;
            }
            case 3: 
            case 5: 
            case 6: 
            case 7: 
            case 9: 
            case 10: 
            case 11: {
                ((JTextField)this.qrX).setText(this.getStringValue());
                break;
            }
            case 8: {
                assert (this.qrm != null);
                ((kzg)this.qrX).setColor((lcq)this.qrm);
                break;
            }
            default: {
                assert (false);
                break;
            }
        }
    }

    public JComponent getComponent() {
        assert (this.qrX != null);
        return this.qrX;
    }

    public String eln() {
        return this.qrX.getClass().getName() + "@" + Integer.toHexString(this.qrX.hashCode());
    }

    public void a(GridBagConstraints gridBagConstraints) {
        switch (this.qoj.bBb()) {
            case 1: 
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 6: 
            case 7: 
            case 8: 
            case 9: 
            case 11: {
                gridBagConstraints.fill = 0;
                break;
            }
            case 10: {
                gridBagConstraints.fill = 2;
                break;
            }
            default: {
                assert (false);
                break;
            }
        }
    }

    public String getStringValue() {
        switch (this.qoj.bBb()) {
            case 1: 
            case 4: {
                return ((Integer)this.qrm).toString();
            }
            case 2: {
                return ((Boolean)this.qrm).toString();
            }
            case 3: {
                return ((Double)this.qrm).toString();
            }
            case 5: {
                return ((Float)this.qrm).toString();
            }
            case 6: {
                return ((Integer)this.qrm).toString();
            }
            case 7: {
                return ((Long)this.qrm).toString();
            }
            case 8: {
                return ((lcq)this.qrm).toString();
            }
            case 9: {
                return ((ljq)this.qrm).toString();
            }
            case 11: {
                return ((ljp)this.qrm).toString();
            }
            case 10: {
                return (String)this.qrm;
            }
        }
        assert (false);
        return null;
    }

    public boolean elo() {
        assert (this.qoj.bBb() > 0);
        assert (this.qrX != null);
        switch (this.qoj.bBb()) {
            case 1: 
            case 4: {
                return this.elp();
            }
            case 2: {
                JCheckBox jCheckBox = (JCheckBox)this.qrX;
                this.qrm = jCheckBox.isSelected();
                return true;
            }
            case 3: 
            case 5: 
            case 6: 
            case 7: {
                return this.elq();
            }
            case 8: {
                return this.elr();
            }
            case 9: {
                return this.els();
            }
            case 11: {
                return this.elt();
            }
            case 10: {
                return this.elu();
            }
        }
        assert (false);
        return false;
    }

    private void init() {
        assert (this.qoj.bBb() > 0);
        switch (this.qoj.bBb()) {
            case 2: {
                JCheckBox jCheckBox = new JCheckBox("", (boolean)((Boolean)this.qrm));
                this.qrX = jCheckBox;
                break;
            }
            case 3: 
            case 5: 
            case 6: 
            case 7: {
                JTextField jTextField = new JTextField(10);
                jTextField.setBackground(this.qqH);
                jTextField.setEditable(true);
                jTextField.setText(this.getStringValue());
                this.qrX = jTextField;
                break;
            }
            case 8: {
                assert (this.qrm != null);
                kzg kzg2 = new kzg((lcq)this.qrm);
                this.qrX = kzg2;
                break;
            }
            case 9: {
                JTextField jTextField = new JTextField(15);
                jTextField.setBackground(this.qqH);
                jTextField.setEditable(true);
                jTextField.setText(this.getStringValue());
                this.qrX = jTextField;
                break;
            }
            case 11: {
                JTextField jTextField = new JTextField(15);
                jTextField.setBackground(this.qqH);
                jTextField.setEditable(true);
                jTextField.setText(this.getStringValue());
                this.qrX = jTextField;
                break;
            }
            case 10: {
                JTextField jTextField = new JTextField(25);
                jTextField.setBackground(this.qqH);
                jTextField.setEditable(true);
                jTextField.setText(this.getStringValue());
                this.qrX = jTextField;
                break;
            }
            default: {
                assert (false);
                break;
            }
        }
    }

    private boolean elp() {
        kze kze2 = (kze)this.qrX;
        this.qrm = new Integer(kze2.ekb());
        return true;
    }

    private boolean elq() {
        assert (this.qoj.bBf() == 1 || this.qoj.bBf() == 2 || this.qoj.bBf() == 3);
        assert (this.qrX instanceof JTextField) : this.qrX;
        JTextField jTextField = (JTextField)this.qrX;
        String string = jTextField.getText();
        if (string == null || string.trim().equals("")) {
            return false;
        }
        switch (this.qoj.bBb()) {
            case 3: {
                return this.yv(string);
            }
            case 5: {
                return this.yw(string);
            }
            case 6: {
                return this.yx(string);
            }
            case 7: {
                return this.yy(string);
            }
        }
        assert (false);
        return false;
    }

    private boolean yv(String string) {
        assert (this.qoj.bBb() == 3);
        assert (string != null);
        try {
            double d2 = Double.parseDouble(string);
            switch (this.qoj.bBf()) {
                case 1: {
                    this.qrm = new Double(d2);
                    return true;
                }
                case 2: {
                    if (d2 < 0.0) {
                        return false;
                    }
                    this.qrm = new Double(d2);
                    return true;
                }
                case 3: {
                    if (d2 <= 0.0) {
                        return false;
                    }
                    this.qrm = new Double(d2);
                    return true;
                }
            }
            assert (false);
            return false;
        }
        catch (Exception exception) {
            return false;
        }
    }

    private boolean yw(String string) {
        assert (this.qoj.bBb() == 5);
        assert (string != null);
        try {
            float f2 = Float.parseFloat(string);
            switch (this.qoj.bBf()) {
                case 1: {
                    this.qrm = new Float(f2);
                    return true;
                }
                case 2: {
                    if (f2 < 0.0f) {
                        return false;
                    }
                    this.qrm = new Float(f2);
                    return true;
                }
                case 3: {
                    if (f2 <= 0.0f) {
                        return false;
                    }
                    this.qrm = new Float(f2);
                    return true;
                }
            }
            assert (false);
            return false;
        }
        catch (Exception exception) {
            return false;
        }
    }

    private boolean yx(String string) {
        assert (this.qoj.bBb() == 6);
        assert (string != null);
        try {
            int n = Integer.parseInt(string);
            switch (this.qoj.bBf()) {
                case 1: {
                    this.qrm = new Integer(n);
                    return true;
                }
                case 2: {
                    if (n < 0) {
                        return false;
                    }
                    this.qrm = new Integer(n);
                    return true;
                }
                case 3: {
                    if (n <= 0) {
                        return false;
                    }
                    this.qrm = new Integer(n);
                    return true;
                }
            }
            assert (false);
            return false;
        }
        catch (Exception exception) {
            return false;
        }
    }

    private boolean yy(String string) {
        assert (this.qoj.bBb() == 7);
        assert (string != null);
        try {
            long l2 = Long.parseLong(string);
            switch (this.qoj.bBf()) {
                case 1: {
                    this.qrm = new Long(l2);
                    return true;
                }
                case 2: {
                    if (l2 < 0L) {
                        return false;
                    }
                    this.qrm = new Long(l2);
                    return true;
                }
                case 3: {
                    if (l2 <= 0L) {
                        return false;
                    }
                    this.qrm = new Long(l2);
                    return true;
                }
            }
            assert (false);
            return false;
        }
        catch (Exception exception) {
            return false;
        }
    }

    private boolean elr() {
        kzg kzg2 = (kzg)this.qrX;
        this.qrm = kzg2.getColor();
        return true;
    }

    private boolean els() {
        assert (this.qrX instanceof JTextField) : this.qrX;
        JTextField jTextField = (JTextField)this.qrX;
        String string = jTextField.getText();
        if (string == null || string.trim().equals("")) {
            if (this.qoj.bBf() == 1) {
                this.qrm = null;
                return true;
            }
            return false;
        }
        ljq ljq2 = ljq.Au(string);
        if (ljq2 == null) {
            return false;
        }
        this.qrm = ljq2;
        return true;
    }

    private boolean elt() {
        assert (this.qrX instanceof JTextField) : this.qrX;
        JTextField jTextField = (JTextField)this.qrX;
        String string = jTextField.getText();
        if (string == null || string.trim().equals("")) {
            if (this.qoj.bBf() == 1) {
                this.qrm = null;
                return true;
            }
            return false;
        }
        ljp ljp2 = ljp.As(string);
        if (ljp2 == null) {
            return false;
        }
        this.qrm = ljp2;
        return true;
    }

    private boolean elu() {
        assert (this.qrX instanceof JTextField) : this.qrX;
        JTextField jTextField = (JTextField)this.qrX;
        String string = jTextField.getText();
        if (string == null || string.trim().equals("")) {
            if (this.qoj.bBf() == 1) {
                this.qrm = null;
                return true;
            }
            return false;
        }
        this.qrm = string;
        return true;
    }
}

