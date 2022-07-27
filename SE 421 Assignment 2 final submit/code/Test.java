//Momen Mustafa A. Myasar 1700273
//Yahya Raaed Faleh 1900102

import java.util.Scanner;

public class Test {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String...args) {
        int choice =0;
        
        System.out.println("Please Enter: \n1.Register\n2.Add Items\n3.Check in date\n4.Check out date\n5.Renew a source\n6.Print borowers and their borrowed items\n7.Post a notification to borrowers\n8.Undo the adding of a source");

            choice = sc.nextInt();
            if(choice == 1){
                register();
            } else if(choice == 2){
                addItems();
            } else if(choice == 3){
                checkIn();
            } else if (choice ==4){
                checkOut();}
            else if (choice == 5){
                renewed();}
            else if (choice == 6){
                printList();} 
            else if (choice == 7){ // 3.b Observer 
                post();}
            else if(choice == 8){ // 2. Undo
                undo();
            }
        }


    public static void register(){
        System.out.println("Please Enter: \n1.Student \n2.Staff \n3.Faculty");
        int type = sc.nextInt();
        if(type == 1){

            System.out.println("Please Enter The student's first name: ");
            String firstName = sc.nextLine();
            System.out.println("Please Enter The student's last name: ");
            String LastName = sc.nextLine();
            System.out.println("Please Enter The student's Date of joining AUIS: ");
            String dateJoin = sc.nextLine();
            System.out.println("Please Enter The student's GPA: ");
            double gpa = sc.nextDouble();

            Student user = new Student();
            user = (Student) user.setGpa(gpa).setFirstName(firstName).setLastName(LastName).setDateOfJoinAUIS(dateJoin).setUserType("Student"); // 3.c
            Inventory.addUser(user);
        } else if(type == 2){
            System.out.println("Please Enter The staff's first name: ");
            String firstName = sc.nextLine();
            System.out.println("Please Enter The staff's last name: ");
            String LastName = sc.nextLine();
            System.out.println("Please Enter The staff's Date of joining AUIS: ");
            String dateJoin = sc.nextLine();
            System.out.println("Please Enter The staff's department: ");
            String dept = sc.nextLine();

            Staff user = new Staff();
            user = (Staff) user.setDepartment(dept).setFirstName(firstName).setLastName(LastName).setDateOfJoinAUIS(dateJoin).setUserType("Staff"); // 3.c
            Inventory.addUser(user);

        } else {
            Faculty user = new Faculty();
            System.out.println("Please Enter The faculty's first name: ");
            String firstName = sc.nextLine();

            
            System.out.println("Please Enter The faculty's last name: ");
            String LastName = sc.nextLine();

            System.out.println("Please Enter The faculty's Date of joining AUIS: ");
            String dateJoin = sc.nextLine();

            System.out.println("Please Enter The faculty's department: ");
            String dept = sc.nextLine();

            user = (Faculty) user.setDepartment(dept).setFirstName(firstName).setLastName(LastName).setDateOfJoinAUIS(dateJoin).setUserType("Faculty"); // 3.c we also made some changes in the classes Borrower, User, Student, Staff, Faculty to apply DSL
            Inventory.addUser(user);
        }
    }
    
    public static void addItems() {
        System.out.println("Please specify which item you want to add: \n1.Book\n2.EBook\n3.Dissertation\n4.Journal");
        int choice = sc.nextInt();
        if(choice == 1){
            Book source = new Book();
            System.out.println("Please Enter The Author's first name: ");
            source.setAuthorName(sc.nextLine());
            System.out.println("Please Enter The number of pages: ");
            source.setNumOfPages(sc.nextInt());
            System.out.println("Please Enter The publish date: ");
            source.setPublishDate(sc.nextLine());
            System.out.println("Please Enter The type of the book: ");
            source.setType(sc.nextLine());

            source.setSourceType("Book");
            Inventory.AddSources(source);

        } else if(choice == 2){
            EBook source = new EBook();
            System.out.println("Please Enter The Author's first name: ");
            source.setAuthorName(sc.nextLine());
            System.out.println("Please Enter The number of pages: ");
            source.setNumOfPages(sc.nextInt());
            System.out.println("Please Enter The publish date: ");
            source.setPublishDate(sc.nextLine());
            System.out.println("Please Enter The type of the book: ");
            source.setType(sc.nextLine());
            System.out.println("Please Enter The duration of the book: ");
            source.setDuration(sc.nextDouble());

            source.setSourceType("EBook");
            Inventory.AddSources(source);
        } else if(choice == 3){
            Dissertation source = new Dissertation();
            System.out.println("Please Enter The Author's first name: ");
            source.setAuthorName(sc.nextLine());
            System.out.println("Please Enter The number of pages: ");
            source.setNumOfPages(sc.nextInt());
            System.out.println("Please Enter The publish date: ");
            source.setPublishDate(sc.nextLine());
            System.out.println("Please Enter The field: ");
            source.setField(sc.nextLine());
            System.out.println("Please Enter The purpose: ");
            source.setPurpose(sc.nextLine());

            source.setSourceType("Dissertation");
            Inventory.AddSources(source);
        } else {
            Journal source = new Journal();
            System.out.println("Please Enter The Author's first name: ");
            source.setAuthorName(sc.nextLine());
            System.out.println("Please Enter The number of pages: ");
            source.setNumOfPages(sc.nextInt());
            System.out.println("Please Enter The publish date: ");
            source.setPublishDate(sc.nextLine());
            System.out.println("Please Enter The field: ");
            source.setField(sc.nextLine());

            source.setSourceType("Journal");
            Inventory.AddSources(source);
        }
    }
    
    public static void checkIn() {
        
        System.out.println("Please specify the user name:");
        String user = sc.nextLine();

        System.out.println("Please specify the source:");
        String source = sc.nextLine();

        System.out.println("Please specify the source type:/nBook/nEbook/nDissertation/nJournal");
        String SourceType = sc.nextLine();

        System.out.println("Please specify the borrower role:/n1.Staff or Faculty /n2.Student");
        String borrowerRole = sc.nextLine();
        if (borrowerRole.equals("Student")) {
            System.out.println("The borrower can borrow a book for up to 1 month, a ebook for up to 2 months, an academic journal for up to 2 weeks");
        }
        else{            
            System.out.println("The borrower can keep this source for two months");
        }

        System.out.println("Please specify today's date:");
        int date = sc.nextInt();

        Inventory.checkInItem(user, source, date, borrowerRole, SourceType);
    }

    public static void checkOut(){
        System.out.println("Please specify the source:");
        String source = sc.nextLine();

        System.out.println("Please specify today's date:");
        int date = sc.nextInt(); 
        Inventory.checkOutItem(source, date);

    }

    public static void renewed(){
        System.out.println("Enter the sources name if you have not renewed a resource before");
        String source = sc.nextLine();
        Inventory.renewed(source);
    }

    public static void printList(){
        System.out.println("Enter the username of the borrower:");
        String userName = sc.nextLine();
        for (int i = 0; i < Inventory.checkInItemUser.length; i++) {
            if (Inventory.checkInItemSource[i]== userName & Inventory.checkInItemSource!=null) {
                System.out.println("User: "+Inventory.checkInItemUser [i]+" Item: "+Inventory.checkInItemSource [i]+" Date: "+Inventory.checkInDateItem[i]);
 
            }
        }
    }

    public static void post(){ // 3.b Observer 
        System.out.println("Enter the wanted message to be sent:");
        String message = sc.nextLine();
        Inventory.post(message);
    }

    public static void undo(){ // 2. Undo 
        Sources source = new Sources();
        source.undo();
    }
}
