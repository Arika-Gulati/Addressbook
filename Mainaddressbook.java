import java.util.*;
import java.text.*;
class Addressbook {
private String fullname;
private String address;
private String city;
private String state;
private String zipcode;
private String phonenumber;

public Addressbook() {
	super();
   }
public Addressbook( String fullname,String address,String city,String state,String zipcode, String phonenumber) {
	this.fullname=fullname;
	this.address=address;
	this.city=city;
	this.state=state;
	this.zipcode=zipcode;
	this.phonenumber=phonenumber;

  }
public String getname() {
	return fullname;
  }
public void setname(String fullname) {
	this.fullname=fullname;
  }
public String getaddress() {
        return address;
  }
public void setaddress(String address) {
        this.address=address;
  }
public String getcity() {
        return city;
  }
public void setcity(String city) {
        this.city=city;
  }
public String getstate() {
        return state;
  }
public void setstate(String state) {
        this.state=state;
  }
public String getzipcode() {
        return zipcode;
  }
public void setzipcode(String zipcode) {
        this.zipcode=zipcode;
  }
public String getphonenumber() {
        return phonenumber;
  }
public void setphonenumber(String phonenumber) {
        this.phonenumber=phonenumber;
  }

public String toString() {
	return "Member name : "+this.fullname+" Address: "+this.address+"City: "+this.city+" State: "+this.state+" ZipCode: "+this.zipcode+" Phone-Number: "+this.phonenumber;
  }

}


public class Mainaddressbook {
	public static void main(String args[]) {
	   Scanner scan=new Scanner(System.in);

	boolean T=true;

	do{

	 System.out.println("Enter 1 to Add new person's detail in Address book ");
	 System.out.println("Enter 2 to Delete person's detail in Address book ");
	 System.out.println("Enter 3 to Modify or update person's detail in Address book ");
	 System.out.println("Enter 4 to Add new person's detail in Address book ");
	 System.out.println("Enter 5 to search person's detail in Address book ");
	 System.out.println("Enter 0 to exit ");

	 System.out.println("Enter your choice: ");
	 int choice=scan.nextInt();

while((choice!=1) && (choice!=2) && (choice!=3) && (choice!=4) && (choice!=5) && (choice!=0)) {
	 System.out.println("INVALID CHOICE PLEASE ENTER YOUR CHOICE CAREFULLY");
 }

Addressbook book=new Addressbook();
ArrayList<Addressbook>list=new ArrayList<>();
switch(choice) { 
   case 1:
	 System.out.println("Adding new person's detail in Address book ");
	 
	System.out.println("Enter Fullname ");
	book.setname(scan.nextLine());
	System.out.println("Enter Address ");
        book.setaddress(scan.nextLine());
	System.out.println("Enter city ");
        book.setcity(scan.nextLine());
	System.out.println("Enter state ");
        book.setstate(scan.nextLine());
	System.out.println("Enter zipcode ");
        book.setzipcode(scan.nextLine());
	System.out.println("Enter phone number ");
        book.setphonenumber(scan.nextLine());

list.add(new Addressbook(book.getname(),book.getaddress(),book.getcity(),book.getstate(),book.getzipcode(),book.getphonenumber()));
System.out.println(list.get(0));
     break;
   }
}
while(T!=false);
   }
 }

























