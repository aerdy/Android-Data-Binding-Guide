package com.example.jarod.databindingguide;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by jarod on 8/1/15.
 */
public class User {
    private final String firstName;
    private final String lastName;
    private final String oldName;
    private boolean data ;

    public User(String firstName, String lastName,String oldName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.oldName = oldName;
    }
    public String getFirstName() {
        return this.firstName;
    }

    public String getOldName() {
        return oldName;
    }

    public String getLastName() {
        return this.lastName;
    }

}
