package viikko11;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class AddressBook {

    private List<Contact> contacts;

    public AddressBook() {
        this.contacts = new ArrayList<>();
    }

    public boolean add(Contact newContact) {
        this.contacts.add(newContact);
        return true;
    }

    public Contact search(String keyword) {
        for (Contact current : this.contacts) {
            String name = current.getName();
            if (name != null && name.toLowerCase().contains(keyword.toLowerCase())) {
                return current; // palautetaan löytynyt arvo heti
            }
        }
        return null; // palautetaan null, jos ei löytynyt
    }

    @Override
    public String toString() {
        // TODO: toteuta tämä metodi. Metodin tulee muodostaa merkkijono, 
        // joka sisältää kaikki yhteystiedot omilla riveillään.
        return "TODO";
    }
}