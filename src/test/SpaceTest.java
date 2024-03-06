package test;
import main.*;

public class SpaceTest {
    Space space = new Space("name", "description", "address", "14850", 5.0, 10, "park", false, new User("username", "password", "email"));
    assertEquals("name", space.getName());
    assertEquals("description", space.getDescription());
    assertEquals("address", space.getAddress());
    assertEquals("14850", space.getZip());
    assertEquals(5.0, space.getRating());
    assertEquals(10, space.getNumReviews());
    assertEquals("park", space.getType());
    assertEquals(false, space.getIsVerified());
    assertEquals("username", space.getCreator().getUsername());
    assertEquals("password", space.getCreator().getPassword());
    assertEquals("email", space.getCreator().getEmail());
    space.setName("new name");
    space.setDescription("new description");
    space.setAddress("new address");
    space.setZip("14851");
    space.setRating(4.0);
    space.setNumReviews(11);
    space.setType("garden");
    space.setIsVerified(true);
    assertEquals("new name", space.getName());
    assertEquals("new description", space.getDescription());
    assertEquals("new address", space.getAddress());
    assertEquals("14851", space.getZip());
    assertEquals(4.0, space.getRating());
    assertEquals(11, space.getNumReviews());
    assertEquals("garden", space.getType());
    assertEquals(true, space.getIsVerified());



    
}
