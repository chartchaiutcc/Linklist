package Linklist;

public class LinkedListApp {
	public static void main(String[] args) {
		DataStructureClass dtc = new DataStructureClass();
		
		dtc.insert(new StudentRecord(1, "Jamse "," james@mmail.com ","0898844 "));
		dtc.insert(new StudentRecord(2, "John "," john@mmail.com ","0856633 "));
		dtc.insert(new StudentRecord(3, "jim "," jim@mmail.com ","0824474 "));
		dtc.insert(new StudentRecord(4,	"jonas "," jonas@mmail.com ","0819484 "));
		
		System.out.println(dtc);
		
		StudentRecord result = dtc.search(2);
		if(result != null) {
			System.out.println("Search result: " + result);
		} else {
			System.out.println("Cannot find a result.");
		}
		
		result = dtc.delete(3);
		if(result != null) {
			System.out.println("Deleted: " + result);
		} else {
			System.out.println("Cannot delete.");
		}
		
		System.out.println(dtc);
	}

}
