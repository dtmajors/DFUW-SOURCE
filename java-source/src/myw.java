/*
 * Decompiled with CFR.
 */
public class myw {
    public myw() {
        System.out.println("Creating Files..");
        myy myy2 = new myy();
        myy2.eTn();
        System.out.println("Done");
    }

    public static void main(String[] stringArray) {
        if (stringArray != null) {
            System.out.print("The Args are:  ");
            for (int i = 0; i < stringArray.length; ++i) {
                System.out.print("Arg(" + i + ") =" + stringArray[i] + ", ");
            }
            System.out.println("");
        }
        myw myw2 = new myw();
    }
}

