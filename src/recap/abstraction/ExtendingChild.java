package recap.abstraction;

public class ExtendingChild extends AbstractParent{

    public ExtendingChild(int var1, String var2, boolean var3, int var4) {
        super(var1, var2, var3, var4);
    }

    @Override
    public int getSumOfVar1And4() {
        return var1 + var4;
    }

    public static void main(String[] args) {
        AbstractParent abstractParent = new ExtendingChild(2, "String", true, 3);
        System.out.println(abstractParent.var1);
        System.out.println(abstractParent.var4);
        System.out.println("Sum of var1 and var4 = " + abstractParent.getSumOfVar1And4());
    }
}
