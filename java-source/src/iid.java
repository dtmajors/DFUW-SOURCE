/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cew
 *  cug
 */
import java.util.List;

public class iid
extends btk
implements hwb {
    private static final double lYo = 0.1;
    private iif lYp = new iif();
    private hwc lYq;
    private double asB = 0.0;
    private ldv QC = null;

    @Override
    public void initialize() {
        super.initialize();
        this.lYq = new hwc();
        this.lYq.setGUID(this.MessageDelegator.bzv());
        this.MessageDelegator.a(this.lYq);
        this.lYq.a(this);
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
        if (this.lYq != null) {
            this.lYq.b(this);
        }
    }

    public void b(ffk ffk2) {
        if (!ffk2.iKY || cug.wy((int)ffk2.ResourceType)) {
            this.cYY();
            return;
        }
        if (ldv.au(this.QC, ffk2.dtj) && this.MessageDelegator.arc().rgz - this.asB < 0.1) {
            return;
        }
        this.asB = this.MessageDelegator.arc().rgz;
        this.QC = ffk2.dtj;
        this.lYp.lYy = ffk2.ResourceType;
        this.lYp.lYz = ffk2.dNb;
        this.lYp.lYA = iic.g(ffk2.DR, 352).floatValue();
        this.lYp.healthMax = iic.g(ffk2.DR, 354).floatValue();
        this.lYp.lYB = this.lYp.healthMax > 0.0f ? this.lYp.lYA / this.lYp.healthMax : -1.0f;
        this.lYp.lYD = -1.0f;
        this.lYp.lYx = iig.lZo;
        Object object = this.lYq.cAT().iterator();
        while (object.hasNext()) {
            hvz hvz2 = object.next();
            iie.cZe().lYt.V(hvz2);
        }
        this.lYq.Q(null, false);
        if (!ldv.au(hso.cxK().bAn().gYY, ffk2.dtj) && (cug.vJ((int)ffk2.ResourceType) || lea.enW().isDescendant(ffk2.ResourceType, cug.fgH))) {
            this.lYq.Q(ffk2.dtj, false);
        }
        if (!(lea.enW().acv(ffk2.ResourceType) == null || lea.enW().isDescendant(ffk2.ResourceType, cug.fjY) && hso.cxK().cxP().czl() || !this.cZd() || ((String)(object = lvm.sXb.bD(ffk2.ResourceType).exA())).contains(lea.enW().getName(ffk2.ResourceType).toLowerCase().replaceAll(" ", "_")))) {
            hso.cxK().cxP().cyJ().cHA().E((String)object, false);
        }
        if (lea.enW().isDescendant(ffk2.ResourceType, cug.fgJ) || lea.enW().isDescendant(ffk2.ResourceType, cug.fgB)) {
            if (!this.cZb()) {
                return;
            }
            this.lYp.firstName = iic.d(ffk2.DR, 9712);
            this.lYp.lastName = iic.d(ffk2.DR, 9728);
            this.lYp.playerName = this.lYp.firstName + " " + this.lYp.lastName;
            this.lYp.lYD = iic.g(ffk2.DR, 12048).floatValue();
            this.lYp.qr(!iic.f(ffk2.DR, 13920));
            this.lYp.lYF = iic.e(ffk2.DR, 14080);
            this.lYp.clanName = iic.d(ffk2.DR, 9744);
            this.lYp.lYC = iic.d(ffk2.DR, 9776);
            this.lYp.lZl = iic.g(ffk2.DR, 13536).floatValue();
            if (hso.cxK().cxP().czb().dNh()) {
                if (iic.a(hso.cxK().cxP().czb().dNw(), ffk2.dtj) != null) {
                    this.lYp.lYw = iii.lZv;
                    this.lYp.lYx = iig.lZp;
                    iie.cZe().a(this.lYp);
                    return;
                }
                if (iic.a(hso.cxK().cxP().czb().dNv(), ffk2.dtj) != null) {
                    this.lYp.lYw = iii.lZw;
                    this.lYp.lYx = iig.lZq;
                    iie.cZe().a(this.lYp);
                    return;
                }
            }
            if (!lhn.isEmpty(this.lYp.clanName)) {
                if (lhn.equal(this.lYp.clanName, hso.cxK().cxP().czb().acl())) {
                    this.lYp.lYw = iii.lZx;
                    this.lYp.lYx = iig.lZp;
                    iie.cZe().a(this.lYp);
                    return;
                }
                object = hso.cxK().cxP().czb().sO(this.lYp.clanName);
                if (object != null) {
                    switch (1.abC[((Enum)object).ordinal()]) {
                        case 1: {
                            this.lYp.lYw = iii.lZA;
                            this.lYp.lYx = iig.lZq;
                            iie.cZe().a(this.lYp);
                            return;
                        }
                        case 2: {
                            this.lYp.lYw = iii.lZz;
                            this.lYp.lYx = iig.lZq;
                            iie.cZe().a(this.lYp);
                            return;
                        }
                        case 3: {
                            this.lYp.lYw = iii.lZy;
                            this.lYp.lYx = iig.lZo;
                            iie.cZe().a(this.lYp);
                            return;
                        }
                        case 4: {
                            this.lYp.lYw = iii.lZB;
                            this.lYp.lYx = iig.lZp;
                            iie.cZe().a(this.lYp);
                            return;
                        }
                        case 5: {
                            this.lYp.lYw = iii.lZC;
                            this.lYp.lYx = iig.lZp;
                            iie.cZe().a(this.lYp);
                            return;
                        }
                    }
                }
            }
            if (hso.cxK().cxP().cyJ().cHM().X(this.lYp.firstName, this.lYp.lastName)) {
                this.lYp.lYw = iii.lZE;
                this.lYp.lYx = iig.lZp;
                iie.cZe().a(this.lYp);
                return;
            }
            if (hso.cxK().cxP().cyJ().cHM().Y(this.lYp.firstName, this.lYp.lastName)) {
                this.lYp.lYw = iii.lZF;
                this.lYp.lYx = iig.lZq;
                iie.cZe().a(this.lYp);
                return;
            }
            if (hso.cxK().cxP().cyJ().F(this.lYp.firstName, this.lYp.lastName)) {
                this.lYp.lYw = iii.lZG;
                this.lYp.lYx = iig.lZp;
                iie.cZe().a(this.lYp);
                return;
            }
            this.lYp.lYw = iii.lZH;
            this.lYp.lYx = iig.lZo;
            iie.cZe().a(this.lYp);
            return;
        }
        if (lea.enW().isDescendant(ffk2.ResourceType, cug.fgx)) {
            if (!this.cZd()) {
                return;
            }
            if (ffk2.ResourceType == cug.fgI) {
                this.lYp.lYw = iii.lZI;
                this.lYp.lYx = iig.lZo;
                this.lYp.lYH = iic.d(ffk2.DR, 12608);
                this.lYp.lYI = iic.d(ffk2.DR, 12624);
                iie.cZe().a(this.lYp);
                return;
            }
            this.lYp.lYG = iic.e(ffk2.DR, 12592);
            if (cug.vX((int)this.lYp.lYG)) {
                this.lYp.lYw = iii.lZJ;
                this.lYp.lYx = iig.lZo;
                iie.cZe().a(this.lYp);
                return;
            }
            if (cug.vI((int)this.lYp.lYG)) {
                this.lYp.lYw = iii.lZK;
                this.lYp.lYx = iig.lZo;
                iie.cZe().a(this.lYp);
                return;
            }
            this.lYp.lYw = iii.lZL;
            this.lYp.lYx = iig.lZo;
            iie.cZe().a(this.lYp);
            return;
        }
        if (lea.enW().isDescendant(ffk2.ResourceType, cug.fpV)) {
            if (!this.cZd()) {
                return;
            }
            this.lYp.lYw = iii.lZM;
            this.lYp.lYx = iig.lZo;
            this.lYp.vulnerable = iic.f(ffk2.DR, 12416);
            this.lYp.ownerClanName = iic.d(ffk2.DR, 12320);
            this.lYp.lYJ = iic.h(ffk2.DR, 12384);
            iie.cZe().a(this.lYp);
            return;
        }
        if (ffk2.ResourceType == cug.frH) {
            if (!this.cZb()) {
                return;
            }
            this.lYp.lYw = iii.lZN;
            this.lYp.lYx = iig.lZo;
            this.lYp.lYK = iic.d(ffk2.DR, 12336);
            this.lYp.lYL = iic.a(ffk2.DR, 12352, dpy.gND);
            this.lYp.ownerClanName = iic.d(ffk2.DR, 12320);
            this.lYp.lYJ = iic.h(ffk2.DR, 12384);
            this.lYp.lYM = iic.h(ffk2.DR, 12400);
            this.lYp.lYN = iic.g(ffk2.DR, 12368).floatValue();
            this.lYp.lYO = iic.e(ffk2.DR, 12752);
            this.lYp.lYP = iic.e(ffk2.DR, 12768);
            iie.cZe().a(this.lYp);
            return;
        }
        if (lea.enW().isDescendant(ffk2.ResourceType, cug.fpz)) {
            if (!this.cZb()) {
                return;
            }
            this.lYp.lYw = iii.lZO;
            this.lYp.lYx = iig.lZo;
            this.lYp.lYK = iic.d(ffk2.DR, 12336);
            this.lYp.ownerClanName = iic.d(ffk2.DR, 12320);
            this.lYp.lYN = iic.g(ffk2.DR, 12368).floatValue();
            this.lYp.lYO = iic.e(ffk2.DR, 12752);
            this.lYp.lYP = iic.e(ffk2.DR, 12768);
            iie.cZe().a(this.lYp);
            return;
        }
        if (lea.enW().isDescendant(ffk2.ResourceType, cug.frl)) {
            if (!this.cZd()) {
                return;
            }
            this.lYp.lYw = iii.lZP;
            this.lYp.lYx = iig.lZo;
            this.lYp.lYQ = iic.f(ffk2.DR, 12464);
            this.lYp.lYR = iic.d(ffk2.DR, 12448);
            iie.cZe().a(this.lYp);
            return;
        }
        if (ffk2.ResourceType == cug.frj) {
            if (!this.cZd()) {
                return;
            }
            this.lYp.lYw = iii.lZQ;
            this.lYp.lYx = iig.lZo;
            this.lYp.lYQ = iic.f(ffk2.DR, 12464);
            this.lYp.lYS = iic.d(ffk2.DR, 12496);
            iie.cZe().a(this.lYp);
            return;
        }
        if (ffk2.ResourceType == cug.frk) {
            if (!this.cZd()) {
                return;
            }
            this.lYp.lYw = iii.lZR;
            this.lYp.lYx = iig.lZo;
            this.lYp.lYQ = iic.f(ffk2.DR, 12464);
            this.lYp.lYT = iic.e(ffk2.DR, 12480);
            this.lYp.lYJ = iic.h(ffk2.DR, 12384);
            iie.cZe().a(this.lYp);
            return;
        }
        if (cug.vk((int)ffk2.ResourceType)) {
            if (!this.cZd()) {
                return;
            }
            this.lYp.lYw = iii.lZS;
            this.lYp.lYx = iig.lZo;
            this.lYp.lYU = iic.d(ffk2.DR, 10432);
            this.lYp.lYJ = iic.h(ffk2.DR, 12384);
            iie.cZe().a(this.lYp);
            return;
        }
        if (cug.vn((int)ffk2.ResourceType)) {
            if (!this.cZd()) {
                return;
            }
            this.lYp.lYw = iii.lZT;
            this.lYp.lYx = iig.lZo;
            this.lYp.lYU = iic.d(ffk2.DR, 10432);
            this.lYp.lYJ = iic.h(ffk2.DR, 12384);
            iie.cZe().a(this.lYp);
            return;
        }
        if (ffk2.ResourceType == cug.flx) {
            if (!this.cZd()) {
                return;
            }
            this.lYp.lYw = iii.lZU;
            this.lYp.lYx = iig.lZo;
            this.lYp.lYU = iic.d(ffk2.DR, 10432);
            this.lYp.lYJ = iic.h(ffk2.DR, 12384);
            iie.cZe().a(this.lYp);
            return;
        }
        if (ffk2.ResourceType == cug.fkx || ffk2.ResourceType == cug.fwE || ffk2.ResourceType == cug.fky) {
            if (!this.cZd()) {
                return;
            }
            this.lYp.lYw = iii.lZV;
            this.lYp.lYx = iig.lZo;
            this.lYp.lYU = iic.d(ffk2.DR, 10432);
            this.lYp.lYJ = iic.h(ffk2.DR, 12384);
            iie.cZe().a(this.lYp);
            return;
        }
        if (lea.enW().isDescendant(ffk2.ResourceType, cug.fra)) {
            if (!this.cZd()) {
                return;
            }
            this.lYp.lYw = iii.lZW;
            this.lYp.lYx = iig.lZo;
            this.lYp.lYV = iic.e(ffk2.DR, 12512);
            this.lYp.lYW = iic.e(ffk2.DR, 12528);
            iie.cZe().a(this.lYp);
            return;
        }
        if (lea.enW().isDescendant(ffk2.ResourceType, cug.fgH)) {
            if (!this.cZb()) {
                return;
            }
            this.lYp.lYw = iii.lZX;
            this.lYp.lYx = iig.lZo;
            this.lYp.lYX = iic.f(ffk2.DR, 12544);
            this.lYp.lYU = iic.d(ffk2.DR, 10432);
            this.lYp.lYJ = iic.h(ffk2.DR, 12384);
            iie.cZe().a(this.lYp);
            return;
        }
        if (lea.enW().isDescendant(ffk2.ResourceType, cug.fnP)) {
            if (!this.cZb()) {
                return;
            }
            this.lYp.lYw = iii.lZY;
            this.lYp.lYx = iig.lZo;
            this.lYp.lYX = iic.f(ffk2.DR, 12544);
            this.lYp.lYU = iic.d(ffk2.DR, 10432);
            this.lYp.lYJ = iic.h(ffk2.DR, 12384);
            iie.cZe().a(this.lYp);
            return;
        }
        if (lea.enW().isDescendant(ffk2.ResourceType, cug.fnO) || lea.enW().isDescendant(ffk2.ResourceType, cug.fnQ)) {
            this.lYp.lYw = iii.lZZ;
            this.lYp.lYx = iig.lZo;
            this.lYp.lYX = iic.f(ffk2.DR, 12544);
            this.lYp.lYU = iic.d(ffk2.DR, 10432);
            this.lYp.lYJ = iic.h(ffk2.DR, 12384);
            this.lYp.lYY = iic.e(ffk2.DR, 12656);
            this.lYp.lYZ = iic.e(ffk2.DR, 12672);
            iie.cZe().a(this.lYp);
            return;
        }
        if (lea.enW().isDescendant(ffk2.ResourceType, cug.fsb) || lea.enW().isDescendant(ffk2.ResourceType, cug.fsd) || lea.enW().isDescendant(ffk2.ResourceType, cug.fsc) || lea.enW().isDescendant(ffk2.ResourceType, cug.fsf)) {
            if (!this.cZd()) {
                return;
            }
            this.lYp.lYw = iii.maa;
            this.lYp.lYx = iig.lZo;
            this.lYp.lZa = iic.e(ffk2.DR, 12560);
            this.lYp.lYU = iic.d(ffk2.DR, 10432);
            this.lYp.lYJ = iic.h(ffk2.DR, 12384);
            iie.cZe().a(this.lYp);
            return;
        }
        if (ffk2.ResourceType == cug.frN) {
            if (!this.cZd()) {
                return;
            }
            this.lYp.lYw = iii.mad;
            this.lYp.lYx = iig.lZo;
            this.lYp.lYU = iic.d(ffk2.DR, 10432);
            this.lYp.lYJ = iic.h(ffk2.DR, 12384);
            iie.cZe().a(this.lYp);
            return;
        }
        if (ffk2.ResourceType == cug.frO) {
            this.lYp.lYw = iii.mab;
            this.lYp.lYx = iig.lZo;
            this.lYp.lYU = iic.d(ffk2.DR, 10432);
            this.lYp.lYJ = iic.h(ffk2.DR, 12384);
            iie.cZe().a(this.lYp);
            return;
        }
        if (lea.enW().isDescendant(ffk2.ResourceType, cug.fnw)) {
            if (!this.cZb()) {
                return;
            }
            this.lYp.lYw = iii.mae;
            this.lYp.lYx = iig.lZo;
            this.lYp.lZc = iic.f(ffk2.DR, 12544);
            this.lYp.lYU = iic.d(ffk2.DR, 10432);
            iie.cZe().a(this.lYp);
            return;
        }
        if (lea.enW().isDescendant(ffk2.ResourceType, cug.fnc)) {
            if (!this.cZd()) {
                return;
            }
            this.lYp.lYw = iii.maf;
            this.lYp.lYx = iig.lZo;
            this.lYp.vulnerable = iic.f(ffk2.DR, 12416);
            this.lYp.lZd = iic.i(ffk2.DR, 12304);
            this.lYp.ownerClanName = iic.d(ffk2.DR, 12320);
            this.lYp.holdingID = iic.d(ffk2.DR, 12640);
            iie.cZe().a(this.lYp);
            return;
        }
        if (lea.enW().isDescendant(ffk2.ResourceType, cug.fmZ)) {
            if (!this.cZd()) {
                return;
            }
            this.lYp.lYw = iii.mag;
            this.lYp.lYx = iig.lZo;
            iie.cZe().a(this.lYp);
            return;
        }
        if (lea.enW().isDescendant(ffk2.ResourceType, cug.fst) || lea.enW().isDescendant(ffk2.ResourceType, cug.fss) || lea.enW().isDescendant(ffk2.ResourceType, cug.fsv)) {
            this.lYp.lYw = iii.mah;
            this.lYp.lYx = iig.lZo;
            this.lYp.lZd = iic.i(ffk2.DR, 12304);
            this.lYp.ownerClanName = iic.d(ffk2.DR, 12320);
            this.lYp.vulnerable = iic.f(ffk2.DR, 12416);
            this.lYp.lZe = iic.f(ffk2.DR, 12704);
            this.lYp.lYJ = iic.h(ffk2.DR, 12384);
            iie.cZe().a(this.lYp);
            return;
        }
        if (lea.enW().isDescendant(ffk2.ResourceType, cug.fsn)) {
            if (!this.cZd()) {
                return;
            }
            this.lYp.lYw = iii.mai;
            this.lYp.lYx = iig.lZo;
            iie.cZe().a(this.lYp);
            return;
        }
        if (lea.enW().isDescendant(ffk2.ResourceType, cug.fso)) {
            if (!this.cZd()) {
                return;
            }
            this.lYp.lYw = iii.maj;
            this.lYp.lYx = iig.lZo;
            this.lYp.lZh = iic.e(ffk2.DR, 12752);
            this.lYp.lZi = iic.e(ffk2.DR, 12768);
            this.lYp.lZj = iic.d(ffk2.DR, 9664);
            iie.cZe().a(this.lYp);
            return;
        }
        if (lea.enW().isDescendant(ffk2.ResourceType, cug.fia)) {
            if (!this.cZd()) {
                return;
            }
            this.lYp.lYw = iii.mak;
            this.lYp.lYx = iig.lZo;
            this.lYp.lZf = iic.d(ffk2.DR, 12720);
            iie.cZe().a(this.lYp);
            return;
        }
        if (cug.vI((int)ffk2.ResourceType)) {
            if (!this.cZb()) {
                return;
            }
            this.lYp.lYw = iii.mal;
            this.lYp.lYx = iig.lZq;
            this.lYp.lZm = lea.epA().dt(ffk2.ResourceType);
            iie.cZe().a(this.lYp);
            return;
        }
        if (ffk2.ResourceType == cug.fsq) {
            if (!this.cZd()) {
                return;
            }
            this.lYp.lYw = iii.mam;
            this.lYp.lYx = iig.lZo;
            this.lYp.lZg = iic.f(ffk2.DR, 1408);
            this.lYp.lZh = iic.e(ffk2.DR, 12752);
            this.lYp.lZi = iic.e(ffk2.DR, 12768);
            this.lYp.lZj = iic.d(ffk2.DR, 1328);
            this.lYp.lYJ = iic.h(ffk2.DR, 12384);
            iie.cZe().a(this.lYp);
            return;
        }
        if (ffk2.ResourceType == cug.fpu || ffk2.ResourceType == cug.fpv || ffk2.ResourceType == cug.fpw || ffk2.ResourceType == cug.fpt || ffk2.ResourceType == cug.fpy || ffk2.ResourceType == cug.fpx) {
            if (!this.cZd()) {
                return;
            }
            this.lYp.lYw = iii.maq;
            this.lYp.lYx = iig.lZo;
            iie.cZe().a(this.lYp);
            return;
        }
        if (lea.enW().isDescendant(ffk2.ResourceType, cug.fpm)) {
            if (!this.cZd()) {
                return;
            }
            this.lYp.lYw = iii.man;
            this.lYp.lYx = iig.lZo;
            this.lYp.lZk = iic.f(ffk2.DR, 12432);
            iie.cZe().a(this.lYp);
            if (ffk2.ResourceType == cug.fwy) {
                this.lYp.lZa = iic.e(ffk2.DR, 13696);
            }
            return;
        }
        if (lea.enW().isDescendant(ffk2.ResourceType, cug.fki)) {
            if (!this.cZd()) {
                return;
            }
            this.lYp.lYw = iii.mao;
            this.lYp.lYx = iig.lZo;
            iie.cZe().a(this.lYp);
            return;
        }
        if (ffk2.ResourceType == cug.fqI || ffk2.ResourceType == cug.fqK || ffk2.ResourceType == cug.fqL || ffk2.ResourceType == cug.fqJ) {
            if (!this.cZd()) {
                return;
            }
            this.lYp.lYw = iii.map;
            this.lYp.lYx = iig.lZo;
            iie.cZe().a(this.lYp);
            return;
        }
        if (!this.cZd()) {
            return;
        }
        this.lYp.lYw = iii.mar;
        this.lYp.lYx = iig.lZo;
        iie.cZe().a(this.lYp);
    }

    @Override
    public void m(alu alu2) {
    }

    @Override
    public void n(alu alu2) {
    }

    @Override
    public void a(List<hvz> list, List<hvz> list2, List<hvz> list3) {
        for (hvz hvz2 : list2) {
            iie.cZe().lYs.V(hvz2);
        }
        for (hvz hvz2 : list3) {
            iie.cZe().lYt.V(hvz2);
        }
    }

    @Override
    public void a(hvz hvz2, List<Integer> list, List<Integer> list2) {
    }

    @Override
    public int cAQ() {
        return 0;
    }

    @Override
    public void a(List<hvz> list, float[] fArray) {
        for (int i = 0; i < list.size(); ++i) {
            hvz hvz2 = list.get(i);
            float f = fArray[i];
            iie.cZe().lYu.k(hvz2, Float.valueOf(f));
        }
    }

    @Override
    public void a(hvz hvz2, float[] fArray) {
    }

    private void cYY() {
        if (this.lYp.lYw != iii.lZu) {
            this.lYp.lYw = iii.lZu;
            this.lYp.lYx = iig.lZo;
            iie.cZe().a(this.lYp);
            hso.cxK().cxP().cyJ().cHA().E("", false);
        }
    }

    private boolean cYZ() {
        cew cew2 = (cew)this.MessageDelegator.bzx().bzt().d(hso.cxK().bAn().gYY);
        if (cew2 == null) {
            return false;
        }
        ceg ceg2 = (ceg)cew2.aLX();
        if (ceg2 == null) {
            return false;
        }
        return ceg2.aLa() != 0 && ceg2.aLa() != 4;
    }

    private boolean cZa() {
        if (this.cYZ()) {
            return true;
        }
        return this.lYp.lYz <= 50.0f;
    }

    private boolean cZb() {
        if (this.cZa()) {
            return true;
        }
        this.cYY();
        return false;
    }

    private boolean cZc() {
        if (this.cYZ()) {
            return true;
        }
        return this.lYp.lYz <= 25.0f;
    }

    private boolean cZd() {
        if (this.cZc()) {
            return true;
        }
        this.cYY();
        return false;
    }
}

