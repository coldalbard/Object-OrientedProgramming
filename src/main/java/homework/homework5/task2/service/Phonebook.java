package main.java.homework.homework5.task2.service;

import main.java.homework.homework5.task2.model.*;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Phonebook {
    private List<Contact> phonebook = currentPhonebook();
    private TxtFormat file = new TxtFormat(FileType.TXT);

    public Phonebook() {
        this.phonebook = currentPhonebook();
    }

    public Contact find(String phone) {
        for (Contact contact : phonebook) {
            if (contact.getPhone().equals(phone)) return contact;
        }
        return null;
    }

    public boolean add(Contact contact) {
        JsonFormat file = new JsonFormat(FileType.JSON);
        if (checkRepetitions(contact)) {
            phonebook.add(contact);
            file.edit(phonebook);
            return true;
        }
        return false;
    }

    public boolean delete(String phone) {
        for (int i = 0; i < phonebook.size(); i++) {
            if (phonebook.get(i).getPhone().equals(phone)) {
                phonebook.remove(i);
                file.edit(phonebook);
                return true;
            }
        }
        return false;
    }

    public boolean change(String firstPhone, Contact cont) {
        for (Contact contact : this.phonebook) {
            if (contact.getPhone().equals(firstPhone)) {
                contact.fullSet(cont.getName(), cont.getSurname(), cont.getPatronomyc(), cont.getPhone(), cont.getDescription());
                file.edit(phonebook);
                return true;
            }
        }
        return false;
    }

    public boolean checkRepetitions(Contact contact) {
        for (Contact search : this.phonebook) {
            if (search.getPhone().equals(contact.getPhone()) &&
                    search.getName().equals(contact.getName()) &&
                    search.getSurname().equals(contact.getSurname()) &&
                    search.getPatronomyc().equals(contact.getPatronomyc())) return false;
        }
        return true;
    }

    public List<Contact> getPhonebook() {
        return phonebook;
    }

    public void printPhonebook() {
        for (Contact contact : this.phonebook) {
            System.out.println(contact);
        }
    }

    public List<Contact> currentPhonebook() {
        TxtFormat txt = new TxtFormat(FileType.TXT);
        String file = txt.dateTxt("D:\\oopJava\\gbproj\\src\\main\\java\\homework\\homework5\\task2\\service\\phonebook.txt");
        String[] fileSplit = file.split("\n");
        StringBuilder sb = new StringBuilder();
        for (String s : fileSplit) {
            for (int i = 0; i < s.length(); i++) {
                if (i == s.length() - 1) {
                    sb.append(',');
                    break;
                } else if (s.charAt(i) == '\"' || s.charAt(i) == ' ') continue;
                else sb.append(s.charAt(i));
            }
        }
        String[] f = sb.toString().split(",");
        String[] v = new String[f.length];
        int count = 0;
        for (String s1 : f) {
            try {
                v[count] = s1.split("=")[1];
                count++;
            } catch (Exception e) {
                return new ArrayList<Contact>();
            }
        }
        Contact ct = new Contact();
        List<Contact> coll = new ArrayList<>();
        count = 1;
        for (String s : v) {
            if (count == 1) ct.setName(s);
            if (count == 2) ct.setSurname(s);
            if (count == 3) ct.setPatronomyc(s);
            if (count == 4) ct.setPhone(s);
            if (count == 5) {
                ct.setDescription(s);
                Contact contact = new Contact(ct.getName(), ct.getSurname(), ct.getPatronomyc(), ct.getPhone(), ct.getDescription());
                coll.add(contact);
                count = 0;
            }
            count++;
        }
        return coll;
    }
}
