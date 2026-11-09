/*
 * Decompiled with CFR.
 */
public class lxp
extends lxl {
    private static final lxp tvN = new lxp();
    @lok(value="Mouse X Sensitivity")
    @lpl(value="\"Mouse X Sensitivity\" setting in Input Options tab")
    public static final lox tvO = tvN.BC("LabelMouseXSensitivity");
    @lok(value="Mouse Y Sensitivity")
    @lpl(value="\"Mouse Y Sensitivity\" setting in Input Options tab")
    public static final lox tvP = tvN.BC("LabelMouseYSensitivity");
    @lok(value="Invert Mouse Y Axis")
    @lpl(value="\"Invert Mouse Y Axis\" setting in Input Options tab")
    public static final lox tvQ = tvN.BC("checkBoxInvertMouseYAxis");
    @lok(value="Mouse Smoothing Enabled")
    @lpl(value="\"Mouse Smoothing Enabled\" setting in Input Options tab")
    public static final lox tvR = tvN.BC("checkBoxMouseSmoothingEnabled");
    @lok(value="Mouse Smoothing Amount")
    @lpl(value="\"Mouse Smoothing Amount\" setting in Input Options tab")
    public static final lox tvS = tvN.BC("LabelMouseSmoothingAmount");

    protected lxp() {
        super("InputOptions");
    }
}

