import java.util.Scanner;

public class Tester {
    public Tester(){
    }

    public static void main(String[] args){

        Person pers = new Person();
        Scanner in = new Scanner(System.in);

        System.out.println("Enter name:");
        pers.setName(in.nextLine());

        System.out.println("Enter surname: ");
        pers.setSuranme(in.nextLine());

        System.out.println("Enter age: ");
        pers.setAge(in.nextInt());

        System.out.println("Enter height");
        pers.setHeight(in.nextDouble());
        in.nextLine();

        System.out.printf("Name: %s \nSurname: %s \nAge: %d \nHeight: %.2f m", pers.getName(), pers.getSuranme(), pers.getAge(), pers.getHeight());

        
    }
}
