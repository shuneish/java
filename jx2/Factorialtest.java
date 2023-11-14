public class Factorialtest {



    public static void main(String[] args) {
        Factorial[] f1 =new Factorial[10];
       


    for(int i=0;i<10;i++){


        f1[i] = new Factorial();
        f1[i].setNum(i);

        if(i==0){
            f1[i].setFact(1);   
        }else{
            f1[i].setFact(f1[i-1].getFact()*i);
        }
        

         System.out.println("num:"+f1[i].getNum()); 
         System.out.println("factorial:"+f1[i].getFact()); 

    }


       
           
    }



}