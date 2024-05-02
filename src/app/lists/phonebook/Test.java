package app.lists.phonebook;

import java.util.List;

public class Test {
    public static void main(String[] args) {

        PhoneBook myPhoneBook = new PhoneBook();

        myPhoneBook.add(new Record("Tosha", "38063456789"));
        myPhoneBook.add(new Record("Sasha", "380634564567"));
        myPhoneBook.add(new Record("Sasha", "38067458789"));
        myPhoneBook.add(new Record("Sasha", "380684566789"));
        myPhoneBook.add(new Record("Misha", "3806846565680"));
        myPhoneBook.add(new Record("Misha", "380684566740"));
        myPhoneBook.add(new Record("Julia", "380684562789"));
        myPhoneBook.add(new Record("Andrey", "380684656534"));

        Record foundRecord = myPhoneBook.find("Misha");
        if(foundRecord != null){
        System.out.println("Name: " + foundRecord.getName() + "; phone num: " + foundRecord.getPhone());
        }else{
            System.out.println("No record found");
        }

        List<Record> foundRecords= myPhoneBook.findAll("Sasha");

        if(foundRecords!=null){
            for(Record record: foundRecords){
                System.out.println("Name: " + record.getName() + "; phone num: " + record.getPhone());
            }
        }else{
            System.out.println("No records found");
        }

    }

}
