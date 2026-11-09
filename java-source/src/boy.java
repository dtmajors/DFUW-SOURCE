/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 */
public class boy
extends btk {
    private final String dyC = "\n";

    public void a(ldv ldv2, int[] nArray, int[] nArray2, boolean[] blArray) {
        if (nArray == null || nArray.length == 0 || nArray2 == null || nArray2.length == 0 || nArray2.length != nArray.length || blArray == null || blArray.length != nArray.length) {
            return;
        }
        for (int i = 0; i < nArray.length; ++i) {
            String string = lea.enW().getName(nArray[i]);
            if (string != null) {
                String string2 = cug.uG((int)nArray[i]);
                if (string2 != null) {
                    int n = nArray2[i];
                    boolean bl2 = blArray[i];
                    ljg ljg2 = new ljg(string2);
                    lja lja2 = new lja(n);
                    if (!bl2) {
                        this.b(ldv2, aud.b.cbs, ljg2, lja2);
                        continue;
                    }
                    this.b(ldv2, aud.b.cbt, ljg2, lja2);
                    continue;
                }
                lfn.b(5, "SFQuestReporter", "reportSubQuestRewardGained() ResourceType " + nArray[i] + " is invalid.");
                continue;
            }
            lfn.b(5, "SFQuestReporter", "reportSubQuestRewardGained() ResourceType " + nArray[i] + " is invalid.");
        }
    }

    public void a(String string, ldv ldv2, String string2) {
        if (string == null || string.trim().equals("")) {
            return;
        }
        ljk ljk2 = new ljk(string2 + ":");
        ljk ljk3 = new ljk("");
        String[] stringArray = string.split("\n");
        for (int i = 0; i < stringArray.length; ++i) {
            if (stringArray[i].trim().equals("")) continue;
            ljk ljk4 = new ljk(stringArray[i]);
            if (i == 0) {
                this.b(ldv2, aud.b.caP, ljk2, ljk4);
                continue;
            }
            this.b(ldv2, aud.b.caP, ljk3, ljk4);
        }
    }

    public void d(String string, ldv ldv2) {
        if (string == null || string.trim().equals("")) {
            return;
        }
        String[] stringArray = string.split("\n");
        for (int i = 0; i < stringArray.length; ++i) {
            if (stringArray[i].trim().equals("")) continue;
            ljk ljk2 = new ljk(stringArray[i]);
            this.b(ldv2, aud.b.caS, ljk2);
        }
    }

    public void e(String string, ldv ldv2) {
        if (string == null || string.trim().equals("")) {
            return;
        }
        String[] stringArray = string.split("\n");
        for (int i = 0; i < stringArray.length; ++i) {
            if (stringArray[i].trim().equals("")) continue;
            ljk ljk2 = new ljk(stringArray[i]);
            this.b(ldv2, aud.b.caQ, ljk2);
        }
    }

    public void b(String string, ldv ldv2, String string2) {
        if (string == null || string.trim().equals("")) {
            return;
        }
        ljk ljk2 = string2 != null && !string2.isEmpty() ? new ljk(string2 + ":") : new ljk("");
        String[] stringArray = string.split("\n");
        for (int i = 0; i < stringArray.length; ++i) {
            if (stringArray[i].trim().equals("")) continue;
            ljk ljk3 = new ljk(stringArray[i]);
            this.b(ldv2, aud.b.caR, ljk3, ljk2);
        }
    }

    public void a(ldv ldv2, bok bok2, boolean bl2) {
        ljk ljk2 = new ljk(bok2.qM());
        this.b(ldv2, aud.b.cbg, ljk2);
        if (bl2 && bok2.asv() > 1) {
            this.b(ldv2, aud.b.cbj, ljk2);
        }
    }

    public void f(ldv ldv2, String string, String string2) {
        ljk ljk2 = string != null && !string.isEmpty() ? new ljk(string + ":") : new ljk("");
        ljk ljk3 = new ljk(string2);
        this.b(ldv2, aud.b.cbe, ljk2, ljk3);
    }

    public void a(bok bok2, ldv ldv2, int n) {
        ljk ljk2 = new ljk(bok2.qM());
        lja lja2 = new lja(n);
        this.b(ldv2, aud.b.caV, ljk2, lja2);
    }

    public void b(bok bok2, ldv ldv2, int n) {
        ljk ljk2 = new ljk(bok2.qM());
        lja lja2 = new lja(n);
        this.b(ldv2, aud.b.caW, ljk2, lja2);
    }

    public void a(int n, ldv ldv2, int n2, int n3) {
        ljk ljk2 = new ljk(cug.uG((int)n));
        lja lja2 = new lja(n2);
        lja lja3 = new lja(n3);
        this.b(ldv2, aud.b.cbr, ljk2, lja2, lja3);
    }

    public void a(bok bok2, int n, ldv ldv2, int n2) {
        ljk ljk2 = new ljk(bok2.qM());
        ljk ljk3 = new ljk(cug.uG((int)n));
        lja lja2 = new lja(n2);
        this.b(ldv2, aud.b.cbl, ljk3, ljk2, lja2);
    }

    public void a(ldv ldv2, aud.b b2, lip ... lipArray) {
        this.b(ldv2, b2, lipArray);
    }

    public void b(ldv ldv2, long l2) {
        StringBuffer stringBuffer = new StringBuffer();
        int n = (int)(l2 / 3600000L);
        long l3 = l2 - (long)n * 3600000L;
        int n2 = (int)(l3 / 60000L);
        int n3 = (int)((l2 - (long)n2 * 60000L - (long)n * 3600000L) / 1000L);
        if (n < 10) {
            stringBuffer.append("0" + n);
        } else {
            stringBuffer.append(n);
        }
        stringBuffer.append(":");
        if (n2 < 10) {
            stringBuffer.append("0" + n2);
        } else {
            stringBuffer.append(n2);
        }
        stringBuffer.append(":");
        if (n3 < 10) {
            stringBuffer.append("0" + n3);
        } else {
            stringBuffer.append(n3);
        }
        ljg ljg2 = new ljg(stringBuffer.toString());
        this.b(ldv2, aud.b.cba, ljg2);
    }

    public void b(ldv ldv2, bok bok2, boolean bl2) {
        ljk ljk2 = new ljk(bok2.qM());
        this.b(ldv2, aud.b.cbf, ljk2);
        if (bl2 && bok2.asv() > 1) {
            this.b(ldv2, aud.b.cbj, ljk2);
        }
    }

    public void b(bok bok2, ldv ldv2, boolean bl2) {
        ljk ljk2 = new ljk(bok2.qM());
        this.b(ldv2, aud.b.cbh, ljk2);
        if (bl2 && bok2.asv() > 1) {
            this.b(ldv2, aud.b.cbj, ljk2);
        }
    }

    public void b(int n, int n2, int n3, ldv ldv2) {
        lja lja2 = new lja(n);
        lja lja3 = new lja(n2);
        ljk ljk2 = new ljk(cug.uG((int)n3));
        this.b(ldv2, aud.b.cbq, lja2, lja3, ljk2);
    }

    public void a(int n, int n2, int n3, ldv ldv2, int n4) {
        due due2 = lea.eoU().Cg(n4);
        if (due2 != null && due2.UseSkillMessage != null && !due2.UseSkillMessage.trim().equals("")) {
            ljg ljg2 = new ljg(due2.UseSkillMessage.replace("#", String.valueOf(n)));
            this.b(ldv2, aud.b.cbu, ljg2);
        } else {
            String string = lea.enZ().getName(n3);
            string = string == null ? "Unknown Skill" : string.replace("s_", "");
            lja lja2 = new lja(n);
            ljk ljk2 = new ljk(cug.uG((int)n2));
            ljk ljk3 = new ljk(string);
            this.b(ldv2, aud.b.cbm, ljk3, lja2, ljk2);
        }
    }

    public void a(int n, int n2, String string, ldv ldv2) {
        if (n > n2) {
            n = n2;
        }
        lja lja2 = new lja(n);
        lja lja3 = new lja(n2);
        ljk ljk2 = new ljk(string);
        this.b(ldv2, aud.b.cbn, lja2, lja3, ljk2);
    }

    public void a(int n, int n2, String string, ldv ldv2, String string2) {
        lja lja2 = new lja(n);
        lja lja3 = new lja(n2);
        ljk ljk2 = new ljk(string);
        ljk ljk3 = new ljk(string2);
        this.b(ldv2, aud.b.cbo, lja2, lja3, ljk2, ljk3);
    }

    public void b(int n, int n2, String string, ldv ldv2) {
        if (n > n2) {
            n = n2;
        }
        lja lja2 = new lja(n);
        lja lja3 = new lja(n2);
        ljk ljk2 = new ljk(string);
        this.b(ldv2, aud.b.cbp, lja2, lja3, ljk2);
    }

    public void f(String string, ldv ldv2) {
        if (string == null || string.trim().equals("")) {
            return;
        }
        String[] stringArray = string.split("\n");
        for (int i = 0; i < stringArray.length; ++i) {
            if (stringArray[i].trim().equals("")) continue;
            ljk ljk2 = new ljk(stringArray[i]);
            this.b(ldv2, aud.b.caU, ljk2);
        }
    }

    private void b(ldv ldv2, aud.b b2, lip ... lipArray) {
        egy egy2 = (egy)this.MessageDelegator.h(2305, this.getGUID(), ldv2);
        egy2.b(b2);
        egy2.ipJ = lipArray;
        egy2.ccR = b2.ordinal();
        this.MessageDelegator.F(egy2);
    }

    @Override
    public void initialize() {
        super.initialize();
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        super.receiveMessage(dxq2);
    }
}

