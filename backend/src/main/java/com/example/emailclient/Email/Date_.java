package com.example.emailclient.Email;

public class Date_ implements Strategy{
    @Override
    public Email[] Sort(Email[] m) {
        int size = m.length;
        for(int i = 0; i<size-1; i++) {
            for (int j = i + 1; j < m.length; j++) {
                if (m[i].getDate().compareTo(m[j].getDate()) < 0) {
                    Email temp = m[i];
                    m[i]=m[j];
                    m[j]=temp;
                }
            }
        }
        return m; }
        //String pattern
    @Override
    public Email[] Search(Email[] email,String key) {

        return new Email[0];
    }
}