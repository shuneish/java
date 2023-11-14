public class Student extends Person {
    // attribute
    private String school;
    private int grade;
    private String number;

    // method
    public void setSchool(String sname) {
        school = sname;
    }

    public String getSchool() {
        return school;
    }

      public void setGrade(int gd) {
        grade = gd;
    }

    public int getGrade() {
        return grade;
    }

      public void setNumber(String num) {
        number = num;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public void print() {
        // System.out.println("Name: " + getName());
        // System.out.println("Address: " +  getAddress());

        super.print();


        System.out.println("School: " +  getSchool());
        System.out.println("grade: " +  getGrade());
        System.out.println("number: " +  getNumber());
    }

    public static void main(String[] args) {
        // Person p1 = new Person();

        Student s1 = new Student();
        
        s1.setLastName("Awano");
        s1.setFirstName("Shunei");
        s1.setAddress("cho, Koga, Hushimi, Kyoto");

        // p1.print();

        s1.setSchool("kosen");
        s1.setGrade(334);
        s1.setNumber("22122003");

        System.out.println(s1.getName());
        System.out.println(s1.getAddress());
        System.out.println(s1.getSchool());
        System.out.println(s1.getGrade());
        System.out.println(s1.getNumber());


        s1.print();
      
    }
}