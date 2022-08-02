//QUESTION 1 :
//ANSWER 1 :
import java.util.Scanner;
public class Test {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
                System.out.println("Enter the number");
                int input = sc.nextInt();
                if (input%2==0){
                    System.out.print("The number is even");
                }
        else{
            System.out.print("The number is odd");
        }

    }
}



//QUESTION 2 :
//ANSWER 2 :
import java.util.Scanner;
public class Test {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int input = sc.nextInt();
        if (input>55){
            System.out.println("The number is greater than 55");
        }
        else{
            System.out.print("The number is lesser than 55");
        }
    }
}



//QUESTION 3 :
//ANSWER 3 :
import java.util.Scanner;
public class Test {
    public static void main(String args[]){
                Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1");

        int in1 = sc.nextInt();
        System.out.println("Enter the number 2");
        int in2 = sc.nextInt();
        if(in1>in2){
        System.out.println(in1+"is greater"+in2);
        }
        else if(in1<in2){
            System.out.println(in2+"is greater"+in1);
        }
        else if(in1=in2){
            System.out.println(in2+"is equal to"+in1);
        }
    }
}



//QUESTION 4 :
//ANSWER 4 :
import java.util.Scanner;
public class Test {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int in1 = sc.nextInt();
        switch(in1){
            case(579):System.out.println("This is Sonu Rollno");
            break;
            case(546):System.out.println("This is Monu Rollno");
                break;
            case(553):System.out.println("This is Manu Rollno");
                break;
            case(544):System.out.println("This is Meenu Rollno");
                break;
            case(516):System.out.println("This is Meenua Rollno");
                break;
            default: System.out.println("Invalid the Rollno");
        }
    }
}




/*QUESTION 5 :
ANSWER 5:
PASS BY VALUE : In this method the copy of the variable is passed to the method.Hence if the value the variable
                is changed then inside the variable which merhod is passed it dose not changes because its just
                a copy of original var not thee real one.
PASS BY REFERENCE : In this method the referece of method of variable is passed instead of copy.Hence when we change
                    the value of the variable then inside its one of the copy changes  which is present in the memory.
 */




//QUESTION 6 :
//ANSWER 6 :
import java.util.Scanner;
public class Test {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int input = sc.nextInt();
        for(int i=1;i<input;i++){
            System.out.println(i);
        }

    }
}



//QUESTION 8 :
//ANSWER 8 :
public class Test {
    public static void main (String args[]){
    int size = 3;
    int count = 1;
    for(int i=0;i<size;i++){
        for(int j=0;j<5;j++){
            System.out.println("count%2");
            count++;
        }
          System.out.println();
    }
    }
}

