package com.app.linkedlist;

import java.net.SecureCacheResponse;

public class LinkedList {

	public Node addNode(Node head, int data) {
		Node newNode = new Node(data);

		newNode.link = head;
		head = newNode;
		return head;

	}

	public void displayList(Node head) {
		Node temp = head;

		if (temp == null) {
			System.out.println("List is empty");

		} else

			while (temp != null) {
				System.out.print(temp.data + " ");
				temp = temp.link; // traverse to next node
			}
		System.out.println();
	}

	public void searchLinkedList(Node head, int key) {

		Node temp = head;
		int index = 1;
		while (temp != null) {
			if (temp.data == key) {
				System.out.println("Key found at node :" + index);
				break;
			}
			index++;
			temp = temp.link;

		}
		if (temp == null)
			System.out.println("Could not find Key:" + key);

	}

	public Node deleteListByKey(Node head, int key) {
		// [previous]->[current]->[next]
		Node current = head;
		Node previous = current;
		while (current != null) {
			if (current.data == key) {
				if (current == head)
					head = head.link;// if data found at head position
				else
					previous.link = current.link;
				break;
			}
			previous = current;
			current = current.link;

		}

		return head;

	}
}
