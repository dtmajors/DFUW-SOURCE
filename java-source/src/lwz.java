/*
 * Decompiled with CFR.
 */
public class lwz
extends lvn {
    private static final lwz tlK = new lwz();
    @lok(value="Player Housing")
    @lpl(value="Used in the housing window. The window header title.")
    public static final lox tlL = tlK.BC("HeaderTitle");
    @lok(value="Exterior")
    @lpl(value="Used in the housing window. The exterior list title.")
    public static final lox tlM = tlK.BC("ExteriorTitle");
    @lok(value="Interior")
    @lpl(value="Used in the housing window. The interior list title.")
    public static final lox tlN = tlK.BC("InteriorTitle");
    @lok(value="Tenants")
    @lpl(value="Used in the housing window. The tenant list title.")
    public static final lox tlO = tlK.BC("TenantTitle");
    @lok(value="Name")
    @lpl(value="Used in the housing window. The tenant name column title.")
    public static final lox tlP = tlK.BC("TenantName");
    @lok(value="Are you sure you want to make this player the owner of the house?")
    @lpl(value="Used in the housing window. The confirmation question for the make owner button.")
    public static final lox tlQ = tlK.BC("MakeOwnerQuestion");
    @lok(value="Are you sure you want to remove this tenant from the house?")
    @lpl(value="Used in the housing window. The confirmation question for the remove tenant button.")
    public static final lox tlR = tlK.BC("RemoveTenantQuestion");
    @lok(value="Are you sure you want to remove yourself from the house?")
    @lpl(value="Used in the housing window. The confirmation question for the remove self button.")
    public static final lox tlS = tlK.BC("RemoveSelfQuestion");

    protected lwz(String string) {
        super("Housing." + string);
    }

    private lwz() {
        super("Housing");
    }
}

