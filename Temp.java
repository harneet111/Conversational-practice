public class Temp {
    public static void main(String[] args){
        int temp=35;
        if(temp > 30){
            System.out.println("Hot");
        } else if(temp > 20){
            System.out.println("Warm");
        } else if(temp>10){
            System.out.println("Cool");
        } else{
            System.out.println("Cold");
        }
        //The final output would be "Warm"
        //If the temp is 35, the ladder would only check the first condition as it is true.
        //If the "temp>10" check was placed first, the ladder would check each condition until "temp>30" appears.
    }
}
