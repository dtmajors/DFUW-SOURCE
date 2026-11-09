/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 */
import java.sql.Timestamp;

public class bda {
    private long cZd = -1L;
    private int cZe = bdh.cZS.ordinal();
    private int ResourceType = -1;
    private int asi = -1;
    private long cZf = 0L;
    private int SN = -1;
    private String bc = null;
    private String cZg = null;
    private int cZh = -1;
    private ldv aES = null;
    private String aET = null;
    private long cZi = -1L;
    private String ResourceName = null;
    private String cZj = null;
    private Timestamp cZk = null;
    private double cZl = 0.0;

    public long aly() {
        return this.cZd;
    }

    void E(long l) {
        this.cZd = l;
    }

    public bdh alz() {
        return bdh.getValueByOrdinal(this.cZe);
    }

    public int az() {
        return this.ResourceType;
    }

    public int vf() {
        return this.asi;
    }

    public long alA() {
        return this.cZf;
    }

    public int qe() {
        return this.SN;
    }

    public String hl() {
        return this.bc;
    }

    public String alB() {
        return this.cZg;
    }

    public int alC() {
        return this.cZh;
    }

    public ldv alD() {
        return this.aES;
    }

    public String alE() {
        return this.aET;
    }

    long alF() {
        return this.cZi;
    }

    void F(long l) {
        this.cZi = l;
    }

    public double alG() {
        return this.cZl;
    }

    public void aP(double d2) {
        this.cZl = d2;
    }

    @Deprecated
    public bda() {
    }

    private bda(bdh bdh2, int n, int n2, long l, int n3, String string) {
        this(bdh2, n, n2, l, n3, string, null, -1, null, null);
    }

    private bda(bdh bdh2, int n, int n2, long l, int n3, String string, String string2) {
        this(bdh2, n, n2, l, n3, string, string2, -1, null, null);
    }

    private bda(bdh bdh2, int n, int n2, long l, String string) {
        this(bdh2, n, n2, l, -1, null, string, -1, null, null);
    }

    private bda(bdh bdh2, int n, int n2, long l, String string, int n3) {
        this(bdh2, n, n2, l, -1, null, string, n3, null, null);
    }

    private bda(bdh bdh2, int n, int n2, long l, int n3, String string, String string2, int n4) {
        this(bdh2, n, n2, l, n3, string, string2, n4, null, null);
    }

    private bda(bdh bdh2, int n, int n2, long l, int n3, String string, String string2, ldv ldv2, String string3) {
        this(bdh2, n, n2, l, n3, string, string2, -1, ldv2, string3);
    }

    private bda(bdh bdh2, int n, int n2, long l, String string, int n3, ldv ldv2, String string2) {
        this(bdh2, n, n2, l, -1, null, string, n3, ldv2, string2);
    }

    private bda(bdh bdh2, int n, int n2, long l, String string, ldv ldv2, String string2) {
        this(bdh2, n, n2, l, -1, null, string, -1, ldv2, string2);
    }

    private bda(bdh bdh2, int n, int n2, long l, ldv ldv2, String string) {
        this(bdh2, n, n2, l, -1, null, null, -1, ldv2, string);
    }

    private bda(bdh bdh2, int n, int n2, long l) {
        this(bdh2, n, n2, l, -1, null, null, -1, null, null);
    }

    public bda(bdh bdh2, int n, int n2, long l, int n3, String string, String string2, int n4, ldv ldv2, String string3) {
        this.cZe = bdh2 == null ? this.cZe : bdh2.ordinal();
        this.ResourceType = n;
        this.asi = n2;
        this.cZf = l;
        this.SN = n3;
        this.bc = string;
        this.cZg = string2;
        this.cZh = n4;
        this.aES = ldv2;
        this.aET = string3;
    }

    public String pa() {
        if (this.ResourceName == null) {
            this.ResourceName = lea.enW().getName(this.ResourceType);
        }
        return this.ResourceName;
    }

    public String alH() {
        if (this.cZj == null && this.cZh >= 0) {
            this.cZj = lea.enW().getName(this.cZh);
        }
        return this.cZj;
    }

    public Timestamp alI() {
        if (this.cZk == null) {
            this.cZk = new Timestamp(this.cZf);
        }
        return this.cZk;
    }

    public String hb(ldv ldv2) {
        switch (this.alz()) {
            case cZT: {
                return "Clan: [" + ldv2.fk() + "] - Player Transaction :: Player: " + this.bc + " (" + this.SN + ") - Resource: " + this.pa() + ",  Quantity: " + this.asi;
            }
            case cZV: {
                return "Clan: [" + ldv2.fk() + "] - Village Capture Reward :: Village: " + this.cZg + " - Resource: " + this.pa() + ", Quantity: " + this.asi;
            }
            case cZW: {
                return "Clan: [" + ldv2.fk() + "] - Village Ownership Reward :: Village: " + this.cZg + " - Resource: " + this.pa() + ", Quantity: " + this.asi;
            }
            case cZU: {
                return "Clan: [" + ldv2.fk() + "] - Fortress Reward :: Fortress: " + this.cZg + " - Resource: " + this.pa() + ", Quantity: " + this.asi;
            }
            case cZX: {
                return "Clan: [" + ldv2.fk() + "] - Workstation Tax :: Holding: " + this.cZg + ", Workstation: " + this.alH() + " - Resource: " + this.pa() + ", Quantity: " + this.asi;
            }
            case cZY: {
                return "Clan: [" + ldv2.fk() + "] - Conquest Challenge Wager :: Holding: " + this.cZg + ", Defender Clan: " + this.aET + "[" + this.aES.fk() + "] - Resource : " + this.pa() + ", Quantity : " + this.asi;
            }
            case cZZ: {
                return "Clan: [" + ldv2.fk() + "] - Conquest Challenge Reward :: Holding: " + this.cZg + " - Resource: " + this.pa() + ", Quantity: " + this.asi;
            }
            case daa: {
                return "Clan: [" + ldv2.fk() + "] - Conquest Siege-Stone Destruction Reward :: Holding: " + this.cZg + ", Owner Clan: " + this.aET + "[" + this.aES.fk() + "] - Resource: " + this.pa() + ", Quantity: " + this.asi;
            }
            case dab: {
                return "Clan: [" + ldv2.fk() + "] - Mercenary Contract Bond :: Other Clan Party: " + (this.aES == null ? "Unknown!" : this.aET + "[" + this.aES.fk() + "]") + " - Resource: " + this.pa() + ", Quantity: " + this.asi;
            }
            case dac: {
                return "Clan: [" + ldv2.fk() + "] - Mercenary Contract Reward :: Other Clan Party: " + (this.aES == null ? "Unknown!" : this.aET + "[" + this.aES.fk() + "]") + " - Resource: " + this.pa() + ", Quantity: " + this.asi;
            }
        }
        return "Clan: [" + ldv2.fk() + "] - UNKNOWN LOG TYPE!!! (" + (Object)((Object)this.alz()) + ") :: Character Name: " + this.bc + ", CharacterID: " + this.SN + ", Source ID: " + this.cZg + ", Source Resource: " + this.alH() + ", OtherClanGUID: " + (this.aES == null ? "null" : "[" + this.aES.fk() + "]") + ", OtherClanName: " + (this.aET == null ? "null" : this.aET) + " - Resource: " + this.pa() + ", Quantity: " + this.asi;
    }

    private static int n(int n, boolean bl) {
        return n * (bl && n < 0 || !bl && n > 0 ? -1 : 1);
    }

    public boolean a(bdb bdb2) {
        return bdb2 == null ? true : bdb2.b(this);
    }

    public String toString() {
        return "[ID: " + Long.toString(this.cZd) + "] " + (this.cZi >= 0L ? "[DB-ID: " + Long.toString(this.cZi) + "] " : "") + "Type: " + this.alz().name() + " :: Resource: " + this.pa() + " :: Quantity: " + Integer.toString(this.asi) + " :: Timestamp: " + this.alI().toString();
    }

    public static bda a(bbr bbr2, int n, int n2, boolean bl, dxr dxr2) {
        if (bbr2 == null || dxr2 == null) {
            return null;
        }
        return new bda(bdh.cZT, n, bda.n(n2, bl), dxr2.bzy().getTimeInMillis(), bbr2.abB().enw(), bbr2.akp());
    }

    public static bda[] a(gmb gmb2, bbr bbr2, dxr dxr2) {
        if (gmb2 == null || bbr2 == null || dxr2 == null) {
            return null;
        }
        if (gmb2.bVQ() == null || gmb2.bVQ().length == 0) {
            return new bda[0];
        }
        bda[] bdaArray = new bda[gmb2.bVQ().length];
        for (int i = 0; i < gmb2.bVQ().length; ++i) {
            bdaArray[i] = bda.a(bbr2, gmb2.bVQ()[i].ResourceType, gmb2.bVQ()[i].asi, gmb2.bVQ()[i].dIU, dxr2);
        }
        return bdaArray;
    }

    public static bda a(eiw eiw2, azb azb2, dxr dxr2) {
        if (eiw2 == null || azb2 == null || dxr2 == null) {
            return null;
        }
        return new bda(bdh.cZX, cug.fkb, bda.n(eiw2.asi, true), dxr2.bzy().getTimeInMillis(), azb2.Xt(), eiw2.fyj);
    }

    public static bda a(azb azb2, aze aze2, bbr bbr2, dxr dxr2, boolean bl) {
        if (bbr2 == null || dxr2 == null) {
            return null;
        }
        return new bda(bdh.cZT, cug.fqf, bda.n(aze2.acN(), !bl), dxr2.bzy().getTimeInMillis(), bbr2.abB().enw(), bbr2.akp(), azb2.Xt(), aze2.az());
    }

    public static bda a(bbf bbf2, int n, dxr dxr2) {
        if (bbf2 == null || dxr2 == null) {
            return null;
        }
        return new bda(bdh.cZW, cug.fkb, bda.n(n, true), dxr2.bzy().getTimeInMillis(), bbf2.ajH());
    }

    public static bda[] a(fcc fcc2, bbj bbj2, dxr dxr2) {
        if (fcc2 == null || bbj2 == null || dxr2 == null) {
            return null;
        }
        if (fcc2.bqd == null || fcc2.iIY == null || fcc2.bqd.length != fcc2.iIY.length || fcc2.bqd.length == 0) {
            return new bda[0];
        }
        bda[] bdaArray = new bda[fcc2.bqd.length];
        long l = dxr2.bzy().getTimeInMillis();
        for (int i = 0; i < fcc2.bqd.length; ++i) {
            bdaArray[i] = new bda(bdh.cZU, fcc2.bqd[i], bda.n(fcc2.iIY[i], true), l, bbj2.akc());
        }
        return bdaArray;
    }

    public static bda[] a(exs exs2, bbf bbf2, bbr bbr2, dxr dxr2) {
        if (exs2 == null || bbf2 == null || dxr2 == null) {
            return null;
        }
        if (exs2.dzL == null || exs2.dzM == null || exs2.dzL.length != exs2.dzM.length || exs2.dzL.length == 0) {
            return new bda[0];
        }
        bda[] bdaArray = new bda[exs2.dzL.length];
        long l = dxr2.bzy().getTimeInMillis();
        for (int i = 0; i < exs2.dzL.length; ++i) {
            bdaArray[i] = bbr2 == null ? new bda(bdh.cZV, exs2.dzL[i], bda.n(exs2.dzM[i], true), l, bbf2.ajH()) : new bda(bdh.cZV, exs2.dzL[i], bda.n(exs2.dzM[i], true), l, bbr2.abB().enw(), bbr2.akp(), bbf2.ajH());
        }
        return bdaArray;
    }

    public static bda[] a(exw exw2, bbf bbf2, dxr dxr2) {
        if (exw2 == null || bbf2 == null || dxr2 == null) {
            return null;
        }
        if (exw2.iFr == null || exw2.iFs == null || exw2.iFr.length != exw2.iFs.length || exw2.iFr.length == 0) {
            return new bda[0];
        }
        bda[] bdaArray = new bda[exw2.iFr.length];
        long l = dxr2.bzy().getTimeInMillis();
        for (int i = 0; i < exw2.iFr.length; ++i) {
            bdaArray[i] = new bda(bdh.cZW, exw2.iFr[i], bda.n(exw2.iFs[i], true), l, bbf2.ajH());
        }
        return bdaArray;
    }

    public static bda a(int n, String string, ldv ldv2, String string2, bbr bbr2, dxr dxr2) {
        if (dxr2 == null) {
            return null;
        }
        return new bda(bdh.cZY, cug.fkb, bda.n(n, false), dxr2.bzy().getTimeInMillis(), bbr2.abB().enw(), bbr2.akp(), string, ldv2, string2);
    }

    public static bda a(int n, String string, dxr dxr2) {
        if (dxr2 == null) {
            return null;
        }
        return new bda(bdh.cZZ, cug.fkb, bda.n(n, true), dxr2.bzy().getTimeInMillis(), string);
    }

    public static bda a(int n, String string, ldv ldv2, String string2, dxr dxr2) {
        if (dxr2 == null) {
            return null;
        }
        return new bda(bdh.cZZ, cug.fkb, bda.n(n, true), dxr2.bzy().getTimeInMillis(), string, ldv2, string2);
    }

    public static bda b(int n, String string, ldv ldv2, String string2, dxr dxr2) {
        if (dxr2 == null) {
            return null;
        }
        return new bda(bdh.cZY, cug.fkb, bda.n(n, true), dxr2.bzy().getTimeInMillis(), string, ldv2, string2);
    }

    public static bda a(int n, String string, int n2, ldv ldv2, String string2, dxr dxr2) {
        if (dxr2 == null) {
            return null;
        }
        return new bda(bdh.daa, cug.fkb, bda.n(n, true), dxr2.bzy().getTimeInMillis(), string, n2, ldv2, string2);
    }

    public static bda a(bao bao2, int n, bbc bbc2, bbr bbr2, dxr dxr2) {
        if (bao2 == null || bbc2 == null || bbr2 == null || dxr2 == null) {
            return null;
        }
        return new bda(bdh.dab, cug.fkb, bda.n(n, false), dxr2.bzy().getTimeInMillis(), bbr2.abB().enw(), bbr2.akp(), bao2.aiL(), bao2.g(bbc2.ajz()), bao2.h(bbc2.ajz()));
    }

    public static bda a(bao bao2, int n, bbc bbc2, dxr dxr2) {
        if (bao2 == null || bbc2 == null || dxr2 == null) {
            return null;
        }
        return new bda(bdh.dab, cug.fkb, bda.n(n, true), dxr2.bzy().getTimeInMillis(), bao2.aiL(), bao2.g(bbc2.ajz()), bao2.h(bbc2.ajz()));
    }

    public static bda b(bao bao2, int n, bbc bbc2, dxr dxr2) {
        if (bao2 == null || bbc2 == null || dxr2 == null) {
            return null;
        }
        return new bda(bdh.dac, cug.fkb, bda.n(n, true), dxr2.bzy().getTimeInMillis(), bao2.aiL(), bao2.g(bbc2.ajz()), bao2.h(bbc2.ajz()));
    }
}

