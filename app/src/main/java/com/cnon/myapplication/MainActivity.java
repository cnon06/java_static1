package com.cnon.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;




public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


       fgded ffeeff = new fgded();
        System.out.println(ffeeff.yazdir());
        System.out.println(ffeeff.yazdir());
        System.out.println(ffeeff.yazdir());
        fgded ghnbnb = new fgded();
        System.out.println(ghnbnb.yazdir());
        System.out.println(ghnbnb.yazdir());
        System.out.println(ghnbnb.yazdir());
        fgded ffdfd = new fgded();
        System.out.println(ffdfd.yazdir());
        System.out.println(ffdfd.yazdir());
        System.out.println(ffdfd.yazdir());
        
        



    }
}

class fgded
{

  static   int count=0; // static ifadesi kaldırıldığında constuctor her çağırıldığında içerisindeki
    // değişkenin değeri bir artmaz yeniden başlar

    fgded()
    {
        count++;

    }


    String yazdir()
    {
        return count+"";
    }

}