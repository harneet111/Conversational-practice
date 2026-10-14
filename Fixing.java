/*public class Fixing{
    public static void main(String[] args){
        int grade=85;
        if(grade=85){
            System.out.println("Great Job!")
        }
    }
}
 Java complains about this code as the assignment sign (=) is used to describe an equal, when it should look like (==).
  Also, the "if" value has no other condition, so the output would just be blank.
 */

public class Fixing{
    public static void main(String[] args){
        int grade=85;
        if(grade==85) {
            System.out.println("Great Job!");
        } else {
            System.out.println("Try again!");
        }
    }
}
//this new code uses the right operator sign, and also assigns a new output for grades below 85.