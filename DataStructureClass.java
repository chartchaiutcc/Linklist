package Linklist;

public class DataStructureClass {
	private int size;
	private int count;
	private StudentRecord listOfStudents;
	
	public DataStructureClass () {
		listOfStudents = null;
		count = 0;
	}
	
	public DataStructureClass(int size) {		
		if(size <= 0) {
			size = 10;
		}
		this.size = size;
		this.count = 0;
	}
	
	//C => Create
	public void insert(StudentRecord newStudentRecord) {
		newStudentRecord.next = listOfStudents;
		listOfStudents = newStudentRecord;
			count++;
		
	}
	
	//R => Retrieve
	public StudentRecord search(int Key) {
		StudentRecord current = listOfStudents;
		while(current.getId() !=Key) {
			if(current.next == null)
				return null;
			else
				current = current.next;
		}
		return current;
	}
	
	
	
	//D => Delete
	public StudentRecord delete(int Key) {
		StudentRecord current = listOfStudents;
		StudentRecord previous = listOfStudents;
		while (current.getId() != Key ) {
			if(current.next == null)
				return null;
			else {
				previous = current;
				current = current.next;	
			}	
		}
		if (current == listOfStudents)
			listOfStudents = listOfStudents.next;
		else 
			previous.next = current.next;
		count --;
		return current;
	}
	
	public int length() {
		return count;	
	}
	
	public boolean isFull() {
		return count == size;
	}
	public String toString() {
		String str = "";
		StudentRecord current = listOfStudents;
		while(current != null) {
			str += current + "\n";
			current = current.next;
		}
		
		return str;
	}
}
