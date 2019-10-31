package academy.learnprogramming;

import java.util.ArrayList;

public class MobilePhone {

    private ArrayList<Contact> contacts = new ArrayList<>();

    public boolean addNewContact(Contact contact) {
        if(findContact(contact.getName()) >= 0) {
            System.out.println("Contact is already on file.");
            return false;
        }

        contacts.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int position = findContact(oldContact.getName());
        if( position < 0) {
            System.out.println(oldContact.getName() + ", was not found.");
            return false;
        } else if(findContact(newContact.getName()) != -1) {
            System.out.println("Contact with name " + newContact.getName() +
                    " already exists. Update was not successful.");
            return false;
        }

        contacts.set(position, newContact);
        System.out.println(oldContact.getName() + ", was replaced with " + newContact.getName());
        return true;
    }

    public boolean removeContact(Contact contact) {
        int position = findContact(contact.getName());
        if( position < 0) {
            System.out.println(contact.getName() + ", was not found.");
            return false;
        }

        contacts.remove(position);
        System.out.println(contact.getName() + ", was deleted.");
        return true;
    }

    public Contact queryContact(String name) {
        int position = findContact(name);
        if( position < 0) {
            System.out.println(name + ", was not found.");
            return null;
        }

        return contacts.get(position);
    }

    public int findContact(String name) {
        for(int i=0; i<contacts.size(); i++) {
            if(name.equals(contacts.get(i).getName()))
                return i;
        }
        return -1;
    }

    public void printContacts() {
        System.out.println("Contact List");
        for(int i=0; i<contacts.size(); i++) {
            System.out.println((i+1) + ". " +
                    contacts.get(i).getName() + " -> " +
                    contacts.get(i).getPhoneNumber());
        }
    }
}
