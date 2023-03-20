
package codeflow;

public class DataValidator {

    public static boolean isUserNameValid(String username) { // no instanse variable,k = new !, used in all classes
        if(username == null || username.length() < 4 || username.length() > 50 ||  username.equals("")) {
            return false;
        }
        else{
            return true;
        }
    }

    public static boolean isPasswordValid(String password) {
        if(password == null || password.length() < 4 || password.length() > 50 ||  password.equals("")) {
            return false;
        }
        else{
            return true;
        }
    }
}