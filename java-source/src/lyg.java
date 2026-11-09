/*
 * Decompiled with CFR.
 */
public class lyg
extends lvn {
    private static final lyg tDR = new lyg();
    @lok(value="Frost Fest Monsters Killed $(Counter)/$(Limit)")
    @lpl(value="Show progress tooltip of the current event on the progress bar")
    public static final lox tDS = tDR.a("SpecialEventStepProgress", lyg.Bh("Counter"), lyg.Bh("Limit"));
    @lok(value="$(Resource.Name$(Limit.Plurality)) Killed $(Counter)/$(Limit)")
    @lpl(value="Show progress tooltip of the current event on the progress bar")
    public static final lox tDT = tDR.a("SpecialEventStepProgressBoss", lyg.Bl("Resource"), lyg.Bh("Counter"), lyg.Bh("Limit"));
    @lok(value="No Events Active At This Time")
    @lpl(value="Default message in the events window when there is no active event.")
    public static final lox tDU = tDR.BC("SpecialEventNoEvents");

    protected lyg(String string) {
        super("SpecialEvents." + string);
    }

    private lyg() {
        super("SpecialEvents");
    }
}

