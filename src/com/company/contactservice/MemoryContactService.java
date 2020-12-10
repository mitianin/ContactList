package com.company.contactservice;

import com.company.Contact;

import java.util.ArrayList;
import java.util.List;

public class MemoryContactService implements ContactService {

    private static List<Contact> list = new ArrayList<>();
    private List<Contact> values;

    @Override
    public List<Contact> getAll() {
        return list;
    }

    @Override
    public void remove(int index) {
        list.remove(index);
    }

    @Override
    public void add(Contact contact) {
        list.add(contact);
    }

    @Override
    public List<Contact> getContactByNumber(String value) {
        values = new ArrayList<>();

        for (Contact c : list
        ) {
            if (c.getPhone().contains(value)) {
                values.add(c);
            }
        }

        return values;
    }

    @Override
    public List<Contact> getContactByName(String value) {
        values = new ArrayList<>();

        for (Contact c : list
        ) {
            if (c.getName().startsWith(value)) {
                values.add(c);
            }
        }

        return values;
    }
}
