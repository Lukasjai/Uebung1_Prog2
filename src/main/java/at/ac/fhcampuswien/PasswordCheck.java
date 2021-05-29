package at.ac.fhcampuswien;

public class PasswordCheck {
    public boolean isValid(String password) {
        if (password.length() > 5 && password.length() < 25) {
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

/*
    public boolean bigSmallLetters(String password){
        return true;
    }
*/

}
