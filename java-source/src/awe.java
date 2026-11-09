/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cew
 */
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class awe {
    public static final boolean crl = false;
    public cew crm = null;
    public String YL = null;
    public String crn = null;
    public String cro = null;
    private Map<awm, awl> crp = lcn.emG();
    private Map<String, awt> crq = lcn.emG();
    private LinkedList<String> crr = lcn.emA();

    public static String ex(String string) {
        if (string == null) {
            return null;
        }
        int n = (string = string.trim()).indexOf(32);
        if (n < 0) {
            return string;
        }
        return string.substring(0, n);
    }

    public static String ey(String string) {
        if (string == null) {
            return null;
        }
        int n = (string = string.trim()).indexOf(32);
        if (n < 0) {
            return "";
        }
        return string.substring(n + 1).trim();
    }

    public awe() {
        this.a(awm.PrimaryTableName, awq.crJ, true, true, null);
        this.a(awm.CurrentTableName, awq.crJ, true, true, null);
        this.a(awm.OwnName, awq.crJ, true, false, this.YL);
        this.a(awm.OwnFirstName, awq.crJ, true, false, this.YL);
        this.a(awm.OwnLastName, awq.crJ, true, false, this.YL);
        this.a(awm.QueryTabCount, awq.crK, true, false, 0);
        this.a(awm.OwnRace, awq.crJ, true, false, this.crn);
        this.a(awm.OwnGender, awq.crJ, true, false, this.cro);
        this.a(awm.SystemNotificationType, awq.crJ, true, true, null);
        this.a(awm.NotificationSubType, awq.crK, true, true, null);
        this.a(awm.NotificationParam1, awq.crJ, true, true, null);
        this.a(awm.NotificationParam2, awq.crJ, true, true, null);
        this.a(awm.NotificationParam3, awq.crJ, true, true, null);
        this.a(awm.FromName, awq.crJ, true, true, null);
        this.a(awm.FromFirstName, awq.crJ, true, true, null);
        this.a(awm.FromLastName, awq.crJ, true, true, null);
        this.a(awm.ToName, awq.crJ, true, true, null);
        this.a(awm.ToFirstName, awq.crJ, true, true, null);
        this.a(awm.ToLastName, awq.crJ, true, true, null);
        this.a(awm.ChatTarget, awq.crJ, true, true, null);
        this.a(awm.TimeStamp, awq.crK, true, false, 0);
        this.a(awm.SenderClanAccessLevel, awq.crK, true, true, 0);
        this.a(awm.SenderClanName, awq.crJ, true, true, null);
        this.a(awm.SenderClanRank, awq.crJ, true, true, null);
        this.a(awm.SenderLocationName, awq.crJ, true, true, null);
        this.a(awm.DistanceToSender, awq.crK, true, true, 0);
        this.a(awm.ChatBucket, awq.crJ, true, false, "Default");
        this.a(awm.OriginTabName, awq.crJ, true, false, null);
        this.a(awm.Text, awq.crJ, false, false, "");
        this.a(awm.DisplayTargets, awq.crM, false, false, "System");
        this.a(awm.DefaultWindow, awq.crJ, false, false, "System");
        this.a(awm.HighlightLevel, awq.crK, false, false, 1);
        this.a(awm.BaseColor, awq.crJ, false, false, "FFFFFF");
        this.a(awm.StripColors, awq.crL, false, false, Boolean.FALSE);
        this.a(awm.StripControlCodes, awq.crL, false, false, Boolean.FALSE);
        this.a(awm.DisplayText, awq.crJ, false, false, "$(Text)");
        this.a(awm.UserString1, awq.crJ, false, true, null);
        this.a(awm.UserString2, awq.crJ, false, true, null);
        this.a(awm.UserString3, awq.crJ, false, true, null);
    }

    public void Xj() {
        lgw lgw2;
        this.YL = dsv.byP().iU();
        this.crp.get((Object)((Object)awm.OwnName)).crG = this.YL;
        this.crp.get((Object)((Object)awm.OwnFirstName)).crG = awe.ex(this.YL);
        this.crp.get((Object)((Object)awm.OwnLastName)).crG = awe.ey(this.YL);
        int n = dsv.byP().jp();
        if (n > 0 && (lgw2 = (lgw)lea.enW().acv(n)) != null) {
            this.crn = lgw2.getName().substring(2);
            this.cro = this.crn.substring(this.crn.indexOf(32) + 1);
            this.crn = this.crn.substring(0, this.crn.indexOf(32));
            this.crp.get((Object)((Object)awm.OwnRace)).crG = this.crn;
            this.crp.get((Object)((Object)awm.OwnGender)).crG = this.cro;
        }
    }

    public void a(awt awt2) {
        if (!this.crq.containsKey(awt2.Name)) {
            this.crq.put(awt2.Name, awt2);
        }
    }

    public awl a(awm awm2) {
        return this.crp.get((Object)awm2);
    }

    public String[] Xk() {
        TreeSet<String> treeSet = new TreeSet<String>();
        for (awt awt2 : this.crq.values()) {
            for (awr awr2 : awt2.crV) {
                for (awb awb2 : awr2.crQ.aMC) {
                    if (awb2.crf == null || !awb2.crf.crC.equals((Object)awm.DefaultWindow) || awb2.crg == null) continue;
                    treeSet.add(awb2.crg);
                }
            }
        }
        return treeSet.toArray(new String[treeSet.size()]);
    }

    public void b(awi awi2) {
        this.b(awi2, "GLOBAL");
        awi2.Xo();
        awi2.Xn();
    }

    public awi a(awi awi2, String string) {
        awi awi3 = awi2.Xm();
        this.b(awi3, string);
        awi3.Xo();
        awi3.Xn();
        return awi3;
    }

    private void b(awi awi2, String string) {
        awt awt2 = this.crq.get(string);
        int n = 0;
        while (awt2 != null) {
            aws aws2 = awt2.e(awi2);
            if (aws2 != aws.RestartAll) {
                return;
            }
            if (++n <= 10) continue;
            break;
        }
    }

    Map<awm, awj> Xl() {
        if (this.YL == null) {
            this.Xj();
        }
        TreeMap<awm, awj> treeMap = lcn.emG();
        for (awl awl2 : this.crp.values()) {
            switch (awl2.crD) {
                case crL: {
                    treeMap.put(awl2.crC, new awk(awl2, (Boolean)awl2.crG));
                    break;
                }
                case crK: {
                    treeMap.put(awl2.crC, new awn(awl2, (Integer)awl2.crG));
                    break;
                }
                case crJ: {
                    treeMap.put(awl2.crC, new awo(awl2, (String)awl2.crG));
                    break;
                }
                case crM: {
                    treeMap.put(awl2.crC, new awp(awl2, (String)awl2.crG));
                }
            }
        }
        return treeMap;
    }

    aws c(awi awi2, String string) {
        awt awt2 = this.crq.get(string);
        if (awt2 == null) {
            return aws.Continue;
        }
        aws aws2 = awt2.e(awi2);
        return aws2;
    }

    private void a(awm awm2, awq awq2, boolean bl, boolean bl2, Object object) {
        assert (!this.crp.containsKey((Object)awm2));
        this.crp.put(awm2, new awl(this, awm2, awq2, bl, bl2, object));
    }

    void b(awt awt2) {
        assert (!this.d(awt2));
        this.crr.add(awt2.Name);
    }

    void c(awt awt2) {
        assert (!this.crr.isEmpty());
        assert (this.crr.getLast().equals(awt2.Name));
        this.crr.removeLast();
    }

    boolean d(awt awt2) {
        return this.crr.contains(awt2.Name);
    }
}

