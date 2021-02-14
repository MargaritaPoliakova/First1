package com.example.first;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button oxide, oxide1, oxide2, oxide3, oxide4, oxide5,
            lue, lue1, lue2, lue3, lue4, lue5, acid, acid1, acid2, acid3, acid4, acid5,
            salt, salt1, salt2, salt3, salt4, salt5;
    TextView text1, text2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text1 = findViewById(R.id.text1);
        text2 = findViewById(R.id.text2);

        oxide = findViewById(R.id.oxide);
        oxide1 = findViewById(R.id.oxide1);
        oxide2 = findViewById(R.id.oxide2);
        oxide3 = findViewById(R.id.oxide3);
        oxide4 = findViewById(R.id.oxide4);
        oxide5 = findViewById(R.id.oxide5);

        lue = findViewById(R.id.lye);
        lue1 = findViewById(R.id.lye1);
        lue2 = findViewById(R.id.lye2);
        lue3 = findViewById(R.id.lye3);
        lue4 = findViewById(R.id.lye4);
        lue5 = findViewById(R.id.lye5);

        acid = findViewById(R.id.acid);
        acid1 = findViewById(R.id.acid1);
        acid2 = findViewById(R.id.acid2);
        acid3 = findViewById(R.id.acid3);
        acid4 = findViewById(R.id.acid4);
        acid5 = findViewById(R.id.acid5);

        salt = findViewById(R.id.salt);
        salt1 = findViewById(R.id.salt1);
        salt2 = findViewById(R.id.salt2);
        salt3 = findViewById(R.id.salt3);
        salt4 = findViewById(R.id.salt4);
        salt5 = findViewById(R.id.salt5);


    }


    public void onMyClick(View v) {
        switch (v.getId()) {
            case R.id.oxide:
                text1.setText(oxide.getText().toString());
                break;
            case R.id.oxide1:
                text1.setText(oxide1.getText().toString());
                break;
            case R.id.oxide2:
                text1.setText(oxide2.getText().toString());
                break;
            case R.id.oxide3:
                text1.setText(oxide3.getText().toString());
                break;
            case R.id.oxide4:
                text1.setText(oxide4.getText().toString());
                break;
            case R.id.oxide5:
                text1.setText(oxide5.getText().toString());
                break;
            case R.id.lye:
                text1.setText(lue.getText().toString());
                break;
            case R.id.lye1:
                text1.setText(lue1.getText().toString());
                break;
            case R.id.lye2:
                text1.setText(lue2.getText().toString());
                break;
            case R.id.lye3:
                text1.setText(lue3.getText().toString());
                break;
            case R.id.lye4:
                text1.setText(lue4.getText().toString());
                break;
            case R.id.lye5:
                text1.setText(lue5.getText().toString());
                break;
            case R.id.acid:
                text1.setText(acid.getText().toString());
                break;
            case R.id.acid1:
                text1.setText(acid1.getText().toString());
                break;
            case R.id.acid2:
                text1.setText(acid2.getText().toString());
                break;
            case R.id.acid3:
                text1.setText(acid3.getText().toString());
                break;
            case R.id.acid4:
                text1.setText(acid4.getText().toString());
                break;
            case R.id.acid5:
                text1.setText(acid5.getText().toString());
                break;
            case R.id.salt:
                text1.setText(salt.getText().toString());
                break;
            case R.id.salt1:
                text1.setText(salt1.getText().toString());
                break;
            case R.id.salt2:
                text1.setText(salt2.getText().toString());
                break;
            case R.id.salt3:
                text1.setText(salt3.getText().toString());
                break;
            case R.id.salt4:
                text1.setText(salt4.getText().toString());
                break;
            case R.id.salt5:
                text1.setText(salt5.getText().toString());
                break;
        }

        if (text1.getText().toString() != null) {
            switch (v.getId()) {
                case R.id.oxide:
                    text2.setText(oxide.getText().toString());
                    break;
                case R.id.oxide1:
                    text2.setText(oxide1.getText().toString());
                    break;
                case R.id.oxide2:
                    text2.setText(oxide2.getText().toString());
                    break;
                case R.id.oxide3:
                    text2.setText(oxide3.getText().toString());
                    break;
                case R.id.oxide4:
                    text2.setText(oxide4.getText().toString());
                    break;
                case R.id.oxide5:
                    text2.setText(oxide5.getText().toString());
                    break;
                case R.id.lye:
                    text2.setText(lue.getText().toString());
                    break;
                case R.id.lye1:
                    text2.setText(lue1.getText().toString());
                    break;
                case R.id.lye2:
                    text2.setText(lue2.getText().toString());
                    break;
                case R.id.lye3:
                    text2.setText(lue3.getText().toString());
                    break;
                case R.id.lye4:
                    text2.setText(lue4.getText().toString());
                    break;
                case R.id.lye5:
                    text2.setText(lue5.getText().toString());
                    break;
                case R.id.acid:
                    text2.setText(acid.getText().toString());
                    break;
                case R.id.acid1:
                    text2.setText(acid1.getText().toString());
                    break;
                case R.id.acid2:
                    text2.setText(acid2.getText().toString());
                    break;
                case R.id.acid3:
                    text2.setText(acid3.getText().toString());
                    break;
                case R.id.acid4:
                    text2.setText(acid4.getText().toString());
                    break;
                case R.id.acid5:
                    text2.setText(acid5.getText().toString());
                    break;
                case R.id.salt:
                    text2.setText(salt.getText().toString());
                    break;
                case R.id.salt1:
                    text2.setText(salt1.getText().toString());
                    break;
                case R.id.salt2:
                    text2.setText(salt2.getText().toString());
                    break;
                case R.id.salt3:
                    text2.setText(salt3.getText().toString());
                    break;
                case R.id.salt4:
                    text2.setText(salt4.getText().toString());
                    break;
                case R.id.salt5:
                    text2.setText(salt5.getText().toString());
                    break;
            }
        }
    }

    public void Print(TextView t1, TextView t2) {
        ImageView imageView = findViewById(R.id.image);
        if (t1.getText().toString() == t2.getText().toString())
            Toast.makeText(getApplicationContext(), "Вы выбрали два одинаковых типа вещества", Toast.LENGTH_SHORT).show();
        if (t1.getText().toString() == "Оксид") {
            switch (t2.getText().toString()) {
                case "Оксид":
                    break;
                case "Основание":
                    break;
                case "Кислота":
                    break;
                case "Соль":
                    break;
                default:
                    Toast.makeText(getApplicationContext(), "Нельзя соединять обобщенное вещество с конкретным ", Toast.LENGTH_SHORT).show();
            }

            if (t1.getText().toString() == "Соль") {
                switch (t2.getText().toString()) {
                    case "Оксид":
                        break;
                    case "Основание":
                        break;
                    case "Кислота":
                        break;
                    case "Соль":
                        break;
                    default:
                        Toast.makeText(getApplicationContext(), "Нельзя соединять обобщенное вещество с конкретным ", Toast.LENGTH_SHORT).show();
                }
            }
            if(t1.getText().toString() == "Основание") {
                switch (t2.getText().toString()) {
                    case "Оксид":
                        break;
                    case "Основание":
                        break;
                    case "Кислота":
                        break;
                    case "Соль":
                        break;
                    default:
                        Toast.makeText(getApplicationContext(), "Нельзя соединять обобщенное вещество с конкретным ", Toast.LENGTH_SHORT).show();
                }
            }
            if(t1.getText().toString() == "Кислота") {
                switch (t2.getText().toString()) {
                    case "Оксид":
                        break;
                    case "Основание":
                        break;
                    case "Кислота":
                        break;
                    case "Соль":
                        break;
                    default:
                        Toast.makeText(getApplicationContext(), "Нельзя соединять обобщенное вещество с конкретным ", Toast.LENGTH_SHORT).show();
                }
            }

            if(t1.getText().toString() == "" && t2.getText().toString() == "") imageView.setImageBitmap(R.drawable.);
            if(t1.getText().toString() == "" && t2.getText().toString() == "") imageView.setImageBitmap(R.drawable.);
            if(t1.getText().toString() == "" && t2.getText().toString() == "") imageView.setImageBitmap(R.drawable.);
            if(t1.getText().toString() == "" && t2.getText().toString() == "") imageView.setImageBitmap(R.drawable.);
            if(t1.getText().toString() == "" && t2.getText().toString() == "") imageView.setImageBitmap(R.drawable.);
            if(t1.getText().toString() == "" && t2.getText().toString() == "") imageView.setImageBitmap(R.drawable.);
            if(t1.getText().toString() == "" && t2.getText().toString() == "") imageView.setImageBitmap(R.drawable.);
            if(t1.getText().toString() == "" && t2.getText().toString() == "") imageView.setImageBitmap(R.drawable.);
            if(t1.getText().toString() == "" && t2.getText().toString() == "") imageView.setImageBitmap(R.drawable.);
            if(t1.getText().toString() == "" && t2.getText().toString() == "") imageView.setImageBitmap(R.drawable.);
            if(t1.getText().toString() == "" && t2.getText().toString() == "") imageView.setImageBitmap(R.drawable.);
            if(t1.getText().toString() == "" && t2.getText().toString() == "") imageView.setImageBitmap(R.drawable.);
            if(t1.getText().toString() == "" && t2.getText().toString() == "") imageView.setImageBitmap(R.drawable.);
            if(t1.getText().toString() == "" && t2.getText().toString() == "") imageView.setImageBitmap(R.drawable.);
            if(t1.getText().toString() == "" && t2.getText().toString() == "") imageView.setImageBitmap(R.drawable.);
            if(t1.getText().toString() == "" && t2.getText().toString() == "") imageView.setImageBitmap(R.drawable.);
            if(t1.getText().toString() == "" && t2.getText().toString() == "") imageView.setImageBitmap(R.drawable.);
            if(t1.getText().toString() == "" && t2.getText().toString() == "") imageView.setImageBitmap(R.drawable.);
            if(t1.getText().toString() == "" && t2.getText().toString() == "") imageView.setImageBitmap(R.drawable.);
            if(t1.getText().toString() == "" && t2.getText().toString() == "") imageView.setImageBitmap(R.drawable.);
            if(t1.getText().toString() == "" && t2.getText().toString() == "") imageView.setImageBitmap(R.drawable.);
            if(t1.getText().toString() == "" && t2.getText().toString() == "") imageView.setImageBitmap(R.drawable.);
            if(t1.getText().toString() == "" && t2.getText().toString() == "") imageView.setImageBitmap(R.drawable.);
            if(t1.getText().toString() == "" && t2.getText().toString() == "") imageView.setImageBitmap(R.drawable.);
            if(t1.getText().toString() == "" && t2.getText().toString() == "") imageView.setImageBitmap(R.drawable.);
            if(t1.getText().toString() == "" && t2.getText().toString() == "") imageView.setImageBitmap(R.drawable.);
            if(t1.getText().toString() == "" && t2.getText().toString() == "") imageView.setImageBitmap(R.drawable.);
            if(t1.getText().toString() == "" && t2.getText().toString() == "") imageView.setImageBitmap(R.drawable.);
            if(t1.getText().toString() == "" && t2.getText().toString() == "") imageView.setImageBitmap(R.drawable.);
            if(t1.getText().toString() == "" && t2.getText().toString() == "") imageView.setImageBitmap(R.drawable.);
            if(t1.getText().toString() == "" && t2.getText().toString() == "") imageView.setImageBitmap(R.drawable.);
            if(t1.getText().toString() == "" && t2.getText().toString() == "") imageView.setImageBitmap(R.drawable.);
            if(t1.getText().toString() == "" && t2.getText().toString() == "") imageView.setImageBitmap(R.drawable.);
            if(t1.getText().toString() == "" && t2.getText().toString() == "") imageView.setImageBitmap(R.drawable.);
            if(t1.getText().toString() == "" && t2.getText().toString() == "") imageView.setImageBitmap(R.drawable.);
            if(t1.getText().toString() == "" && t2.getText().toString() == "") imageView.setImageBitmap(R.drawable.);
            if(t1.getText().toString() == "" && t2.getText().toString() == "") imageView.setImageBitmap(R.drawable.);
            if(t1.getText().toString() == "" && t2.getText().toString() == "") imageView.setImageBitmap(R.drawable.);
            if(t1.getText().toString() == "" && t2.getText().toString() == "") imageView.setImageBitmap(R.drawable.);
            if(t1.getText().toString() == "" && t2.getText().toString() == "") imageView.setImageBitmap(R.drawable.);
        }
    }
}
