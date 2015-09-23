package com.leeeyou.toolbarsample;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.Toolbar.OnMenuItemClickListener;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class ToolbarActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toolbar);

        final Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        toolbar.setTitle("Toolbar");
        toolbar.setTitleTextColor(Color.WHITE);

        toolbar.setSubtitle("SubTitle");
        toolbar.setSubtitleTextColor(Color.GRAY);

        toolbar.setNavigationIcon(R.mipmap.menu);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ToolbarActivity.this, "Navigation", Toast.LENGTH_SHORT).show();
            }
        });

        toolbar.setLogo(R.mipmap.ic_launcher);

        toolbar.inflateMenu(R.menu.menu_toolbar);
        toolbar.setOnMenuItemClickListener(new OnMenuItemClickListener() {
                                               @Override
                                               public boolean onMenuItemClick(MenuItem item) {
                                                   String result = "";
                                                   switch (item.getItemId()) {
                                                       case R.id.ac_toolbar_copy:
                                                           result = "Copy";
                                                           break;
                                                       case R.id.ac_toolbar_cut:
                                                           result = "Cut";
                                                           break;
                                                       case R.id.ac_toolbar_del:
                                                           result = "Del";
                                                           break;
                                                       case R.id.ac_toolbar_edit:
                                                           result = "Edit";
                                                           break;
                                                       case R.id.ac_toolbar_email:
                                                           result = "Email";
                                                           break;
                                                   }

                                                   Toast.makeText(ToolbarActivity.this, result, Toast.LENGTH_SHORT).show();
                                                   return true;
                                               }
                                           }
        );


    }

}
