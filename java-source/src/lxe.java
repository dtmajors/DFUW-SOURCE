/*
 * Decompiled with CFR.
 */
public class lxe
extends lvn {
    private static lxe tnR = new lxe();
    @lok(value="Sort")
    @lpl(value="Translated name for window title")
    public static final lox sXP = tnR.BC("WindowTitle");
    @lok(value="Sort By ($(Column))")
    @lpl(value="Label for sort criterion column")
    public static final lox tnS = tnR.a("LabelSortColumn", lxe.Bk("Column"));
    @lok(value="Name")
    @lpl(value="Text for sort by name option")
    public static final lox tnT = tnR.BC("LabelSortByName");
    @lok(value="Custom Tag")
    @lpl(value="Text for sort by custom tag option")
    public static final lox tnU = tnR.BC("LabelSortByCustomTag");
    @lok(value="Color")
    @lpl(value="Text for sort by color option")
    public static final lox tnV = tnR.BC("LabelSortByColor");
    @lok(value="Quantity")
    @lpl(value="Text for sort by quantity option")
    public static final lox tnW = tnR.BC("LabelSortByQuantity");
    @lok(value="Quality")
    @lpl(value="Text for sort by quality option")
    public static final lox tnX = tnR.BC("LabelSortByQuality");
    @lok(value="Durability")
    @lpl(value="Text for sort by durability option")
    public static final lox tnY = tnR.BC("LabelSortByDurability");
    @lok(value="Weight")
    @lpl(value="Text for sort by weight option")
    public static final lox tnZ = tnR.BC("LabelSortByWeight");
    @lok(value="Ascending")
    @lpl(value="Text for ascending sort option")
    public static final lox toa = tnR.BC("LabelSortAscending");
    @lok(value="Descending")
    @lpl(value="Text for descending sort option")
    public static final lox tob = tnR.BC("LabelSortDescending");

    protected lxe() {
        super("InventoryWindowSortOptions");
    }
}

