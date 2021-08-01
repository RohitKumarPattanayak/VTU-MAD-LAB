package com.example.lab4_wallpaper;

import androidx.appcompat.app.AppCompatActivity;

import android.app.WallpaperManager;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    ImageView Img;
    int i = -1;
    int j = -1;
    int j1 = -1;
    int k = -1;

    int img[] = new int[]{R.drawable.naruto1,R.drawable.naruto2,R.drawable.naruto3};
    int guy[] = new int[]{R.drawable.guy1,R.drawable.guy2,R.drawable.guy3};
    int itachi[] = new int[]{R.drawable.itachi1,R.drawable.itachi2,R.drawable.itachi3};
    int kakashi[] = new int[]{R.drawable.kakashi1,R.drawable.kakashi2,R.drawable.kakashi3};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Img = findViewById(R.id.imageView);
        getSupportActionBar().hide();
    }
    public void wallpaper_changer_NARUTO(View view) {
        WallpaperManager w = WallpaperManager.getInstance(getBaseContext());
        try {
            i += 1;
            w.setBitmap(BitmapFactory.decodeResource(getResources(),img[i]));
            Img.setImageBitmap(BitmapFactory.decodeResource(getResources(),img[i]));
            if(i == 2){ i = -1; }
        } catch (IOException e) {
            e.printStackTrace();
        }
        Toast.makeText(MainActivity.this,"Naruto wallpaper-"+i+" is set.", Toast.LENGTH_SHORT).show();
    }

    public void wallpaper_changer_ITACHI(View view) {
        WallpaperManager w1  = WallpaperManager.getInstance(getBaseContext());
        j += 1;
        try {
            w1.setBitmap(BitmapFactory.decodeResource(getResources(),itachi[j]));
            Img.setImageBitmap(BitmapFactory.decodeResource(getResources(),itachi[j]));
            if(j == 2){j = -1; }
        } catch (IOException e) {
            e.printStackTrace();
        }
        Toast.makeText(MainActivity.this,"Itachi wallpaper-"+j+" is set.", Toast.LENGTH_SHORT).show();
    }

    public void wallpaper_changer_KAKASHI(View view) {
        WallpaperManager w2  = WallpaperManager.getInstance(getBaseContext());
        k += 1;
        try {
            w2.setBitmap(BitmapFactory.decodeResource(getResources(),kakashi[k]));
            Img.setImageBitmap(BitmapFactory.decodeResource(getResources(),kakashi[k]));
            if(k == 2){k = -1; }
        } catch (IOException e) {
            e.printStackTrace();
        }
        Toast.makeText(MainActivity.this,"Kakashi wallpaper-"+k+" is set.", Toast.LENGTH_SHORT).show();
    }

    public void wallpaper_changer_GUY(View view) {
        WallpaperManager w3  = WallpaperManager.getInstance(getBaseContext());
        j1 += 1;
        try {
            w3.setBitmap(BitmapFactory.decodeResource(getResources(),guy[j1]));
            Img.setImageBitmap(BitmapFactory.decodeResource(getResources(),guy[j1]));
            if(j1 == 2){j1 = -1; }
        } catch (IOException e) {
            e.printStackTrace();
        }
        Toast.makeText(MainActivity.this,"Guy wallpaper-"+j1+" is set.", Toast.LENGTH_SHORT).show();
    }
}