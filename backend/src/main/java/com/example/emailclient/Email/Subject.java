package com.example.emailclient.Email;

import java.util.ArrayList;

public class Subject implements Strategy{
    @Override
    public Email[] Sort(Email[] m) {
        int size = m.length;
        for(int i = 0; i<size-1; i++) {
            for (int j = i + 1; j < m.length; j++) {
                if (m[i].getSubject().compareTo(m[j].getSubject()) > 0) {
                    Email temp = m[i];
                    m[i]=m[j];
                    m[j]=temp; } }
        }
        return m;
    }

    @Override
    public Email[] Search(Email[] email,String key) {
        ArrayList<Email> searched= new ArrayList<>();
        for (int j = 0; j < email.length; j++) {
            if (email[j].getSubject().compareTo(key) == 0) {
                searched.add(email[j]);
                 }}

        return searched.toArray(new Email[searched.size()]);
    }
}
