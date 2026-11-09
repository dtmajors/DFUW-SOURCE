/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  lcw
 *  lqf
 */
import java.util.List;

public class kr
extends jk {
    private static final String TC = "SFConsoleCommandHandlerSpawner";

    @Override
    public void nU() {
        this.a(a.ark.toString().toLowerCase(), true, hc.aaP, lqf.saj, mhs.STRING, mhs.STRING);
        this.a(a.arl.toString().toLowerCase(), hc.aaP, lqf.sak, mhs.STRING);
        this.a(a.arm.toString().toLowerCase(), hc.aaP, lqf.sal, mhs.STRING);
        this.a(a.arn.toString().toLowerCase(), hc.aaP, lqf.sam, mhs.STRING);
        this.a(a.aro.toString().toLowerCase(), hc.aaP, lqf.san, mhs.STRING);
        this.a(a.arp.toString().toLowerCase(), hc.aaP, lqf.sao, mhs.STRING);
    }

    @Override
    public void a(jj jj2) {
        a a2 = this.bE(jj2.akV);
        if (a2 == null) {
            jj2.b(lqd.rXd.bD(jj2.akV), true);
            return;
        }
        switch (a2) {
            case ark: {
                this.bt(jj2);
                break;
            }
            case arl: {
                this.bu(jj2);
                break;
            }
            case arm: {
                this.bv(jj2);
                break;
            }
            case arn: {
                this.bw(jj2);
                break;
            }
            case aro: {
                this.bx(jj2);
                break;
            }
            case arp: {
                this.by(jj2);
                break;
            }
            default: {
                jj2.b(lqd.rXk.bD(jj2.akV), true);
            }
        }
    }

    private a bE(String string) {
        for (a a2 : a.values()) {
            if (!a2.toString().equalsIgnoreCase(string)) continue;
            return a2;
        }
        return null;
    }

    private void bt(jj jj2) {
        List<cte> list;
        if (!this.b(jj2)) {
            return;
        }
        String string = ((mhr)jj2.cA((int)0)).Value;
        int n = this.ResourceTree.getType(string);
        if (n <= 0) {
            lfn.b(5, TC, "spawnCorpse() ResourceName='" + string + "' is invalid.");
            jj2.b(lqd.rXo.bD(string), true);
            return;
        }
        if (!this.ResourceTree.isDescendant(n, cug.fgJ) && !this.ResourceTree.isDescendant(n, cug.fgG)) {
            lfn.b(5, TC, "spawnCorpse() ResourceName='" + string + "' is not a player or a monster.");
            jj2.b(lqd.rXo.bD(string), true);
            return;
        }
        fdn fdn2 = (fdn)this.MessageDelegator.h(9237, this.GUID, this.nW().getGUID().bFk());
        fdn2.bst = bkd.dqN;
        fdn2.aZG = this.nW().getGUID();
        fdn2.akX = this.nW().getGUID();
        fdn2.ResourceType = n;
        fdn2.DisplayName = string;
        if (jj2.getArgCount() > 1 && !(list = this.ba(((mhr)jj2.cA((int)1)).Value)).isEmpty()) {
            fdn2.dtP = list.toArray(new cte[list.size()]);
        }
        this.MessageDelegator.F(fdn2);
        jj2.nT();
    }

    private void bu(jj jj2) {
        if (!this.b(jj2)) {
            return;
        }
        String string = ((mhr)jj2.cA((int)0)).Value;
        int n = this.ResourceTree.getType(string);
        if (n <= 0) {
            lfn.b(5, TC, "spawnMonster() ResourceName='" + string + "' is invalid.");
            jj2.b(lqd.rXo.bD(string), true);
            return;
        }
        if (!this.ResourceTree.isDescendant(n, cug.fgG)) {
            lfn.b(5, TC, "spawnMonster() ResourceName='" + string + "' is not a monster.");
            jj2.b(lqd.rXo.bD(string), true);
            return;
        }
        fdn fdn2 = (fdn)this.MessageDelegator.h(9237, this.GUID, this.nW().getGUID().bFk());
        fdn2.bst = bkd.dqU;
        fdn2.aZG = this.nW().getGUID();
        fdn2.akX = this.nW().getGUID();
        fdn2.ResourceType = n;
        fdn2.DisplayName = string;
        this.MessageDelegator.F(fdn2);
        jj2.nT();
    }

    private void bv(jj jj2) {
        if (!this.b(jj2)) {
            return;
        }
        String string = ((mhr)jj2.cA((int)0)).Value;
        int n = this.ResourceTree.getType(string);
        if (n <= 0) {
            lfn.b(5, TC, "spawnMonsters() MonsterResourceName='" + string + "' is invalid.");
            jj2.b(lqd.rXo.bD(string), true);
            return;
        }
        if (!this.ResourceTree.isDescendant(n, cug.fgG)) {
            lfn.b(5, TC, "spawnMonsters() MonsterResourceName='" + string + "' is not a monster.");
            jj2.b(lqd.rXo.bD(string), true);
            return;
        }
        jrw jrw2 = new jrw(lcw.qLb + "xml-files/server/resource/");
        if (!jrw2.exists()) {
            lfn.b(5, TC, "spawnMonsters() Directory 'xml-files/server/resource/' does not exist.");
            return;
        }
        jrw[] jrwArray = jrw2.dRT();
        boolean bl = true;
        for (int i = 0; i < jrwArray.length; ++i) {
            String string2 = jrwArray[i].getName();
            if (!string2.startsWith("r_") || !string2.endsWith(".xml")) continue;
            if ((string2 = string2.substring(0, string2.length() - 4)) == null || string2.trim().equals("")) {
                lfn.b(5, TC, "spawnMonsters() FileName is invalid.");
                continue;
            }
            int n2 = this.ResourceTree.getType(string2);
            if (n2 <= 0) {
                lfn.b(5, TC, "spawnMonsters() ResourceName '" + string2 + "' is invalid.");
                continue;
            }
            if (!this.ResourceTree.isDescendant(n2, n)) continue;
            fdn fdn2 = (fdn)this.MessageDelegator.h(9237, this.GUID, this.nW().getGUID().bFk());
            fdn2.bst = bkd.dqV;
            fdn2.aZG = this.nW().getGUID();
            fdn2.akX = this.nW().getGUID();
            fdn2.ResourceType = n2;
            fdn2.DisplayName = string2;
            this.MessageDelegator.F(fdn2);
            jj2.nT();
        }
    }

    private void bw(jj jj2) {
        if (!this.b(jj2)) {
            return;
        }
        String string = ((mhr)jj2.cA((int)0)).Value;
        int n = this.ResourceTree.getType(string);
        if (n <= 0) {
            lfn.b(5, TC, "spawnResource() ResourceName='" + string + "' is invalid.");
            jj2.b(lqd.rXo.bD(string), true);
            return;
        }
        if (!this.ResourceTree.isDescendant(n, cug.fgB) && !this.ResourceTree.isDescendant(n, cug.fkp)) {
            lfn.b(5, TC, "spawnResource() ResourceName='" + string + "' is not a gankable player or a prop.");
            jj2.b(lqd.rXo.bD(string), true);
            return;
        }
        bvu bvu2 = (bvu)this.nW().aAG();
        if (bvu2 == null) {
            lfn.b(5, TC, "spawnResource() Player mesh object is null.");
            jj2.b(lqd.rXl.bD(jj2.akV), true);
            return;
        }
        ljq ljq2 = bvu2.azb();
        if (ljq2 == null) {
            lfn.b(5, TC, "spawnResource() Position is null.");
            jj2.b(lqd.rXl.bD(jj2.akV), true);
            return;
        }
        lgl lgl2 = bvu2.azc();
        if (lgl2 == null) {
            lfn.b(5, TC, "spawnResource() Rotation is null.");
            jj2.b(lqd.rXl.bD(jj2.akV), true);
            return;
        }
        fdj fdj2 = (fdj)this.MessageDelegator.h(9234, this.GUID, this.nW().getGUID().bFk());
        fdj2.bst = bkd.dqM;
        fdj2.aZG = this.nW().getGUID();
        fdj2.akX = this.nW().getGUID();
        fdj2.ResourceType = n;
        fdj2.Position = ljq2;
        fdj2.Rotation = lgl2;
        this.MessageDelegator.F(fdj2);
        jj2.nT();
    }

    private void bx(jj jj2) {
        if (!this.b(jj2)) {
            return;
        }
        String string = ((mhr)jj2.cA((int)0)).Value;
        int n = this.ResourceTree.getType(string);
        if (n <= 0) {
            lfn.b(5, TC, "spawnResourceMesh() ResourceName='" + string + "' is invalid.");
            jj2.b(lqd.rXo.bD(string), true);
            return;
        }
        bvu bvu2 = (bvu)this.nW().aAG();
        if (bvu2 == null) {
            lfn.b(5, TC, "spawnResourceMesh() Player mesh object is null.");
            jj2.b(lqd.rXl.bD(jj2.akV), true);
            return;
        }
        ljq ljq2 = bvu2.azb();
        if (ljq2 == null) {
            lfn.b(5, TC, "spawnResourceMesh() Position is null.");
            jj2.b(lqd.rXl.bD(jj2.akV), true);
            return;
        }
        lgl lgl2 = bvu2.azc();
        if (lgl2 == null) {
            lfn.b(5, TC, "spawnResourceMesh() Rotation is null.");
            jj2.b(lqd.rXl.bD(jj2.akV), true);
            return;
        }
        fdj fdj2 = (fdj)this.MessageDelegator.h(9234, this.GUID, this.nW().getGUID().bFk());
        fdj2.bst = bkd.dqS;
        fdj2.aZG = this.nW().getGUID();
        fdj2.akX = this.nW().getGUID();
        fdj2.ResourceType = n;
        fdj2.Position = ljq2;
        fdj2.Rotation = lgl2;
        this.MessageDelegator.F(fdj2);
        jj2.nT();
    }

    private void by(jj jj2) {
        if (!this.b(jj2)) {
            return;
        }
        String string = ((mhr)jj2.cA((int)0)).Value;
        int n = this.ResourceTree.getType(string);
        if (n <= 0) {
            lfn.b(5, TC, "spawnWildlife() ResourceName='" + string + "' is invalid.");
            jj2.b(lqd.rXo.bD(string), true);
            return;
        }
        if (!this.ResourceTree.isDescendant(n, cug.fgP)) {
            lfn.b(5, TC, "spawnWildlife() ResourceName='" + string + "' is not a wildlife.");
            jj2.b(lqd.rXo.bD(string), true);
            return;
        }
        fdn fdn2 = (fdn)this.MessageDelegator.h(9237, this.GUID, this.nW().getGUID().bFk());
        fdn2.bst = bkd.dqW;
        fdn2.aZG = this.nW().getGUID();
        fdn2.akX = this.nW().getGUID();
        fdn2.ResourceType = n;
        fdn2.DisplayName = string;
        this.MessageDelegator.F(fdn2);
        jj2.nT();
    }
}

