package com.trisha.mycities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    ImageView cityImg;
    TextView cityName,cityDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        cityImg=(ImageView)findViewById(R.id.ctgimg);
        cityName=(TextView)findViewById(R.id.cityname);
        cityDescription=(TextView)findViewById(R.id.citydescription);

        String getCityNo=getIntent().getExtras().getString("cityno");

        if(getCityNo.equals("one"))
        {
            cityImg.setImageResource(R.drawable.ctg);
            cityName.setText(R.string.city1);
            cityDescription.setText(R.string.des_city1);

        }
        else if(getCityNo.equals("two"))
        {
            cityImg.setImageResource(R.drawable.dhaka);
            cityName.setText(R.string.city2);
            cityDescription.setText(R.string.des_city2);

        }
        else if(getCityNo.equals("three"))
        {

            cityImg.setImageResource(R.drawable.cox);
            cityName.setText(R.string.city3);
            cityDescription.setText(R.string.des_city3);

        }
        else if(getCityNo.equals("four"))
        {
            cityImg.setImageResource(R.drawable.syl);
            cityName.setText(R.string.city4);
            cityDescription.setText(R.string.des_city4);

        }
    }
}
