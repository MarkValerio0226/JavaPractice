package JavaPractice;
import java.util.Iterator;
import java.util.Scanner;
import java.util.*;
public class timelog {
    
    private int contact;
    private String visit;
    private String tlog;
    private int vno;
    private String date;
    private String Name;
    private int Cardno;

    public timelog(String name, int contact, String date, String tlog, int vno, String visit, int Cardno) {
            this.vno = vno;
            this.date = date;
            this.Name = name;
            this.tlog = tlog;
            this.visit = visit;
            this.contact = contact;
            this.Cardno = Cardno;

    }
    public int getContact(){
        return contact;
    }
    public int getVno(){
        return vno;
    }
    public int getCardno(){
        return Cardno;
    }
    public String getName(){
        return Name;
    }
    public String getDate(){
        return date;
    }
    public String getVisit(){
        return visit;
    }
    public String getTlog(){
        return tlog;
    }
    public String toString(){
        return "\nCardno: "+Cardno+" \nName: "+Name+"\nContact: "+contact+" \nPurpose: "+visit+" \nDate: "+date+" \nTime: "+tlog;
    }

    public static void main(String[] args){
        
        Collection<timelog> c = new ArrayList<timelog>();
        try (Scanner scanner = new Scanner(System.in)) {
            try (Scanner scanner1 = new Scanner(System.in)) {
                int vno;
                String date;
                String Name;
                String tlog;
                String visit;
                int cardno;
                int contact;

                   
                

                    System.out.println("========*WELCOME TO UDM*=======");
                do{
                    
                    System.out.println("1. Fill up");
                    System.out.println("2. Visitor's Time log ");
                    System.out.println("3. Search the name Visitor");
                    System.out.println("4. Delete Information");
                    System.out.println("5. Update the Time log.");
                    System.out.print("Choose and Enter a Number: " );
                    vno =scanner.nextInt();

                    switch(vno){
                        case 1:
                        System.out.print("Card Number: ");
                        cardno = scanner.nextInt();
                        System.out.print("Name of Visitor: ");
                        Name = scanner1.nextLine();
                        System.out.print("Insert Contact number : ");
                        contact = scanner.nextInt();    
                        System.out.print("Purpose of Visitation : ");
                        visit = scanner1.nextLine();
                        System.out.print("Time : ");
                        tlog = scanner1.nextLine();
                        System.out.print("Date: ");
                        date = scanner1.nextLine();
                       System.out.println("===================================");
                        System.out.println("Card #: "+ cardno);
                        System.out.println("Name: "+ Name);
                        System.out.println("Contact #: "+ contact);
                        System.out.println("Purpose of Visitation: "+ visit);
                        System.out.println("Time:  "+ tlog);
                        System.out.println("Date: "+ date);

                        System.out.println("You Can now Pasok leche ka!");
                        System.out.println("----------------------------------");
                        
                         c.add(new timelog(Name, contact, date, tlog, vno, visit, cardno));              
                    
                        
                        break;
                        case  2:
                        System.out.println("----------------------------------");
                        Iterator<timelog> i = c.iterator();
                        while(i.hasNext()){
                            timelog e = i.next();
                            System.out.println(e);
                        }
                        System.out.println("---------------------------------");
                        break;
                    
                        case  3:
                        boolean found = false;
                        System.out.print("Enter the Card Number: ");
                        int Cardno = scanner.nextInt();
                        System.out.println("----------------------------------");
                        i = c.iterator();
                        while(i.hasNext()){
                            timelog e = i.next();
                            if(e.getCardno() == Cardno) {
                            System.out.println(e);
                                found = true;
                        }
                    }
                        if(!found){
                            System.out.println("Visitor's Information Not Found!.");
                        }
                        System.out.println("---------------------------------");
                        break;
                        case  4:
                        found = false;
                        System.out.print("Enter the Card Number To Delete: ");
                        Cardno = scanner.nextInt();
                        System.out.println("----------------------------------");
                        i = c.iterator();
                        while(i.hasNext()){
                            timelog e = i.next();
                            if(e.getCardno() == Cardno) {
                                i.remove();
                            System.out.println(e);
                                found = true;
                        }
                    }
                        if(!found){
                            System.out.println("Visitor's Card number Not Found!.");
                        }else{
                            System.out.println("Record has been deleted..............");
                        }
                        System.out.println("---------------------------------");
                        break;
                    }
                    
                    
                }while(vno!=0); 
            }
        }
    }

}
