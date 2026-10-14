//This is the original code

/* public class Score {
    public static void main(String[] args){
        int score=48;
        if(score >=50){
            System.out.println("Pass");
             }  System.out.println("Done");
    }
} */
//output would be "Done," which prints despite the condition being false as it isn't bound to the cpndition.

public class Score{
    public static void main(String[] args){
        int score=48;
        if(score>=50){
            System.out.println("Pass");
            System.out.println("Done");
        }
    }
}
//Now nothing will print as "Done" becomes apart of the condition.