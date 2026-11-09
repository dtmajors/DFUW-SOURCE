/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  lcr
 *  lcw
 */
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class axw
extends btk
implements bto {
    private static final boolean ctu = true;
    private static final String ctv = "clan_cities";
    private b ctw = b.ctL;
    private boolean ctx = true;
    private List<jrw> cty;
    private jrw ctz;
    private axn.a ctA;
    private int ctB;
    private axn.a[] ctC = axn.a.values();
    private List<String> ctD = lcn.emv();
    private List<String> ctE = lcn.emv();
    private Map<String, String> ctF = lea.eoS();
    private List<String> ctG = lcn.emv();

    public axw() {
        this.ctG.add("all_clanstone_chaos001.xml");
        this.ctG.add("clan_building_alfar_bindstone_greater.xml");
        this.ctG.add("clan_building_dwarf_bindstone_greater.xml");
        this.ctG.add("clan_building_human_bindstone_greater.xml");
        this.ctG.add("clan_building_human_clanstone_greater.xml");
        this.ctG.add("clan_building_mahirim_bindstone_greater.xml");
        this.ctG.add("clan_building_mirdain_bindstone_greater.xml");
        this.ctG.add("clan_building_mirdain_clanstone_greater.xml");
        this.ctG.add("clan_building_ork_bindstone_greater.xml");
    }

    @Override
    public void initialize() {
        super.initialize();
        if (this.ctx) {
            this.dy();
        }
        assert (this.GUID != null);
        assert (this.cty != null);
        assert (this.cty.size() != 0);
    }

    private void dy() {
        ArrayList<jrw> arrayList = lcn.emv();
        for (int i = 0; i < 32; ++i) {
            for (int j = 0; j < 32; ++j) {
                jrw jrw2 = new jrw(lcw.qLb + "xml-files/objectspace/built_tiles/" + lcw.f((lej)new lej(i, j)).toLowerCase());
                if (!jrw2.exists()) continue;
                arrayList.add(jrw2);
            }
        }
        this.cty = arrayList;
    }

    @Override
    public void doTick(ldz ldz2) {
        switch (this.ctw) {
            case ctL: {
                if (this.cty.isEmpty()) {
                    this.ctw = b.ctO;
                    this.YN();
                    return;
                }
                this.ctz = this.cty.remove(0);
                this.ctw = b.ctM;
                this.YO();
                break;
            }
            case ctM: {
                break;
            }
            case ctN: {
                this.ctw = b.ctL;
                break;
            }
        }
    }

    private void YN() {
        this.c("Done City Preprocessing.", true);
        this.MessageDelegator.hd(this.GUID);
        if (!this.ctE.isEmpty()) {
            for (String string : this.ctE) {
            }
        }
        if (!this.ctD.isEmpty()) {
            for (String string : this.ctD) {
            }
        }
        if (this.ctx) {
            if (this.ctB > 0) {
                System.exit(1);
                return;
            }
            System.exit(0);
        }
    }

    private void YO() {
        Map<ldv, amf> map = this.a(this.ctz);
        if (map.isEmpty()) {
            this.ctw = b.ctN;
            return;
        }
        ArrayList<amf> arrayList = new ArrayList<amf>(map.values());
        axn axn2 = new axn();
        if (this.ctA == null) {
            this.ctw = b.ctN;
            this.ctD.add(this.ctz.getName() + " <- No Current Race");
            return;
        }
        axs axs2 = axn2.a(arrayList, this.ctA);
        if (axs2 == null) {
            this.ctw = b.ctN;
            this.ctD.add(this.ctz.getName() + " <-- Something Missing. Sphere?");
            return;
        }
        String string = null;
        lej lej2 = lcw.dW((ljq)axs2.Xv());
        String string2 = lcw.f((lej)lej2);
        string2 = this.ctF.get(string2.toLowerCase());
        assert (string2 != null) : "TileName is null for CityName = " + string;
        string = string2;
        this.ctE.add("Tile = " + this.ctz.getName() + ", CityName =" + string + ". Race =" + (Object)((Object)this.ctA));
        int n = 0;
        int n2 = (int)axn2.XI() + n;
        axs2.iq(n2);
        this.b(axs2);
        this.ctw = b.ctN;
    }

    private void b(axs axs2) {
        if (axs2 == null) {
            assert (false);
            return;
        }
        String string = lcw.dX((ljq)axs2.Xv());
        assert (string != null);
        Object object = lcw.dW((ljq)axs2.Xv());
        Object object2 = lcw.f((lej)object);
        object2 = this.ctF.get(((String)object2).toLowerCase());
        assert (object2 != null) : "TileName is null for CityName = " + string;
        string = object2;
        axs2.eK(string);
        axs2.setID(lpd.BH(string));
        object = axs2.getID() + ".xml";
        object2 = new jyj();
        ((jyj)object2).vE((String)object);
        jyk jyk2 = new jyk();
        jyk2.a((String)object, axs2);
        String string2 = "City saved as [" + (String)object + "]";
    }

    private void c(axs axs2) {
        Object object2;
        TreeMap<String, Object> treeMap = lcn.emG();
        List<axq> list = axs2.YG();
        for (axq object22 : list) {
            object2 = (a)treeMap.get(object22.Yp());
            if (object2 == null) {
                object2 = new a(this, null);
                ((a)object2).ResourceName = object22.Yp();
                ((a)object2).ctI = jry.tu(cug.uP((int)object22.Yo())) + ".xml";
                treeMap.put(((a)object2).ResourceName, object2);
            }
            ++((a)object2).ctJ;
        }
        Object object3 = "";
        for (Object object2 : treeMap.values()) {
            object3 = (String)object3 + ((a)object2).ctI + "," + ((a)object2).ResourceName + "," + ((a)object2).ctJ + "\n";
        }
        String string = lcw.dX((ljq)axs2.Xv());
        object2 = new jrw(lcw.qLb + "csv" + "/" + string + "_" + axs2.getID() + ".csv");
        if (!((jrw)object2).dRU().exists()) {
            boolean bl = ((jrw)object2).dRU().mkdir();
            assert (bl);
        }
        jry.a((jrw)object2, (String)object3);
    }

    /*
     * WARNING - void declaration
     */
    private Map<ldv, amf> a(jrw jrw2) {
        void var8_13;
        String string;
        void string3;
        Map<ldv, amf> map = lcn.emw();
        if (!jrw2.exists() || !jrw2.isDirectory()) {
            return map;
        }
        ArrayList<String> arrayList = lcn.emv();
        jrw[] jrwArray = jrw2.a(new jsl("xml"));
        String string2 = (lcw.qLb + "xml-files/objectspace/").replace('/', '\\');
        Object jxd2 = jrwArray;
        int n = ((jrw[])jxd2).length;
        boolean n2 = false;
        while (string3 < n) {
            block19: {
                jrw jrw3 = jxd2[string3];
                if (!jrw3.isDirectory()) {
                    String string4 = jrw3.getAbsolutePath();
                    string = null;
                    try {
                        string = jry.tk(string4);
                    }
                    catch (FileNotFoundException fileNotFoundException) {
                        break block19;
                    }
                    catch (IOException iOException) {
                        break block19;
                    }
                    if (string.contains(ctv)) {
                        this.ctA = null;
                        for (axn.a a2 : this.ctC) {
                            if (!string.contains(a2.toString())) continue;
                            this.ctA = a2;
                            break;
                        }
                        if (this.ctA != null) {
                            assert (string4.startsWith(string2));
                            String string5 = string4.substring(string2.length());
                            arrayList.add(string5);
                        }
                    }
                }
            }
            ++string3;
        }
        jxd2 = new jxd();
        if (arrayList != null && !arrayList.isEmpty()) {
            if (arrayList.size() > 1) {
                this.ctD.add("Tile [" + this.ctz.getName() + "] has [" + arrayList.size() + "] cities files..");
            }
            for (String string6 : arrayList) {
                Map<ldv, amf> map2 = ((jxd)jxd2).a(jrw2, string6, false, false);
                map = map2;
            }
        }
        if (map.isEmpty()) {
            return map;
        }
        n = 0;
        boolean bl = false;
        for (amf amf2 : map.values()) {
            string = amf2.getObjectDescriptionFilename();
            if (!string.contains(ctv)) continue;
            ++n;
            if (!this.ctG.contains(string = jry.tu(string) + ".xml")) continue;
            ++var8_13;
        }
        if (var8_13 == false && n == 1) {
            map.clear();
        }
        if (var8_13 == true && n == 1) {
            map.clear();
        } else if (n > 0) {
            // empty if block
        }
        return map;
    }

    private void c(String string, boolean bl) {
        haz haz2 = (haz)this.MessageDelegator.h(4098, this.GUID, lcr.qzr);
        haz2.lU(string);
        haz2.setMessageType(0);
        haz2.lV("LevelConverter");
        haz2.mT(bl);
        this.MessageDelegator.F(haz2);
    }
}

