/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dta
 *  gg
 *  lcr
 */
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class bgs
extends bgk {
    public static final String dlF = "cf_configure";
    public static final String dlG = "cf_execute";
    public static final String dlH = "cf_quarantine";
    public static final String dlI = "cf_add";
    public static final String dlJ = "cf_remove";
    public static final String dlK = "cf_replace";
    public static final ldv Ti = new ldv(65533, 1800, 1);
    public static bgh Tq;
    int dlv = 0;
    int dlL = 0;
    private TreeMap<Integer, HashSet<kcd>> dlM = lcn.emG();
    private static final int dlN = -1;
    private static final int dlO = -2;

    private int d(String string, int n, int n2) {
        String string2 = (String)this.dlm.get("percentlow");
        int n3 = -1;
        if (string2 == null) {
            return -2;
        }
        try {
            n3 = Integer.parseInt(string2);
        }
        catch (NumberFormatException numberFormatException) {
            // empty catch block
        }
        if (n3 < n || n3 > n2) {
            this.fw("Invalid value for '" + string + "'");
            return -1;
        }
        return n3;
    }

    @Override
    public void initialize() {
        super.initialize();
        amf amf2 = ((dta)this.MessageDelegator).bzt().d(lcr.hac);
        if (amf2 == null || !(amf2 instanceof gg)) {
            this.fw("Could not find SFGamelogicDistributor");
            return;
        }
        gg gg2 = (gg)amf2;
        gr[] grArray = gg2.hS();
        if (grArray == null) {
            this.fw("Could not get node info array");
            return;
        }
        for (gr object2 : grArray) {
            if (object2 == null || object2.eO == null || !object2.eO.equals("Frontend")) continue;
            ++this.dlL;
        }
        if (this.akV.equalsIgnoreCase(dlF)) {
            boolean bl;
            kcc kcc2;
            String string = (String)this.dlm.get("function");
            if (string == null) {
                this.fw("Required parameter function is missing");
                return;
            }
            String string2 = string;
            boolean bl2 = false;
            int n = -1;
            int n2 = -1;
            int n3 = -1;
            int n4 = -1;
            int n5 = -1;
            int n6 = -1;
            n = this.d("percentlow", 0, 100);
            if (n == -1) {
                return;
            }
            n4 = this.d("percenthigh", 0, 100);
            if (n4 == -1) {
                return;
            }
            n2 = this.d("delayminlow", 0, 86400);
            if (n2 == -1) {
                return;
            }
            n5 = this.d("delayminhigh", 0, 86400);
            if (n5 == -1) {
                return;
            }
            n3 = this.d("delaymaxlow", 0, 86400);
            if (n3 == -1) {
                return;
            }
            n6 = this.d("delaymaxhigh", 0, 86400);
            if (n6 == -1) {
                return;
            }
            if (n != -2) {
                kcc2 = (kcc)this.MessageDelegator.i(273, this.getGUID(), Ti);
                kcc2.ID = "setpercentlow";
                kcc2.akV = "configureclientfunc";
                kcc2.pdY = string2 + ":PercentLow:" + n;
                kcc2.iBr = true;
                this.MessageDelegator.b(kcc2);
                ++this.dlv;
                boolean numberFormatException = true;
            }
            if (n4 != -2) {
                kcc2 = (kcc)this.MessageDelegator.i(273, this.getGUID(), Ti);
                kcc2.ID = "setpercenthigh";
                kcc2.akV = "configureclientfunc";
                kcc2.pdY = string2 + ":PercentHigh:" + n4;
                kcc2.iBr = true;
                this.MessageDelegator.b(kcc2);
                ++this.dlv;
                boolean bl3 = true;
            }
            if (n2 != -2) {
                kcc2 = (kcc)this.MessageDelegator.i(273, this.getGUID(), Ti);
                kcc2.ID = "setdelayminlow";
                kcc2.akV = "configureclientfunc";
                kcc2.pdY = string2 + ":DelayMinLow:" + n2;
                kcc2.iBr = true;
                this.MessageDelegator.b(kcc2);
                ++this.dlv;
                boolean bl4 = true;
            }
            if (n5 != -2) {
                kcc2 = (kcc)this.MessageDelegator.i(273, this.getGUID(), Ti);
                kcc2.ID = "setdelayminhigh";
                kcc2.akV = "configureclientfunc";
                kcc2.pdY = string2 + ":DelayMinHigh:" + n2;
                kcc2.iBr = true;
                this.MessageDelegator.b(kcc2);
                ++this.dlv;
                boolean bl5 = true;
            }
            if (n3 != -2) {
                kcc2 = (kcc)this.MessageDelegator.i(273, this.getGUID(), Ti);
                kcc2.ID = "setdelaymaxlow";
                kcc2.akV = "configureclientfunc";
                kcc2.pdY = string2 + ":DelayMaxLow:" + n3;
                kcc2.iBr = true;
                this.MessageDelegator.b(kcc2);
                ++this.dlv;
                boolean bl6 = true;
            }
            if (n6 != -2) {
                kcc2 = (kcc)this.MessageDelegator.i(273, this.getGUID(), Ti);
                kcc2.ID = "setdelaymaxhigh";
                kcc2.akV = "configureclientfunc";
                kcc2.pdY = string2 + ":DelayMaxHigh:" + n6;
                kcc2.iBr = true;
                this.MessageDelegator.b(kcc2);
                ++this.dlv;
                bl = true;
            }
            if (!bl) {
                kcc2 = (kcc)this.MessageDelegator.i(273, this.getGUID(), Ti);
                kcc2.ID = "querypercent";
                kcc2.akV = "queryclientfunc";
                kcc2.pdY = string2 + ":PercentLow";
                kcc2.iBr = true;
                this.MessageDelegator.b(kcc2);
                ++this.dlv;
                kcc2 = (kcc)this.MessageDelegator.i(273, this.getGUID(), Ti);
                kcc2.ID = "querydelaymin";
                kcc2.akV = "queryclientfunc";
                kcc2.pdY = string2 + ":DelayMinLow";
                kcc2.iBr = true;
                this.MessageDelegator.b(kcc2);
                ++this.dlv;
                kcc2 = (kcc)this.MessageDelegator.i(273, this.getGUID(), Ti);
                kcc2.ID = "querydelaymax";
                kcc2.akV = "queryclientfunc";
                kcc2.pdY = string2 + ":DelayMaxLow";
                kcc2.iBr = true;
                this.MessageDelegator.b(kcc2);
                ++this.dlv;
                kcc2 = (kcc)this.MessageDelegator.i(273, this.getGUID(), Ti);
                kcc2.ID = "querypercent";
                kcc2.akV = "queryclientfunc";
                kcc2.pdY = string2 + ":PercentHigh";
                kcc2.iBr = true;
                this.MessageDelegator.b(kcc2);
                ++this.dlv;
                kcc2 = (kcc)this.MessageDelegator.i(273, this.getGUID(), Ti);
                kcc2.ID = "querydelaymin";
                kcc2.akV = "queryclientfunc";
                kcc2.pdY = string2 + ":DelayMinHigh";
                kcc2.iBr = true;
                this.MessageDelegator.b(kcc2);
                ++this.dlv;
                kcc2 = (kcc)this.MessageDelegator.i(273, this.getGUID(), Ti);
                kcc2.ID = "querydelaymax";
                kcc2.akV = "queryclientfunc";
                kcc2.pdY = string2 + ":DelayMaxHigh";
                kcc2.iBr = true;
                this.MessageDelegator.b(kcc2);
                ++this.dlv;
            }
            this.dlv *= this.dlL;
        } else if (this.akV.equalsIgnoreCase(dlG)) {
            String string = (String)this.dlm.get("function");
            if (string == null) {
                this.fw("Required parameter function is missing");
                return;
            }
            String string3 = string;
            string = (String)this.dlm.get("character");
            if (string == null) {
                this.fw("Required parameter character is missing");
                return;
            }
            String string2 = string;
            ldv ldv2 = Tq.fv(string2);
            if (ldv2 == null) {
                this.fw("Character '" + string2 + "' is not online");
                return;
            }
            int n = Tq.hk(ldv2);
            if (n <= 0) {
                this.fw("Could not find client node id of Character '" + string2 + "'");
                return;
            }
            kcc kcc3 = (kcc)this.MessageDelegator.i(273, this.getGUID(), Ti);
            kcc3.ID = "runclientfunc";
            kcc3.akV = "runclientfunc";
            kcc3.pdY = string3 + ":" + n;
            kcc3.iBr = true;
            this.MessageDelegator.b(kcc3);
            this.dlv += this.dlL;
        } else if (this.akV.equalsIgnoreCase(dlH)) {
            String string = (String)this.dlm.get("disable");
            int n = 0;
            if (string != null) {
                try {
                    n = Integer.parseInt(string);
                }
                catch (NumberFormatException numberFormatException) {
                    // empty catch block
                }
                if (n < 0) {
                    this.fw("Invalid value for 'disable'");
                    return;
                }
                kcc kcc4 = (kcc)this.MessageDelegator.i(273, this.getGUID(), Ti);
                kcc4.ID = "quarantineclient";
                kcc4.akV = "quarantineclient";
                kcc4.pdY = "" + n;
                kcc4.iBr = true;
                this.MessageDelegator.b(kcc4);
                this.dlv += this.dlL;
            }
        } else if (this.akV.equalsIgnoreCase(dlI)) {
            int n;
            int n7;
            int n8;
            int n9;
            int n10;
            int n11;
            int n12;
            String string = (String)this.dlm.get("function");
            if (string == null) {
                this.fw("Required parameter function is missing");
                return;
            }
            String string4 = (String)this.dlm.get("file");
            if (string4 == null) {
                this.fw("Required parameter file is missing");
                return;
            }
            String string3 = (String)this.dlm.get("type");
            if (string3 == null) {
                this.fw("Required parameter type is missing");
                return;
            }
            try {
                n12 = Integer.parseInt(string3);
            }
            catch (NumberFormatException numberFormatException) {
                this.fw("type is not a valid integer");
                return;
            }
            String string5 = (String)this.dlm.get("delayminlow");
            if (string5 == null) {
                this.fw("Required parameter delayminlow is missing");
                return;
            }
            try {
                n11 = Integer.parseInt(string5);
            }
            catch (NumberFormatException numberFormatException) {
                this.fw("delayminlow is not a valid integer");
                return;
            }
            String string6 = (String)this.dlm.get("delayminhigh");
            if (string6 == null) {
                this.fw("Required parameter delayminhigh is missing");
                return;
            }
            try {
                n10 = Integer.parseInt(string6);
            }
            catch (NumberFormatException numberFormatException) {
                this.fw("delayminhigh is not a valid integer");
                return;
            }
            String string7 = (String)this.dlm.get("delaymaxlow");
            if (string7 == null) {
                this.fw("Required parameter delaymaxlow is missing");
                return;
            }
            try {
                n9 = Integer.parseInt(string7);
            }
            catch (NumberFormatException numberFormatException) {
                this.fw("delaymaxlow is not a valid integer");
                return;
            }
            String string8 = (String)this.dlm.get("delaymaxhigh");
            if (string8 == null) {
                this.fw("Required parameter delaymaxhigh is missing");
                return;
            }
            try {
                n8 = Integer.parseInt(string8);
            }
            catch (NumberFormatException numberFormatException) {
                this.fw("delaymaxhigh is not a valid integer");
                return;
            }
            String string9 = (String)this.dlm.get("percentlow");
            if (string9 == null) {
                this.fw("Required parameter percentlow is missing");
                return;
            }
            try {
                n7 = Integer.parseInt(string9);
            }
            catch (NumberFormatException numberFormatException) {
                this.fw("percentlow is not a valid integer");
                return;
            }
            String string10 = (String)this.dlm.get("percenthigh");
            if (string10 == null) {
                this.fw("Required parameter percenthigh is missing");
                return;
            }
            try {
                n = Integer.parseInt(string10);
            }
            catch (NumberFormatException numberFormatException) {
                this.fw("percenthigh is not a valid integer");
                return;
            }
            kcc kcc5 = (kcc)this.MessageDelegator.i(273, this.getGUID(), Ti);
            kcc5.ID = "addfunc";
            kcc5.akV = "addfunc";
            kcc5.pdY = string + ":" + string4 + ":" + n12 + ":" + n7 + ":" + n11 + ":" + n9 + ":" + n + ":" + n10 + ":" + n8;
            kcc5.iBr = true;
            this.MessageDelegator.b(kcc5);
            this.dlv += this.dlL;
        } else if (this.akV.equalsIgnoreCase(dlJ)) {
            String string = (String)this.dlm.get("function");
            if (string == null) {
                this.fw("Required parameter function is missing");
                return;
            }
            kcc kcc5 = (kcc)this.MessageDelegator.i(273, this.getGUID(), Ti);
            kcc5.ID = "removefunc";
            kcc5.akV = "removefunc";
            kcc5.pdY = string;
            kcc5.iBr = true;
            this.MessageDelegator.b(kcc5);
            this.dlv += this.dlL;
        } else if (this.akV.equalsIgnoreCase(dlK)) {
            String string = (String)this.dlm.get("function");
            if (string == null) {
                this.fw("Required parameter function is missing");
                return;
            }
            String string5 = (String)this.dlm.get("file");
            if (string5 == null) {
                this.fw("Required parameter file is missing");
                return;
            }
            kcc kcc6 = (kcc)this.MessageDelegator.i(273, this.getGUID(), Ti);
            kcc6.ID = "replacefunc";
            kcc6.akV = "replacefunc";
            kcc6.pdY = string + ":" + string5;
            kcc6.iBr = true;
            this.MessageDelegator.b(kcc6);
            this.dlv += this.dlL;
        } else {
            this.fw("Unknown command '" + this.akV + "'");
            return;
        }
    }

    @Override
    public void receiveMiddlewareMessage(kcz kcz2) {
        switch (kcz2.getMessageType()) {
            case 274: {
                this.a((kcd)kcz2);
                break;
            }
            default: {
                super.receiveMiddlewareMessage(kcz2);
            }
        }
    }

    private void a(kcd kcd2) {
        --this.dlv;
        HashSet hashSet = this.dlM.get(kcd2.aO().ib());
        if (hashSet == null) {
            hashSet = (HashSet)lcn.emx();
            this.dlM.put(kcd2.aO().ib(), hashSet);
        }
        hashSet.add(kcd2);
        if (this.dlv == 0) {
            if (this.akV.equals(dlF)) {
                this.apb();
            } else if (this.akV.equals(dlG)) {
                this.apc();
            } else if (this.akV.equals(dlH)) {
                this.apc();
            } else if (this.akV.equals(dlI)) {
                this.apc();
            } else if (this.akV.equals(dlJ)) {
                this.apc();
            } else if (this.akV.equals(dlK)) {
                this.apc();
            }
            this.aoU();
        }
    }

    private void apb() {
        TreeMap treeMap = lcn.emG();
        for (Serializable serializable : this.dlM.keySet()) {
            HashSet<kcd> hashSet = this.dlM.get(serializable);
            TreeMap<String, String> treeMap2 = lcn.emG();
            treeMap.put((Integer)serializable, treeMap2);
            treeMap2.put("nodeid", "" + serializable);
            for (kcd kcd2 : hashSet) {
                StringTokenizer stringTokenizer = new StringTokenizer(kcd2.pdZ, ":");
                ArrayList<String> arrayList = lcn.emv();
                while (stringTokenizer.hasMoreTokens()) {
                    arrayList.add(stringTokenizer.nextToken());
                }
                if (arrayList.size() == 3) {
                    treeMap2.put("funcname", (String)arrayList.get(0));
                    treeMap2.put(((String)arrayList.get(1)).toLowerCase(), (String)arrayList.get(2));
                    continue;
                }
                treeMap2.put("response", kcd2.pdZ);
            }
        }
        for (Serializable serializable : treeMap.values()) {
            this.t((Map<String, String>)((Object)serializable));
        }
    }

    private void apc() {
        TreeMap treeMap = lcn.emG();
        for (Serializable serializable : this.dlM.keySet()) {
            HashSet<kcd> hashSet = this.dlM.get(serializable);
            TreeMap<String, String> treeMap2 = lcn.emG();
            treeMap.put((Integer)serializable, treeMap2);
            treeMap2.put("nodeid", "" + serializable);
            for (kcd kcd2 : hashSet) {
                treeMap2.put("result", kcd2.pdZ);
            }
        }
        for (Serializable serializable : treeMap.values()) {
            this.t((Map<String, String>)((Object)serializable));
        }
    }
}

