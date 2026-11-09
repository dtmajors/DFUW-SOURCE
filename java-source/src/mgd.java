/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class mgd {
    private float dum = 10.0f;
    private int gwX = 10;
    private int gwL = 0;
    private float dKD = 1.0f;
    private float gww = 0.1f;
    private float gwx = 0.1f;
    private List Dvb = null;
    private List Dvc = null;
    private List Dvd = null;
    private boolean gwy = true;
    private boolean gwz = true;
    private boolean gwJ = false;
    private boolean gwY = true;
    private float Dve = 0.0f;
    private float Dvf = 0.0f;
    private float gwE = 0.19625f;

    public void eyl() {
        this.eym();
        this.Dvd = lcn.emv();
        this.Dvc = lcn.emv();
        Random random = new Random();
        for (int i = 0; i < this.gwL; ++i) {
            int n = random.nextInt(this.gwX);
            ljq ljq2 = (ljq)this.Dvb.get(n);
            Integer n2 = new Integer(n);
            this.Dvd.add(n2);
            List list = this.eM(ljq2);
            this.Dvc.add(list);
        }
    }

    public List aea(int n) {
        if (n >= this.Dvc.size()) {
            return null;
        }
        List list = (List)this.Dvc.get(n);
        return list;
    }

    public void updatePoints() {
        this.eyn();
        for (int i = 0; i < this.Dvc.size(); ++i) {
            List list = (List)this.Dvc.get(i);
            Integer n = (Integer)this.Dvd.get(i);
            ljq ljq2 = (ljq)this.Dvb.get(n);
            this.a(list, ljq2);
        }
    }

    private void eym() {
        ljq ljq2;
        this.Dvb = lcn.emv();
        float f = this.dum / (float)this.gwX;
        double d2 = Math.PI / (double)this.gwX;
        for (int i = 0; i < this.gwX; ++i) {
            double d3;
            ljq2 = new ljq();
            ljq2.rlV = (float)i * f;
            if (this.gwy) {
                if (this.Dvf != 0.0f) {
                    d3 = (double)i * d2;
                    ljq2.y = (float)Math.sin(d3) * this.Dvf;
                } else {
                    float f2 = lew.eqr();
                    ljq2.y = f2 * this.dKD;
                }
            } else {
                ljq2.y = 0.0f;
            }
            if (this.gwz) {
                if (this.Dve != 0.0f) {
                    d3 = (double)i * d2;
                    ljq2.x = (float)Math.sin(d3) * this.Dve;
                } else {
                    float f3 = lew.eqr();
                    ljq2.x = f3 * this.dKD;
                }
            } else {
                ljq2.x = 0.0f;
            }
            this.Dvb.add(ljq2);
        }
        ljq ljq3 = (ljq)this.Dvb.get(0);
        ljq3.y = 0.0f;
        ljq3.rlV = 0.0f;
        ljq3.x = 0.0f;
        ljq2 = (ljq)this.Dvb.get(this.gwX - 1);
        ljq2.y = 0.0f;
        ljq2.x = 0.0f;
        ljq2.rlV = this.dum;
    }

    private List eM(ljq ljq2) {
        Object object;
        float f = lew.eqr() * this.gwE;
        float f2 = lew.eqr() * this.gwE;
        float f3 = ljq2.rlV;
        float f4 = this.dum - f3;
        float f5 = f4 + (float)Math.random() * f4;
        int n = (int)(f4 / this.dum * (float)this.gwX);
        if (n < 2) {
            n = 2;
        } else if (n >= this.gwX) {
            n = this.gwX - 1;
        }
        ArrayList<Object> arrayList = lcn.emv();
        float f6 = f5 / (float)n;
        float f7 = this.gww * this.dKD;
        for (int i = 0; i < n; ++i) {
            float f8;
            object = new ljq();
            ((ljq)object).rlV = (float)i * f6;
            if (this.gwy) {
                f8 = lew.eqr();
                ((ljq)object).y = f8 * f7;
            } else {
                ((ljq)object).y = 0.0f;
            }
            if (this.gwz) {
                f8 = lew.eqr();
                ((ljq)object).x = f8 * f7;
            } else {
                ((ljq)object).x = 0.0f;
            }
            arrayList.add(object);
        }
        ljq ljq3 = (ljq)arrayList.get(0);
        ljq3.y = 0.0f;
        ljq3.rlV = 0.0f;
        ljq3.x = 0.0f;
        object = new mfy();
        lgl lgl2 = new lgl(f, f2, 0.0f);
        ((mfy)object).ac(lgl2);
        for (int i = 0; i < arrayList.size(); ++i) {
            ljq ljq4 = (ljq)arrayList.get(i);
            ljq ljq5 = ((mfy)object).eJ(ljq4);
            ljq5.rlV += ljq2.rlV;
            ljq4.ex(ljq5);
        }
        return arrayList;
    }

    private void eyn() {
        ljq ljq2;
        float f = this.gww * this.dKD;
        float f2 = this.dKD * this.gwx;
        for (int i = 1; i < this.gwX - 1; ++i) {
            float f3;
            ljq2 = (ljq)this.Dvb.get(i - 1);
            ljq ljq3 = (ljq)this.Dvb.get(i);
            ljq ljq4 = (ljq)this.Dvb.get(i + 1);
            if (this.gwy) {
                f3 = lew.eqr();
                ljq3.y += f3 * f;
                if (ljq3.y > ljq2.y + f2) {
                    ljq3.y = ljq2.y + f2;
                }
                if (ljq3.y < ljq2.y - f2) {
                    ljq3.y = ljq2.y - f2;
                }
                if (ljq3.y > ljq4.y + f2) {
                    ljq3.y = ljq4.y + f2;
                }
                if (ljq3.y < ljq4.y - f2) {
                    ljq3.y = ljq4.y - f2;
                }
                if (ljq3.y > this.dKD) {
                    ljq3.y = this.dKD;
                }
                if (ljq3.y < -this.dKD) {
                    ljq3.y = -this.dKD;
                }
            }
            if (!this.gwz) continue;
            f3 = lew.eqr();
            ljq3.x += f3 * f;
            if (ljq3.x > ljq2.x + f2) {
                ljq3.x = ljq2.x + f2;
            }
            if (ljq3.x < ljq2.x - f2) {
                ljq3.x = ljq2.x - f2;
            }
            if (ljq3.x > ljq4.x + f2) {
                ljq3.x = ljq4.x + f2;
            }
            if (ljq3.x < ljq4.x - f2) {
                ljq3.x = ljq4.x - f2;
            }
            if (ljq3.x > this.dKD) {
                ljq3.x = this.dKD;
            }
            if (!(ljq3.x < -this.dKD)) continue;
            ljq3.x = -this.dKD;
        }
        if (this.gwJ) {
            ljq ljq5 = (ljq)this.Dvb.get(this.gwX - 2);
            ljq2 = (ljq)this.Dvb.get(this.gwX - 1);
            if (this.gwy) {
                float f4 = lew.eqr();
                ljq2.y += f4 * f;
                if (ljq2.y > ljq5.y + f2) {
                    ljq2.y = ljq5.y + f2;
                }
                if (ljq2.y < ljq5.y - f2) {
                    ljq2.y = ljq5.y - f2;
                }
                if (ljq2.y > this.dKD) {
                    ljq2.y = this.dKD;
                }
                if (ljq2.y < -this.dKD) {
                    ljq2.y = -this.dKD;
                }
            }
            if (this.gwz) {
                float f5 = lew.eqr();
                ljq2.x += f5 * f;
                if (ljq2.x > ljq5.x + f2) {
                    ljq2.x = ljq5.x + f2;
                }
                if (ljq2.x < ljq5.x - f2) {
                    ljq2.x = ljq5.x - f2;
                }
                if (ljq2.x > this.dKD) {
                    ljq2.x = this.dKD;
                }
                if (ljq2.x < -this.dKD) {
                    ljq2.x = -this.dKD;
                }
            }
        }
    }

    private void a(List list, ljq ljq2) {
        ljq ljq3;
        ljq ljq4 = (ljq)list.get(0);
        ljq4.ex(ljq2);
        float f = this.gww * this.dKD;
        float f2 = this.dKD * this.gwx;
        for (int i = 1; i < list.size() - 1; ++i) {
            float f3;
            ljq3 = (ljq)list.get(i - 1);
            ljq ljq5 = (ljq)list.get(i);
            ljq ljq6 = (ljq)list.get(i + 1);
            if (this.gwy) {
                f3 = lew.eqr();
                ljq5.y += f3 * f;
                if (ljq5.y > ljq3.y + f2) {
                    ljq5.y = ljq3.y + f2;
                }
                if (ljq5.y < ljq3.y - f2) {
                    ljq5.y = ljq3.y - f2;
                }
                if (ljq5.y > ljq6.y + f2) {
                    ljq5.y = ljq6.y + f2;
                }
                if (ljq5.y < ljq6.y - f2) {
                    ljq5.y = ljq6.y - f2;
                }
                if (ljq5.y > this.dKD) {
                    ljq5.y = this.dKD;
                }
                if (ljq5.y < -this.dKD) {
                    ljq5.y = -this.dKD;
                }
            }
            if (!this.gwz) continue;
            f3 = lew.eqr();
            ljq5.x += f3 * f;
            if (ljq5.x > ljq3.x + f2) {
                ljq5.x = ljq3.x + f2;
            }
            if (ljq5.x < ljq3.x - f2) {
                ljq5.x = ljq3.x - f2;
            }
            if (ljq5.x > ljq6.x + f2) {
                ljq5.x = ljq6.x + f2;
            }
            if (ljq5.x < ljq6.x - f2) {
                ljq5.x = ljq6.x - f2;
            }
            if (ljq5.x > this.dKD) {
                ljq5.x = this.dKD;
            }
            if (!(ljq5.x < -this.dKD)) continue;
            ljq5.x = -this.dKD;
        }
        if (this.gwY) {
            ljq ljq7 = (ljq)list.get(list.size() - 2);
            ljq3 = (ljq)list.get(list.size() - 1);
            if (this.gwy) {
                float f4 = lew.eqr();
                ljq3.y += f4 * f;
                if (ljq3.y > ljq7.y + f2) {
                    ljq3.y = ljq7.y + f2;
                }
                if (ljq3.y < ljq7.y - f2) {
                    ljq3.y = ljq7.y - f2;
                }
                if (ljq3.y > this.dKD) {
                    ljq3.y = this.dKD;
                }
                if (ljq3.y < -this.dKD) {
                    ljq3.y = -this.dKD;
                }
            }
            if (this.gwz) {
                float f5 = lew.eqr();
                ljq3.x += f5 * f;
                if (ljq3.x > ljq7.x + f2) {
                    ljq3.x = ljq7.x + f2;
                }
                if (ljq3.x < ljq7.x - f2) {
                    ljq3.x = ljq7.x - f2;
                }
                if (ljq3.x > this.dKD) {
                    ljq3.x = this.dKD;
                }
                if (ljq3.x < -this.dKD) {
                    ljq3.x = -this.dKD;
                }
            }
        }
    }

    public float getLength() {
        return this.dum;
    }

    public void setLength(float f) {
        this.dum = f;
    }

    public List eyo() {
        return this.Dvb;
    }

    public float getMaxNeighBourRadiusPercentageDeviation() {
        return this.gwx;
    }

    public void setMaxNeighBourRadiusPercentageDeviation(float f) {
        this.gwx = f;
    }

    public int getMaxNumBranchPoints() {
        return this.gwX;
    }

    public void setMaxNumBranchPoints(int n) {
        this.gwX = n;
    }

    public float getMaxRadius() {
        return this.dKD;
    }

    public void setMaxRadius(float f) {
        this.dKD = f;
    }

    public float getMaxRadiusPercentageDeviation() {
        return this.gww;
    }

    public void setMaxRadiusPercentageDeviation(float f) {
        this.gww = f;
    }

    public int eyp() {
        return this.gwL;
    }

    public void aeb(int n) {
        this.gwL = n;
    }

    public List eyq() {
        return this.Dvc;
    }

    public void ce(List list) {
        this.Dvc = list;
    }

    public boolean isXAxisDeviation() {
        return this.gwz;
    }

    public void setXAxisDeviation(boolean bl) {
        this.gwz = bl;
    }

    public boolean isYAxisDeviation() {
        return this.gwy;
    }

    public void setYAxisDeviation(boolean bl) {
        this.gwy = bl;
    }

    public boolean isAnimateEndPoint() {
        return this.gwJ;
    }

    public void setAnimateEndPoint(boolean bl) {
        this.gwJ = bl;
    }

    public boolean isAnimateSubBranchEndPoint() {
        return this.gwY;
    }

    public void setAnimateSubBranchEndPoint(boolean bl) {
        this.gwY = bl;
    }

    public float getMaxSubBranchAngle() {
        return this.gwE;
    }

    public void setMaxSubBranchAngle(float f) {
        this.gwE = f;
    }

    public float eyr() {
        return this.Dve;
    }

    public void oe(float f) {
        this.Dve = f;
    }

    public float eys() {
        return this.Dvf;
    }

    public void of(float f) {
        this.Dvf = f;
    }
}

