public class Main {
    public static void main(String[] args) {

            GriffindorStudent[] students = {
                    new GriffindorStudent("Narry Potter", 90, 90, 90, 90, 95),
                    new GriffindorStudent("Hermiona Grander", 80, 95, 90, 90, 90)
            };

            HogwartsStudentPrint printer = new HogwartsStudentPrint();
            for (HogwartsStudent student : students) {
                printer.print(student);
            }

            Hogwarts hogwarts = new Hogwarts();
            hogwarts.compareGriffindorStudent(students[0], students[1]);

        }


}

