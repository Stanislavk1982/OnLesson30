public class CustomHashMapTest {

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


        CustomHashMap customHashMap = new CustomHashMap();
        customHashMap.put(student, grade);
        customHashMap.put(student1, grade1);
        customHashMap.put(student2, grade2);
        customHashMap.put(student3, grade1);
        customHashMap.put(student4, grade2);
        customHashMap.put(student5, grade);
        System.out.println(customHashMap);
    }
}
