public class map4 {

	public static void main(String[] args) {
		ContactList contactsList = new ContactList();
		
		contactsList.addContact("Ashwath", 9799988788);
		contactsList.addContact("Nanda", 8856654712);
		contactsList.addContact("Akhil", 7354126985);
				
		System.out.println("Akhil: " + contactsList.doesContactNameExist("Akhil"));
		System.out.println("9799988788: " + contactsList.doesContactNumberExist(9799988788));
		
		System.out.println();
		contactsList.listAllContacts();
	}

}