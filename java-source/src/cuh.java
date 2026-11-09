/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cbx
 *  cdb
 *  cug
 *  kah
 */
import java.util.Iterator;
import java.util.Map;

public class cuh {
    private Map<Integer, cbx> fxz = lcn.emw();
    private jyg fxA = null;
    private kah fxB = null;
    private boolean fxC = true;
    private static les ResourceTree = lea.enW();
    public static final cuh fxD = new cuh(true);

    public cuh(boolean bl) {
        this.fxC = bl;
        this.fxA = new jyg(this.fxC);
        this.fxB = new kah(this, this.fxC);
    }

    public kah bbQ() {
        return this.fxB;
    }

    public cxf bbR() {
        return this.fxB.bbR();
    }

    public cbx A(int n, boolean bl) {
        String string;
        assert (!this.fxC);
        if (n <= 0) {
            lfn.b(5, "SFResourceFactory", "createClientResource() ResourceType is invalid.");
            return null;
        }
        int n2 = 0;
        n2 = ResourceTree.isDescendant(n, cug.fgw) ? cug.fgw : (ResourceTree.isDescendant(n, cug.fgA) ? cug.fgA : (ResourceTree.isDescendant(n, cug.fgD) ? cug.fgD : (ResourceTree.isDescendant(n, cug.fnD) ? cug.fnD : (ResourceTree.isDescendant(n, cug.fgH) ? cug.fgH : (ResourceTree.isDescendant(n, cug.fnO) ? cug.fnO : (ResourceTree.isDescendant(n, cug.fnP) ? cug.fnP : (ResourceTree.isDescendant(n, cug.fnQ) ? cug.fnQ : (ResourceTree.isDescendant(n, cug.fgP) ? cug.fgP : n))))))));
        String string2 = ResourceTree.getName(n);
        if (string2 == null) {
            lfn.b(5, "SFResourceFactory", "createClientResource() ResourceType " + n2 + " is invalid.");
            return null;
        }
        Integer n3 = new Integer(n2);
        cbx cbx2 = null;
        if (!this.fxz.containsKey(n3)) {
            String string3;
            string = "xml-files/client/resource/";
            if (string.endsWith("/")) {
                string = string.substring(0, string.length() - 1);
            }
            if ((string3 = this.wM(n2)) == null) {
                lfn.b(5, "SFResourceFactory", "createClientResource() -----------------------------------------------------------------------------------------");
                lfn.b(5, "SFResourceFactory", "createClientResource() There is no defined XML-file for resource '" + string2 + "' or any of its ancestors.");
                lfn.b(5, "SFResourceFactory", "createClientResource() Tried this resourcefile '" + string3 + "'");
                lfn.b(5, "SFResourceFactory", "createClientResource() -----------------------------------------------------------------------------------------");
                return null;
            }
            cbx2 = this.a(string, string3, true);
            if (cbx2 == null) {
                lfn.b(5, "SFResourceFactory", "createClientResource() Loaded resource is null.");
                return null;
            }
            if (cbx2.az() != n) {
                cbx2.l(n);
            }
            if (cbx2.aIh() != null) {
                this.fxz.put(n3, cbx2);
            }
        } else {
            cbx2 = this.fxz.get(n3);
            if (cbx2 == null) {
                lfn.b(5, "SFResourceFactory", "createResource() Resource '" + string2 + "' was not found in resourcemap.");
                return null;
            }
        }
        string = cbx2;
        if (bl) {
            string = cbx2.aIk();
        }
        assert (n == string.az()) : "ResourceType=" + n + " TemplateResourceType=" + string.az();
        return string;
    }

    public cbx B(int n, boolean bl) {
        String string;
        assert (this.fxC);
        if (n <= 0) {
            lfn.b(5, "SFResourceFactory", "createResource() ResourceType is invalid.");
            return null;
        }
        String string2 = ResourceTree.getName(n);
        if (string2 == null) {
            lfn.b(5, "SFResourceFactory", "createResource() ResourceType " + n + " is invalid.");
            return null;
        }
        cbx cbx2 = null;
        if (!this.fxz.containsKey(n)) {
            String string3;
            Object object;
            String string4;
            string = null;
            string = this.fxC ? "xml-files/server/resource/" : "xml-files/client/resource/";
            if (string.endsWith("/")) {
                string = string.substring(0, string.length() - 1);
            }
            if ((string4 = this.wM(n)) == null) {
                lfn.b(5, "SFResourceFactory", "createResource() There is no defined XML-file for resource '" + string2 + "' or any of its ancestors.");
                return null;
            }
            cbx2 = this.a(string, string4, true);
            if (cbx2 == null) {
                lfn.b(5, "SFResourceFactory", "createResource() Loaded resource is null.");
                return null;
            }
            if (cbx2.aIh() == null) {
                lfn.b(5, "SFResourceFactory", "createResource() Resource '" + cbx2.pa() + "' does not have a meshobjectinfo.");
                return null;
            }
            if (cbx2.az() != n) {
                cbx2.l(n);
                object = (lgw)ResourceTree.acv(n);
                assert (object != null);
                cbx2.aIh().setFileName(((lgw)object).bBt());
            }
            object = cbx2.aIh().aza();
            if (cbx2.aAG() == null && bve.a((bve.a)((Object)object)) && !(string3 = cbx2.aIh().getFileName()).contains("smallcube")) {
                bvc bvc2 = this.fxA.d(string3, (bve.a)((Object)object));
                if (bvc2 == null) {
                    lfn.b(5, "SFResourceFactory", "createResource() Could not create animated meshobject '" + string3 + "' for resource '" + cbx2.pa() + "'");
                    return null;
                }
                cbx2.d((bvd)bvc2);
            }
            if (this.fxC) {
                cbx2.jm().ft();
            }
            this.fxz.put(n, cbx2);
        } else {
            cbx2 = this.fxz.get(n);
            if (cbx2 == null) {
                lfn.b(5, "SFResourceFactory", "createResource() Resource '" + string2 + "' was not found in resourcemap.");
                return null;
            }
        }
        string = cbx2;
        if (bl) {
            string = cbx2.aIk();
        }
        assert (n == string.az()) : "ResourceType=" + n + " TemplateResourceType=" + string.az();
        return string;
    }

    public cbx wL(int n) {
        if (n <= 0) {
            lfn.b(5, "SFResourceFactory", "getTemplateResource() ResoureceType is invalid.");
            return null;
        }
        cbx cbx2 = this.fxz.get(n);
        if (cbx2 != null) {
            return cbx2;
        }
        cbx2 = this.B(n, false);
        if (cbx2 == null) {
            lfn.b(5, "SFResourceFactory", "getTemplateResource() Resource '" + ResourceTree.getName(n) + "' could not be loaded.");
            return null;
        }
        return cbx2;
    }

    public cbx w(String string, String string2) {
        if (string == null) {
            lfn.b(5, "SFResourceFactory", "loadResourceFromBackup() BackupDirName is null.");
            return null;
        }
        if (string2 == null) {
            lfn.b(5, "SFResourceFactory", "loadResourceFromBackup() ResourceName is null.");
            return null;
        }
        String string3 = string2 + ".xml";
        cbx cbx2 = this.a(string, string3, false);
        if (cbx2 == null) {
            lfn.b(5, "SFResourceFactory", "loadResourceFromBackup() Loaded resource is null.");
            return null;
        }
        bve.a a2 = cbx2.aIh().aza();
        if (cbx2.aAG() == null && bve.a(a2)) {
            String string4 = cbx2.aIh().getFileName();
            bvc bvc2 = this.fxA.d(string4, a2);
            if (bvc2 == null) {
                lfn.b(5, "SFResourceFactory", "loadResourceFromBackup() Could not create animated meshobject '" + string4 + "' for resource '" + cbx2.pa() + "'");
                return null;
            }
            bvc2.setGUID(cbx2.aIh().getGUID());
            cbx2.d((bvd)bvc2);
        }
        return cbx2;
    }

    private cbx a(String string, String string2, boolean bl) {
        try {
            return this.fxB.d(string.toLowerCase(), string2.toLowerCase(), bl);
        }
        catch (bg bg2) {
            lfn.log("SFResourceFactory", bg2);
            return null;
        }
    }

    private String wM(int n) {
        lgw lgw2 = (lgw)ResourceTree.acv(n);
        while (lgw2 != null) {
            if (lgw2.erK()) {
                String string = lgw2.getName() + ".xml";
                return string;
            }
            lgw2 = (lgw)ResourceTree.i(lgw2);
        }
        return null;
    }

    public void w(cbx cbx2) {
        Object object;
        Object object2;
        if (cbx2 == null) {
            lfn.b(5, "SFResourceFactory", "addUsedResourceGUID() Resource is null.");
            return;
        }
        this.lK(cbx2.getGUID());
        if (cbx2.aAG() != null) {
            this.lK(cbx2.aAG().getGUID());
        }
        if (cbx2 instanceof cdb) {
            object2 = (cdb)cbx2;
            if (object2.aJC().asf() != null) {
                this.lK(object2.aJC().asf().getGUID());
            }
            object = object2.aJz().jl().values().iterator();
            while (object.hasNext()) {
                this.d((cxc)object.next());
            }
        }
        if (!(object2 = cbx2.aIu()).isEmpty()) {
            object = null;
            for (int i = 0; i < object2.size(); ++i) {
                object = (alm)object2.get(i);
                this.lK(((alm)object).getGUID());
            }
        }
    }

    public void a(cbx cbx2, ldv ldv2, ldv ldv3) {
        Object object;
        Object object2;
        if (cbx2 == null) {
            lfn.b(5, "SFResourceFactory", "assignGUIDToResource() Resource is null.");
            return;
        }
        if (ldv2 == null) {
            lfn.b(5, "SFResourceFactory", "assignGUIDToResource() OSGUID is null.");
            return;
        }
        if (ldv3 == null) {
            cbx2.setGUID(this.lL(ldv2));
        } else {
            cbx2.setGUID(ldv3);
        }
        if (cbx2.aAG() != null) {
            cbx2.aAG().setGUID(this.lL(ldv2));
        } else if (cbx2.aIh() != null) {
            cbx2.aIh().setGUID(this.lL(ldv2));
        }
        if (cbx2 instanceof cdb) {
            object2 = (cdb)cbx2;
            object2.aJC().setGUID(this.lL(ldv2));
            if (object2.aJC().asf() != null) {
                object2.aJC().asf().setGUID(this.lL(ldv2));
            }
            object = object2.aJz().jl().values().iterator();
            while (object.hasNext()) {
                this.b((cxc)object.next(), ldv2);
            }
        }
        if (cbx2 instanceof cni) {
            object2 = (cni)cbx2;
            ((cni)object2).aJC().setGUID(this.lL(ldv2));
            if (((cni)object2).aJC().asf() != null) {
                ((cni)object2).aJC().asf().setGUID(this.lL(ldv2));
            }
        }
        if (!(object2 = cbx2.aIu()).isEmpty()) {
            object = null;
            int n = object2.size();
            for (int i = 0; i < n; ++i) {
                object = (alm)object2.get(i);
                ((alm)object).setGUID(this.lL(ldv2));
            }
        }
    }

    public void a(cxc cxc2, ldv ldv2) {
        if (cxc2 == null) {
            lfn.b(5, "SFResourceFactory", "assignGUIDToSkillBase() Skill is null.");
            return;
        }
        if (ldv2 == null) {
            lfn.b(5, "SFResourceFactory", "assignGUIDToSkillBase() OSGUID is null.");
            return;
        }
        this.b(cxc2, ldv2);
    }

    private void h(cdb cdb2) {
        assert (cdb2 != null);
        assert (cdb2.getGUID() != null);
        Iterator iterator = cdb2.aJz().jl().values().iterator();
        while (iterator.hasNext()) {
            this.b((cxc)iterator.next(), cdb2.getGUID().bFk());
        }
    }

    private void b(cxc cxc2, ldv ldv2) {
        cxc2.setGUID(this.lL(ldv2));
        if (cxc2 instanceof czj) {
            czj czj2 = (czj)((Object)cxc2);
            czb[] czbArray = czj2.bhL();
            int n = czbArray.length;
            for (int i = 0; i < n; ++i) {
                this.b((cxc)((Object)czbArray[i]), ldv2);
            }
        }
    }

    private void lK(ldv ldv2) {
        ldx.enG().aci(ldv2.enw()).lK(ldv2);
    }

    private void d(cxc cxc2) {
        this.lK(cxc2.getGUID());
    }

    private ldv lL(ldv ldv2) {
        if (this.fxC) {
            ldv ldv3 = ldx.enG().fS(ldv2.ib(), ldv2.enw()).lL(ldv2);
            return ldv3;
        }
        return ldx.enG().aci(ldv2.enw()).lL(ldv2);
    }
}

