package kr.hnu.test;

import java.io.Serializable;

public class Account implements Serializable {
    private String id;
    private String pw;

    public Account(String id, String pw){
        this.id = id;
        this.pw = pw;
    }

    public String getId() {
        return id;
    }

    public String getPw() {
        return pw;
    }


}