public class TryOverload {
    // attribute
    private int valInt;
    private String valStr;
    private double valDouble;

    // method
    public void setValue(int val) {
        valInt = val;
    }

    public int getInt() {
        return valInt;
    }

      public void setValue(String val) {
        valStr = val;
    }

    public String getStr() {
        return valStr;
    }

      public void setValue(double val) {
        valDouble = val;
    }

    public double getDouble() {
        return valDouble;
    }

      public void times(int val1,int val2) {

        int val;
        val = val1*val2;

        System.out.println(val);
        
    }

     public void times(String str,int num) {

       for (int i=0; i<num; i++){

         System.out.println(str);

       }
      
    }

    public void times(int num,String str) {

       for (int i=0; i<num; i++){

         System.out.println(str);

       }
      
    }

    public void times(String str1,String str2) {

       System.out.println(str1 +str2);
      
    }

    public static void main(String[] args) {

        TryOverload to = new TryOverload();



        int i1,i2;

        to.setValue(3);
        i1=to.getInt();
        to.setValue(4);
        i2=to.getInt();

        String s1,s2,s3;

        to.setValue("Happy");
        s1=to.getStr();
        to.setValue("Birthday");
        s2=to.getStr();
        to.setValue("Birthday!");
        s3=to.getStr();

        double d1;

        to.setValue(3.17);
        d1=to.getDouble();

        System.out.println(i1);
        System.out.println(s1);
        System.out.println(d1);


        to.times(i1,i2);
        to.times(s1,i1);
        to.times(i2,s2);
        to.times(s1,s3);


    }


   


}