/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  aux
 *  cug
 *  dta
 */
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JTextField;

public class mpt
extends mkx {
    private List<a> DWZ = lcn.emv();
    private aux DEC = null;
    private Map<JCheckBox, a> DXa = lcn.emw();
    private JTextField DXb = null;
    private String DXc = "nature/";
    private b DXd = null;

    public mpt(aux aux2) {
        super(false);
        this.DEC = aux2;
        this.setClosable(false);
        this.DXb = new JTextField();
        this.DXb.setText(this.DXc);
        this.DXb.setPreferredSize(new Dimension(100, 20));
        this.DXb.addKeyListener(new KeyListener(this){
            final /* synthetic */ mpt DXe;
            {
                this.DXe = mpt2;
            }

            public void keyPressed(KeyEvent keyEvent) {
            }

            public void keyReleased(KeyEvent keyEvent) {
            }

            public void keyTyped(KeyEvent keyEvent) {
                mpt.b(this.DXe).CM(mpt.a(this.DXe).getText());
            }
        });
        this.eIQ();
        this.c();
    }

    private void c() {
        this.DGa.setLayout(new BoxLayout(this.DGa, 1));
        for (a a2 : this.DWZ) {
            JCheckBox jCheckBox = new JCheckBox(a2.getName());
            a a3 = a2;
            jCheckBox.addActionListener(new ActionListener(this, a3){
                final /* synthetic */ a DXf;
                final /* synthetic */ mpt DXe;
                {
                    this.DXe = mpt2;
                    this.DXf = a2;
                }

                public void actionPerformed(ActionEvent actionEvent) {
                    JCheckBox jCheckBox = (JCheckBox)actionEvent.getSource();
                    mpt.a(this.DXe, this.DXf, jCheckBox.isSelected());
                }
            });
            this.DGa.add(jCheckBox);
            jCheckBox.setSelected(a2.cm());
            this.DXa.put(jCheckBox, a2);
        }
        this.DGb.add(this.DXb);
        this.setTitle("Object Hider");
        this.setClosable(true);
        this.pack();
    }

    private void eIQ() {
        this.DWZ.add(new d(this, "Light Gizmos", 147));
        this.DWZ.add(new a(this, "Light Volumes", false){
            final /* synthetic */ mpt DXe;
            {
                this.DXe = mpt2;
                super(mpt2, string, bl);
            }

            public void g(amf amf2, boolean bl) {
                mpt.a(this.DXe, amf2, bl);
            }
        });
        this.DWZ.add(new d(this, "Light Planes", 149));
        this.DWZ.add(new d(this, "Road Control Points", 142));
        this.DWZ.add(new a(this, "Roads"){
            final /* synthetic */ mpt DXe;
            {
                this.DXe = mpt2;
                super(mpt2, string);
            }

            public void g(amf amf2, boolean bl) {
                mpt.b(this.DXe, amf2, bl);
            }
        });
        this.DWZ.add(new d(this, "Decal Gizmos", 148));
        this.DWZ.add(new d(this, "Sound Emitter Gizmos", 144));
        this.DWZ.add(new a(this, "Sound Emitter Max Radius ", false){
            final /* synthetic */ mpt DXe;
            {
                this.DXe = mpt2;
                super(mpt2, string, bl);
            }

            public void g(amf amf2, boolean bl) {
                mpt.a(this.DXe, amf2, bl, true);
            }
        });
        this.DWZ.add(new a(this, "Sound Emitter Min Radius ", false){
            final /* synthetic */ mpt DXe;
            {
                this.DXe = mpt2;
                super(mpt2, string, bl);
            }

            public void g(amf amf2, boolean bl) {
                mpt.a(this.DXe, amf2, bl, false);
            }
        });
        this.DWZ.add(new d(this, "Collection Gizmos", 29));
        this.DWZ.add(new d(this, "SFX Gizmos", 46));
        this.DWZ.add(new a(this, "City Spheres"){
            final /* synthetic */ mpt DXe;
            {
                this.DXe = mpt2;
                super(mpt2, string);
            }

            public void g(amf amf2, boolean bl) {
                mpt.c(this.DXe, amf2, bl);
            }
        });
        this.DWZ.add(new c(this, "Harvesting Herbs", cug.fqA));
        this.DWZ.add(new c(this, "Logging Trees", cug.fqD));
        this.DWZ.add(new c(this, "Mining Metal", cug.fqC));
        this.DWZ.add(new c(this, "Mining Rock", cug.fqB));
        this.DWZ.add(new c(this, "Water", cug.fqr));
        this.DWZ.add(new c(this, "Clan Structures", cug.fpm));
        this.DWZ.add(new c(this, "Buildings", cug.fnz));
        this.DWZ.add(new c(this, "Props", cug.fkp));
        this.DWZ.add(new b(this, "'nature/'", "nature/"));
        this.DWZ.add(new b(this, "'building/'", "building/"));
        this.DWZ.add(new b(this, "'prop/all/'", "prop/all/"));
        this.DWZ.add(new b(this, "'prop/'", "prop/"));
        this.DWZ.add(new b(this, "'tree'", "tree"));
        this.DWZ.add(new b(this, "'rock'", "rock"));
        this.DWZ.add(new a(this, "SoundCones", false){
            final /* synthetic */ mpt DXe;
            {
                this.DXe = mpt2;
                super(mpt2, string, bl);
            }

            public void g(amf amf2, boolean bl) {
                mpt.d(this.DXe, amf2, bl);
            }
        });
        this.DXd = new b(this, "Custom", this.DXc);
        this.DWZ.add(this.DXd);
    }

    private void a(a a2, boolean bl) {
        Map map = this.DEC.am();
        if (map == null) {
            return;
        }
        a a3 = a2;
        boolean bl2 = bl;
        this.DEC.b(new Runnable(this, map, a3, bl2){
            final /* synthetic */ Map DXg;
            final /* synthetic */ a DXf;
            final /* synthetic */ boolean DXh;
            final /* synthetic */ mpt DXe;
            {
                this.DXe = mpt2;
                this.DXg = map;
                this.DXf = a2;
                this.DXh = bl;
            }

            public void run() {
                for (dta dta2 : this.DXg.values()) {
                    ArrayList<amf> arrayList = lcn.emv();
                    arrayList.addAll(dta2.bzr());
                    for (amf amf2 : arrayList) {
                        this.DXf.g(amf2, this.DXh);
                    }
                }
            }
        });
    }

    private void c(amf amf2, boolean bl) {
        if (amf2.getObjectType() != 147) {
            return;
        }
        dsg dsg2 = (dsg)((Object)amf2);
        dsg2.bxF().hX(bl);
    }

    private void d(amf amf2, boolean bl) {
        if (amf2.getObjectType() != 106) {
            return;
        }
        dsn dsn2 = (dsn)((Object)amf2);
        if (bl) {
            dsn2.bys();
        } else {
            dsn2.byt();
        }
    }

    private void e(amf amf2, boolean bl) {
        if (amf2.getObjectType() != 141) {
            return;
        }
        dsj dsj2 = (dsj)amf2;
        if (bl) {
            dsj2.bxN();
        } else {
            dsj2.byd();
        }
    }

    private void a(amf amf2, boolean bl, boolean bl2) {
        if (amf2.getObjectType() == 144) {
            dsk dsk2 = (dsk)((Object)amf2);
            if (bl2) {
                dsk2.js(bl);
            } else {
                dsk.ju(bl);
            }
            dsk2.byg();
        }
    }

    private void f(amf amf2, boolean bl) {
        dsk.gXX = bl;
    }

    static /* synthetic */ JTextField a(mpt mpt2) {
        return mpt2.DXb;
    }

    static /* synthetic */ b b(mpt mpt2) {
        return mpt2.DXd;
    }

    static /* synthetic */ void a(mpt mpt2, a a2, boolean bl) {
        mpt2.a(a2, bl);
    }

    static /* synthetic */ void a(mpt mpt2, amf amf2, boolean bl) {
        mpt2.c(amf2, bl);
    }

    static /* synthetic */ void b(mpt mpt2, amf amf2, boolean bl) {
        mpt2.e(amf2, bl);
    }

    static /* synthetic */ void a(mpt mpt2, amf amf2, boolean bl, boolean bl2) {
        mpt2.a(amf2, bl, bl2);
    }

    static /* synthetic */ void c(mpt mpt2, amf amf2, boolean bl) {
        mpt2.d(amf2, bl);
    }

    static /* synthetic */ void d(mpt mpt2, amf amf2, boolean bl) {
        mpt2.f(amf2, bl);
    }
}

