package codeflow;



public class User {

    String name;
    String password;

    public User(String name, String password) {
        setName(name);//validates
        setPassword(password);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        //user.getname, we can make this byt chaning to static from other class but them all people with login with the same name

        if(DataValidator.isUserNameValid(name)){
            this.name = name;// return the setName(name) name inside this parathesis,
        }
        else{
            this.name = name;
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(DataValidator.isPasswordValid(password)){
            this.password = password;
        }
        else{
            this.password = "N/A";
        }
    }
}