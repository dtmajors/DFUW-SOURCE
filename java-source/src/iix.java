/*
 * Decompiled with CFR.
 */
public class iix
extends iis {
    private int mbX = 21;

    public iix() {
        super(true, lyu.tKI);
        ipx ipx2 = ipx.l(new ipf[0]);
        this.cXE().W(ipx2);
        ipx2.W(ipx.h(ipx.d(this.dal()), ipx.d(this.dam())));
        ipx2.W(ipx.a(4, 1, new ipf[0]));
        ipx2.W(ipx.d(this.dan()));
        this.cZZ();
    }

    @Override
    public ije dae() {
        return new iit(this, ikd.mfx, lwx.tkN.bD(new Object[0]), true, lyu.tKz);
    }

    @Override
    public ikd daf() {
        return ikd.mfx;
    }

    @Override
    public void cZZ() {
        switch (this.daD()) {
            case mcL: {
                this.dal().qP("casting_and_breath_background_small");
                this.dam().qP("casting_foreground_small");
                this.dan().zY(9);
                this.mbX = 22;
                break;
            }
            case mcM: {
                this.dal().qP("casting_and_breath_background_normal");
                this.dam().qP("casting_foreground_normal");
                this.dan().zY(10);
                this.mbX = 21;
                break;
            }
            case mcN: {
                this.dal().qP("casting_and_breath_background_large");
                this.dam().qP("casting_foreground_large");
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

