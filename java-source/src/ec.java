/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  ari
 *  ash
 *  dta
 *  eg
 *  lcr
 *  lcw
 */
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Pattern;
import org.w3c.dom.Node;

public class ec
extends btk
implements bto {
    private ldv oJ;
    private ljq oK;
    private ldv nN;
    private String oL;
    private boolean oM;
    private a oN = a.pg;
    private final Set<String> oO = lcn.emx();
    private int oP = -1;
    private List<String> oQ = lcn.emv();
    private final Set<ldv> oR = lcn.emx();
    private int oS = 0;
    private final jxl oT = new jxl();
    private final TreeSet<b> oU = lcn.emH();
    private double oV = 0.0;
    private eg oW;

    @Override
    public void cleanUp() {
        super.cleanUp();
    }

    @Override
    public void doTick(ldz ldz2) {
        this.n(ldz2);
    }

    @Override
    public void initialize() {
        if (mje.DBX) {
            assert (mje.DCa != null);
            this.oQ = mje.DCa;
            for (String string : this.oQ) {
            }
        } else if (mje.DBW) {
            this.dy();
        }
        this.oW = (eg)((dta)this.MessageDelegator).bzt().d(lcr.qAE);
        assert (this.oW != null);
        this.nN = this.oW.dU();
        assert (this.nN != null);
        assert (this.oQ != null && !this.oQ.isEmpty());
        this.oN = a.ph;
        mje.DBe = 0L;
    }

    @Override
    public void receiveResourceResponse(ktf ktf2) {
        if (ktf2.egN() == 8) {
            if (((kta)ktf2).getResult() == 0) {
                --this.oP;
                if (this.oP != 0) {
                    return;
                }
                if (this.oN == a.pe) {
                    this.oN = a.pc;
                }
                return;
            }
            lfn.b(5, this.getClass().getSimpleName(), "receiveResourceResponse() ERROR loading Tile " + ((kta)ktf2).ecp() + " !!");
            return;
        }
        super.receiveResourceResponse(ktf2);
    }

    @Override
    public void receiveResponse(ktv ktv2) {
        switch (ktv2.egT()) {
            case 524: {
                this.a((kvv)ktv2);
                break;
            }
            case 1024: {
                assert (this.oS > 0);
                --this.oS;
                if (this.oS != 0) break;
                this.oN = a.oY;
                break;
            }
            default: {
                super.receiveResponse(ktv2);
            }
        }
    }

    public void r(List<String> list) {
        this.oQ = list;
    }

    private void a(String string, lgs lgs2) {
        lgs lgs3;
        ljq ljq2;
        String string2;
        int n2 = (int)lcw.qGD.x;
        int n3 = (int)lcw.qGD.rlV;
        ljq ljq3 = lcw.zh((String)string);
        lej lej2 = lcw.zf((String)string);
        int n4 = 31;
        lgs lgs4 = new lgs((int)ljq3.x, (int)ljq3.rlV, n2, n3);
        assert (lgs2.x(lgs4)) : "Spawnpoint Does not intersect with MainTile [" + string + "]. SpawnRect = " + lgs2 + ", TileRect = " + lgs4;
        if (lej2.getY() > 0 && !"out_of_bounds".equalsIgnoreCase(string2 = lcw.f((lej)new lej(lej2.getX(), lej2.getY() - 1)).toLowerCase())) {
            ljq2 = lcw.zh((String)string2);
            lgs3 = new lgs((int)ljq2.x, (int)ljq2.rlV, n2, n3);
            if (lgs3.x(lgs2) && this.oO.add(string2) && lgs2.cg + lgs2.H > lgs3.cg + lgs3.H) {
                this.a(string2, lgs2);
            }
        }
        if (lej2.getY() < 31 && !"out_of_bounds".equalsIgnoreCase(string2 = lcw.f((lej)new lej(lej2.getX(), lej2.getY() + 1)).toLowerCase())) {
            ljq2 = lcw.zh((String)string2);
            lgs3 = new lgs((int)ljq2.x, (int)ljq2.rlV, n2, n3);
            if (lgs3.x(lgs2) && this.oO.add(string2) && lgs2.cg < lgs3.cg) {
                this.a(string2, lgs2);
            }
        }
        if (lej2.getX() < 31 && !"out_of_bounds".equalsIgnoreCase(string2 = lcw.f((lej)new lej(lej2.getX() + 1, lej2.getY())).toLowerCase())) {
            ljq2 = lcw.zh((String)string2);
            lgs3 = new lgs((int)ljq2.x, (int)ljq2.rlV, n2, n3);
            if (lgs3.x(lgs2) && this.oO.add(string2) && lgs2.cf < lgs3.cf) {
                this.a(string2, lgs2);
            }
        }
        if (lej2.getX() > 0 && !"out_of_bounds".equalsIgnoreCase(string2 = lcw.f((lej)new lej(lej2.getX() - 1, lej2.getY())).toLowerCase())) {
            ljq2 = lcw.zh((String)string2);
            lgs3 = new lgs((int)ljq2.x, (int)ljq2.rlV, n2, n3);
            if (lgs3.x(lgs2) && this.oO.add(string2) && lgs2.cf + lgs2.rmN > lgs3.cf + lgs3.rmN) {
                this.a(string2, lgs2);
            }
        }
        if (lej2.getX() > 0 && lej2.getY() > 0 && !"out_of_bounds".equalsIgnoreCase(string2 = lcw.f((lej)new lej(lej2.getX() - 1, lej2.getY() - 1)).toLowerCase())) {
            ljq2 = lcw.zh((String)string2);
            lgs3 = new lgs((int)ljq2.x, (int)ljq2.rlV, n2, n3);
            if (lgs3.x(lgs2) && this.oO.add(string2) && lgs2.cg + lgs2.H > lgs3.cg + lgs3.H && lgs2.cf + lgs2.rmN > lgs3.cf + lgs3.rmN) {
                this.a(string2, lgs2);
            }
        }
        if (lej2.getX() < 31 && lej2.getY() > 0 && !"out_of_bounds".equalsIgnoreCase(string2 = lcw.f((lej)new lej(lej2.getX() + 1, lej2.getY() - 1)).toLowerCase())) {
            ljq2 = lcw.zh((String)string2);
            lgs3 = new lgs((int)ljq2.x, (int)ljq2.rlV, n2, n3);
            if (lgs3.x(lgs2) && this.oO.add(string2) && lgs2.cg + lgs2.H > lgs3.cg + lgs3.H && lgs2.cf < lgs3.cf) {
                this.a(string2, lgs2);
            }
        }
        if (lej2.getX() > 0 && lej2.getY() < 31 && !"out_of_bounds".equalsIgnoreCase(string2 = lcw.f((lej)new lej(lej2.getX() - 1, lej2.getY() + 1)).toLowerCase())) {
            ljq2 = lcw.zh((String)string2);
            lgs3 = new lgs((int)ljq2.x, (int)ljq2.rlV, n2, n3);
            if (lgs3.x(lgs2) && this.oO.add(string2) && lgs2.cg < lgs3.cg && lgs2.cf + lgs2.rmN > lgs3.cf + lgs3.rmN) {
                this.a(string2, lgs2);
            }
        }
        if (lej2.getX() < 31 && lej2.getY() < 31 && !"out_of_bounds".equalsIgnoreCase(string2 = lcw.f((lej)new lej(lej2.getX() + 1, lej2.getY() + 1)).toLowerCase())) {
            ljq2 = lcw.zh((String)string2);
            lgs3 = new lgs((int)ljq2.x, (int)ljq2.rlV, n2, n3);
            if (lgs3.x(lgs2) && this.oO.add(string2) && lgs2.cg < lgs3.cg && lgs2.cf < lgs3.cf) {
                this.a(string2, lgs2);
            }
        }
    }

    private void dy() {
        jrw[] jrwArray;
        int n2;
        ArrayList<String> arrayList = lcn.emv();
        for (int i2 = 0; i2 < 32; ++i2) {
            for (n2 = 0; n2 < 32; ++n2) {
                jrwArray = lcw.f((lej)new lej(i2, n2)).toLowerCase();
                jrw jrw2 = new jrw(lcw.qLb + "xml-files/objectspace/built_tiles/" + (String)jrwArray);
                if (!jrw2.exists()) continue;
                arrayList.add((String)jrwArray);
            }
        }
        jrw jrw3 = new jrw(lcw.qLb + "xml-files/objectspace/testing/");
        assert (jrw3.exists());
        n2 = 0;
        jrwArray = jrw3.dRT();
        for (jrw jrw4 : jrwArray) {
            jrw jrw5 = jrw4;
            if (!jrw5.isDirectory() || jrw5.getName().equals("CVS") || jrw5.getName().equals(".svn")) continue;
            arrayList.add(jrw5.getName());
            ++n2;
        }
        this.oQ = arrayList;
    }

    private void n(ldz ldz2) {
        switch (this.oN) {
            case ph: {
                if (this.oQ.isEmpty()) {
                    lfn.b(0, this.getClass().getSimpleName(), "checkLevelMinimapStatus() : --Completed NavMesh Generation. Exiting application--");
                    this.dk();
                    return;
                }
                this.oM = false;
                this.oV = ldz2.rgz;
                this.oL = this.oQ.remove(0);
                this.oN = a.pb;
                break;
            }
            case pb: {
                this.oN = a.pf;
                this.dA();
                break;
            }
            case pf: {
                this.oN = a.pd;
                this.dE();
                break;
            }
            case pd: {
                this.oN = a.pe;
                this.dD();
                break;
            }
            case pe: {
                break;
            }
            case pc: {
                this.oN = a.oZ;
                break;
            }
            case oZ: {
                this.dz();
                this.oN = a.pa;
                break;
            }
            case pa: {
                boolean bl = true;
                for (ldv ldv2 : this.oR) {
                    if (this.MessageDelegator.d(ldv2) == null) continue;
                    bl = false;
                    break;
                }
                if (!bl) break;
                if (!this.oM) {
                    this.oN = a.oZ;
                    return;
                }
                this.oN = a.pi;
                break;
            }
            case pi: {
                this.dF();
                this.oN = a.pj;
                break;
            }
            case pj: {
                break;
            }
            case oY: {
                this.oN = a.ph;
                break;
            }
        }
    }

    private void dk() {
        this.cleanUp();
        System.exit(0);
    }

    private String X(String string) {
        String string2 = "full/" + string + "_full" + ".lvl";
        if (!new File(lcw.qLb + "level/" + string2).exists()) {
            return string + ".lvl";
        }
        return string2;
    }

    private void dz() {
        if (this.oU.isEmpty()) {
            this.oM = true;
            return;
        }
        this.oR.clear();
        b b2 = this.oU.pollFirst();
        for (ash ash2 : b2.pl) {
            ldv ldv2 = this.MessageDelegator.bzv();
            ash2.setGUID(ldv2);
            this.MessageDelegator.a((amf)ash2);
            this.oR.add(ldv2);
            ash2.Tr();
        }
    }

    private void dA() {
        if (Pattern.matches("[a-zA-Z][a-fA-F]{0,1}[0-9]{2}", this.oL)) {
            if (mje.DCc) {
                this.dC();
            }
            this.dB();
            if (this.oU.isEmpty()) {
                this.oN = a.ph;
            }
            this.oK = lcw.zh((String)this.oL);
            return;
        }
        btg btg2 = fy.ax.get(this.oL);
        if (btg2 == null) {
            this.oN = a.ph;
            return;
        }
        if (this.oL.contains("_dungeon")) {
            bst bst2 = btg2.axy().get(0);
            assert (bst2 != null) : "Level is null for Zone = " + btg2.axz();
            this.Y(bst2.axg());
            this.oK = bst2.axh().axe();
            return;
        }
        this.oN = a.ph;
    }

    private void Y(int n2) {
        if (n2 == -1) {
            lfn.b(5, this.getClass().getSimpleName(), "getSpawnpointsFromDungeon() : TileID for TileName [" + this.oL + "] is -1.");
            System.exit(1);
            return;
        }
        List<bsv> list = fy.TF.get(n2);
        if (list == null || list.isEmpty()) {
            this.oN = a.ph;
            return;
        }
        this.oO.add(this.oL);
        for (bsv bsv2 : list) {
            arf arf2;
            assert (bsv2 instanceof btd) : "LevelObject [" + bsv2 + "] is not SFLevelObjectSpawnPoint";
            btd btd2 = (btd)bsv2;
            ari ari2 = this.oT.vk(btd2.axo());
            if (ari2 == null) {
                lfn.b(5, this.getClass().getSimpleName(), "getSpawnpointsFromDungeon() : Spawnpoint [] does not exist or could not be parsed!");
                continue;
            }
            if (!this.aa(ari2.getName())) continue;
            b b2 = new b(this);
            b2.Name = ari2.getName();
            ash ash2 = ash.a((ljq)btd2.av(), (float)ari2.getRadius(), (ash.c)ari2.Rr(), (String)ari2.getName());
            b2.a(ash2);
            if (mje.DBV && (arf2 = jvj.uu(b2.Name)) != null && arf2.QH() != arf.b.bOA) {
                for (String string : arf2.QG()) {
                    String string2;
                    if (string.equalsIgnoreCase(string2 = b2.Name + ".xml")) continue;
                    String string3 = string.substring(0, string.indexOf(95)).toLowerCase();
                    this.oO.add(string3);
                    if (string2.hashCode() >= string.hashCode()) continue;
                    try {
                        ash ash3 = ash.a((ljq)btd2.av(), (ljq)this.Z(string), (float)500.0f, (ash.c)ari2.Rr(), (String)(b2.Name + "_" + string.substring(0, string.indexOf(46))));
                        b2.a(ash3);
                    }
                    catch (bo bo2) {
                        bo2.printStackTrace();
                    }
                }
            }
            this.oU.add(b2);
        }
    }

    private void dB() {
        List<bsv> list = this.Y(this.oL);
        if (list == null || list.isEmpty()) {
            return;
        }
        this.oO.add(this.oL);
        for (bsv bsv2 : list) {
            arf arf2;
            assert (bsv2 instanceof btd) : "LevelObject [" + bsv2 + "] is not SFLevelObjectSpawnPoint";
            btd btd2 = (btd)bsv2;
            ari ari2 = this.oT.vk(btd2.axo());
            if (ari2 == null) {
                lfn.b(5, this.getClass().getSimpleName(), "getSpawnpointsFromTile() : Spawnpoint [] does not exist or could not be parsed!");
                continue;
            }
            if (!this.aa(ari2.getName())) continue;
            b b2 = new b(this);
            b2.Name = ari2.getName();
            ash ash2 = ash.a((ljq)btd2.av(), (float)ari2.getRadius(), (ash.c)ari2.Rr(), (String)ari2.getName());
            b2.a(ash2);
            if (mje.DBV && (arf2 = jvj.uu(b2.Name)) != null && arf2.QH() != arf.b.bOA) {
                for (String string : arf2.QG()) {
                    String string2;
                    if (string.equalsIgnoreCase(string2 = b2.Name + ".xml")) continue;
                    String string3 = string.substring(0, string.indexOf(95)).toLowerCase();
                    this.oO.add(string3);
                    if (string2.hashCode() >= string.hashCode()) continue;
                    try {
                        ash ash3 = ash.a((ljq)btd2.av(), (ljq)this.Z(string), (float)500.0f, (ash.c)ari2.Rr(), (String)(b2.Name + "_" + string.substring(0, string.indexOf(46))));
                        b2.a(ash3);
                    }
                    catch (bo bo2) {
                        bo2.printStackTrace();
                    }
                }
            }
            this.oU.add(b2);
            float f2 = ari2.getRadius();
            ljq ljq2 = btd2.av();
            lgs object2 = new lgs((int)(ljq2.x - f2), (int)(ljq2.rlV - f2), (int)(f2 * 2.0f), (int)(f2 * 2.0f));
            this.a(this.oL, object2);
        }
    }

    private List<bsv> Y(String string) {
        int n2 = new myy().Eg(string);
        if (n2 == -1) {
            lfn.b(5, this.getClass().getSimpleName(), "getSpawnpointsFromTile() : TileID for TileName [" + string + "] is -1.");
            System.exit(1);
        }
        return fy.TF.get(n2);
    }

    private void dC() {
        if (!this.aa(this.oL)) {
            return;
        }
        float f2 = jxn.vq(this.oL);
        if (f2 < 0.0f) {
            return;
        }
        f2 = f2 == 0.0f ? 500.0f : f2;
        ljq ljq2 = lcw.zh((String)this.oL);
        ljq ljq3 = new ljq(ljq2.x + lcw.qGD.x / 2.0f, ljq2.y, ljq2.rlV + lcw.qGD.rlV / 2.0f);
        b b2 = new b(this);
        b2.Name = this.oL;
        ash ash2 = ash.b((ljq)ljq3, (float)f2, (ash.c)ash.c.bVu, (String)b2.Name);
        b2.a(ash2);
        this.oU.add(b2);
        this.oO.add(this.oL);
    }

    private ljq Z(String string) {
        Object object;
        StringBuilder stringBuilder = new StringBuilder();
        if (string.contains("_dungeon")) {
            stringBuilder.append("xml-files/objectspace/dungeons/");
            stringBuilder.append(string.substring(0, string.indexOf(95)));
            stringBuilder.append("/");
            stringBuilder.append("_dungeon".substring(1));
            object = string.substring(string.indexOf("_dungeon") + "_dungeon".length());
            stringBuilder.append(((String)object).substring(0, ((String)object).indexOf(95)));
            stringBuilder.append("/");
            stringBuilder.append(string);
        } else {
            stringBuilder.append("xml-files/objectspace/built_tiles/");
            stringBuilder.append(string.substring(0, string.indexOf(95)));
            stringBuilder.append("/");
            stringBuilder.append(string);
        }
        object = jsy.tJ(stringBuilder.toString());
        Node node = jsy.a("SFObjectSpace", (Node)object);
        Node node2 = jsy.a("SpawnPointTemplateReference", node);
        Node node3 = jsy.a("Position", node2);
        return jsy.w(node3);
    }

    private void a(kvv kvv2) {
        assert (false) : "not supported";
        if (kvv2.bQF()) {
            if (kvv2.bQG() == 0 && kvv2.Wb() == 0) {
                lfn.b(4, this.getClass().getSimpleName(), "handleAreaLoadSensorResponse() No objects? Sensor active before loading started? LoadCount = 0, TotalCount = 0.");
                return;
            }
            this.a(true, true);
            this.oN = a.pc;
        }
    }

    private boolean aa(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        long l2 = 0L;
        long l3 = 0L;
        long l4 = 0L;
        if (string.contains("_dungeon")) {
            stringBuilder.append(lcw.qLb);
            stringBuilder.append("xml-files/objectspace/dungeons/");
            stringBuilder.append(string.substring(0, string.indexOf(95)));
            stringBuilder.append("/");
            stringBuilder.append("_dungeon".substring(1));
            String string2 = string.substring(string.indexOf("_dungeon") + "_dungeon".length());
            stringBuilder.append(string2.substring(0, string2.indexOf(95)));
            jrw jrw2 = new jrw(stringBuilder.toString());
            assert (jrw2.exists());
            l2 = jrw2.lastModified();
            for (jrw jrw3 : jrw2.dRT()) {
                long l5;
                if (jrw3.isDirectory() || l2 >= (l5 = jrw3.lastModified())) continue;
                l2 = l5;
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append(lcw.qLb);
            stringBuilder.append("xml-files/object/spawnpoint/");
            stringBuilder.append(string);
            stringBuilder.append(".xml");
            jrw2 = new jrw(stringBuilder.toString());
            assert (jrw2.exists());
            l4 = jrw2.lastModified();
            stringBuilder = new StringBuilder();
            stringBuilder.append(lcw.qLb);
            stringBuilder.append("pathgraphs/");
            stringBuilder.append("nm_");
            stringBuilder.append(string);
            jrw2 = new jrw(stringBuilder.toString());
            if (!jrw2.exists()) {
                return true;
            }
            l3 = jrw2.lastModified();
            return l3 < l4 || l3 < l2;
        }
        if (string.contains("_spawns_")) {
            stringBuilder.append(lcw.qLb);
            stringBuilder.append("xml-files/objectspace/built_tiles/");
            stringBuilder.append(string.substring(0, string.indexOf(95)));
            jrw jrw4 = new jrw(stringBuilder.toString());
            assert (jrw4.exists());
            l2 = jrw4.lastModified();
            for (jrw jrw5 : jrw4.dRT()) {
                long l6;
                if (jrw5.isDirectory() || l2 >= (l6 = jrw5.lastModified())) continue;
                l2 = l6;
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append(lcw.qLb);
            stringBuilder.append("xml-files/object/spawnpoint/");
            stringBuilder.append(string);
            stringBuilder.append(".xml");
            jrw4 = new jrw(stringBuilder.toString());
            assert (jrw4.exists());
            l4 = jrw4.lastModified();
            stringBuilder = new StringBuilder();
            stringBuilder.append(lcw.qLb);
            stringBuilder.append("pathgraphs/");
            stringBuilder.append("nm_");
            stringBuilder.append(string);
            jrw4 = new jrw(stringBuilder.toString());
            if (!jrw4.exists()) {
                return true;
            }
            l3 = jrw4.lastModified();
            return l3 < l4 || l3 < l2;
        }
        stringBuilder.append(lcw.qLb);
        stringBuilder.append("xml-files/objectspace/built_tiles/");
        stringBuilder.append(string);
        jrw jrw6 = new jrw(stringBuilder.toString());
        assert (jrw6.exists());
        l2 = jrw6.lastModified();
        stringBuilder = new StringBuilder();
        for (jrw jrw7 : jrw6.dRT()) {
            long l7;
            if (jrw7.isDirectory() || l2 >= (l7 = jrw7.lastModified())) continue;
            l2 = l7;
        }
        stringBuilder.append(lcw.qLb);
        stringBuilder.append("xml-files/object/spawntile/");
        stringBuilder.append(string);
        stringBuilder.append(".xml");
        jrw6 = new jrw(stringBuilder.toString());
        if (!jrw6.exists()) {
            return false;
        }
        l4 = jrw6.lastModified();
        stringBuilder = new StringBuilder();
        stringBuilder.append(lcw.qLb);
        stringBuilder.append("pathgraphs/");
        stringBuilder.append("tnm_");
        stringBuilder.append(string);
        jrw6 = new jrw(stringBuilder.toString());
        if (!jrw6.exists()) {
            return true;
        }
        l3 = jrw6.lastModified();
        return l3 < l4 || l3 < l2;
    }

    private void dD() {
        this.oP = this.oO.size();
        for (String string : this.oO) {
            string = this.X(string);
            krw krw2 = (krw)this.MessageDelegator.j(16);
            krw2.wQ(string);
            krw2.ts(this.GUID);
            krw2.xC(true);
            this.MessageDelegator.a(krw2);
        }
    }

    private void dE() {
        ljq ljq2 = new ljq(512.0f, 500.0f, 512.0f);
        ljq ljq3 = new ljq(1.5707963267948966, 0.0, 0.0);
        ljq ljq4 = this.oK;
        if (ljq4 == null) {
            ljq4 = mje.DBl;
        }
        ljq4.es(ljq2);
        edc edc2 = (edc)this.MessageDelegator.h(2049, this.GUID, this.nN);
        edc2.DH(12);
        edc2.a(new lgl(ljq3));
        edc2.c(ljq4);
        this.MessageDelegator.I(edc2);
    }

    private void a(boolean bl, boolean bl2) {
        assert (false) : "Not supported";
        int n2 = 1;
        if (this.oJ == null) {
            if (bl2) {
                lfn.b(4, this.getClass().getSimpleName(), "sendAreaLoadSensorRequest() : Can't remove sensor. AreaSensorGUID is null.");
                return;
            }
            this.oJ = this.MessageDelegator.bzv();
        } else {
            if (!bl2) assert (false) : "Can't add when sensor isn't null!";
            n2 = 2;
        }
        koh koh2 = (koh)this.MessageDelegator.h(524);
        koh2.ZQ(n2);
        koh2.ts(this.GUID);
        koh2.c(new ljq());
        koh2.setRadius(100.0f);
        koh2.sy(this.oJ);
        koh2.lQ(false);
        koh2.lm(bl);
        this.MessageDelegator.a(koh2);
        if (n2 == 2) {
            this.oJ = null;
        }
    }

    private void dF() {
        for (String string : this.oO) {
            string = this.X(string);
            kku kku2 = (kku)this.MessageDelegator.h(1036);
            kku2.YF(1);
            kku2.hC(ldv.rfe);
            kku2.wQ(string);
            kku2.ts(this.GUID);
            kku2.wD(true);
            this.MessageDelegator.a(kku2);
            ++this.oS;
        }
    }
}

