import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class Student {

    public Student() {

    }

    public String name;
    public String prenom;
    public Student(String nom, String prenom) {
        this.name = nom;
        this.prenom = prenom;
    }

    public void setName(String nom) {
        this.name = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "{" +
                "\"nom\" :" + "\"" + name + "\"" +
                ",\"prenom\" :" + "\"" + prenom + "\"" +
                '}';
    }

    public void serialize(Student student) {

        FileWriter fw;

        File file = new File("Student1.json");

        try {

            fw = new FileWriter(file);

            String str = student.toString();

            fw.write(str);

            fw.close();

        } catch (FileNotFoundException e) {

            e.printStackTrace();

        } catch (IOException e) {

            e.printStackTrace();

        }

    }
    public void deserialize(){

        FileReader fr;

        File file = new File("Student1.json");

        StringBuilder str;

        try{
            fr = new FileReader(file);
            str = new StringBuilder();
            int i = 0;

            while((i = fr.read()) != -1)

                str.append((char) i);

            System.out.println(str);

        } catch (IOException e) {

            e.printStackTrace();

        }

    }

}