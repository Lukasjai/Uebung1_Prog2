package at.ac.fhcampuswien;

public class PasswordCheck {

    public boolean isValid(String password) {
        if (password.length() > 8 && password.length() < 25) {
            return true;
        } else {
            return false;
        }
    }

    public boolean containsNumbers(String password){
        if (password.contains("[0-9]+")){
            return false;
        }else{
            return true;
        }
    }

    public boolean bigSmallLetters(String password){
        if (password.contains("[A-Z]+") && password.contains("[a-z]+")){
            return false;
        }else{
            return true;
        }
    }

    public boolean specialSign(String pw){
        if (pw.contains(")") || pw.contains("(") || pw.contains("#") || pw.contains( "$") || pw.contains( "?") || pw.contains( "!" ) || pw.contains( "%") || pw.contains( "/") || pw.contains( "@")) {
            return true;
        }else {
            return false;

        }
    }

    public boolean noSpecialSign(String pw){
        String password = pw.replaceAll("[A-Z],[a-z],[0-9],[()#$?!%/@]","");
        if(password.equals("")){
         return true;
        }else {
            return false;
        }
    }

    public boolean followingNumbers (String pw){
        for(int i=0; i<pw.length();i++){
            if(pw.charAt(i) == pw.charAt(i+1)-1 && pw.charAt(i+1)-1 == pw.charAt(i+2)-2 && String.valueOf(pw.charAt(i)).matches("[0-9]") ){
                return false;
            }
        }
        return true;
    }


    public boolean followingEqualNumbers (String pw){
        for(int i=0; i<pw.length();i++){
            if(pw.charAt(i) == pw.charAt(i+1) && pw.charAt(i+1) == pw.charAt(i+2) && pw.charAt(i+2) == pw.charAt(i+3) && String.valueOf(pw.charAt(i)).matches("[0-9]") ){
                return false;
            }
        }
        return true;
    }
}
