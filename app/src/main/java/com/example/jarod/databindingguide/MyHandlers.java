package com.example.jarod.databindingguide;

import android.content.DialogInterface;
import android.view.View;

/**
 * Created by jarod on 8/1/15.
 */
public class MyHandlers {
    public void onClickFriend(View view) {
            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });
         }
    public void onClickEnemy(View view) {
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        }
}
