package task2;
import java.util.Scanner;
public class Main {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		LinkedList list = new LinkedList();
		int d,i;
		String n;
		while(true) {
			System.out.println("CHOOSE:\n1.ADD\n2.SET BY INDEX\n3.SET BY DATA\n4.GET BY INDEX\n5.GET BY DATA\n6.DELETE BY INDEX\n7.DELETE BY DATA\n8.PRINT LIST\n9.EXIT");
			int op=sc.nextInt();
			switch(op) {
			case 1:
				System.out.println("CHOSE ADD");
				System.out.println("Enter data:");
				d=sc.nextInt();
				System.out.println("Enter name:");
				sc.nextLine();
				n=sc.nextLine();
				LinkedList.add(list,n, d);
				break;
			case 2:
				System.out.println("CHOSE SET BY INDEX");
				System.out.println("Enter index:");
				i=sc.nextInt();
				System.out.println("Enter data:");
				d=sc.nextInt();
				System.out.println("Enter name:");
				sc.nextLine();
				n=sc.nextLine();
				LinkedList.setByIndex(list, i, d, n);
				break;
			case 3:
				System.out.println("CHOSE SET BY DATA");
				System.out.println("Enter data:");
				d=sc.nextInt();
				System.out.println("Enter name:");
				sc.nextLine();
				n=sc.nextLine();
				LinkedList.setByData(list,d, n);
				break;
			case 4:
				System.out.println("CHOSE GET BY INDEX");
				System.out.println("Enter index:");
				i=sc.nextInt();
				LinkedList.getByIndex(list, i);
				break;
			case 5:
				System.out.println("CHOSE GET BY DATA");
				System.out.println("Enter data:");
				d=sc.nextInt();
				LinkedList.getByData(list, d);
				break;
			case 6:
				System.out.println("CHOSE DELETE BY INDEX");
				System.out.println("Enter index:");
				i=sc.nextInt();
				LinkedList.deleteAtPosition(list, i);
				break;
			case 7:
				System.out.println("CHOSE DELETE BY DATA");
				System.out.println("Enter data:");
				d=sc.nextInt();
				LinkedList.deleteByKey(list,d);
				break;
			case 8:
				System.out.println("CHOSE PRINT LIST");
				LinkedList.printList(list);
				break;
			case 9:
				System.out.println("CHOOSE TO EXIT");
				return;
			default:
				System.out.println("INCORRECT CHOICE,CHOOSE AGAIN");
				
			}
		}

	
	}

}
