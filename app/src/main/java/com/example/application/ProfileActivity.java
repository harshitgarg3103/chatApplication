package com.example.application;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.flaviofaria.kenburnsview.KenBurnsView;
import de.hdodenhof.circleimageview.CircleImageView;
import jahirfiquitiva.libs.fabsmenu.FABsMenu;
import jahirfiquitiva.libs.fabsmenu.TitleFAB;

public class ProfileActivity extends AppCompatActivity
{
    private TextView name, status;
    private CircleImageView image;
    private KenBurnsView cover;
    private FABsMenu menu;
    private TitleFAB button1, button2, button3;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        name = findViewById(R.id.profile_name);
        status = findViewById(R.id.profile_status);
        image = findViewById(R.id.imageMsg);
        menu = findViewById(R.id.profile_fabs_menu);
        cover = findViewById(R.id.profile_cover);

    }


}