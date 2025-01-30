public class PasswordGenerator {

    public static void main(String[] args) {
        // Define the length of the password (you can change this value)
        String Password=generatePassword(10);
        System.out.println("GeneratedPAssword:"+Password);
    }
    static String generatePassword(int length){
        String Chars=("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_+");
        StringBuilder Password=new StringBuilder();
        for(int i=0;i<length;i++){
            int randomIndex=(int)(Math.random()*Chars.length());
            Password.append(Chars.charAt(randomIndex));
        }
        return Password.toString();
    } 
} 
