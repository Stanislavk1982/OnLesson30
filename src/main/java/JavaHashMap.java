import java.util.HashMap;
import java.util.Map;

public class JavaHashMap
{
    public static void main(String[] args) {

        Student student = new Student("John", "Doe", 25);
        Student student1 = new Student("John1", "Doe1", 26);
        Student student2 = new Student("John2", "Doe2", 27);
        Student student3 = new Student("John3", "Doe3", 28);
        Student student4 = new Student("John4", "Doe4", 29);
        Student student5 = new Student("John5", "Doe5", 30);

        Grade grade = new Grade(5, "A", "great");
        Grade grade1 = new Grade(3, "C", "not bad");
        Grade grade2 = new Grade(4, "B", "good");

        Map<Student,Grade> map = new HashMap<Student, Grade>();
        map.put(student,grade);

        Map<Integer, String> words= new HashMap<Integer, String>();
        words.put(5, "some word");
        words.put(3 , "another_word");
        words.put(9, "new_word");

        for (int key : words.keySet()) {
            String value = words.get(key);
            System.out.println(key+" - " + value);
        }

        System.out.println(words.get(5));
       /* words.put(3, "new_word");
        System.out.println("---------------------");
        for (int key : words.keySet()) {
            String value = words.get(key);
            System.out.println(key+" - " + value);
        }
*/
    }
}
