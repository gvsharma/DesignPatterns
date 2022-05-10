package creational.Builder;

import javafx.scene.media.EqualizerBand;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class StudentTest {
    @Test
    public void testStudent() {
//        Student student = new Student();
//        student.setFname("John");
//        student.setLname("Joe");
//        student.setEmail("joen@gmail.com");
//        student.setPhone("1927981632");
//        student.setAddress("adhb, ausdiugasd, asdkjbhaksd");
//
//        assertEquals("John", student.getFname());


        Map<String, String>map = new HashMap<>();
        map.put("fname", "Jhon");
        map.put("lname", "Hoe");
        map.put("email", "hoe@gmail.com");
        map.put("phone", "9283719823");
        map.put("address", "lkasdlf, aojsdad, ajisdojansd");

        Student student = new Student(map);

        assertEquals("John", map.get("fname"));
    }

    @Test
    public void newStudentTest() {
        NewStudent  student = new NewStudent.NewStudentBuilder()
                .setFname("John")
                .setLname("Joe")
                .setEmail("jkabsdfkhb@email.com")
                .setPhone("1208371283")
                .setAddress("adjhbv12313kjbzd").build();

        assertEquals("John", student.getFname());
    }
}
