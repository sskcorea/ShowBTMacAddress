package com.example.samsung.showbtmacaddress;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView tv1=(TextView)findViewById(R.id.txt1);
        final TextView tv2=(TextView)findViewById(R.id.txt2);

        tv1.setText("MAC (Setting) : " + android.provider.Settings.Secure.getString(this.getContentResolver(), "bluetooth_address"));
        tv2.setText("MAC (BluetoothAdapter): " + BluetoothAdapter.getDefaultAdapter().getAddress());
    }
}
