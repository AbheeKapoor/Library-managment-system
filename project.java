import java.util.Scanner;
interface Abhishek {
			public String say();
		  }

public class Project{
			public static void main(String []args){
			LPU L=new Mess();
			System.out.println(" ");
			System.out.println(" ");
			System.out.println(L.Mes());
			System.out.println(" ");
	System.out.println("                                           Welcome To Our Library Management System                            ");
			char r;
			do{
				System.out.println("Enter 1 To Add Book");
				System.out.println("Enter 2 To Issue a Book");
				System.out.println("Enter 3 To Return a Book");
				System.out.println("Enter 4 To Print Details");
				System.out.println("Enter 5 To Exit");
				Scanner obj1=new Scanner (System.in);
				System.out.println("Enter Any Number : ");
				int a=obj1.nextInt();
				switch(a){
					case 1:
						Library.Lib aa=new  Library.Lib();
						aa.Toadd();
						break;
					case 2:
						Library.Lib bb=new  Library.Lib();
						bb.Toiss();
						break;
					case 3:
						Library.Lib cc=new  Library.Lib();
						cc.Toret();
						break;
					case 4:
						Return dd=new  Return();
						dd.details();
						break;
					case 5 :
						Library.Lib ee=new  Library.Lib();
						ee.exit();
						break;
					default:
						System.out.println("Invalid Number : ");


			}

				System.out.println("You Want to Select Next Option  Y/N:    ");
				r=obj1.next().charAt(0);}
				while(r=='y'||r=='Y');
				if(r=='n'||r=='N'){
				Abhishek s=()->{                                                                            //LAMBDA EXPRESSION
return " *************************************   Thanks For Using Our Library Management System     ********************************************";
					};
				System.out.println(" ");
	System.out.println("                                          ''There is no friend as loyal as a book.''  ");
				System.out.println(" ");
				System.out.println(s.say());                                			             //LAMBDA EXPRESSION
				Library.Lib z=new Library.Lib();
z.exit();
}

}

}
		abstract class LPU {  										             //ABSTRACT  CLASS
  				abstract String Mes();  							             //ABSTRACT METHOD
  				 }
		class Mess extends LPU{											     //INHERITANCE
					String Mes(){
		return "   -----------------------------------------  India's Largest UNiversity (LPU)-----------------------------------------  ";
	 } 

			}
class Library 										
	{
			static class Lib{                                                                      	           //STATIC NESTED CLASS
						static String str,b,date;
			 			static int a,c;
						void Toadd(){
							System.out.println("Enter Book Name , Price , Book Number : ");
							Scanner obj2=new Scanner (System.in);
							String str=obj2.nextLine();
							int price=obj2.nextInt();
							int bookno=obj2.nextInt();
							System.out.println("Details of Added Book is  " );
							System.out.println("Book Name is  :   "+str);
							System.out.println("Price is :  "+price);
							System.out.println("Book Number is :  "+bookno);
}
						void Toiss(){
								Scanner obj3=new Scanner (System.in);
								System.out.println("Enter Book Name : ");
								str=obj3.nextLine();
								boolean cInput=true;
			 do{												      //EXCEPTION HANDLING	
				try{
					System.out.println("Book ID : ");
					a=obj3.nextInt();
					cInput=false;
			   }
			catch(Exception ex){										   //EXCEPTION HANDLING	
					System.out.println("Try again.("+" Incorrect Input : An integer is requried)");
					obj3.nextLine();
					}
}while(cInput);
					obj3.nextLine();
                        		System.out.println("Issue Date : ");
					b=obj3.nextLine();
                        		System.out.println("Total Number of Book Issued : ");
					c=obj3.nextInt();
					obj3.nextLine();
                        		System.out.println("Book Retrn Date : ");
					date=obj3.nextLine();
}
				int getid(){
						return a;
		  			 }
			



	void Toret(){
			System.out.println("Enter Student Name and Book Id : ");
			Scanner c=new Scanner (System.in);
			String name=c.nextLine();
			int bookid=c.nextInt();
			if(a==bookid){
			System.out.println("Details Of Book Issued : ");
			System.out.println("Book Name : "+Library.Lib.str);
			System.out.println("Book Id :  "+Library.Lib.a);
			System.out.println("Issue Date : "+Library.Lib.b);
			System.out.println("Total No of Book Issued : "+Library.Lib.c);
			System.out.println("Book Return Date : "+Library.Lib.date);
			}
			else{
				System.out.println("Wrong Id , Please Enter correct Id : ");
				}

		}

		void exit()
				{
		System.exit(0);
				}
}

}

class Return extends Library                                                                                               //INHERITANCE
{
		void details(){
			System.out.println("Book Name : "+Library.Lib.str);
			System.out.println("Book Id :  "+Library.Lib.a);
			System.out.println("Issue Date : "+Library.Lib.b);
			System.out.println("Total No of Book Issued : "+Library.Lib.c);
			System.out.println("Book Return Date : "+Library.Lib.date);

			}
}













