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
        String password = pw.replaceAll("[A-z],[a-z],[0-9],[()#$?!%/@]","");
        if(password == null){
         return true;
        }else { return false;
        }
    }


}
