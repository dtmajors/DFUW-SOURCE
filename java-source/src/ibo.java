/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 *  ibp
 */
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ibo
extends iys {
    private Map<ibs, icr> lFv = lcn.emw();
    private boolean lFw = false;
    private boolean lFx = true;
    private boolean lFy = true;
    private int lFz = 0x888888;
    private ibu lFA;
    private static final int lFB = 0x888888;
    private static Map<String, hc> lFC = lcn.emw();

    public ibo() {
        this.dqE().b(isf.mwN);
        this.dqE().sw(true);
        this.dqE().ss(true);
        for (ibs ibs2 : ibz.cNn()) {
            ibs2.b(this.lFv, false);
        }
    }

    public boolean a(ibs ibs2) {
        icr icr2 = this.lFv.get(ibs2);
        return icr2 != null && icr2.visible;
    }

    public Map<ibs, icr> cML() {
        Map<ibs, icr> map = lcn.emw();
        for (Map.Entry<ibs, icr> entry : this.lFv.entrySet()) {
            map.put(entry.getKey(), entry.getValue().cNS());
        }
        return map;
    }

    public void J(Map<ibs, icr> map) {
        for (Map.Entry<ibs, icr> entry : map.entrySet()) {
            this.lFv.put(entry.getKey(), entry.getValue().cNS());
        }
    }

    public void K(Map<ibs, icr> map) {
        for (Map.Entry<ibs, icr> entry : map.entrySet()) {
            icr icr2 = this.lFv.get(entry.getKey());
            icr2.color = entry.getValue().color;
            icr2.lHC = entry.getValue().lHC;
        }
    }

    public boolean cMM() {
        return this.lFw;
    }

    public void pF(boolean bl) {
        this.lFw = bl;
    }

    public int cMN() {
        return this.lFz;
    }

    public void PN(int n) {
        this.lFz = n;
    }

    public boolean cMO() {
        return this.lFx;
    }

    public void pG(boolean bl) {
        this.lFx = bl;
    }

    public boolean cMP() {
        return this.lFy;
    }

    public void pH(boolean bl) {
        this.lFy = bl;
    }

    public ibu cMQ() {
        return this.lFA;
    }

    public boolean a(ibu ibu2) {
        if (this.lFA == ibu2) {
            return false;
        }
        this.lFA = ibu2;
        return true;
    }

    public ibp cMy() {
        return this.djE() instanceof ibp ? (ibp)this.djE() : null;
    }

    @Override
    public float cMR() {
        return this.cMy().cXR();
    }

    public void appendText(String string) {
        this.d(string, 3000, 2000, true);
    }

    public void b(jmz jmz2) {
        for (icr icr2 : this.lFv.values()) {
            if (!icr2.lHB.d(jmz2) || !this.a(icr2.lHB)) continue;
            switch (jmz2.dMQ()) {
                case nDh: {
                    this.a(icr2.lHB, icr2, (jnc)jmz2);
                    break;
                }
                case nDi: {
                    this.a(icr2.lHB, icr2, (jna)jmz2);
                    break;
                }
                case nDj: {
                    this.a(icr2.lHB, icr2, (jne)jmz2);
                    break;
                }
                case nDk: {
                    this.a(icr2.lHB, icr2, (jnb)jmz2);
                }
            }
            if (!this.lFx) break;
            this.c(jmz2);
            break;
        }
    }

    public void a(itt itt2) {
        itt2.a(new itr("NewMessageNotification", this.lFx));
        itt2.a(new itu("TimestampColor", this.lFz));
        itt2.a(new itr("TimestampVisible", this.lFw));
        itt2.a(new itr("ShowMessageTags", this.lFy));
        itt2.a(new itx("InputChannel", this.lFA != null ? this.lFA.getId() : ""));
        itt itt3 = new itt("Channels");
        itt2.a(itt3);
        for (icr icr2 : this.lFv.values()) {
            itt itt4 = new itt("Channel");
            itt3.a(itt4);
            itt4.a(new itx("ChannelIdentifier", icr2.lHB.getId()));
            icr2.a(itt4);
        }
    }

    public void b(itt itt2) {
        this.lFx = itt2.A("NewMessageNotification", true);
        this.lFz = itt2.L("TimestampColor", 0xFFFFFF);
        this.lFw = itt2.A("TimestampVisible", false);
        this.lFy = itt2.A("ShowMessageTags", true);
        this.lFA = ibv.pE(itt2.T("InputChannel", ""));
        itt itt3 = (itt)itt2.rA("Channels");
        List<its> list = itt3.getChildren();
        for (its its2 : list) {
            ibs ibs2;
            itt itt4 = (itt)its2;
            String string = itt4.T("ChannelIdentifier", null);
            if (string == null) {
                string = itt4.T("ChannelId", null);
            }
            if (string == null || (ibs2 = ibr.pD(string)) == null) continue;
            icr icr2 = this.lFv.get(ibs2);
            if (icr2 == null) {
                icr2 = ibs2.pJ(true);
            }
            icr2.b(itt4);
        }
    }

    public static hc oY(String string) {
        return lFC.get(string);
    }

    @Override
    public void oZ(String string) {
        if ((string = string.replace("event:", "")).startsWith(ibh.lEJ.name())) {
            string = string.replace(ibh.lEJ.name() + ":", "");
            this.pb(string);
        } else if (string.startsWith(ibh.lEK.name())) {
            string = string.replace(ibh.lEK.name() + ":", "");
            this.pd(string);
        } else if (string.startsWith(ibh.lEL.name())) {
            string = string.replace(ibh.lEL.name() + ":", "");
            this.pf(string);
        } else if (string.startsWith(ibh.lEM.name())) {
            string = string.replace(ibh.lEM.name() + ":", "");
            this.ph(string);
        } else if (string.startsWith(ibh.lEN.name())) {
            string = string.replace(ibh.lEN.name() + ":", "");
            this.pi(string);
        } else if (string.startsWith(ibh.lEO.name())) {
            string = string.replace(ibh.lEO.name() + ":", "");
            this.pj(string);
        }
    }

    @Override
    public void pa(String string) {
        if ((string = string.replace("event:", "")).startsWith(ibh.lEJ.name())) {
            string = string.replace(ibh.lEJ.name() + ":", "");
            this.pc(string);
        } else if (string.startsWith(ibh.lEK.name())) {
            string = string.replace(ibh.lEK.name() + ":", "");
            this.pe(string);
        } else if (string.startsWith(ibh.lEL.name())) {
            string = string.replace(ibh.lEL.name() + ":", "");
            this.pg(string);
        }
    }

    public void pb(String string) {
    }

    public void pc(String string) {
    }

    public void pd(String string) {
    }

    public void pe(String string) {
    }

    public void pf(String string) {
    }

    public void pg(String string) {
    }

    public void ph(String string) {
        int n = Integer.valueOf(string);
        ign ign2 = igq.QK(n);
        if (ign2 != null) {
            this.djE();
            ioa.cyJ().cIJ().q(ign2);
        }
    }

    public void pi(String string) {
        int n = Integer.valueOf(string);
        ign ign2 = igq.QK(n);
        if (ign2 != null) {
            this.djE();
            jht jht2 = ioa.cyJ().cIM();
            if (!jht2.a(ign2, true)) {
                hso.cxK().cxP().c(mbu.uoc.bD(ign2.getTitle()), false);
            }
        }
    }

    public void pj(String string) {
        int n = Integer.valueOf(string);
        ign ign2 = igq.QK(n);
        if (ign2 != null) {
            this.djE();
            jht jht2 = ioa.cyJ().cIM();
            if (!jht2.a(ign2, false)) {
                if (!jht2.x(ign2)) {
                    hso.cxK().cxP().c(mbu.uoe.bD(ign2.getTitle()), false);
                } else {
                    hso.cxK().cxP().c(mbu.uod.bD(ign2.getTitle()), false);
                }
            }
        }
    }

    @Override
    public hyn pk(String string) {
        return ibi.oW(string);
    }

    public void c(jmz jmz2) {
    }

    public void cbU() {
    }

    public void cGR() {
    }

    private static void a(StringBuilder stringBuilder, int n, String string) {
        stringBuilder.append("<font color=\"#" + String.format("%x", n) + "\">");
        stringBuilder.append(string);
        stringBuilder.append("</font>");
    }

    private static void b(StringBuilder stringBuilder) {
        ibo.a(stringBuilder, 0x888888, "[");
    }

    private static void c(StringBuilder stringBuilder) {
        ibo.a(stringBuilder, 0x888888, "]");
    }

    private void a(StringBuilder stringBuilder, long l2, ibs ibs2) {
        if (this.lFw) {
            ibo.b(stringBuilder);
            ibo.a(stringBuilder, this.lFz, ldz.b(l2, true));
            ibo.c(stringBuilder);
        }
    }

    private void a(StringBuilder stringBuilder, ibs ibs2, icr icr2) {
        ibo.b(stringBuilder);
        ibo.a(stringBuilder, icr2.color, ibs2.cNq().bD(new Object[0]).exA());
        ibo.c(stringBuilder);
    }

    private void a(StringBuilder stringBuilder, hc hc2, int n) {
        if (hc2 != null && hc2.ordinal() >= hc.aaB.ordinal()) {
            ibo.b(stringBuilder);
            if (hc2.ordinal() >= hc.aaP.ordinal()) {
                ibo.a(stringBuilder, n, "ADM");
            } else {
                ibo.a(stringBuilder, n, "GM");
            }
            ibo.c(stringBuilder);
        }
    }

    private void a(StringBuilder stringBuilder, String string, String string2, int n, hc hc2) {
        this.a(stringBuilder, hc2, 0xFF0000);
        ibo.b(stringBuilder);
        ibo.a(stringBuilder, n, ibo.L(string, string2));
        ibo.c(stringBuilder);
    }

    private static String L(String string, String string2) {
        return "<a href='event:" + ibh.lEJ.name() + ":" + string2 + "'>" + string + "</a>";
    }

    private boolean a(StringBuilder stringBuilder, ibs ibs2, icr icr2, jna jna2) {
        if (ibs2 == ibv.lGy) {
            ibo.a(stringBuilder, icr2.color, jna2.dMT());
            return true;
        }
        return false;
    }

    private void b(StringBuilder stringBuilder, ibs ibs2, icr icr2, jna jna2) {
        if ((ibs2 == ibv.lGy || ibs2 == ibv.lGx) && jna2.dMU() != null && jna2.dMU() != bbs.NoRank) {
            ibo.a(stringBuilder, icr2.color, jna2.dMU().wp().bD(new Object[0]).exA().toUpperCase());
        }
    }

    private void a(StringBuilder stringBuilder, ibs ibs2, icr icr2, jnb jnb2, boolean bl) {
        ibo.b(stringBuilder);
        ibo.a(stringBuilder, icr2.color, jnb2.dMV(), bl);
        ibo.c(stringBuilder);
    }

    private static void a(StringBuilder stringBuilder, int n, jns jns2, boolean bl) {
        jns jns3 = jns2.dNU();
        if (bl) {
            if (jns3 != jns2.dOh()) {
                ibo.a(stringBuilder, n, jns3, true);
                ibo.a(stringBuilder, 0x888888, ".");
            }
            ibo.a(stringBuilder, n, jns2.dNZ().wp().bD(new Object[0]).exA());
        } else if (jns3 != jns2.dOh()) {
            ibo.a(stringBuilder, n, jns3, false);
        } else {
            ibo.a(stringBuilder, n, jns2.dNZ().wp().bD(new Object[0]).exA());
        }
    }

    private static void a(StringBuilder stringBuilder, int n, String string, boolean bl) {
        if (bl) {
            ibo.a(stringBuilder, 0x888888, ":");
        }
        ibo.a(stringBuilder, n, ibo.pm(string));
    }

    private static boolean pl(String string) {
        return string.equals(dsv.byP().iU());
    }

    private void a(ibs ibs2, icr icr2, jnc jnc2) {
        lFC.put(jnc2.dMW(), jnc2.dMX());
        if (jnc2 == null) {
            assert (false);
            return;
        }
        if (icr2 == null) {
            assert (false);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<p>");
        stringBuilder.append("<font size='" + icr2.lHC.bll() + "'>");
        this.a(stringBuilder, jnc2.dMS(), ibs2);
        if (this.lFy) {
            this.a(stringBuilder, ibs2, icr2);
        }
        String string = jnc2.dNa();
        boolean bl = string.startsWith("EMOTE_MESSAGE:");
        boolean bl2 = true;
        if (!bl) {
            this.a(stringBuilder, jnc2.dMW(), jnc2.dMW(), icr2.color, jnc2.dMX());
        } else {
            string = string.substring("EMOTE_MESSAGE:".length());
            if (!this.lFy) {
                bl2 = false;
            }
        }
        ibo.a(stringBuilder, icr2.color, string, bl2);
        stringBuilder.append("</font>");
        stringBuilder.append("</p>");
        this.appendText(stringBuilder.toString());
    }

    private void a(ibs ibs2, icr icr2, jna jna2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<p>");
        stringBuilder.append("<font size='" + icr2.lHC.bll() + "'>");
        this.a(stringBuilder, jna2.dMS(), ibs2);
        if (this.lFy) {
            this.a(stringBuilder, ibs2, icr2);
        }
        if (this.lFy) {
            ibo.b(stringBuilder);
            if (this.a(stringBuilder, ibs2, icr2, jna2)) {
                stringBuilder.append("|");
            }
            this.b(stringBuilder, ibs2, icr2, jna2);
            ibo.c(stringBuilder);
        }
        this.a(stringBuilder, jna2.dMW(), jna2.dMW(), icr2.color, jna2.dMX());
        ibo.a(stringBuilder, icr2.color, jna2.dNa(), true);
        stringBuilder.append("</font>");
        stringBuilder.append("</p>");
        this.appendText(stringBuilder.toString());
    }

    private void a(ibs ibs2, icr icr2, jne jne2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<p>");
        stringBuilder.append("<font size='" + icr2.lHC.bll() + "'>");
        this.a(stringBuilder, jne2.dMS(), ibs2);
        if (this.lFy) {
            this.a(stringBuilder, ibs2, icr2);
        }
        boolean bl = jne2.dNb();
        String string = "";
        String string2 = "";
        if (bl) {
            string2 = jne2.dNc();
            string = lvw.tbO.bD(string2).exA();
        } else {
            if (jne2.dNc().equals(jne2.dMW())) {
                return;
            }
            string = string2 = jne2.dMW();
        }
        this.a(stringBuilder, string, string2, icr2.color, jne2.dMX());
        ibo.a(stringBuilder, icr2.color, jne2.dNa(), true);
        stringBuilder.append("</font>");
        stringBuilder.append("</p>");
        this.appendText(stringBuilder.toString());
    }

    private void a(ibs ibs2, icr icr2, jnb jnb2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<p>");
        stringBuilder.append("<font size='" + icr2.lHC.bll() + "'>");
        this.a(stringBuilder, jnb2.dMS(), ibs2);
        this.a(stringBuilder, ibs2, icr2, jnb2, this.lFy);
        ibo.a(stringBuilder, icr2.color, jnb2.bPu().exA(), true);
        stringBuilder.append("</font>");
        stringBuilder.append("</p>");
        this.appendText(stringBuilder.toString());
    }

    private static String pm(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        Set set = lcn.emx();
        int n = 0;
        while (n < string.length()) {
            int n2;
            char c2 = string.charAt(n);
            if (c2 != '<') {
                stringBuilder.append(c2);
                ++n;
                continue;
            }
            if (string.startsWith("<img src='", n)) {
                n2 = string.indexOf("id='", n + 1) + 4;
                int n3 = string.indexOf(39, n2);
                String string2 = string.substring(n2, n3);
                int n4 = string2.indexOf(58);
                string2 = string2.substring(n4 + 1);
                int n5 = n + 10;
                int n6 = string.indexOf(39, n5);
                String string3 = string.substring(n5, n6);
                int n7 = string.indexOf("width='", n6) + 7;
                int n8 = string.indexOf(39, n7);
                String string4 = string.substring(n7, n8);
                int n9 = string.indexOf("height='", n6) + 8;
                int n10 = string.indexOf(39, n9);
                String string5 = string.substring(n9, n10);
                String string6 = "<a href='event:" + string2 + "' ><img src='" + string3 + "' width='" + string4 + "' height='" + string5 + "'/></a><img/>";
                stringBuilder.append(string6);
                n = string.indexOf(62, n3 + 1) + 1;
                continue;
            }
            if (ibo.y(string, n)) {
                n2 = string.indexOf("</a>", n) + 4;
                stringBuilder.append(string.substring(n, n2));
                n = n2;
                continue;
            }
            n = string.indexOf(62, n + 1) + 1;
        }
        String string7 = stringBuilder.toString();
        return string7;
    }

    private static boolean y(String string, int n) {
        for (ibh ibh2 : ibh.values()) {
            if (!string.startsWith("<a href='event:" + ibh2.name() + ":", n)) continue;
            return true;
        }
        return false;
    }
}

