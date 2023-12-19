package com.example.msafe;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.squareup.picasso.Picasso;

import de.hdodenhof.circleimageview.CircleImageView;

public class ChatActivity extends AppCompatActivity {

    String ReceiverImage,ReceiverUID, ReceiverName;
    CircleImageView profileImage;
    TextView receiver_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        ReceiverName = getIntent().getStringExtra("name");
        ReceiverImage = getIntent().getStringExtra("ReceiverImage");
        ReceiverUID = getIntent().getStringExtra("uid");
        receiver_name = findViewById(R.id.receiver_name);

        profileImage = findViewById(R.id.profile_image);

        Picasso.get().load(ReceiverImage).into(profileImage);
        receiver_name.setText(""+ReceiverName);


    }
}