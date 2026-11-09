/*
 * Decompiled with CFR.
 */
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class lak
extends JPanel {
    private String Name = null;
    protected List lAR = lcn.emv();

    public lak(String string) {
        assert (string != null);
        this.Name = string;
    }

    @Override
    public final String getName() {
        assert (this.Name != null);
        return this.Name;
    }

    public final void a(laj laj2) {
        this.lAR.add(laj2);
    }

    public final List getProperties() {
        return this.lAR;
    }

    public final boolean elv() {
        laj laj2 = null;
        boolean bl = true;
        for (int i2 = 0; i2 < this.lAR.size(); ++i2) {
            laj2 = (laj)this.lAR.get(i2);
            if (laj2.elo()) continue;
            lfn.b(5, "SFXMLPropertyPane", "validatePane() Value of property '" + laj2.getName() + "' is invalid.");
            bl = false;
        }
        return bl;
    }

    protected final void elw() {
        assert (this.lAR != null);
        GridBagLayout gridBagLayout = new GridBagLayout();
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        this.setLayout(gridBagLayout);
        gridBagConstraints.anchor = 18;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new Insets(5, 5, 5, 5);
        laj laj2 = null;
        for (int i2 = 0; i2 < this.lAR.size(); ++i2) {
            laj2 = (laj)this.lAR.get(i2);
            if (laj2.getName().equals("Duration")) {
                gridBagConstraints.fill = 2;
                gridBagConstraints.gridx = 0;
                gridBagConstraints.gridy = i2;
                gridBagConstraints.weightx = 0.0;
                gridBagConstraints.weighty = 0.0;
                this.add((Component)new JLabel(laj2.getName() + " (Infinite = " + -2.0f + ")"), gridBagConstraints);
            } else {
                gridBagConstraints.fill = 2;
                gridBagConstraints.gridx = 0;
                gridBagConstraints.gridy = i2;
                gridBagConstraints.weightx = 0.0;
                gridBagConstraints.weighty = 0.0;
                this.add((Component)new JLabel(laj2.getName()), gridBagConstraints);
            }
            gridBagConstraints.weightx = 1.0;
            gridBagConstraints.weighty = 1.0;
            gridBagConstraints.gridx = 1;
            laj2.a(gridBagConstraints);
            this.add((Component)laj2.getComponent(), gridBagConstraints);
        }
        this.validate();
    }

    protected final laj yz(String string) {
        assert (string != null);
        laj laj2 = null;
        for (int i2 = 0; i2 < this.lAR.size(); ++i2) {
            laj2 = (laj)this.lAR.get(i2);
            if (!laj2.getName().equals(string)) continue;
            return laj2;
        }
        return null;
    }

    protected final int yA(String string) {
        assert (string != null);
        laj laj2 = this.yz(string);
        if (laj2 == null) {
            lfn.b(5, "SFXMLPropertyPane", "getBitmaskValue() Could not find property '" + string + "'");
            assert (false);
            return -1;
        }
        if (laj2.bBb() != 1 && laj2.bBb() != 4) {
            lfn.b(5, "SFXMLPropertyPane", "getBitmaskValue() Property '" + string + "' is not a bitmask property.");
            assert (false);
            return -1;
        }
        return (Integer)laj2.getValue();
    }

    protected final boolean yB(String string) {
        assert (string != null);
        laj laj2 = this.yz(string);
        if (laj2 == null) {
            lfn.b(5, "SFXMLPropertyPane", "getBooleanValue() Could not find property '" + string + "'");
            assert (false);
            return false;
        }
        if (laj2.bBb() != 2) {
            lfn.b(5, "SFXMLPropertyPane", "getBooleanValue() Property '" + string + "' is not a boolean property.");
            assert (false);
            return false;
        }
        return (Boolean)laj2.getValue();
    }

    protected final double yC(String string) {
        assert (string != null);
        laj laj2 = this.yz(string);
        if (laj2 == null) {
            lfn.b(5, "SFXMLPropertyPane", "getDoubleValue() Could not find property '" + string + "'");
            assert (false);
            return 0.0;
        }
        if (laj2.bBb() != 3) {
            lfn.b(5, "SFXMLPropertyPane", "getDoubleValue() Property '" + string + "' is not a double property.");
            assert (false);
            return 0.0;
        }
        return (Double)laj2.getValue();
    }

    protected final float yD(String string) {
        assert (string != null);
        laj laj2 = this.yz(string);
        if (laj2 == null) {
            lfn.b(5, "SFXMLPropertyPane", "getFloatValue() Could not find property '" + string + "'");
            assert (false);
            return 0.0f;
        }
        if (laj2.bBb() != 5) {
            lfn.b(5, "SFXMLPropertyPane", "getFloatValue() Property '" + string + "' is not a float property.");
            assert (false);
            return 0.0f;
        }
        return ((Float)laj2.getValue()).floatValue();
    }

    protected final int yE(String string) {
        assert (string != null);
        laj laj2 = this.yz(string);
        if (laj2 == null) {
            lfn.b(5, "SFXMLPropertyPane", "getIntValue() Could not find property '" + string + "'");
            assert (false);
            return 0;
        }
        if (laj2.bBb() != 6) {
            lfn.b(5, "SFXMLPropertyPane", "getIntValue() Property '" + string + "' is not an int property.");
            assert (false);
            return 0;
        }
        return (Integer)laj2.getValue();
    }

    protected final long yF(String string) {
        assert (string != null);
        laj laj2 = this.yz(string);
        if (laj2 == null) {
            lfn.b(5, "SFXMLPropertyPane", "getLongValue() Could not find property '" + string + "'");
            assert (false);
            return 0L;
        }
        if (laj2.bBb() != 7) {
            lfn.b(5, "SFXMLPropertyPane", "getLongValue() Property '" + string + "' is not a long property.");
            assert (false);
            return 0L;
        }
        return (Long)laj2.getValue();
    }

    protected final lcq yG(String string) {
        assert (string != null);
        laj laj2 = this.yz(string);
        if (laj2 == null) {
            lfn.b(5, "SFXMLPropertyPane", "getSFColorRGBAValue() Could not find property '" + string + "'");
            assert (false);
            return null;
        }
        if (laj2.bBb() != 8) {
            lfn.b(5, "SFXMLPropertyPane", "getSFColorRGBAValue() Property '" + string + "' is not a SFColorRGBA property.");
            assert (false);
            return null;
        }
        return (lcq)laj2.getValue();
    }

    protected final ljq yH(String string) {
        assert (string != null);
        laj laj2 = this.yz(string);
        if (laj2 == null) {
            lfn.b(5, "SFXMLPropertyPane", "getSFVector3Value() Could not find property '" + string + "'");
            assert (false);
            return null;
        }
        if (laj2.bBb() != 9) {
            lfn.b(5, "SFXMLPropertyPane", "getSFVector3Value() Property '" + string + "' is not a SFVector3 property.");
            assert (false);
            return null;
        }
        return (ljq)laj2.getValue();
    }

    protected final ljp yI(String string) {
        assert (string != null);
        laj laj2 = this.yz(string);
        if (laj2 == null) {
            lfn.b(5, "SFXMLPropertyPane", "getSFVector2Value() Could not find property '" + string + "'");
            assert (false);
            return null;
        }
        if (laj2.bBb() != 11) {
            lfn.b(5, "SFXMLPropertyPane", "getSFVector2Value() Property '" + string + "' is not a SFVector2 property.");
            assert (false);
            return null;
        }
        return (ljp)laj2.getValue();
    }

    protected final String yJ(String string) {
        assert (string != null);
        laj laj2 = this.yz(string);
        if (laj2 == null) {
            lfn.b(5, "SFXMLPropertyPane", "getStringValue() Could not find property '" + string + "'");
            assert (false);
            return null;
        }
        if (laj2.bBb() != 10) {
            lfn.b(5, "SFXMLPropertyPane", "getStringValue() Property '" + string + "' is not a string property.");
            assert (false);
            return null;
        }
        return (String)laj2.getValue();
    }

    protected final void e(String string, Object object) {
        assert (string != null);
        assert (object != null);
        laj laj2 = this.yz(string);
        if (laj2 == null) {
            lfn.b(5, "SFXMLPropertyPane", "setPropertyValue() Could not find property '" + string + "'");
            return;
        }
        laj2.setValue(object);
    }
}

