/*
 * Decompiled with CFR.
 */
import java.util.List;
import java.util.Map;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class jxz {
    jsa nWd = null;
    private final lju fzk = new lju(0, 2);
    private boolean pad = false;
    private final List<String> pae = lcn.emv();
    private List<String> paf = null;
    private final boolean bC = false;

    public boolean aI(ldz ldz2) {
        if (!this.pae.isEmpty()) {
            String string = this.pae.remove(0);
            jxd jxd2 = new jxd();
            jxd2.b(this.nWd);
            jxd2.vc(string);
            return true;
        }
        return false;
    }

    public void tw(String string) {
        jxd jxd2 = new jxd();
        jxd2.b(this.nWd);
        double d2 = System.currentTimeMillis();
        this.vx(string);
        if (this.paf != null && !this.paf.isEmpty()) {
            for (String string2 : this.paf) {
                if (this.pad) {
                    this.pae.add(string2);
                    continue;
                }
                double d3 = System.currentTimeMillis();
                jxd2.vc(string2);
            }
        }
    }

    private void vx(String string) {
        String string2;
        Node node;
        int n;
        double d2 = System.currentTimeMillis();
        assert (string != null);
        this.paf = null;
        Document document = null;
        try {
            document = jsy.tJ(string);
        }
        catch (bo bo2) {
            return;
        }
        Node node2 = jsy.a("SFWorldData", (Node)document);
        if (node2 == null) {
            assert (false);
            return;
        }
        lju lju2 = jsy.c(document);
        if (!this.fzk.b(lju2)) {
            assert (false);
            return;
        }
        NodeList nodeList = document.getElementsByTagName("SFWorldDataReference");
        String string3 = null;
        this.paf = lcn.emv();
        jxz jxz2 = null;
        for (n = 0; n < nodeList.getLength(); ++n) {
            string3 = "DescriptionFilename";
            node = jsy.a(string3, nodeList.item(n));
            if (node == null) {
                assert (false);
                continue;
            }
            string2 = jsy.m(node);
            if (string2 == null) {
                assert (false);
                continue;
            }
            if (jxz2 == null) {
                jxz2 = new jxz();
                jxz2.b(this.nWd);
                jxz2.vb(true);
            }
            jxz2.tw("xml-files/worlddata/" + string2);
            List<String> list = jxz2.dUJ();
            if (list == null) continue;
            this.paf.addAll(list);
        }
        nodeList = document.getElementsByTagName("SFObjectSpace");
        string3 = null;
        for (n = 0; n < nodeList.getLength(); ++n) {
            string3 = "DescriptionFilename";
            node = jsy.a(string3, nodeList.item(n));
            if (node == null) {
                assert (false);
                continue;
            }
            string2 = jsy.m(node);
            if (string2 == null) {
                assert (false);
                continue;
            }
            this.paf.add(string2);
        }
    }

    public Map<String, Map<ldv, amf>> d(jrw jrw2, boolean bl) {
        String string = jry.tr(jrw2.getAbsolutePath());
        assert (string != null);
        Map<String, Map<ldv, amf>> map = lcn.emw();
        jxd jxd2 = new jxd();
        jxd2.b(this.nWd);
        this.vx(string);
        if (this.paf != null && !this.paf.isEmpty()) {
            for (String string2 : this.paf) {
                map.put(string2, jxd2.b(jrw2, string2, bl));
            }
        }
        return map;
    }

    public void a(jrw jrw2, Map<String, Map<ldv, amf>> map) {
        String string = jry.tr(jrw2.getAbsolutePath());
        assert (string != null);
        jxd jxd2 = new jxd();
        jxd2.b(this.nWd);
        this.vx(string);
        if (this.paf != null && !this.paf.isEmpty()) {
            for (String string2 : this.paf) {
                map.put(string2, jxd2.f(jrw2, string2));
            }
        }
    }

    public Map<ldv, amf> a(jrw jrw2, boolean bl, boolean bl2) {
        String string = jry.tr(jrw2.getAbsolutePath());
        assert (string != null);
        Map<ldv, amf> map = lcn.emw();
        jxd jxd2 = new jxd();
        jxd2.b(this.nWd);
        this.vx(string);
        if (this.paf != null && !this.paf.isEmpty()) {
            for (String string2 : this.paf) {
                jxd2.va(bl2);
                map.putAll(jxd2.b(jrw2, string2, bl));
            }
        }
        return map;
    }

    public List<String> dUJ() {
        return this.paf;
    }

    public void b(jsa jsa2) {
        this.nWd = jsa2;
    }

    public String[] vy(String string) {
        this.vx("xml-files/worlddata/" + string);
        if (this.paf != null && !this.paf.isEmpty()) {
            return this.paf.toArray(new String[this.paf.size()]);
        }
        return null;
    }

    public final boolean dUK() {
        return this.pad;
    }

    public final void vb(boolean bl) {
        this.pad = bl;
    }
}

