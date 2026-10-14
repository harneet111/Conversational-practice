public class dAY{
    public static void main(String[] args){
        int day=2;
        switch(day) {
            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Tue");
                 break;
            case 3:
                System.out.println("Wed");
                   break;
            default:
                System.out.println("Other");
                //"Tue" will be printed, because the switch checks each case and because case 2's value is "Tue," it will be printed.
                //"break" separates the conditions, without it all of the dates would be printed, regardless of the int value.
        }
    }
}
