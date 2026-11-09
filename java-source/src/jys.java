/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  bvf
 *  dqk
 *  dta
 *  jzc
 *  lcw
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class jys {
    private final String pau = lcw.qLb + "xml-files/objectspace/";
    protected jzc par = new jzc();
    private final lju paq = new lju(0, 1);
    protected boolean pav = false;
    private String dKK = null;
    private String paw = null;

    public void g(dta dta2) {
        this.a(dta2, false);
    }

    public void a(dta dta2, boolean bl) {
        String string = this.pau + dta2.getObjectDescriptionFilename();
        if (bl) {
            string = string + "temp.xml";
        }
        dta2.setObjectDescriptionFilename(dta2.getObjectDescriptionFilename());
        jrw jrw2 = new jrw(string);
        if (!jrw2.dRU().exists()) {
            jry.g(jrw2.dRU());
        }
        this.paw = jrw2.dRU().getName();
        this.dKK = dta2.getObjectDescriptionFilename();
        assert (this.dKK != null);
        boolean bl2 = false;
        Document document = this.par.dSD();
        Element element = document.createElement("SFObjectSpace");
        document.appendChild(element);
        this.a(element, this.par.b(document, dta2.getGUID()));
        this.a(element, this.par.b(document, this.paq));
        this.a(element, this.par.a(document, dta2.isActive(), "Active"));
        this.a(element, this.par.a(document, dta2.isLocked(), "Locked"));
        this.a(element, this.par.a(document, this.pav, "Inlined"));
        this.a(element, this.par.a(document, dta2.bzz(), "ObjectSpaceType"));
        ArrayList<dul> arrayList = null;
        List list = dta2.bzq();
        arrayList = list == null ? new ArrayList<dul>() : new ArrayList(list);
        ArrayList<amf> arrayList2 = new ArrayList<amf>(dta2.bzr());
        ArrayList<amf> arrayList3 = lcn.emv();
        for (amf amf2 : arrayList2) {
            if (!(amf2 instanceof bdl)) continue;
            arrayList3.addAll(this.a((bdl)((Object)amf2), arrayList2, arrayList));
        }
        arrayList2.removeAll(arrayList3);
        arrayList.removeAll(arrayList3);
        Object object = null;
        for (int i2 = 0; i2 < arrayList2.size(); ++i2) {
            object = arrayList2.get(i2);
            if (object instanceof bkb || !((amf)object).isWorldbuilderSaveable()) continue;
            this.a(bl2, document, element, arrayList, arrayList2, (amf)object);
        }
        for (dul dul2 : arrayList) {
            if (dul2.getRelationType() == 1028) continue;
            this.a(element, this.par.a(document, dul2, bl2));
        }
        jsz.a(document, jrw2);
    }

    protected void h(dta dta2) {
        String string = lcw.qLb + "xml-files/objectspace/";
        jrw jrw2 = new jrw(string + dta2.getObjectDescriptionFilename() + "temp.xml");
        if (!jrw2.exists()) {
            return;
        }
        jrw jrw3 = new jrw(string + dta2.getObjectDescriptionFilename());
        jry.a(jrw3, jrw2);
        jrw2.delete();
    }

    protected void a(boolean bl, Document document, Element element, List<dul> list, List<amf> list2, amf amf2) {
        int n = amf2.getObjectType();
        switch (n) {
            case 29: 
            case 38: {
                int n2 = ((bdl)((Object)amf2)).amc();
                if (!this.pav) {
                    this.a(element, this.par.a(document, (bdl)((Object)amf2), bl));
                    break;
                }
                list2.addAll(this.b((bdl)((Object)amf2)));
                break;
            }
            case 10: {
                this.a(element, this.par.a(document, (drr)amf2, bl));
                break;
            }
            case 5: 
            case 24: {
                this.a(element, this.par.a(document, (dqk)amf2, bl));
                break;
            }
            case 13: {
                this.a(element, this.par.a(document, (bvf)amf2, bl));
                break;
            }
            case 3: {
                this.a(element, this.par.a(document, (dld)amf2, bl));
                break;
            }
            case 33: {
                this.a(element, this.par.a(document, (drk)amf2, bl));
                break;
            }
            case 156: {
                this.a(element, this.par.a(document, (drl)amf2, bl));
                break;
            }
            case 9: {
                this.a(element, this.par.a(document, (drw)amf2, bl));
                break;
            }
            case 37: {
                if (((dul)amf2).getRelationType() == 1028) break;
                this.a(element, this.par.a(document, (dul)amf2, bl));
                break;
            }
            case 28: {
                this.a(element, this.par.a(document, (btk)amf2, bl));
                break;
            }
            case 35: {
                this.a(element, this.par.a(document, (drm)amf2, bl));
                break;
            }
            case 36: {
                this.a(element, this.par.a(document, (drx)amf2, bl));
                break;
            }
            case 47: {
                this.a(element, this.par.a(document, (dry)amf2, bl));
                break;
            }
            case 50: {
                this.a(element, this.par.a(document, (drb)amf2, bl));
                break;
            }
            case 51: {
                this.a(element, this.par.a(document, (drc)amf2, bl));
                break;
            }
            case 58: {
                this.a(element, this.par.a(document, (drd)amf2, bl));
                break;
            }
            case 59: {
                this.a(element, this.par.a(document, (drf)amf2, bl));
                break;
            }
            case 23: {
                this.a(element, this.par.a(document, (dsr)amf2, this.paw, bl));
                break;
            }
            case 69: {
                this.a(element, this.par.a(document, (drs)amf2, bl));
                break;
            }
            case 74: {
                this.a(element, this.par.a(document, (drv)amf2, bl));
                break;
            }
            case 53: {
                dsl dsl2 = (dsl)((Object)amf2);
                if (dsl2.getObjectDescriptionFilename() == null || dsl2.getObjectDescriptionFilename().equals("n/a")) break;
                this.a(element, this.par.a(document, dsl2, bl));
                break;
            }
            case 135: {
                this.a(element, this.par.a(document, (arm)amf2, bl));
                break;
            }
            case 46: {
                this.a(element, this.par.a(document, (dsm)((Object)amf2), bl));
                break;
            }
            case 45: {
                this.a(element, this.par.a(document, (dsp)((Object)amf2), bl));
                break;
            }
            case 106: {
                this.a(element, this.par.a(document, (dsn)((Object)amf2), bl));
                break;
            }
            case 94: {
                this.a(element, this.par.a(document, (drz)((Object)amf2), bl));
                break;
            }
            case 120: {
                this.a(element, this.par.a(document, (dse)((Object)amf2), bl));
                break;
            }
            case 121: {
                this.a(element, this.par.a(document, (dsh)((Object)amf2), bl));
                break;
            }
            case 153: {
                this.a(element, this.par.a(document, (dso)((Object)amf2), bl));
                break;
            }
            case 140: {
                this.a(element, this.par.a(document, (dsd)((Object)amf2), bl));
                break;
            }
            case 144: {
                this.a(element, this.par.a(document, (dsk)((Object)amf2), bl));
                break;
            }
            case 141: {
                this.a(element, this.par.a(document, (dsj)amf2, bl));
                break;
            }
            case 142: {
                break;
            }
            case 147: {
                this.a(element, this.par.a(document, (dsg)((Object)amf2), bl));
                break;
            }
            case 148: {
                this.a(element, this.par.a(document, (dsa)((Object)amf2), bl));
                break;
            }
            case 150: {
                this.a(element, this.par.a(document, (dsq)((Object)amf2), bl));
                break;
            }
            case 151: {
                this.a(element, this.par.a(document, (dsc)((Object)amf2), bl));
                break;
            }
        }
    }

    private List b(bdl bdl2) {
        ArrayList<amf> arrayList = lcn.emv();
        Map<ldv, amf> map = bdl2.amf();
        Iterator<amf> iterator = map.values().iterator();
        Object var5_5 = null;
        while (iterator.hasNext()) {
            List<ldv> list;
            amf amf2 = iterator.next();
            if (!(amf2 instanceof amf)) continue;
            if (amf2 instanceof btk && (list = ((btk)amf2).getObserverObjects()) != null && !list.isEmpty()) {
                Object var8_8 = null;
                dul dul2 = null;
                int n = list.size();
                for (int i2 = 0; i2 < n; ++i2) {
                    dul2 = new dul(((btk)amf2).getGUID(), list.get(i2), 1025);
                    dul2.setGUID(ldx.enG().aci(((btk)amf2).getGUID().enw()).bzv());
                    arrayList.add(dul2);
                }
            }
            arrayList.add(amf2);
        }
        return arrayList;
    }

    protected void a(Element element, Element element2) {
        if (element != null && element2 != null) {
            element.appendChild(element2);
        }
    }

    private List<amf> a(bdl bdl2, List<amf> list, List<dul> list2) {
        ArrayList<amf> arrayList = lcn.abH(50);
        this.b(bdl2, list, arrayList);
        return arrayList;
    }

    private void b(bdl bdl2, List<amf> list, List<amf> list2) {
        List<amf> list3 = bdl2.ame();
        amf amf2 = null;
        amf amf3 = null;
        int n = list.size();
        for (int i2 = 0; i2 < n; ++i2) {
            amf2 = list.get(i2);
            int n2 = list3.size();
            for (int i3 = 0; i3 < n2; ++i3) {
                amf3 = list3.get(i3);
                if (amf3 instanceof bdl && !list2.contains(amf3)) {
                    this.b((bdl)((Object)amf3), list, list2);
                }
                if (!amf2.equals(amf3) || list2.contains(amf2)) continue;
                list2.add(amf3);
            }
        }
    }

    public boolean dUM() {
        return this.pav;
    }

    public void vc(boolean bl) {
        this.pav = bl;
    }
}

