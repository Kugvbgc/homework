package com.khair.homework;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    GridView GridView;

    ArrayList<HashMap<String,String>>arrayList=new ArrayList<>();
    HashMap<String,String>hashMap=new HashMap<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridView=findViewById(R.id.GridView);

        CreteTable();
        MyAdapter myAdapter=new MyAdapter();
        GridView.setAdapter(myAdapter);












    }
 ///================================================================================================
 //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

 public class MyAdapter extends BaseAdapter{

     @Override
     public int getCount() {
         return arrayList.size();
     }

     @Override
     public Object getItem(int position) {
         return null;
     }

     @Override
     public long getItemId(int position) {
         return 0;
     }

     @Override
     public View getView(int position, View convertView, ViewGroup parent) {

         LayoutInflater inflater= (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
         View myView =inflater.inflate(R.layout.item,parent,false);

         TextView textView=myView.findViewById(R.id.Item_Tittle);
         LinearLayout layout=myView.findViewById(R.id.Item);

         HashMap<String,String>hashMap=arrayList.get(position);
         String stringTittle=hashMap.get("Item_Tittle");

         textView.setText(stringTittle);


         layout.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 if (position==0){
                     startActivity(new Intent(MainActivity.this, MainActivity2.class));

                 }else if (position==1){
                     startActivity(new Intent(MainActivity.this, MainActivity3.class));

                 }else if (position==2){
                     startActivity(new Intent(MainActivity.this, MainActivity4.class));

                 }else if (position==3){
                     startActivity(new Intent(MainActivity.this, MainActivity5.class));

                 }else if (position==4){
                     startActivity(new Intent(MainActivity.this, MainActivity6.class));

                 }else if (position==5){
                     startActivity(new Intent(MainActivity.this, MainActivity7.class));

                 }else if (position==6){
                     startActivity(new Intent(MainActivity.this, MainActivity8.class));

                 }else if (position==7){
                     startActivity(new Intent(MainActivity.this, MainActivity9.class));

                 }else if (position==8){
                     startActivity(new Intent(MainActivity.this, MainActivity10.class));

                 }else if (position==9){
                     startActivity(new Intent(MainActivity.this, MainActivity11.class));

                 }
             }
         });







         return myView;
     }
 }
//==========================================CreteTable==============================================
///+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

    public void CreteTable(){
        hashMap=new HashMap<>();
        hashMap.put("Item_Tittle","HOME WORK 214_1");
        arrayList.add(hashMap);

        hashMap=new HashMap<>();
        hashMap.put("Item_Tittle","HOME WORK 214_2");
        arrayList.add(hashMap);



        hashMap=new HashMap<>();
        hashMap.put("Item_Tittle","HOME WORK 214_3");
        arrayList.add(hashMap);


        hashMap=new HashMap<>();
        hashMap.put("Item_Tittle","HOME WORK 214_4");
        arrayList.add(hashMap);


        hashMap=new HashMap<>();
        hashMap.put("Item_Tittle","HOME WORK 214_5");
        arrayList.add(hashMap);


        hashMap=new HashMap<>();
        hashMap.put("Item_Tittle","HOME WORK 232_1");
        arrayList.add(hashMap);


        hashMap=new HashMap<>();
        hashMap.put("Item_Tittle","HOME WORK 232_2");
        arrayList.add(hashMap);


        hashMap=new HashMap<>();
        hashMap.put("Item_Tittle","HOME WORK 232_3");
        arrayList.add(hashMap);


        hashMap=new HashMap<>();
        hashMap.put("Item_Tittle","HOME WORK 232_4");
        arrayList.add(hashMap);


        hashMap=new HashMap<>();
        hashMap.put("Item_Tittle","HOME WORK 232_5");
        arrayList.add(hashMap);










    }




















///================================================================================================
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

}