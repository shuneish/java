public class Persontest {

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setLastName("Awano");
        p1.setFirstName("Shunei");
        p1.setAddress("cho, Koga, Hushimi, Kyoto");


        System.out.println(p1.getName());
        System.out.println(p1.getAddress());



        p1.print();
      
    }
    


}