/*Create an user defined exception named Check Argument to check the
number of arguments passed through command line. If the number of
arguments is less than four, throw the Check Argument exception, else print the
addition of squares of all the four elements*/

class CheckArgumentException extends Exception{
    private static final long serialVersionUID = 1L;
    CheckArgumentException(String s) {
        super(s);
    }
}
public class p3 {
    public static int calculateSum(int args,int[] argumentsArray) throws CheckArgumentException{
        int sum=0;
        if(args<4)
            throw new CheckArgumentException("\nArguments passed is less than 4");
        else{
            for(int i=0;i<args;i++){
                sum=sum+(argumentsArray[i]*argumentsArray[i]);
            }
        }
        return sum;
    } 
    public static void main(String[] args) {

        int[] argumentsArray = new int[args.length];
        for(int i=0;i<args.length;i++){argumentsArray[i]= Integer.parseInt(args[i]);}

        try{
            int result = calculateSum(args.length,argumentsArray);
            System.out.println("\nThe Sum of the Sqaures of the numbres is: "+result);
        }
        catch(CheckArgumentException e){
            System.out.println(e);
        }
        
    }
}