


package codeflow;

import java.util.ArrayList;
public class UserHandler {


        private ArrayList<User> users = new ArrayList<>();

        public boolean createUser(String name, String password) {//if name or password is wrong return false but if one of them is right return true
            if (!DataValidator.isPasswordValid(password) || !DataValidator.isUserNameValid(name)) {//here we call function without making a new instance k=ne w
                return false;
            } else {
                for (User user : users) {/// checking if the name already exist like someone has this username
                    if (user.getName().equals(name)) {
                        return false;
                    }
                }
            }
            users.add(new User(name, password));//
            return true;
        }

        public boolean addUser(User u) { // add  user in case you are using or creating a username that exist
            for (User user : users) {//
                if (user.getName().equals(u.getName())) {
                    return false;
                }
            }
            users.add(u);
            return true;
        }

        public boolean login(String name, String password) {// both things has to be correct to log in
            for (User user : users) {
                if (user.getName().equals(name) && user.getPassword().equals(password)) {
                    return true;
                }
            }
            return false;
        }


    }

