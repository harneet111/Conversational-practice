public class Age{
    public static void main(String[] args){
        int age=15;
        boolean hasLicence=true;
        if (age>= 16){
            if(hasLicence){
                System.out.println("Can drive");
            } else {
                System.out.println("Get a licence first");
            }
        } else{
            System.out.println("Too young");
        }
    }
}
//"Can drive" prints.
// it still prints "can drive"
//the "Can drive"" check can't be written without nesting.
//This is the final nested code