package hcmute.edu.vn.nhom03.foody;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public static Button btntinhthanh;


    int REQUSET_CODE_EDIT = 123;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btntinhthanh = findViewById(R.id.buttonTinhThanh);



        btntinhthanh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SearchTinhThanhActivity.class);
                startActivityForResult(intent, REQUSET_CODE_EDIT);
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if(requestCode == REQUSET_CODE_EDIT && resultCode == RESULT_OK && data != null )
        {
            String ten = data.getStringExtra("aaa");
            btntinhthanh.setText(ten);
        }

        super.onActivityResult(requestCode, resultCode, data);
    }
}
