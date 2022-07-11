import java.util.Scanner;
public class ResultSheet 
 {
 public static void main(String[] args) 
 {
 Scanner sc = new Scanner(System.in);
 int roll; 
 double point,sum,Bengali,English,Mathematics,Religion,GenSci,IntroToBus,Accounting,BusEntres;
 String name, grade;
 System.out.println("   ");
 System.out.println("   Inter Your Name:");
 name = sc.nextLine();
 System.out.println("   ");
 System.out.println("   Inter Your roll:");
 roll = sc.nextInt();
 System.out.println("   ");
 System.out.println("   Inter Your Bengali Mark:");
 Bengali = sc.nextInt();
 System.out.println("   ");
 System.out.println("   Inter Your English Mark:");
 English = sc.nextInt();
 System.out.println("   ");
 System.out.println("   Inter Your Mathematics Mark:");
 Mathematics = sc.nextInt();
 System.out.println("   ");
 System.out.println("   Inter Your Religion Mark:");
 Religion = sc.nextInt();
 System.out.println("   ");
 System.out.println("   Inter Your General Science Mark:");
 GenSci = sc.nextInt();
 System.out.println("   ");
 System.out.println("   Inter Your Introduction To Business Mark:");
 IntroToBus = sc.nextInt();
 System.out.println("   ");
 System.out.println("   Inter Your Accounting Mark:");
 Accounting = sc.nextInt();
 System.out.println("   ");
 System.out.println("   Inter Your Business Entrepreneurship Mark:");
 BusEntres = sc.nextInt();
 sum = Bengali+English+Mathematics+Religion+GenSci+IntroToBus+Accounting+BusEntres;
 System.out.println("                                          ");
 System.out.println("Name : "+name+"                Roll : "+roll);
 point = sum/8;
 System.out.println("                                          ");
 System.out.println("Subject"+"                     Marks");
 System.out.println(".......................................");
 System.out.println("Bengali"+"                     "+Bengali);
 System.out.println("English"+"                     "+English);
 System.out.println("Mathematics"+"                 "+Mathematics);
 System.out.println("Religion"+"                    "+Religion);
 System.out.println("General Science"+"             "+GenSci);
 System.out.println("Introduction To Business"+"    "+IntroToBus);
 System.out.println("Accounting"+"                  "+Accounting);
 System.out.println("Business Entrepreneurship"+"   "+BusEntres);
 System.out.println(".......................................");
 System.out.println("Total Marks:"+"                "+ sum);
 System.out.println("Average Marks:"+"              "+ point);
 if( Bengali <33 || English <33 || Mathematics <33 || Religion <33 || 
 GenSci <33 || IntroToBus <33 || Accounting <33 || BusEntres<33 )
 {
     grade = "F";
 }
 else if(point>=80) {
 grade = "A+";
 }
 else if(point>=70) {
 grade = "A";
 }
 else if(point>=60) {
 grade = "A-";
 }
 else if(point>=50) {
 grade = "B";
 }
 else if(point>=40) {
 grade = "C";
 }
 else if(point>=33) {
 grade = "D";
 }
 else {
 grade = "F";
 }
 System.out.println("your Grade :               "+"("+grade+")");
 System.out.println("                                          ");
 System.out.println(":::::::::::: Craeted By MaHmuD :::::::::::");
 }
 }
