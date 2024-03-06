package test;
import main.*;




public class UserTest {
    User user = new User("username", "password", "email");
    assertEquals("username", user.getUsername());
    assertEquals("password", user.getPassword());
    assertEquals("email", user.getEmail());
    assertEquals(false, user.getIsFrozen());
    user.setUsername("new username");
    user.setPassword("new password");
    user.setEmail("new email");
    user.Freeze();
    assertEquals("new username", user.getUsername());
    assertEquals("new password", user.getPassword());
    assertEquals("new email", user.getEmail());
    assertEquals(true, user.getIsFrozen());
    user.UnFreeze();
    assertEquals(false, user.getIsFrozen());
    

}
