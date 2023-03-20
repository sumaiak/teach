package codeflow;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserHandlerTest2 {   //@annotation
    UserHandler userHandler;
//
    @BeforeEach     ///a code that run be4 the others
    void setUp() {
         userHandler = new UserHandler();
        userHandler.addUser(new User("signe","1234"));
        userHandler.addUser(new User("sally","12834"));
        userHandler.addUser(new User("Tess","123454"));

    }

    @Test
    void createUser() {

    }

    @Test
    void addUser() {
    }

    @Test
    void login() {
    }
}