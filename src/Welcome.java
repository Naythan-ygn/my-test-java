import java.util.Scanner;

public class Welcome {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome Student!");
        StudentRec str[] = new StudentRec[4];
        for (StudentRec sr : str){
            sr = new StudentRec();   
        }

        StudentRec sr[] = new StudentRec[4];
        for (int i = 1; i < str.length ; i++){
            sr[i] = new StudentRec();
            sr[i].setName(); sr[i].setadd(); sr[i].setAge();
            System.out.println();
            System.out.println("Student Name: " + sr[i].getName());
            System.out.println("Location: " + sr[i].getAdd());
            System.out.println("Age: " + sr[i].getAge() + "\n");
            System.out.println("---------------------------------------");
        }
    }
}

class StudentRec {
    String name,add;
    int age;
    Scanner scan = new Scanner(System.in);
    public void setName(){
        System.out.print ("Enter your name : ");
        name = scan.nextLine();
    }
    public void setadd(){
        System.out.print("Enter your address : ");
        add = scan.nextLine();
    }
    public void setAge(){
        System.out.print("Enter your age : ");
        age = scan.nextInt();
    }
    public String getName(){
        return name;
    }
    public String getAdd(){
        return add;
    }
    public int getAge(){
        return age;
    }

}
