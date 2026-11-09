/*
 * Decompiled with CFR.
 */
public class mcv
extends lzh {
    private static final mcv uCq = new mcv();
    @lok(value="The health of your $(Resource.NameSingular) located in $(Area) was modified. It now has $(Health) hp left.")
    @lpl(value="Displayed to a player when a placed strongbox has its health modified.")
    public static final lox uCr = uCq.a("HealthChanged", mcv.Bl("Resource"), mcv.Br("Area"), mcv.ah("Health", 2));
    @lok(value="Your $(Resource.NameSingular) located in $(Area) has $(Time) left before it becomes lootable by everyone.")
    @lpl(value="Displayed to a player to notify for the remaining time before a placed strongbox time out and becomes lootable.")
    public static final lox uCs = uCq.a("TimeoutWarning", mcv.Bl("Resource"), mcv.Br("Area"), mcv.Bi("Time"));
    @lok(value="Your $(Resource.NameSingular) located in $(Area) has timed out and can now be looted by everyone.")
    @lpl(value="Displayed to a player when a placed strongbox has timed out and has became lootable.")
    public static final lox uls = uCq.a("TimedOut", mcv.Bl("Resource"), mcv.Br("Area"));
    @lok(value="You do not have access to this $(Resource.NameSingular).")
    @lpl(value="Displayed to a player when he/she has not access to this strongbox.")
    public static final lox tWl = uCq.a("AccessDenied", mcv.Bl("Resource"));

    protected mcv(String string) {
        super("StrongBoxes." + string);
    }

    private mcv() {
        super("StrongBoxes");
    }
}

