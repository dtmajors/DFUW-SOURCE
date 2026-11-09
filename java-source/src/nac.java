/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 *  lcw
 */
import java.util.List;

public class nac
extends btk
implements bto,
jrz {
    public boolean EXs = false;
    public boolean EXt = false;
    public boolean EXu = true;
    public boolean EXv = true;
    public float EXw = 1.0f;
    public List<jrw> Enz = lcn.emv();
    public List<jrw> EXx;
    public boolean jyF;
    public boolean EXy = false;
    public boolean jyG = false;
    public int jqY = 0;
    public boolean EXz = false;
    private jrw EXA;
    private int EXB;
    private int EhM;
    private String EXC = "C:\\dump\\dfdata\\";
    private a EXD = a.EXG;

    @Override
    public void doTick(ldz ldz2) {
        this.eTS();
    }

    @Override
    public void initialize() {
        super.initialize();
        if (this.EXv) {
            this.EXx = lcn.emv();
            this.EXx.addAll(this.Enz);
        }
        assert (this.Enz != null && !this.Enz.isEmpty());
        this.a("Starting preprocessing..", "no title", true, 3);
        this.EXB = this.Enz.size();
    }

    @Override
    public void receiveResourceResponse(ktf ktf2) {
        switch (ktf2.egN()) {
            case 9: {
                this.b((ksy)ktf2);
                break;
            }
            default: {
                super.receiveResourceResponse(ktf2);
                lfn.b(0, this.getClass().getSimpleName(), "receiveResourceResponse() : Got unhandled Response = " + ktf2);
            }
        }
    }

    @Override
    public void receiveResponse(ktv ktv2) {
        switch (ktv2.egT()) {
            default: 
        }
        lfn.b(0, this.getClass().getSimpleName(), "receiveResourceResponse() : Got unhandled Response = " + ktv2);
        super.receiveResponse(ktv2);
    }

    private void b(ksy ksy2) {
        lfn.b(0, this.getClass().getName(), "Got SFResourceCollisionPreProcessMeshResponse Result is [" + ksy2.getResult() + "] , ErrorString [" + ksy2.getErrorString() + "]");
        if (ksy2.getResult() != 0) {
            this.a(ksy2.getErrorString(), "Collision Processing Error!", true, 2);
        } else {
            this.EXD = a.EXM;
        }
    }

    private void eTS() {
        switch (this.EXD) {
            case EXG: {
                assert (!this.Enz.isEmpty());
                this.EXA = this.Enz.remove(0);
                this.eTU();
                break;
            }
            case EXH: {
                this.eTV();
                break;
            }
            case EXI: {
                this.eTW();
                break;
            }
            case EXJ: {
                this.eTZ();
                break;
            }
            case EXK: {
                this.eTY();
                break;
            }
            case EXL: {
                break;
            }
            case EXM: {
                this.eTX();
                break;
            }
            case EXN: {
                if (this.Enz.isEmpty()) {
                    this.EXD = a.EXO;
                } else {
                    lfn.b(0, this.getClass().getSimpleName(), "handleAutomaticFullPreProcessing() : Finished with file = " + this.EXA + "");
                    this.EXD = a.EXG;
                }
                ++this.EhM;
                if (this.EhM == this.EXB && this.EXv) {
                    ++this.EXB;
                }
                this.a("Processed: " + this.EXA.getAbsolutePath(), "no title", true, 3);
                break;
            }
            case EXO: {
                if (this.EXv) {
                    this.EXD = a.EXQ;
                    break;
                }
                this.EXD = a.EXS;
                break;
            }
            case EXQ: {
                this.EXD = a.EXR;
                mjg mjg2 = new mjg(this){
                    final /* synthetic */ nac EXE;
                    {
                        this.EXE = nac2;
                    }

                    public Object Hv() {
                        nac.a(this.EXE);
                        return "done";
                    }

                    public void finished() {
                    }
                };
                mjg2.start();
                break;
            }
            case EXR: {
                break;
            }
            case EXS: {
                String string = "Done Full Processing of [" + this.EXB + "] files!";
                lfn.b(0, this.getClass().getSimpleName(), "handleAutomaticFullPreProcessing() : " + string);
                this.a(string, "Full Preprocessing", true, 0);
                this.MessageDelegator.hd(this.GUID);
            }
        }
        lfn.b(0, this.getClass().getSimpleName(), "handleAutomaticFullPreProcessing() : StepCompleted = " + this.EXD.name() + ", CurrentFile = " + this.EXA);
    }

    private void eTT() {
        this.EhM = 0;
        this.EXB = 0;
        this.a("Dumping the files to: " + this.EXC, "File dumping", true, 3);
        lfn.b(0, "SFObjectPreprocessor", "dumpFiles() Doing FileDump!");
        assert (this.EXx != null);
        this.g(this.EXx, this.EXC);
        this.EXD = a.EXS;
    }

    private Object g(List list, String string) {
        jsq jsq2 = new jsq();
        jsp jsp2 = new jsp();
        jsp2.a(list, string, jsq2, this);
        return "done";
    }

    @Override
    public void A(int n2, int n3, String string) {
        this.EhM = n2;
        this.EXB = n3;
        this.a("Copying: " + string, "File dumping", true, 3);
    }

    protected void eTU() {
        boolean bl;
        this.EXD = a.EXH;
        jxa jxa2 = new jxa();
        String string = jxa2.s(this.EXA);
        if (string == null) {
            lfn.b(5, this.getClass().getSimpleName(), "moveMeshToMeshDir() : File does not have an active Mesh! -> " + this.EXA);
            assert (false);
            return;
        }
        jrw jrw2 = new jrw(lcw.qLb + "mesh/_newmeshfiles/" + string);
        jrw jrw3 = new jrw(lcw.qLb + "mesh/" + string);
        if (!jrw2.exists()) {
            lfn.b(3, this.getClass().getSimpleName(), "moveMeshToMeshDir() : Did not find Mesh [" + jrw3.getName() + "]. Checking for .x files.");
            string = string.substring(0, string.lastIndexOf(".")) + ".x";
            jrw2 = new jrw(lcw.qLb + "mesh/_newmeshfiles/" + string);
            if (!jrw2.exists()) {
                lfn.b(3, this.getClass().getSimpleName(), "moveMeshToMeshDir() : Did not find Mesh [" + jrw2.getName() + "]. Already copied?");
                return;
            }
            if (jrw3.exists()) {
                jrw3.delete();
            }
            jrw3 = new jrw(lcw.qLb + "mesh/" + string);
            lfn.b(0, this.getClass().getSimpleName(), "moveMeshToMeshDir() : Found File to copy: " + jrw2);
        }
        if (jrw3.exists()) {
            jrw3.delete();
        }
        if (!(bl = jrw2.renameTo(jrw3))) assert (false) : "Could not rename [" + jrw2 + "] to [" + jrw3 + "]";
    }

    protected void eTV() {
        jrw jrw2;
        jxa jxa2 = new jxa();
        String string = lcw.qLb + "mesh/";
        jrw jrw3 = this.EXA;
        String string2 = jxa2.s(jrw3).replace('\\', '/');
        if (!string2.toLowerCase().endsWith(".x")) {
            lfn.b(0, this.getClass().getSimpleName(), "convertToSFM() : Existing file does not refer to a mesh");
            string2 = jry.tu(string2) + ".x";
        }
        if (!(jrw2 = new jrw(string + string2)).exists()) {
            lfn.b(0, this.getClass().getSimpleName(), "convertToSFM() : Mesh *.X- does not exist. Nothing to convert to SFM. File = " + jrw2);
            this.EXD = a.EXI;
            return;
        }
        String string3 = jrw2.getAbsolutePath().replace('\\', '/');
        String string4 = string + jry.tu(string3) + ".sfm";
        string4 = string4.replace('\\', '/');
        kse kse2 = (kse)this.MessageDelegator.j(17);
        kse2.Ls(1);
        kse2.jC(string3);
        kse2.ls(string4);
        kse2.Lr(0);
        kse2.ts(this.GUID);
        this.MessageDelegator.a(kse2);
        lfn.b(0, this.getClass().getSimpleName(), "convertToSFM() : Sent Convert2SFM Request. OldFile = " + string3 + ", NewFile = " + string4);
        this.EXD = a.EXI;
    }

    private void eTW() {
        jxa jxa2 = new jxa();
        String string = lcw.qLb + "mesh/";
        jrw jrw2 = this.EXA;
        String string2 = string + jxa2.s(jrw2);
        jrw jrw3 = new jrw(string2);
        if (string2.toLowerCase().endsWith(".x")) {
            String string3 = jry.tu(string2) + ".sfm";
            jxa2.d(jrw2, string3);
        } else {
            lfn.b(1, this.getClass().getSimpleName(), "setNewActiveMeshInXMLFiles() : Not changing active MeshFilename for file = [" + jrw3 + "]");
        }
        this.EXD = a.EXJ;
    }

    private void eTX() {
        jxa jxa2 = new jxa();
        String string = lcw.qLb + "mesh/";
        jrw jrw2 = this.EXA;
        String string2 = string + jxa2.s(jrw2);
        string2 = string2.toLowerCase();
        string2 = jry.tu(string2) + ".x";
        jrw jrw3 = new jrw(string + string2);
        if (!jrw3.exists()) {
            this.EXD = a.EXN;
            return;
        }
        lfn.b(0, this.getClass().getSimpleName(), "removeOldXFiles() : Deleting file = " + jrw3);
        boolean bl = jrw3.delete();
        assert (bl);
        this.EXD = a.EXN;
    }

    private void eTY() {
        lfn.b(0, this.getClass().getSimpleName(), "BEGIN Collision PreProcessing [" + this.Enz.size() + "] Meshes");
        String string = null;
        jrw jrw2 = null;
        jrw2 = this.EXA;
        string = jrw2.getAbsolutePath();
        string = string.toLowerCase();
        if (nab.EXr == null) {
            nab.eTR();
        }
        if (nab.EXr == null) {
            lfn.b(3, this.getClass().getSimpleName(), "preprocessCollisionFiles() : Ignore Textures is null!");
        } else {
            lfn.b(3, this.getClass().getSimpleName(), "preprocessCollisionFiles() : Ignore Textures size = " + nab.EXr.length);
        }
        boolean bl = true;
        if (this.EXz || string.contains("_newxmlfiles")) {
            lfn.b(0, "SFObjectPreprocessor", "preprocessCollisionFiles() CreateNewCollisionFiles = " + this.EXz + ", Filename = " + string + ",  UseValuesFromXMLFile set to FALSE.");
            bl = false;
        }
        kru kru2 = (kru)this.MessageDelegator.j(22);
        kru2.ts(this.GUID);
        kru2.pYW = string;
        kru2.pYX = string;
        kru2.pYV = this.jqY;
        kru2.pZa = bl;
        kru2.pYY = true;
        kru2.pYZ = nab.EXr;
        kru2.daN = this.EXw;
        if (this.jyF) {
            kru2.pZb = 1;
            kru2.pZc = 1;
            kru2.pZd = 1;
        } else if (this.EXy || this.jyG) {
            kru2.pZd = 4;
        }
        this.MessageDelegator.a(kru2);
        lfn.b(0, this.getClass().getSimpleName(), "Collision PreProcessing. Scale [" + this.EXw + "] ");
        this.EXD = a.EXL;
    }

    private void eTZ() {
        String string = this.EXA.getAbsolutePath();
        ksa ksa2 = (ksa)this.MessageDelegator.j(4);
        ksa2.Ln(32);
        ksa2.ts(this.GUID);
        ksa2.mG(false);
        ksa2.setXMLFileName(string);
        ksa2.jC(string);
        ksa2.hC(this.MessageDelegator.lL(lcr.qzr));
        ksa2.mF(true);
        ksa2.setVersion("1");
        ksa2.lA(string);
        ksa2.lB(string);
        ksa2.lz(string + ".bkp");
        ksa2.setScale(this.EXw);
        ksa2.mE(false);
        this.MessageDelegator.a(ksa2);
        this.EXD = a.EXK;
    }

    private void a(String string, String string2, boolean bl, int n2) {
        haz haz2 = (haz)this.MessageDelegator.h(4098, this.GUID, lcr.qzr);
        haz2.lU(string);
        haz2.setMessageType(n2);
        haz2.lV(string2);
        haz2.mT(bl);
        haz2.jzW = this.EhM;
        haz2.jzV = this.EXB;
        this.MessageDelegator.F(haz2);
    }

    static /* synthetic */ void a(nac nac2) {
        nac2.eTT();
    }
}

