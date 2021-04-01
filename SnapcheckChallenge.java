
//package snapcheckchallenge;

public class SnapcheckChallenge {

    public static void main(String[] args) {
        if(args.length > 0){
            System.out.println(encrypt(String.join("",args)));
        }
        /*System.out.println(encrypt("if man was meant to stay on the ground god would have given us roots"));
        System.out.println(encrypt("have a nice day"));
        System.out.println(encrypt("feed the dog"));
        System.out.println(encrypt("chillout"));
        System.out.println(encrypt("p")); */
    }
    
    public static String encrypt(String s){
        s = s.replaceAll("\\s", "");
        
        double L = Math.sqrt(s.length());
        //int rowAmt = (int)L;
        int colAmt = (int)Math.ceil(L);
        //System.out. println("" + rowAmt + " " + colAmt);
        
       
        StringBuilder encodedString = new StringBuilder();
        
        for(int i = 0; i < colAmt; i++){
            for(int j = i; j < s.length(); j+= colAmt){
                //System.out.print(""+j+",");
                encodedString.append(s.charAt(j));
            }
            encodedString.append(' ');
        }
        
        return encodedString.toString();
    }
}
