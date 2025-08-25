class Student{
    // Attributes == Properties == State == Variable
    String name;
    long roll_no;
    int[] marks = new int[5];
    String branch = "CS";
    char section = 'D';
    String address ;

    // Methods == Functions in C
    void greeting(){
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        // creating an object in Java
        // creating array of object class
        Student student[] = new Student[10];
//        student1[0] = new Student();
        student[0].name = "Sameer";
        student[1].name = "Samridh";
        student[2].name = "Sanidhya";
        student[3].name = "Shivam";
        student[4].name = "Saurav";
        student[5].name = "Pankaj";
        student[6].name = "Rohit";
        student[7].name = "Hasan";
        student[8].name = "Kamal";
        student[9].name = "Prem";


        student[0].address = "pune";
        student[1].address = "bihar";
        student[2].address = "delhi";
        student[3].address = "mumbai";
        student[4].address = "kolkata";
        student[5].address = "delhi";
        student[6].address = "delhi";
        student[7].address = "chennai";
        student[8].address = "kolkata";
        student[9].address = "pune";

        int count = 0;
        for (int i = 0; i < student.length; i++) {
            if (student[i].address.equals("delhi")) {
                System.out.println(student[i].name+" lives in delhi");
            }
//            System.out.println(count);


        }
    }



}



