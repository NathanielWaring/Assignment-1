

import link.Person;

public class Main {

	public static void main(String[] args) throws Exception {
		LinkedList<Person> test = new LinkedList<Person>();
		System.out.println("The array is empty: "+ test.isEmpty());
		System.out.println("********************************");
		System.out.println("Added original data");
		Person testPerson = new Person("Joe", "Smith", "123 Here", "Greenfield", "Massachusetts", "01301");
		test.addFirst(testPerson);
		testPerson = new Person("Jane", "Smith", "123 Here", "Greenfield", "Massachusetts", "01301");
		test.addFirst(testPerson);
		testPerson = new Person("Sally", "Smith", "123 Here", "Greenfield", "Massachusetts", "01301");
		test.addFirst(testPerson);
		test.printList();
		System.out.println("********************************");
		
		testPerson = new Person("Billy", "Smith", "123 Here", "Greenfield", "Massachusetts", "01301");
		test.addFirst(testPerson);
		System.out.println("Added first: " + testPerson.getFirstName());

		test.printList();
		System.out.println("********************************");
		testPerson = new Person("Johnny", "Smith", "123 Here", "Greenfield", "Massachusetts", "01301");
		test.addLast(testPerson);
		System.out.println("Added last: " + testPerson.getFirstName());
		test.printList();
		
		System.out.println("********************************");
		testPerson = new Person("Hector", "Gonzales", "321 There", "Greenfield", "Massachusetts", "01301");
		test.add(3, testPerson);
		System.out.println("Added at element 3: " + testPerson.getFirstName());
		test.printList();
		
		
		System.out.println("********************************");
		
		Person removed = test.remove(2);
		
		System.out.println("Removed at element 2: " + removed.getFirstName());

		test.printList();
		
		System.out.println("********************************");
		
		removed = test.removeFirst();
		
		System.out.println("Removed first: " + removed.getFirstName());

		test.printList();
		
		System.out.println("********************************");
		removed = test.removeLast();
		
		System.out.println("Removed last: " + removed.getFirstName());

		test.printList();
		System.out.println("********************************");
		System.out.println("The array is empty: "+ test.isEmpty());
	}

}
