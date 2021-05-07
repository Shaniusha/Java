package Swap_Values_28_4;

class Swapper{

    public Object[] arguments;

    public Swapper(final Object[] args){ //
        arguments = args;
    }

    public void swapValues() {
        Object[] args = new Object[]{arguments[0],arguments[1]};
        Object temp = args[0];
        args[0] = args[1];
        args[1] = temp;
        arguments = args;
    }
    public static void main(String[]args){
        Object[] args1 = new Object[]{"os","ok"};
        Swapper s = new Swapper(args1);
        s.swapValues();
        System.out.println(s.arguments[0]);
        System.out.println(s.arguments[1]);
    }
}

