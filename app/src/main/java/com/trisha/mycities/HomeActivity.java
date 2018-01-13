package com.trisha.mycities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    Button btnR1,btnR2,btnR3,btnR4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btnR1=(Button)findViewById(R.id.btn1);
        btnR2=(Button)findViewById(R.id.btn2);
        btnR3=(Button)findViewById(R.id.btn3);
        btnR4=(Button)findViewById(R.id.btn4);

        btnR1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HomeActivity.this,DetailsActivity.class);
                intent.putExtra("cityno","one");
                startActivity(intent);


            }
        });
        btnR2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HomeActivity.this,DetailsActivity.class);
                intent.putExtra("cityno","two");
                startActivity(intent);

            }
        });
        btnR3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HomeActivity.this,DetailsActivity.class);
                intent.putExtra("cityno","three");
                startActivity(intent);


            }
        });
        btnR4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HomeActivity.this,DetailsActivity.class);
                intent.putExtra("cityno","four");
                startActivity(intent);


            }
        });
    }
}
