/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
public class bhq
extends bgk {
    @Override
    public void initialize() {
        int n;
        float f2;
        int n2;
        boolean bl;
        float f3;
        float f4;
        float f5;
        int n3;
        super.initialize();
        String string = (String)this.dlm.get("numobjs");
        String string2 = (String)this.dlm.get("updaterate");
        String string3 = (String)this.dlm.get("speed");
        String string4 = (String)this.dlm.get("distance");
        String string5 = (String)this.dlm.get("attachedsensors");
        String string6 = (String)this.dlm.get("numdisctests");
        String string7 = (String)this.dlm.get("sensorradius");
        String string8 = (String)this.dlm.get("numactivetimers");
        if (string == null || string2 == null || string3 == null || string4 == null || string5 == null || string6 == null || string7 == null || string8 == null) {
            this.fw("Required params: numobjs=1 updaterate=0.1 speed=2.0 distance=20 attachedsensors=false numdisctests=0 sensorradius=200.0 numactivetimers=100");
            return;
        }
        try {
            n3 = Integer.parseInt(string);
        }
        catch (NumberFormatException numberFormatException) {
            this.fw("numobjs is not a valid int: " + string);
            return;
        }
        try {
            f5 = Float.parseFloat(string2);
        }
        catch (NumberFormatException numberFormatException) {
            this.fw("updaterate is not a valid float: " + string2);
            return;
        }
        try {
            f4 = Float.parseFloat(string3);
        }
        catch (NumberFormatException numberFormatException) {
            this.fw("speed is not a valid float: " + string3);
            return;
        }
        try {
            f3 = Float.parseFloat(string4);
        }
        catch (NumberFormatException numberFormatException) {
            this.fw("distance is not a valid float: " + string4);
            return;
        }
        if ((double)f3 < 1.0) {
            f3 = 1.0f;
        }
        try {
            bl = Boolean.parseBoolean(string5);
        }
        catch (NumberFormatException numberFormatException) {
            this.fw("attachedsensors is not a valid int: " + string5);
            return;
        }
        try {
            n2 = Integer.parseInt(string6);
        }
        catch (NumberFormatException numberFormatException) {
            this.fw("numdisctests is not a valid int: " + string6);
            return;
        }
        try {
            f2 = Float.parseFloat(string7);
        }
        catch (NumberFormatException numberFormatException) {
            this.fw("sensorradius is not a valid float: " + string7);
            return;
        }
        try {
            n = Integer.parseInt(string8);
        }
        catch (NumberFormatException numberFormatException) {
            this.fw("numactivetimers is not a valid int: " + string8);
            return;
        }
        ldv ldv2 = new ldv(65534, lcr.qCx.enw(), lcr.qCx.enx());
        gqr gqr2 = (gqr)this.MessageDelegator.h(11089, this.getGUID(), ldv2);
        gqr2.ilu = 510;
        gqr2.eRm = f5;
        gqr2.fXV = f4;
        gqr2.jpE = n3;
        gqr2.mB = f3;
        gqr2.jpF = bl;
        gqr2.jpG = n2;
        gqr2.eUj = f2;
        gqr2.jpH = n;
        this.MessageDelegator.F(gqr2);
        this.aoU();
    }
}

