/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  jxb
 *  lcr
 */
import java.util.ArrayList;
import java.util.Map;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class jwk {
    private lju fzk = new lju(0, 1);
    private jxb oXe = null;
    private ldv Rr = null;
    private boolean daE = true;
    private boolean oXf = false;
    private Map oXg = lcn.emw();
    private final boolean bC = false;
    ldw gZO;

    public jwk(ldv ldv2) {
        this.Rr = ldv2;
        if (this.Rr == null) {
            lfn.b(5, this.getClass().getName(), "OSGUID is null!");
            assert (false) : "Did this get your attention?";
        }
        this.gZO = ldx.enG().fS(this.Rr.ib(), this.Rr.enw());
        this.oXe = new jxb(this.Rr);
    }

    private ldv Wk(int n) {
        return this.gZO.Wk(n);
    }

    public bdl a(Node node, bdm bdm2) {
        this.b(node, bdm2);
        if (bdm2.amo() == 3) {
            node = jsy.a("CellList", node);
        }
        this.c(node, bdm2);
        return this.b(bdm2);
    }

    public bdl a(bdm bdm2) {
        Document document = null;
        String string = "xml-files/object/collection/" + bdm2.getObjectDescriptionFilename();
        try {
            document = jsy.tJ(string);
        }
        catch (bo bo2) {
            lfn.b(5, this.getClass().getName(), "parseCollection() : Could not parse Collection SFFile [" + string + "]. [*] Reason: \n" + bo2);
        }
        if (document == null) {
            lfn.b(5, "SFCollectionDescFileParser", "parseCollection() : Could not Parse Collectionfile [" + string + "]");
            return null;
        }
        Node node = jsy.a("SFObjectCollectionDescription", document.getDocumentElement());
        if (node == null) {
            node = jsy.a("SFObjectModuleCollectionDescription", document.getDocumentElement());
        }
        if (node == null) {
            lfn.b(5, this.getClass().getName(), "Collection SFFile [" + string + "] is invalid!");
            return null;
        }
        lju lju2 = jsy.c(document);
        if (lju2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "parseCollection() : Cannot find version!");
            return null;
        }
        if (!lju2.b(this.fzk)) {
            lfn.b(5, this.getClass().getName(), "Collection SFFile [" + string + "], version (" + lju2.getMajor() + "." + lju2.getMinor() + ") not supported!");
            return null;
        }
        this.b(node, bdm2);
        if (bdm2.amo() == 3) {
            node = jsy.a("CellList", node);
        }
        this.c(node, bdm2);
        return this.b(bdm2);
    }

    private void b(Node node, bdm bdm2) {
        Node node2 = null;
        node2 = jsy.a("SFObjectCollectionType", node);
        if (node2 != null) {
            int n = jsy.r(node2);
            bdm2.kn(n);
            if (n == 1 || n == 3) {
                // empty if block
            }
        }
        if (bdm2.amo() == 3) {
            node2 = jsy.a("CellSize", node);
            if (node2 != null) {
                bdm2.cs(jsy.o(node2));
            }
            if ((node2 = jsy.a("GridDimension", node)) != null) {
                bdm2.c(jsy.x(node2));
            }
            if ((node2 = jsy.a("ShowGridLines", node)) != null) {
                bdm2.setShowGrid(jsy.t(node2));
            }
        }
    }

    private void c(Node node, bdm bdm2) {
        Object var3_3 = null;
        this.oXg.clear();
        if (node.hasChildNodes()) {
            NodeList nodeList = node.getChildNodes();
            for (int i2 = 0; i2 < nodeList.getLength(); ++i2) {
                if (nodeList.item(i2).getNodeType() == 3 || nodeList.item(i2).getNodeType() == 8) continue;
                boolean bl = true;
                Object object = this.oXe.bk(nodeList.item(i2));
                if (object == null) continue;
                if (object instanceof dqm) {
                    lek lek2 = (lek)this.oXg.get(object.getObjectDescriptionFilename());
                    if (lek2 != null && this.oXf && lek2.equals(((dqm)object).bug())) {
                        String string = "FOUND DUPLICATE CELL at Position: " + lek2 + " For Collection[" + bdm2.getObjectDescriptionFilename() + "]";
                        lfn.b(5, this.getClass().getName(), string);
                        assert (false) : string;
                        continue;
                    }
                    this.oXg.put(object.getObjectDescriptionFilename(), ((dqm)object).bug());
                } else if (object instanceof btl) {
                    lfn.b(5, this.getClass().getSimpleName(), "traverseCollectionNode() : LobjectObjectDesc not supported!");
                } else if (object instanceof bdm) {
                    this.a(object, bdm2);
                    bl = false;
                    object = this.a((bdm)object);
                }
                if (bl) {
                    this.a(object, bdm2);
                }
                bdm2.p(object);
            }
        }
    }

    private bdl b(bdm bdm2) {
        this.gZO.lK(bdm2.getGUID());
        bdl bdl2 = null;
        if (bdm2.amo() == 1) {
            bdl2 = this.c(bdm2);
        } else if (bdm2.amo() == 3) {
            bdl2 = this.d(bdm2);
        }
        return bdl2;
    }

    private void a(Object object, bdm bdm2) {
        if (object instanceof ami && object instanceof amf) {
            if (bdm2.amo() != 3) {
                ami ami2 = (ami)object;
                ljq ljq2 = ami2.av();
                ljq2.es(bdm2.av());
                ami2.c(ljq2);
            }
        } else if (object instanceof lhj && bdm2.amo() != 3) {
            lhj lhj2 = (lhj)object;
            ljq ljq3 = lhj2.getTargetPosition();
            if (ljq3 != null) {
                ljq3.es(bdm2.av());
                lfn.b(0, this.getClass().getName(), "Setting new Target position: " + ljq3 + " in SpecialEffectObject: " + lhj2.getSpecialEffectName());
                lhj2.setTargetPosition(ljq3);
            }
            if ((ljq3 = lhj2.getSourcePosition()) != null) {
                ljq3.es(bdm2.av());
                lfn.b(0, this.getClass().getName(), "Setting new Source position: " + ljq3 + " in SpecialEffectObject: " + lhj2.getSpecialEffectName());
                lhj2.setSourcePosition(ljq3);
            }
        }
    }

    private void a(ljq ljq2, bdm bdm2) {
        if (bdm2.amo() != 3) {
            ljq2.es(bdm2.av());
        }
    }

    public void a(bdl bdl2) {
        int n;
        Map<ldv, amf> map = bdl2.amf();
        ArrayList<amf> arrayList = lcn.abH(bdl2.ame().size());
        amf amf22 = null;
        ArrayList<amf> arrayList2 = lcn.emv();
        for (amf amf22 : map.values()) {
            if (amf22 instanceof dul) {
                arrayList2.add(amf22);
                continue;
            }
            arrayList.add(amf22);
        }
        for (amf amf3 : map.values()) {
            if (amf3 instanceof dqm) {
                amf3 = ((dqm)amf3).buh();
            }
            if (amf3 instanceof amf) {
                amf22 = amf3;
                lek lek2 = null;
                if (bdl2 instanceof bdn) {
                    lek2 = ((bdn)bdl2).ams().ud(amf22.getGUID());
                    this.v(amf22);
                    if (lek2 == null) continue;
                    ((bdn)bdl2).ams().a(lek2, amf22.getGUID());
                    continue;
                }
                this.v(amf22);
                continue;
            }
            lfn.b(5, this.getClass().getName(), "Cannot fix GUID for Obj" + amf3 + "!");
        }
        this.O(map);
        map.clear();
        int n2 = arrayList.size();
        for (n = 0; n < n2; ++n) {
            amf22 = (amf)arrayList.get(n);
            map.put(amf22.getGUID(), amf22);
        }
        n2 = arrayList2.size();
        for (n = 0; n < n2; ++n) {
            amf22 = (amf)arrayList2.get(n);
            map.put(amf22.getGUID(), amf22);
        }
    }

    private void v(amf amf2) {
        ldv ldv2 = amf2.getGUID();
        if (ldv2.enw() == lcr.qzh.enw()) {
            ldv2 = this.gZO.lL(this.Rr);
            amf2.setGUID(ldv2);
        } else {
            this.gZO.lK(ldv2);
        }
    }

    private void O(Map map) {
        Object var2_22 = null;
        for (Object var2_22 : map.values()) {
            dul dul2;
            if (!(var2_22 instanceof dul) || (dul2 = (dul)var2_22).getRelationType() != 1025) continue;
            ldv ldv2 = dul2.Bq();
            ldv ldv3 = this.Wk(ldv2.enx());
            btk btk2 = (btk)map.get(ldv2);
            if (btk2 == null) {
                btk2 = (btk)map.get(ldv3);
            }
            ldv ldv4 = dul2.Br();
            ldv ldv5 = this.Wk(ldv4.enx());
            btk btk3 = (btk)map.get(ldv4);
            if (btk3 == null) {
                btk3 = (btk)map.get(ldv5);
            }
            if (btk2 != null && btk3 != null) {
                ldv ldv6 = dul2.getGUID();
                int n = dul2.getRelationType();
                dul2.reset();
                dul2.setGUID(ldv6);
                dul2.setRelationType(n);
                dul2.cM(btk2.getGUID());
                dul2.cN(btk3.getGUID());
                lfn.b(1, "SFCollectionDescFileParser.traverseObjectCollection", "Relation Type [" + dul2.getRelationType() + "], StartPoint(GU)ID:" + ldv2 + ", EndPoint(GU)ID:" + ldv4);
                continue;
            }
            lfn.b(5, this.getClass().getName(), "Found no Object for StartPointGUID " + ldv2 + ", or EndPointGUID " + ldv4);
            lfn.b(5, this.getClass().getName(), "Found no Object for StartPointGUID " + ldv3 + ", or EndPointGUID " + ldv5);
        }
    }

    private bdl c(bdm bdm2) {
        bdl bdl2 = null;
        Object var3_3 = null;
        if (bdm2.amo() == 1) {
            bdl2 = new bdl();
            bdl2.cT(this.daE);
            bdl2.setGUID(bdm2.getGUID());
            bdl2.kl(bdm2.amo());
            bdl2.c(bdm2.av());
            bdl2.a(bdm2.aw());
            bdl2.setScale(bdm2.getScale());
            bdl2.fq(bdm2.getObjectDescriptionFilename());
            Map map = bdm2.amn();
            amf amf22 = null;
            ArrayList arrayList = lcn.emv();
            for (amf amf22 : map.values()) {
                if (amf22 instanceof dul) continue;
                bdl2.a(amf22);
            }
            int n = arrayList.size();
            for (int i2 = 0; i2 < n; ++i2) {
                bdl2.a((amf)arrayList.get(i2));
            }
        } else assert (false) : "Could not make ObjectCollection. Wrong type [" + bdm2.amo() + "]";
        return bdl2;
    }

    private bdn d(bdm bdm2) {
        bdn bdn2 = null;
        Object var3_3 = null;
        if (bdm2.amo() == 3) {
            bdn2 = new bdn(bdm2.amp());
            bdn2.cT(this.daE);
            bdn2.setGUID(bdm2.getGUID());
            bdn2.kl(bdm2.amo());
            bdn2.c(bdm2.av());
            bdn2.a(bdm2.aw());
            bdn2.setScale(bdm2.getScale());
            bdn2.fq(bdm2.getObjectDescriptionFilename());
            bdn2.cs(bdm2.amr());
            bdn2.setShowGrid(bdm2.amq());
            Map map = bdm2.amn();
            amf amf22 = null;
            dqm dqm2 = null;
            for (amf amf22 : map.values()) {
                if (!(amf22 instanceof dqm)) continue;
                dqm2 = (dqm)amf22;
                if (dqm2.buh() instanceof bdm) {
                    bdm bdm3 = (bdm)dqm2.buh();
                    ljq ljq2 = bdn2.ams().j(dqm2.bug());
                    bdm3.c(ljq2);
                    bdl bdl2 = this.a(bdm3);
                    if (bdl2 != null) {
                        lfn.b(0, ".", "Adding Nested ObjectCollection [" + bdl2.amd() + "], with Pos:" + ljq2);
                        dqm2.m((amf)((Object)bdl2));
                        bdn2.a(dqm2);
                        continue;
                    }
                    lfn.b(5, this.getClass().getName(), "Collection Contained Within Module Collection could not be parsed! Returned NULL");
                    assert (false);
                    continue;
                }
                bdn2.a(dqm2);
            }
        } else {
            lfn.b(5, this.getClass().getName(), "Cannot create ModuleCollection. WRONG TYPE [" + bdm2.amo() + "]");
            assert (false);
        }
        return bdn2;
    }

    public void cT(boolean bl) {
        this.daE = bl;
    }
}

