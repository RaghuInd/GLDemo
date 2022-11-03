package com.app.linkedlist;

public class Driver {

	public static void main(String[] args) {
	
		LinkedList linkedList = new LinkedList();
		Node head= null;
		head = linkedList.addNode(head,100);
		head = linkedList.addNode(head,700);
		head = linkedList.addNode(head,50);
		head = linkedList.addNode(head,99);
		linkedList.displayList(head);
		linkedList.searchLinkedList(head, 50);
		linkedList.searchLinkedList(head, 55);
		head=linkedList.deleteListByKey(head, 700);
		linkedList.displayList(head);
		head=linkedList.deleteListByKey(head, 99);
		linkedList.displayList(head);
		head=linkedList.deleteListByKey(head, 100);
		linkedList.displayList(head);
		head=linkedList.deleteListByKey(head, 50);
		linkedList.displayList(head);
	}

}
