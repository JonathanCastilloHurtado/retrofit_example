package com.johncastle.retrofit_example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    final String URL_BASE_FORMULARIOS="http://www.johncastle.com.mx/apis/";
    final String URL_BASE_USUARIOS="http://www.johncastle.com.mx/apis/";
    final String URL_BASE_LOGINAPP="http://172.20.0.131:80/";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewModel viewModel = new ViewModel(URL_BASE_LOGINAPP);
        viewModel.consumeLoginApp();
    }

}