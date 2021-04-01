
package snapcheckchallenge;

public class SnapcheckChallenge {

    public static void main(String[] args) {
        if(args.length > 0){
            encrypt(String.join("",args));
        }
        encrypt("if man was meant to stay on the ground god would have given us roots");
        encrypt("have a nice day");
        encrypt("feed the dog");
        encrypt("chillout");
        encrypt("p");
    }
    
    public static void encrypt(String s){
        s = s.replaceAll("\\s", "");
        
        double L = Math.sqrt(s.length());
        int rowAmt = (int)L;
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
        
        System.out.println(encodedString);
    }
}
