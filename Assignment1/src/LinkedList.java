
import link.Link;

public class LinkedList<A> {

	Link<A> root = null;
	Link<A> end = null;
	int length = 0;

	void add(int index, A a) throws Exception {
		Link<A> newObject = new Link<A>();
		newObject.theElement = a;
		Link<A> temp = root;
		if (index > length || index < 0) {
			throw new Exception("Trying to get element beyond list");
		}

		if (index == 0) {
			this.addFirst(a);

		} else if (index == length) {
			this.addLast(a);

		} else {

			for (int i = 0; i < index - 1; i++) {

				temp = temp.next;
			}
			newObject.next = temp.next;
			temp.next = newObject;

		}
		length++;
	}

	void addFirst(A a) {
		Link<A> newObject = new Link<A>();
		newObject.theElement = a;
		if (root == null) {
			end = newObject;
		}
		newObject.next = root;
		root = newObject;
		length++;
	}

	void addLast(A a) {
		Link<A> newObject = new Link<A>();
		Link<A> temp = root;
		newObject.theElement = a;
		if (root == null) {
			root = newObject;
		}

		for (int i = 0; i < length - 1; i++) {
			temp = temp.next;
		}
		temp.next = newObject;
		end = newObject;
		length++;
	}

	A remove(int index) throws Exception {
		Link<A> temp = root;
		A tempElement = null;
		if (index > length || index < 0) {
			throw new Exception("Trying to get element beyond list");
		}

		if (index == 0) {
			this.removeFirst();

		} else if (index == length) {
			this.removeLast();

		} else {

			for (int i = 0; i < index - 1; i++) {

				temp = temp.next;
			}
			tempElement = temp.next.theElement;
			temp.next = temp.next.next;

		}
		
		length--;
		return tempElement;
	}

	A removeFirst() {
		Link<A> temp = root;
		root = root.next;
		length--;
		if(root == null) {
			end = null;
		}

		return temp.theElement;
		

	}

	A removeLast() {

		Link<A> temp = root;
		A tempElement;

		for (int i = 0; i < length - 1; i++) {
			temp = temp.next;
		}
		tempElement = end.theElement;
		temp.next = null;
		end = temp;
		length--;
		return tempElement;

	}

	boolean isEmpty() {
		if (root == null && end == null) {
			return true;
		} else {
			return false;
		}

	}

	A get(int index) throws Exception {

		if (index > length) {
			throw new Exception("Trying to get element beyond list");
		}

		if (index == 0) {
			return (A) root.theElement;
		}
		Link<A> temp;
		temp = root;
		for (int i = 0; i < index; i++) {
			temp = temp.next;
		}
		return temp.theElement;

	}
	void printList() throws Exception {
		for ( int i = 0;i < length;i++) {
		A result = this.get(i);
		System.out.println(result);
		}
	}
}
