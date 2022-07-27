import java.util.Scanner;

public class Inventory {
    public static Scanner sc = new Scanner(System.in);

    public static int resourceNum=0;
    public static int userIndex=0;
    public static int checkInItem=0;

    public static User[] users = new User[1000];
    public static Sources[] sources2 = new Sources[1000];
    public static String[] checkInItemUser = new String [1000];
    public static String[] checkInItemSource = new String [1000];
    public static int[] checkInDateItem = new int[1000];
    public static String[] CkeckInTypeUser = new String[1000];
    public static String[] CkeckInSourceType = new String[1000];
    


    public static void AddSources(Sources sourcesInput) {
        sources2[resourceNum] = sourcesInput;
        sourcesInput.setSerialNo(resourceNum);
         resourceNum++;  
    }

    public static void addUser(User user) {
        users[userIndex] = user;
        user.setID(userIndex);
        userIndex++;
    }

    public static void checkInItem(String user, String source, int date, String userType, String sourceType){
        
        int counter =0;
        for (int i = 0; i < users.length; i++) {

            if(user.equals(users[i].getFirstName())){
                counter ++;
            }
            if (counter>=5) {
                System.out.println("This user is already has 5 accounts. Enter another username");
                user = sc.nextLine();
                counter =0;
                i =0;
            }
        }
        counter =0;

        int counter2 = 0;
        for (int i = 0; i < sources2.length; i++) {
            if(source.equals(sources2[i].getSourceName())){
            counter2++;    
            }
            if (counter2>=1) {
                System.out.println("This source is already taken. Enter another source");
                source = sc.nextLine();
                counter =0;
                i=0;
            }
        }
        counter2 = 0;

        checkInItemUser [checkInItem] = user;
        checkInItemSource [checkInItem] = source;        
        checkInDateItem[checkInItem] = date;
        CkeckInTypeUser[checkInItem] = userType;
        CkeckInSourceType[checkInItem] = sourceType;
        checkInItem++;

    }

    public static void checkOutItem(String source, int date){

        int inDate=0;
        int j=0;
        for (j = 0; j < checkInItemSource.length; j++) {
            if (checkInItemSource[j] == source) {
                inDate = checkInDateItem[j];
                break;
            }
        }
        int cal = date - inDate;
        if ("Student".equals(CkeckInTypeUser[j])) {
            
            if ("Book".equals(CkeckInSourceType[j])) {
                if(cal > 30){
                    int fine= cal-30;
                    System.out.println("You have a fine:  $ "+fine);
                }
            } else if ("EBook".equals(CkeckInSourceType[j])) {
                if(cal > 60){
                    int fine= (cal-60)/2;
                    System.out.println("You have a fine:  $ "+fine);
                }
            }else {
                if(cal > 14){
                    int fine= (cal-14)*2;
                    System.out.println("You have a fine:  $ "+fine);
                }
            }
        }
        else{
            if(cal > 60){
                int fine= (cal-60);
                if ("Book".equals(CkeckInSourceType[j])) {
                        System.out.println("You have a fine:  $ "+fine);                 
                } else if ("EBook".equals(CkeckInSourceType[j])) {
                        System.out.println("You have a fine:  $ "+fine/2);          
                }else {
                        System.out.println("You have a fine:  $ "+fine*2);
                }
  
            }
        }

        for (int i = 0; i < checkInItemSource.length; i++){
            if (checkInItemSource[i] == source) {
                checkInItemSource[i] = null;
            }
        }
    }
        
        
    public static void renewed(String source){
        for (int j = 0; j < checkInItemSource.length; j++) {
            if (checkInItemSource[j] == source) {
                    checkInDateItem[j] =0;
                break;
            }
        }     
        
    }

}
