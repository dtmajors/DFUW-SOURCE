/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 *  lcw
 */
import java.sql.Timestamp;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class bgo
extends bgk {
    private cbk.a dlp = cbk.a.ejv;
    private cbk.b dlq = cbk.b.ejB;
    private boolean dlr = false;
    private Queue<ldv> dls = null;
    private int dlt = 0;
    private int dlu = 0;
    private int dlv = 0;
    private Map<Integer, lfs<Integer, Set<fya>>> dlw = null;
    private List<String> dlx = null;
    private int dly = 0;
    private int dlz = 0;
    private int dlA = 0;
    private fya[] dlB = null;
    private Queue<kdj> dlC = null;
    private int dlD = 0;

    @Override
    public void initialize() {
        Object object;
        String string = (String)this.dlm.get("DoIt");
        String string2 = (String)this.dlm.get("ServerName");
        String string3 = (String)this.dlm.get("NodeID");
        String string4 = (String)this.dlm.get("ObjectSpaceID");
        String string5 = (String)this.dlm.get("Detail");
        String string6 = (String)this.dlm.get("ShowFailures");
        String string7 = (String)this.dlm.get("OutputTarget");
        try {
            this.dlp = cbk.a.getValueByOrdinal(Integer.parseInt(string5));
        }
        catch (NumberFormatException numberFormatException) {
            this.dlp = cbk.a.getValueByName(string5);
        }
        try {
            this.dlq = cbk.b.getValueByOrdinal(Integer.parseInt(string7));
        }
        catch (NumberFormatException numberFormatException) {
            this.dlq = cbk.b.getValueByName(string7);
        }
        if (string6 != null) {
            this.dlr = Boolean.parseBoolean(string6);
        }
        if (string2 != null) {
            object = null;
            if (string2.compareToIgnoreCase("WebGate") == 0) {
                object = lcr.qEo;
            } else if (string2.compareToIgnoreCase("Stats Server") == 0) {
                object = lcr.qEl;
            } else if (string2.compareToIgnoreCase("Gamelogic Distributor") == 0) {
                object = new ldv(lcr.hac.ib(), 0, 0);
            } else if (string2.toLowerCase().startsWith("gamelogic")) {
                String string8 = string2.toLowerCase().replace("gamelogic", "").trim();
                if (string8.compareToIgnoreCase("All") == 0) {
                    this.dls = lcn.emA();
                    for (int i = 300; i <= 399; ++i) {
                        this.dls.add(new ldv(i, 0, 0));
                    }
                    this.hu(this.dls.poll());
                    return;
                }
                int n = -1;
                try {
                    n = Integer.parseInt(string8) - 1;
                }
                catch (NumberFormatException numberFormatException) {
                    this.fw("Could Not Parse Gamelogic Server Number from Server Name Parameter!!!... Parameter = " + string2 + ", Gamelogic Node Number = " + string8);
                    return;
                }
                int n2 = 300 + n;
                if (n2 < 300 || n2 > 399) {
                    this.fw("Gamelogic Server Node ID, '" + n2 + "', is Out-of-Range!!!... Minimum Gamelogic Server Node ID = " + 300 + ", Maximum Gamelogic Server Node ID = " + 399);
                    return;
                }
                object = new ldv(n2, 0, 0);
            } else {
                this.fw("Unrecognised Server Name, '" + string2 + "'!!!... Known Server Names Are: 'WebGate', 'Stats Server', 'Gamelogic Distributor' or 'GamelogicX' (where 'X' is the number of the individual game-logic server, or 'All' to audit all game-logic servers collectively)");
                return;
            }
            this.hu((ldv)object);
            return;
        }
        if (string3 != null) {
            int n = -1;
            try {
                n = Integer.parseInt(string3);
            }
            catch (NumberFormatException numberFormatException) {
                this.fw("Could Not Parse 'NodeID' Parameter!!!... Parameter = " + string3);
                return;
            }
            int n3 = 0;
            if (string4 != null) {
                try {
                    n3 = Integer.parseInt(string4);
                }
                catch (NumberFormatException numberFormatException) {
                    this.fw("Could Not Parse 'ObjectSpaceID' Parameter!!!... Parameter = " + string4);
                    return;
                }
            }
            ldv ldv2 = new ldv(n, n3, 0);
            this.hu(ldv2);
            return;
        }
        if (string != null && Boolean.parseBoolean(string)) {
            this.dls = lcn.emA();
            this.dls.add(lcr.qEo);
            this.dls.add(lcr.qEl);
            this.dls.add(new ldv(lcr.hac.ib(), 0, 0));
            for (int i = 300; i <= 399; ++i) {
                this.dls.add(new ldv(i, 0, 0));
            }
            this.hu(this.dls.poll());
            return;
        }
        object = lcn.emw();
        object.put("1. Result:", "Missing Parameters!!!");
        object.put("2. Parameters (Option 1):", "DoIt='True' :: Audits All Server Nodes and All Their Object-Spaces");
        object.put("3. Parameters (Option 2):", "ServerName :: Name of Server to Aduit All Object-Spaces of ('WebGate', 'Stats Server', 'Gamelogic Distributor' or 'GamelogicX'... Where 'X' is Gamelogic Server Number, or 'All')");
        object.put("4. Parameters (Option 3):", "NodeID :: ID of the Node to Audit All the Object-Spaces of");
        object.put("5. Parameters (Option 4):", "NodeID & ObjectSpaceID :: IDs of the Node and Object-Space to Audit");
        object.put("6. Parameters (Optional):", "Detail :: The Amount of Detail to Include in the Audit as String ('Overview', 'Medium' or 'Full') or Ordinal (0, 1 or 2)... Default: 'Overview' (0)");
        object.put("7. Parameters (Optional):", "ShowFailures :: [True|False] Indicates if Audit Requests that Failed to be Sent Should be Detailed or Not... Default: 'False'");
        object.put("8. Parameters (Optional):", "OutputTarget :: Where Audit Results Should be Sent... 'Log' is Here Only, 'LogAndDatabase' is Here and Database Tables, 'Database' is Database Tables Only... Default: 'Log'");
        object.put("9. Information:", "'Overview' Audits Contain Simple Object Counts... 'Medium' Audits Contain Additional Instance Frequencies for Each Class... 'Full' Audits Also Contain Complete Per-Instance Details");
        this.t((Map<String, String>)object);
        this.aoU();
    }

    private void aoW() {
        if (this.dls != null && !this.dls.isEmpty()) {
            this.hu(this.dls.poll());
        }
        if (this.dlt + this.dlu == this.dlv) {
            this.aoX();
            switch (this.dlq) {
                case ejD: {
                    this.aoZ();
                    Map<String, String> map = lcn.emw();
                    map.put("Result:", (this.dlB == null ? "0" : Integer.toString(this.dlB.length)) + " response values sent to the database");
                    this.t(map);
                    break;
                }
                case ejC: {
                    this.aoZ();
                    this.aoY();
                    break;
                }
                default: {
                    this.aoY();
                }
            }
            if (this.dlC == null || this.dlC.isEmpty()) {
                this.aoU();
            }
        }
    }

    @Override
    public void doTick(ldz ldz2) {
        super.doTick(ldz2);
        if (this.dlC != null && !this.dlC.isEmpty()) {
            --this.dlD;
            if (this.dlD <= 0) {
                this.dlD = 5;
                this.MessageDelegator.b(this.dlC.poll());
                if (this.dlC.isEmpty()) {
                    this.aoU();
                }
            }
        }
    }

    private void aoX() {
        Object object;
        int n;
        Set<fya> set = lcn.emx();
        for (Map.Entry<Integer, lfs<Integer, Set<fya>>> entry : this.dlw.entrySet()) {
            int n2;
            int n3;
            if ((Integer)entry.getValue().reX == 1) {
                set.addAll((Collection)entry.getValue().reY);
                continue;
            }
            fya[] fyaArray = ((Set)entry.getValue().reY).toArray(new fya[((Set)entry.getValue().reY).size()]);
            if (fyaArray[0].bSO() != null) {
                Object object2;
                n = 0;
                for (n3 = 0; n3 < fyaArray.length; ++n3) {
                    n += fyaArray[n3].bSO().aHJ() == null ? 0 : fyaArray[n3].bSO().aHJ().length;
                }
                n3 = 0;
                object = new cbn[n];
                for (int i = 0; i < fyaArray.length; ++i) {
                    if (fyaArray[i].bSO().aHJ() == null) continue;
                    for (n2 = 0; n2 < fyaArray[i].bSO().aHJ().length; ++n2) {
                        object[n3++] = fyaArray[i].bSO().aHJ()[n2];
                    }
                }
                Map<Integer, cbn[]> map = lcn.emw();
                for (n2 = 0; n2 < ((cbn[])object).length; ++n2) {
                    object2 = (cbn[])map.get(((cbn)object[n2]).aHN());
                    if (object2 == null) {
                        object2 = lcn.emx();
                        map.put(((cbn)object[n2]).aHN(), (cbn[])object2);
                    }
                    object2.add(object[n2]);
                }
                if (map.size() != ((Object[])object).length) {
                    n2 = 0;
                    object2 = new cbn[map.size()];
                    for (Map.Entry entry2 : map.entrySet()) {
                        int n4;
                        cbn[] cbnArray = ((Set)entry2.getValue()).toArray(new cbn[((Set)entry2.getValue()).size()]);
                        int n5 = 0;
                        int n6 = 0;
                        for (n4 = 0; n4 < cbnArray.length; ++n4) {
                            n5 += cbnArray[n4].aHQ() == null ? 0 : cbnArray[n4].aHQ().length;
                            n6 += cbnArray[n4].aHP() == null ? 0 : cbnArray[n4].aHP().length;
                        }
                        n4 = 0;
                        int n7 = 0;
                        cbm[] cbmArray = new cbm[n5];
                        String[] stringArray = new String[n6];
                        int[] nArray = new int[n6];
                        for (int i = 0; i < cbnArray.length; ++i) {
                            int n8;
                            if (cbnArray[i].aHQ() != null) {
                                for (n8 = 0; n8 < cbnArray[i].aHQ().length; ++n8) {
                                    cbmArray[n4++] = cbnArray[i].aHQ()[n8];
                                }
                            }
                            if (cbnArray[i].aHP() == null) continue;
                            for (n8 = 0; n8 < cbnArray[i].aHP().length; ++n8) {
                                stringArray[n7] = cbnArray[i].aHP()[n8];
                                nArray[n7] = cbnArray[i].aHO()[n8];
                                ++n7;
                            }
                        }
                        cbnArray[0].a(cbmArray);
                        cbnArray[0].l(stringArray);
                        cbnArray[0].x(nArray);
                        object2[n2++] = cbnArray[0];
                    }
                    object = object2;
                }
                fyaArray[0].bSO().a((cbn[])object);
                set.add(fyaArray[0]);
                continue;
            }
            if (fyaArray[0].bSP() == null) continue;
            if (fyaArray[0].bSP().aHN() > this.dlz) {
                this.dlz = fyaArray[0].bSP().aHN();
            }
            n = 0;
            for (n3 = 0; n3 < fyaArray.length; ++n3) {
                n += fyaArray[n3].bSP().aHQ() == null ? 0 : fyaArray[n3].bSP().aHQ().length;
            }
            n3 = 0;
            object = new cbm[n];
            for (int i = 0; i < fyaArray.length; ++i) {
                if (fyaArray[i].bSP().aHQ() == null) continue;
                for (n2 = 0; n2 < fyaArray[i].bSP().aHQ().length; ++n2) {
                    object[n3++] = fyaArray[i].bSP().aHQ()[n2];
                }
            }
            fyaArray[0].bSP().a((cbm[])object);
            set.add(fyaArray[0]);
        }
        this.dlB = set.toArray(new fya[set.size()]);
        int n9 = this.dlB.length - 1;
        boolean bl = false;
        while (!bl) {
            bl = true;
            for (int i = 0; i < n9; ++i) {
                n = 0;
                if (this.dlB[i].bSN() > this.dlB[i + 1].bSN()) {
                    n = 1;
                } else if (this.dlB[i].bSN() == this.dlB[i + 1].bSN()) {
                    int n10 = n = this.dlB[i].bIJ() > this.dlB[i + 1].bIJ() ? 1 : 0;
                }
                if (n == 0) continue;
                fya fya2 = this.dlB[i];
                this.dlB[i] = this.dlB[i + 1];
                this.dlB[i + 1] = fya2;
                bl = false;
            }
            --n9;
        }
        if (this.dlB.length > 0) {
            this.dly = this.dlB[this.dlB.length - 1].bSN();
        }
        for (int i = 0; i < this.dlB.length; ++i) {
            if (this.dlB[i].bSO() != null) {
                if (this.dlB[i].bSO().aHJ() == null) continue;
                bl = false;
                n9 = this.dlB[i].bSO().aHJ().length - 1;
                while (!bl) {
                    bl = true;
                    for (n = 0; n < n9; ++n) {
                        if (this.dlB[i].bSO().aHJ()[n].aHN() <= this.dlB[i].bSO().aHJ()[n + 1].aHN()) continue;
                        cbn cbn2 = this.dlB[i].bSO().aHJ()[n];
                        this.dlB[i].bSO().aHJ()[n] = this.dlB[i].bSO().aHJ()[n + 1];
                        this.dlB[i].bSO().aHJ()[n + 1] = cbn2;
                        bl = false;
                    }
                    --n9;
                }
                if (this.dlB[i].bSO().aHJ().length > 0 && this.dlB[i].bSO().aHJ()[this.dlB[i].bSO().aHJ().length - 1].aHN() > this.dlz) {
                    this.dlz = this.dlB[i].bSO().aHJ()[this.dlB[i].bSO().aHJ().length - 1].aHN();
                }
                for (n = 0; n < this.dlB[i].bSO().aHJ().length; ++n) {
                    if (this.dlB[i].bSO().aHJ()[n].aHQ() == null) continue;
                    bl = false;
                    n9 = this.dlB[i].bSO().aHJ()[n].aHQ().length - 1;
                    while (!bl) {
                        bl = true;
                        for (int j = 0; j < n9; ++j) {
                            if (this.dlB[i].bSO().aHJ()[n].aHQ()[j].getGUID().enx() <= this.dlB[i].bSO().aHJ()[n].aHQ()[j + 1].getGUID().enx()) continue;
                            object = this.dlB[i].bSO().aHJ()[n].aHQ()[j];
                            this.dlB[i].bSO().aHJ()[n].aHQ()[j] = this.dlB[i].bSO().aHJ()[n].aHQ()[j + 1];
                            this.dlB[i].bSO().aHJ()[n].aHQ()[j + 1] = object;
                            bl = false;
                        }
                        --n9;
                    }
                    if (this.dlB[i].bSO().aHJ()[n].aHQ().length <= 0 || this.dlB[i].bSO().aHJ()[n].aHQ()[this.dlB[i].bSO().aHJ()[n].aHQ().length - 1].getGUID().enx() <= this.dlA) continue;
                    this.dlA = this.dlB[i].bSO().aHJ()[n].aHQ()[this.dlB[i].bSO().aHJ()[n].aHQ().length - 1].getGUID().enx();
                }
                continue;
            }
            if (this.dlB[i].bSP() == null) continue;
            if (this.dlB[i].bSP().aHQ() != null) {
                bl = false;
                n9 = this.dlB[i].bSP().aHQ().length - 1;
                while (!bl) {
                    bl = true;
                    for (n = 0; n < n9; ++n) {
                        if (this.dlB[i].bSP().aHQ()[n].getGUID().enx() <= this.dlB[i].bSP().aHQ()[n + 1].getGUID().enx()) continue;
                        cbm cbm2 = this.dlB[i].bSP().aHQ()[n];
                        this.dlB[i].bSP().aHQ()[n] = this.dlB[i].bSP().aHQ()[n + 1];
                        this.dlB[i].bSP().aHQ()[n + 1] = cbm2;
                        bl = false;
                    }
                    --n9;
                }
                if (this.dlB[i].bSP().aHQ().length > 0 && this.dlB[i].bSP().aHQ()[this.dlB[i].bSP().aHQ().length - 1].getGUID().enx() > this.dlA) {
                    this.dlA = this.dlB[i].bSP().aHQ()[this.dlB[i].bSP().aHQ().length - 1].getGUID().enx();
                }
            }
            if (this.dlB[i].bSP().aHN() <= this.dlz) continue;
            this.dlz = this.dlB[i].bSP().aHN();
        }
    }

    /*
     * WARNING - void declaration
     */
    private void aoY() {
        int n;
        if (this.dlB == null) {
            return;
        }
        Map<String, String> map = lcn.yi(false);
        for (n = 0; n < this.dlB.length; ++n) {
            Object object;
            int n2;
            Object object2;
            if (this.dlB[n].bSO() != null) {
                object2 = this.dlB[n].bSO();
                map.put("Node (" + this.af(((cbl)object2).ib(), this.dly) + ") Information:", "Object-Spaces: " + Integer.toString(((cbl)object2).aHF()) + ", Objects: " + Integer.toString(((cbl)object2).aHG()) + ", Logic-Objects: " + Integer.toString(((cbl)object2).aHH()) + ", Tickable Objects: " + Integer.toString(((cbl)object2).aHI()));
                cbn[] i = ((cbl)object2).aHJ() == null ? new cbn[]{} : ((cbl)object2).aHJ();
                for (n2 = 0; n2 < i.length; ++n2) {
                    object = i[n2];
                    map.put("Node (" + this.af(((cbl)object2).ib(), this.dly) + ") Object-Space (" + this.af(((cbn)object).aHN(), this.dlz) + ") Information:", "Objects: " + Integer.toString(((cbn)object).aHG()) + ", Logic-Objects: " + Integer.toString(((cbn)object).aHH()) + ", Tickable Objects: " + Integer.toString(((cbn)object).aHI()));
                    if (((cbn)object).aHP() != null) {
                        for (int j = 0; j < ((cbn)object).aHP().length; ++j) {
                            map.put("Node (" + this.af(((cbl)object2).ib(), this.dly) + ") Object-Space (" + this.af(((cbn)object).aHN(), this.dlz) + ") Instance Frequencies (" + this.af(j, ((cbn)object).aHP().length) + "):", "Class: " + ((cbn)object).aHP()[j] + ", Instance Count: " + ((cbn)object).aHO()[j]);
                        }
                    }
                    cbm[] cbmArray = ((cbn)object).aHQ() == null ? new cbm[]{} : ((cbn)object).aHQ();
                    for (int j = 0; j < cbmArray.length; ++j) {
                        cbm cbm2 = ((cbn)object).aHQ()[j];
                        map.put("Node (" + this.af(((cbl)object2).ib(), this.dly) + ") Object-Space (" + this.af(((cbn)object).aHN(), this.dlz) + ") Object (" + this.af(cbm2.getGUID().enx(), this.dlA) + "):", "GUID: " + cbm2.getGUID() + ", Class: " + cbm2.getClassName() + ", Logic-Object: " + cbm2.aHL() + " Tickable: " + cbm2.aHM() + ", toString(): " + cbm2.aHK());
                    }
                }
                continue;
            }
            if (this.dlB[n].bSP() == null) continue;
            object2 = this.dlB[n].bSP();
            map.put("Node (" + this.af(this.dlB[n].bSN(), this.dly) + ") Object-Space (" + this.af(((cbn)object2).aHN(), this.dlz) + ") Information:", "Objects: " + Integer.toString(((cbn)object2).aHG()) + ", Logic-Objects: " + Integer.toString(((cbn)object2).aHH()) + ", Tickable Objects: " + Integer.toString(((cbn)object2).aHI()));
            if (((cbn)object2).aHP() != null) {
                void var4_7;
                boolean bl = false;
                while (var4_7 < ((cbn)object2).aHP().length) {
                    map.put("Node (" + this.af(this.dlB[n].bSN(), this.dly) + ") Object-Space (" + this.af(((cbn)object2).aHN(), this.dlz) + ") Instance Frequencies (" + this.af((int)var4_7, ((cbn)object2).aHP().length) + "):", "Class: " + ((cbn)object2).aHP()[var4_7] + ", Instance Count: " + ((cbn)object2).aHO()[var4_7]);
                    ++var4_7;
                }
            }
            cbm[] cbmArray = ((cbn)object2).aHQ() == null ? new cbm[]{} : ((cbn)object2).aHQ();
            for (n2 = 0; n2 < cbmArray.length; ++n2) {
                object = ((cbn)object2).aHQ()[n2];
                map.put("Node (" + this.af(this.dlB[n].bSN(), this.dly) + ") Object-Space (" + this.af(((cbn)object2).aHN(), this.dlz) + ") Object (" + this.af(((cbm)object).getGUID().enx(), this.dlA) + "):", "GUID: " + ((cbm)object).getGUID() + ", Class: " + ((cbm)object).getClassName() + ", Logic-Object: " + ((cbm)object).aHL() + " Tickable: " + ((cbm)object).aHM() + ", toString(): " + ((cbm)object).aHK());
            }
        }
        if (this.dlr) {
            n = 0;
            for (String string : this.dlx) {
                map.put("Error String (" + this.af(n++, this.dlx.size()) + ":", string);
            }
        }
        this.t(map);
    }

    private String af(int n, int n2) {
        String string = Integer.toString(n);
        String string2 = Integer.toString(n2);
        int n3 = string2.length() - string.length();
        if (n3 > 0) {
            for (int i = 0; i < n3; ++i) {
                string = "0" + string;
            }
        }
        return string;
    }

    private void aoZ() {
        String string = "INSERT INTO performance_audit_node VALUES";
        String string2 = "INSERT INTO performance_audit_object_space VALUES";
        String string3 = "INSERT INTO performance_audit_object VALUES";
        String string4 = "INSERT INTO performance_audit_instance_frequency VALUES";
        String string5 = "(" + Integer.toString(lcw.qGe) + ", " + Integer.toString(lcw.qGf) + ", " + "'" + new Timestamp(this.MessageDelegator.bzy().getTimeInMillis()) + "'" + ", ";
        String string6 = string;
        String string7 = string2;
        String string8 = string3;
        String string9 = string4;
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        for (int i = 0; i < this.dlB.length; ++i) {
            cbn[] cbnArray;
            cbn[] cbnArray2;
            if (this.dlB[i].bSO() != null) {
                cbnArray2 = this.dlB[i].bSO();
                string6 = string6 + (n++ > 0 ? ", " : "") + string5 + Integer.toString(cbnArray2.ib()) + ", " + Integer.toString(cbnArray2.aHF()) + ", " + Integer.toString(cbnArray2.aHG()) + ", " + Integer.toString(cbnArray2.aHH()) + ", " + Integer.toString(cbnArray2.aHI()) + ")";
                if (n >= 100) {
                    this.fx(string6);
                    n = 0;
                    string6 = string;
                }
            }
            if (this.dlB[i].bSO() == null) {
                if (this.dlB[i].bSP() == null) {
                    cbnArray = new cbn[]{};
                } else {
                    cbn[] cbnArray3 = new cbn[1];
                    cbnArray = cbnArray3;
                    cbnArray3[0] = this.dlB[i].bSP();
                }
            } else {
                cbnArray = this.dlB[i].bSO().aHJ() == null ? new cbn[]{} : this.dlB[i].bSO().aHJ();
            }
            cbnArray2 = cbnArray;
            for (int j = 0; j < cbnArray2.length; ++j) {
                int n5;
                cbn cbn2 = cbnArray2[j];
                string7 = string7 + (n2++ > 0 ? ", " : "") + string5 + Integer.toString(cbn2.ib()) + ", " + Integer.toString(cbn2.aHN()) + ", " + Integer.toString(cbn2.aHG()) + ", " + Integer.toString(cbn2.aHH()) + ", " + Integer.toString(cbn2.aHI()) + ")";
                if (n2 >= 100) {
                    this.fx(string7);
                    n2 = 0;
                    string7 = string2;
                }
                if (cbn2.aHP() != null) {
                    for (n5 = 0; n5 < cbn2.aHP().length; ++n5) {
                        string9 = string9 + (n4++ > 0 ? ", " : "") + string5 + Integer.toString(cbn2.ib()) + ", " + Integer.toString(cbn2.aHN()) + ", " + bgo.aD(cbn2.aHP()[n5]) + ", " + Integer.toString(cbn2.aHO()[n5]) + ")";
                        if (n4 < 50) continue;
                        this.fx(string9);
                        n4 = 0;
                        string9 = string4;
                    }
                }
                if (cbn2.aHQ() == null) continue;
                for (n5 = 0; n5 < cbn2.aHQ().length; ++n5) {
                    cbm cbm2 = cbn2.aHQ()[n5];
                    string8 = string8 + (n3++ > 0 ? ", " : "") + string5 + cbm2.getGUID().eny() + ", " + bgo.aD(cbm2.getClassName()) + ", " + (cbm2.aHL() ? "1" : "0") + ", " + (cbm2.aHM() ? "1" : "0") + ", " + bgo.aD(cbm2.aHK()) + ")";
                    if (n3 < 50) continue;
                    this.fx(string8);
                    n3 = 0;
                    string8 = string3;
                }
            }
        }
        if (n > 0) {
            this.fx(string6);
        }
        if (n2 > 0) {
            this.fx(string7);
        }
        if (n3 > 0) {
            this.fx(string8);
        }
        if (n4 > 0) {
            this.fx(string9);
        }
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

    private void fx(String string) {
        if (this.dlC == null) {
            this.dlC = lcn.emA();
        }
        kdj kdj2 = (kdj)this.MessageDelegator.i(259, this.GUID, cbk.eju);
        kdj2.wA("Darkfall");
        kdj2.wB(string);
        this.dlC.add(kdj2);
    }

    private void hu(ldv ldv2) {
        fxz fxz2 = (fxz)this.MessageDelegator.h(28931, this.GUID, ldv2);
        fxz2.b(this.dlp);
        this.MessageDelegator.F(fxz2);
        ++this.dlv;
        if (this.dlw == null) {
            this.dlw = lcn.emw();
        }
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 28932: {
                this.a((fya)dxq2);
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

    private void a(fya fya2) {
        lfs<Integer, Set<fya>> lfs2 = this.dlw.get(fya2.bSN());
        if (lfs2 == null) {
            lfs2 = new lfs(fya2.bSM(), new HashSet());
            this.dlw.put(fya2.bSN(), lfs2);
        }
        ((Set)lfs2.reY).add(fya2);
        if (((Integer)lfs2.reX).intValue() == ((Set)lfs2.reY).size()) {
            ++this.dlt;
            this.aoW();
        }
    }

    private void f(gre gre2) {
        this.hv(gre2.bEB());
    }

    private void b(kcs kcs2) {
        this.hv(kcs2.hsQ);
    }

    private void hv(ldv ldv2) {
        ++this.dlu;
        if (this.dlr) {
            if (this.dlx == null) {
                this.dlx = lcn.emA();
            }
            this.dlx.add("Request sent to GUID '" + ldv2 + "' failed to be delivered!!!");
        }
        this.aoW();
    }
}

