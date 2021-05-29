package at.ac.fhcampuswien;

public class PasswordCheck {
    public boolean isValid(String password){
        if(password.length()>5 && password.length()<25){
            return true;
        }else {
            return false;
        }
    }
}
