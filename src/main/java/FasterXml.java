import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;


public class FasterXml  {

    public static void main(String[] args) {

        Student student = new Student();

        student.setName("youssef");

        student.setPrenom("Ouhba");

        String filePath = "C:/Users/hp/Downloads/Faster/jackson_user.json";

        File file = new File(filePath);

        ObjectMapper mapper = new ObjectMapper();

        try {

            mapper.writeValue(file, student);

        } catch (IOException e) {

            throw new RuntimeException(e);

        }

        Student deserializedStudent= null;

        try {

            deserializedStudent = mapper.readValue(new File(filePath), Student.class);

            System.out.println(deserializedStudent.getName());

            System.out.println(deserializedStudent.getPrenom());

        } catch (IOException e) {

            throw new RuntimeException(e);

        }

    }

}