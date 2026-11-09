/*
 * Decompiled with CFR.
 */
public class iiv
extends iis {
    private int mbX = 21;

    public iiv() {
        super(true, lyu.tKJ);
        ipx ipx2 = ipx.l(new ipf[0]);
        this.cXE().W(ipx2);
        ipx2.W(ipx.h(ipx.d(this.dal()), ipx.d(this.dam())));
        ipx2.W(ipx.a(4, 1, new ipf[0]));
        ipx2.W(ipx.d(this.dan()));
        this.cZZ();
    }

    @Override
    public ije dae() {
        return new iit(this, ikd.mfy, lwx.tkM.bD(new Object[0]), true, lyu.tKA);
    }

    @Override
    public ikd daf() {
        return ikd.mfy;
    }

    @Override
    public void cZZ() {
        switch (this.daD()) {
            case mcL: {
                this.dal().qP("casting_and_breath_background_small");
                this.dam().qP("breath_foreground_small0");
                this.dan().zY(9);
                this.mbX = 22;
                break;
            }
            case mcM: {
                this.dal().qP("casting_and_breath_background_normal");
                this.dam().qP("breath_foreground_normal0");
                this.dan().zY(10);
                this.mbX = 21;
                break;
            }
            case mcN: {
                this.dal().qP("casting_and_breath_background_large");
                this.dam().qP("breath_foreground_large0");
                this.dan().zY(12);
                this.mbX = 20;
            }
        }
    }

    @Override
    public int dar() {
        return this.daA() + this.mbX;
    }

    @Override
    public void Rc(int n) {
        this.Rf(n - this.mbX);
    }
}

