package task2;
import java.io.*;
import java.util.Scanner;
public class LinkedList {

	Node head; 
	static class Node {
		String name;
		int data;
		Node next;

		Node(String n,int d)
		{	name=n;
			data = d;
			next = null;
		}
	}

	
	public static LinkedList add(LinkedList list,String name,int data)
	{
		Node new_node = new Node(name,data);
		new_node.next = null;
		if (list.head == null) {
			list.head = new_node;
		}
		else {
			Node last = list.head;
			while (last.next != null) {
				last = last.next;
			}
			last.next = new_node;
		}

		return list;
	}

	public static void printList(LinkedList list)
	{
		Node currNode = list.head;
		System.out.print("\nLinkedList: ");
		while (currNode != null) {
			System.out.println(currNode.data + ","+currNode.name);
			currNode = currNode.next;
		}
		System.out.println("\n");
	}
	
	public static void setByData(LinkedList list,int key,String name) {
		Node currNode = list.head;
		if (currNode != null && currNode.data == key) {
			currNode.name=name;
			return;
		}
		while (currNode != null && currNode.data != key) {
			currNode = currNode.next;
		}

		if (currNode != null) {
			currNode.name=name;
		
		}
		else {
			System.out.println(key +" not found");
		}

	
	}
	
	
	public static void setByIndex(LinkedList list,int index,int data,String name) {
		int i=0;
		Node currNode = list.head;
		if (currNode != null && index==0) {
			currNode.data=data;
			currNode.name=name;
			return;
		}
		currNode = currNode.next;
		i++;
		while (currNode != null && i != index) {
			currNode = currNode.next;
			i++;
		}

		if (currNode != null) {
			currNode.data=data;
			currNode.name=name;
			return;
		
		}
		else {
			System.out.println("Index not found");
		}

	
	}
	public static void getByData(LinkedList list,int key) {
		Node currNode = list.head;
		if (currNode != null && currNode.data == key) {
			System.out.println("Info at "+key+" is :"+currNode.name);
			return;
		}
		while (currNode != null && currNode.data != key) {
			currNode = currNode.next;
		}

		if (currNode != null) {
			System.out.println("Info at "+key+" is :"+currNode.name);
		
		}
		else {
			System.out.println(key +" not found");
		}

	
	}
	public static void getByIndex(LinkedList list,int index) {
		int i=0;
		Node currNode = list.head;
		if (currNode != null && index==0) {
			System.out.println("Data:"+currNode.data+" and Name:"+currNode.name);
			return;
		}
		currNode = currNode.next;
		i++;
		while (currNode != null && i != index) {
			currNode = currNode.next;
			i++;
		}

		if (currNode != null) {
			System.out.println("Data:"+currNode.data+" and Name:"+currNode.name);
		
		}
		else {
			System.out.println("Index not found");
		}

	
	}
	
	public static LinkedList deleteByKey(LinkedList list,int key)
	{
		Node currNode = list.head, prev = null;
		Scanner sc=new Scanner(System.in);
		
		if (currNode != null && currNode.data == key) {
			System.out.println("Confirm the name:");
			String checkName=sc.nextLine();
			if(checkName.equals(currNode.name)) {
			list.head = currNode.next; 
			System.out.println(key + " found and deleted");
			return list;}
			else {
				System.out.println("Data and Name mismatch");
				return list;
			}
		}

		
		while (currNode != null && currNode.data != key) {
		
			prev = currNode;
			currNode = currNode.next;
		}

		
		if (currNode != null) {
			System.out.println("Confirm the name:");
			String checkName=sc.nextLine();
			if(checkName.equals(currNode.name)) {
				prev.next = currNode.next;
			System.out.println(key + " found and deleted");
			return list;}
			else {
				System.out.println("Data and Name mismatch");
				return list;
			}
			

		}

		if (currNode == null) {
		
			System.out.println(key + " not found");
		}

		return list;
	}
	
	public static LinkedList deleteAtPosition(LinkedList list, int index)
	{
	
		Node currNode = list.head, prev = null;

	
		if (index == 0 && currNode != null) {
			list.head = currNode.next; 
			System.out.println(index + " position element deleted");
			return list;
		}

	prev=currNode;
		int counter = 0;

		
		while (currNode != null) {

			if (counter == index) {
				
				prev.next = currNode.next;

				System.out.println(
					index + " position element deleted");
				break;
			}
			else {
			
				currNode = currNode.next;
				counter++;
			}
		}

	
		if (currNode == null) {
			
			System.out.println(
				index + " position element not found");
		}

	
		return list;
	}

	

}
