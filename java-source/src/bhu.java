/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 *  lcw
 */
import java.sql.Timestamp;
import java.util.Map;

public class bhu
extends bgk {
    private boolean dmp = false;

    @Override
    public void initialize() {
        this.dmp = Boolean.parseBoolean((String)this.dlm.get("SendToDatabase"));
        String string = (String)this.dlm.get("GUID");
        if (string != null) {
            ldv ldv2 = null;
            ldv2 = ldv.zq(string);
            if (ldv2 == null) {
                try {
                    ldv2 = ldv.aw(Long.parseLong(string));
                }
                catch (NumberFormatException numberFormatException) {
                    this.fw("Could Not Parse 'GUID' Parameter, '" + string + "'!!!... Parameter must be in either the string-format (E.g. '[NodeID,ObjectSpaceID,ObjectID]'), or the single integer long-format (E.g. '123456790987654321')!!!");
                    return;
                }
                if (!(ldv.acf(ldv2.ib()) && ldv.acg(ldv2.enw()) && ldv.ach(ldv2.enx()))) {
                    ldv2 = null;
                }
            }
            if (ldv2 == null) {
                this.fw("Could Not Parse 'GUID' Parameter, '" + string + "'!!!... Parameter must be in either the string-format (E.g. '[NodeID,ObjectSpaceID,ObjectID]'), or the single integer long-format (E.g. '123456790987654321')!!!");
                return;
            }
            if (!this.hy(ldv2)) {
                this.fw("GUID, '" + ldv2 + "', is Not from a Recognised Java Server-Node... Only Java Objects Can Respond to this Query!!!");
                return;
            }
            this.hz(ldv2);
            return;
        }
        String string2 = (String)this.dlm.get("NodeID");
        String string3 = (String)this.dlm.get("ObjectSpaceID");
        String string4 = (String)this.dlm.get("ObjectID");
        if (string2 != null && string3 != null && string4 != null) {
            int n = -1;
            int n2 = -1;
            int n3 = -1;
            try {
                n = Integer.parseInt(string2);
            }
            catch (NumberFormatException numberFormatException) {
                this.fw("Could Not Parse 'NodeID' Parameter, '" + string2 + "'!!!... Node ID must be a single integer value!!!");
                return;
            }
            try {
                n2 = Integer.parseInt(string3);
            }
            catch (NumberFormatException numberFormatException) {
                this.fw("Could Not Parse 'ObjectSpaceID' Parameter, '" + string3 + "'!!!... Object-Space ID must be a single integer value!!!");
                return;
            }
            try {
                n3 = Integer.parseInt(string4);
            }
            catch (NumberFormatException numberFormatException) {
                this.fw("Could Not Parse 'ObjectID' Parameter, '" + string4 + "'!!!... Object ID must be a single integer value!!!");
                return;
            }
            if (!ldv.M(n, n2, n3)) {
                if (!ldv.acf(n)) {
                    this.fw("Node ID, '" + n + "', is invalid!!!");
                    return;
                }
                if (!ldv.acg(n2)) {
                    this.fw("Object-Space ID, '" + n2 + "', is invalid!!!");
                    return;
                }
                if (!ldv.ach(n3)) {
                    this.fw("Object ID, '" + n3 + ", is invalid!!!");
                    return;
                }
                this.fw("Component Parameters, [" + n + "," + n2 + "," + n3 + "], are Invalid!!!");
                return;
            }
            ldv ldv3 = new ldv(n, n2, n3);
            if (!this.hy(ldv3)) {
                this.fw("GUID, '" + ldv3 + "', is Not from a Recognised Java Server-Node... Only Java Objects Can Respond to this Query!!!");
                return;
            }
            this.hz(ldv3);
            return;
        }
        if (string2 != null || string3 != null || string4 != null) {
            String string5 = "";
            if (string2 == null) {
                string5 = string5 + "'NodeID'";
            }
            if (string3 == null) {
                string5 = string5 + (string5.isEmpty() ? "" : " AND ") + "'ObjectSpaceID'";
            }
            if (string4 == null) {
                string5 = string5 + (string5.isEmpty() ? "" : " AND ") + "'ObjectID'";
            }
            this.fw("Parameters Missing!!!... Command parameters must include " + string5);
            return;
        }
        this.fw("Parameters Missing!!!... Command must be issued with EITHER a single 'GUID' parameter (string or long format) OR 3 component-integer parameters 'NodeID', 'ObjectSpaceID' and 'ObjectID'!!!");
    }

    private static String aD(String string) {
        if (string == null || string.trim().isEmpty()) {
            return string;
        }
        StringBuffer stringBuffer = new StringBuffer();
        char[] cArray = string.trim().toCharArray();
        block3: for (int i = 0; i < cArray.length; ++i) {
            switch (cArray[i]) {
                case '\"': 
                case '\'': 
                case '\\': {
                    stringBuffer.append("\\" + cArray[i]);
                    continue block3;
                }
                default: {
                    stringBuffer.append(cArray[i]);
                }
            }
        }
        return "'" + stringBuffer.toString() + "'";
    }

    private boolean hy(ldv ldv2) {
        if (ldv2 == null) {
            return false;
        }
        if (ldv2.ib() == lcr.qEo.ib()) {
            return true;
        }
        if (ldv2.ib() == lcr.qEl.ib()) {
            return true;
        }
        if (ldv2.ib() == lcr.hac.ib()) {
            return true;
        }
        if (ldv2.ib() >= 300 && ldv2.ib() <= 399) {
            return true;
        }
        return ldv2.ib() >= 1024 && ldv2.ib() <= 65500;
    }

    private void hz(ldv ldv2) {
        fyd fyd2 = (fyd)this.MessageDelegator.h(28929, this.GUID, ldv2);
        fyd2.jM(true);
        this.MessageDelegator.F(fyd2);
    }

    private void fz(String string) {
        kdj kdj2 = (kdj)this.MessageDelegator.i(259, this.GUID, cbk.eju);
        kdj2.wA("Darkfall");
        kdj2.wB(string);
        this.MessageDelegator.b(kdj2);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 28930: {
                this.a((fye)dxq2);
                break;
            }
            case 11034: {
                this.f((gre)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    @Override
    public void receiveMiddlewareMessage(kcz kcz2) {
        switch (kcz2.getMessageType()) {
            case 270: {
                this.b((kcs)kcz2);
                break;
            }
            default: {
                super.receiveMiddlewareMessage(kcz2);
            }
        }
    }

    private void a(fye fye2) {
        Object object;
        if (this.dmp) {
            object = "INSERT INTO performance_audit_object VALUES(" + Integer.toString(lcw.qGe) + ", " + Integer.toString(lcw.qGf) + ", " + "'" + new Timestamp(this.MessageDelegator.bzy().getTimeInMillis()) + "'" + ", " + fye2.aO().eny() + ", " + bhu.aD(fye2.getClassName()) + ", " + (fye2.aHL() ? "1" : "0") + ", " + (fye2.aHM() ? "1" : "0") + ", " + bhu.aD(fye2.aHK()) + ")";
            this.fz((String)object);
        }
        object = lcn.emw();
        object.put("Object", fye2.aO().toString());
        object.put("Class", fye2.getClassName());
        object.put("SFLogicObject", Boolean.toString(fye2.aHL()));
        object.put("SFRunnableLogicObject", Boolean.toString(fye2.aHM()));
        object.put("Object.toString()", fye2.aHK());
        this.t((Map<String, String>)object);
        this.aoU();
    }

    private void f(gre gre2) {
        Map<String, String> map = lcn.emw();
        map.put("Result", "No SFObject With a GUID of " + gre2.bWU() + " Exists!!!");
        this.t(map);
        this.aoU();
    }

    private void b(kcs kcs2) {
        Map<String, String> map = lcn.emw();
        map.put("Result", "No SFObject With a GUID of " + kcs2.hsQ + " Exists!!!");
        this.t(map);
        this.aoU();
    }
}

