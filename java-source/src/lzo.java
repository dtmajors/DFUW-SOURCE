/*
 * Decompiled with CFR.
 */
public class lzo
extends lzn {
    private static final lzo tXe = new lzo();
    @lok(value="Invalid Thread Priority: $(Priority)")
    @lpl(value="Displayed when a command to set a thread priority contains an invalid thread priority value")
    public static final lox tXf = tXe.a("InvalidThreadPriority", lzo.Bk("Priority"));
    @lok(value="Could not parse log threshold: $(Parameter)")
    @lpl(value="Displayed when the middleware log level threshold parameter fails to parse")
    public static final lox tXg = tXe.a("LogThresholdParseFailed", lzo.Bk("Parameter"));
    @lok(value="Log threshold level set to: $(Parameter)")
    @lpl(value="Displayed when the middleware log level threhold has been set")
    public static final lox tXh = tXe.a("LogThresholdSet", lzo.Bk("Parameter"));
    @lok(value="Unrecognised proxy debug level '$(DebugLevel)' - Valid values are 'none', 'class' or 'field'")
    @lpl(value="Displayed when the proxy debug level parameter is not recognised")
    public static final lox tXi = tXe.a("DebugLevelUnrecognised", lzo.Bk("DebugLevel"));
    @lok(value="Proxy debug level set to '$(DebugLevel)'")
    @lpl(value="Displayed when the proxy debug level has been set")
    public static final lox tXj = tXe.a("DebugLevelSet", lzo.Bk("DebugLevel"));
    @lok(value="Enabled proxy asserts")
    @lpl(value="Displayed when proxy asserts have been enabled")
    public static final lox tXk = tXe.BC("AssertsEnabled");
    @lok(value="Disabled proxy asserts")
    @lpl(value="Displayed when proxy asserts have been disabled")
    public static final lox tXl = tXe.BC("AssertsDisabled");
    @lok(value="Operation Result: $(ResultData)")
    @lpl(value="Displayed when a middleware operation results in success")
    public static final lox tXm = tXe.a("OperationResultSuccess", lzo.Bk("ResultData"));
    @lok(value="Operation Error: $(Error) for $(Operation)")
    @lpl(value="Displayed when a middleware operation results in failure")
    public static final lox tXn = tXe.a("OperationResultFailed", lzo.Bh("Error"), lzo.Bh("Operation"));

    protected lzo(String string) {
        super("Middleware." + string);
    }

    private lzo() {
        super("Middleware");
    }
}

