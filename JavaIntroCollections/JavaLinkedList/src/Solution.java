
public class Solution {

	public static void main(String[] args) {
		Node four = new Node(8);
		Node three = new Node(5, four);
		Node two = new Node(4, three);
		Node one = new Node(2, two);

		print(one);
		insertLast(one, 17);
		print(one);
		Node zero = insertFirst(one, 1);
		print(zero);
		delete(zero, 1);
		print(zero);
	}

	static void print(Node head) {
		if(head ==null) return;
		Node node=head;
		while(node.next!=null){
								//node to referencja do head ,ma caly czas takie same wartości jak tamto waretosci bedziemy
								// wysiwetlac dopok nie ma nulla -- petla while(jak nie wiemy ile elementow) jak wiemy ile elementow to for
			System.out.println(node.data);

			node=node.next;

		}
		System.out.println(node.data);
		//dodaj implementacj�
		System.out.println("End of method print\n");
	}

	static Node insertLast(Node head, int data) {//poczatek a int data to liczba jaka chcemy dodac na koniec
		Node node=head;
		while(node.next!=null){
			node=node.next;
		}
		node.next = new Node();//lub moze byc node.next = new Node(data); bez linijki niżek
		node.next.data = data;
		return head;


	}
	
	static Node insertFirst(Node head,int x) {
		if(head == null){
			head=new Node(x);
			return head;
		}
		Node node = new Node(x);
		node.next = head;
		return node;
	}
	
	static Node delete(Node head, int position) {
		//usu� linijk� poni�ej i dodaj w�asn� implementacj�
		return new Node();
	}

}
