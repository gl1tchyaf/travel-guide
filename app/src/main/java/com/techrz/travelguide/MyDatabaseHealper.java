package com.techrz.travelguide;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class MyDatabaseHealper extends SQLiteOpenHelper {

    private static final String Database_name= "Places";
    private static final int Version= 18;


    private Context context;

    public MyDatabaseHealper(@Nullable Context context) {
        super(context, Database_name, null, Version);
        this.context=context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        try{
            Toast.makeText(context,"Table Created ",Toast.LENGTH_LONG).show();
            db.execSQL("Create TABLE Places (Place_name varchar(50) primary key,Zilla_name varchar(20),Route varchar(1000),Cost varchar(5000),Map_link varchar(50));");
            db.execSQL("Create TABLE Places_Bangla (Place_name varchar(50) primary key,Zilla_name varchar(20),Route varchar(1000),Cost varchar(5000),Map_link varchar(50));");

           // db.execSQL("INSERT INTO Places VALUES('Inani Beach','Cox-Bazar','This will be the discription gg boi','Bus diya jaba vai','onek taka','https://fahimpro');");


            db.execSQL("INSERT INTO Places_Bangla VALUES('Safari Park','Gazipur','কিভাবে যাবেন\n" +
                    "এটি ঢাকা থেকে ৪০ কিলোমিটার উত্তরে ঢাকা - ময়মনসিংহ মহাসড়কের বাঘের বাজার থেকে ৩ কিলোমিটার পশ্চিমে সাফারী পার্কটির অবস্থান। ঢাকার গুলিস্তান থেকে প্রভাতি-বনশ্রী বাস মাওনা যায়। বাঘের বাজার থেকে ইজি বাইক/অটো রিক্সা/সিএনজি করে ৩ কিলো পশ্চিমে পার্কের ফটক পর্যন্ত যেতে ভাড়া নিবে জনপ্রতি ১০ টাকা।','সাফারি পার্ক প্রবেশ\n" +
                    "সকল বাংলাদেশিদের জন্য পার্কে প্রবেশ টিকেটের মূল্য ৫০ টাকা তবে ১৮ বছরের নিচে ছেলেমেয়েরা ২০ টাকায় পার্কে প্রবেশ করতে পারে। আর সাধারণ অথবা শিক্ষা সফরে আসা ছাত্রছাত্রীদের পার্কে প্রবেশ করতে ১০ টাকা দিতে হয়। বিদেশী দর্শনার্থীদের জন্য পার্কে প্রবেশ মূল্য ৫ ডলার। এছাড়া শিক্ষা প্রতিষ্ঠান থেকে শিক্ষা সফরে আগতদের জন্য স্পেশাল প্রবেশ ফি রয়েছে। যদি শিক্ষা সফরে আসা শিক্ষার্থীদের গ্রুপ ৪০-১০০ জন হয় তাহলে সবার প্রবেশ করতে ৪০০ টাকা লাগবে। যদি শিক্ষার্থী সংখ্যা ১০০ এর বেশি হয় তাহলে প্রবেশ করতে ৮০০ টাকা লাগবে।\n" +
                    "কোর সাফারি পার্ক প্রবেশ ফি\n" +
                    "কোর সাফারি পার্ক যেখানে খোলা পরিবেশে জীব জন্তু ঘুরে বেড়ায় তার মাঝ দিয়ে জীপ ও মিনিবাসে ঘুরে দেখতে জনপ্রতি ১০০ টাকা প্রদান করতে হবে। ১৮ বছরের কম বয়সী এবং ছাত্র/ছাত্রীদের জন্য প্রবেশ মূল্য জনপ্রতি ৫০ টাকা। মিনিবাসে করে ২০ মিনিট ঘুরিয়ে দেখাবে।\n" +
                    "পার্কের অন্যান্য জায়গায় প্রবেশ করতে টিকিট কেটে প্রবেশ করতে হবে। সব গুলো স্পট দেখতে মোটামুটি ২০০-৩০০ টাকা লাগবে। একসাথে কয়েকটি স্পট দেখার প্যাকেজ ও পাওয়া যায়।  এছাড়া প্যাডেল বোটে ৩০ মিনিট ভ্রমণ করতে জনপ্রতি ২০০ টাকা খরচ হবে।\n" +
                    "পার্কিং ভাড়া\n" +
                    "প্রতিটি বাস, কোচ বা ট্রাক এর পার্কিং ভাড়া ২০০ টাকা। মাইক্রোবাস বা মিনি বাসের পার্কিং ভাড়া ১০০ টাকা। জিপ, প্রাইভেটকার, অটোরিকশা বা সিএনজি পার্কিং ভাড়া ৬০ টাকা। (সময় ভেদে সকল ভাড়া পরিবর্তিত হতে পারে)\n" +
                    "পরিদর্শনের সময়\n" +
                    "বঙ্গবন্ধু শেখ মুজিব সাফারি পার্ক মঙ্গলবার ছাড়া সপ্তাহে ছয় দিন সকাল ৯ টা থেকে বিকাল ৫টা পর্যন্ত খোলা থাকে। সপ্তাহের প্রতি মঙ্গলবার বঙ্গবন্ধু সাফারি পার্ক বন্ধ থাকে। পুরোটা ঘুরে দেখতে চাইলে সারাদিন চলে যাবে। তাই সবচেয়ে ভালো হয় যদি সকাল সকাল চলে যান। তাহলে আরামে সারাদিন ঘুরে ঘুরে সব অংশ দেখতে পারবেন।\n','https://goo.gl/maps/gTdGspkHu91TBb5f9');");

            db.execSQL("INSERT INTO Places_Bangla VALUES('CoxBazar','CoxBazar','ঢাকা থেকে কক্সবাজার যাওয়ার উপায়\n" +
                    "ঢাকা হতে মূলত বাস এবং বিমান এই দুইটি উপায়ে সরাসরি কক্সবাজার যেতে পারবেন। রেলপথে অর্থাৎ ট্রেনে সরাসরি কক্সবাজার যাওয়ার আপাতত কোন সুযোগ নেই। এক্ষেত্রে আপনাকে ঢাকা থেকে ট্রেনে চড়ে চট্টগ্রাম এসে পরবর্তীতে অন্য উপায়ে চট্টগ্রাম হতে কক্সবাজার যেতে হবে।\n" +
                    "ঢাকা থেকে বাসে কক্সবাজার\n" +
                    "বাস হচ্ছে ঢাকা থেকে কক্সবাজার যাওয়ার সবচাইতে জনপ্রিয় বাহন। রাজধানী ঢাকার সায়দাবাদ, গাবতলী এবং মহাখালী বাস টার্মিনাল সহ বেশকিছু জায়গা হতে ঢাকা টু কক্সবাজার রুটে বিভিন্ন পরিবহণের এসি, নন-এসি বাস চলাচল করে। বাসে চড়ে ঢাকা থেকে কক্সবাজার পর্যন্ত ৪১৪ কিলোমিটার পথ পাড়ি দিতে ১০ থেকে ১২ ঘণ্টা সময় লাগে।\n','Royal Tulip Sea Pearl Beach Resort & Spa\n" +
                    "প্রতি রাতের জন্য রুম ভাড়া ১২ হাজার টাকা থেকে ১ লাখ ১৮ হাজার টাকা পর্যন্ত।\n" +
                    "+88-01970660066, +88-029140454\n" +
                    "Web: www.seapearlbd.com\n" +
                    "Sayeman Beach Resort\n" +
                    "প্রতি রাতের জন্য রুম ভাড়া ১০৫০০ টাকা থেকে ৪৪,০০০ টাকা পর্যন্ত।','https://goo.gl/maps/bbGh9bY6wzSRno1v5');");

        }
        catch (Exception e){
            Toast.makeText(context,"Error: "+e,Toast.LENGTH_LONG).show();
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE Places;");
        db.execSQL("DROP TABLE Places_Bangla;");
        onCreate(db);
    }

     public String displayRoute_Bangla(String place){
         String str=" ";
                SQLiteDatabase sqLiteDatabase = this.getReadableDatabase();
                Cursor description= sqLiteDatabase.rawQuery("Select Route from Places_Bangla where Place_name='"+place+"';",null);
         if (description.moveToFirst()) {
            str = description.getString(0);
         }
                return str;
    }
    public String cost_Bangla(String place){
        String str=" ";
        SQLiteDatabase sqLiteDatabase = this.getReadableDatabase();
        Cursor description= sqLiteDatabase.rawQuery("Select Cost from Places_Bangla where Place_name='"+place+"';",null);
        if (description.moveToFirst()) {
            str = description.getString(0);
        }
        return str;
    }
    public String mapLink_Bangla(String place){
        String str=" ";
        SQLiteDatabase sqLiteDatabase = this.getReadableDatabase();
        Cursor description= sqLiteDatabase.rawQuery("Select Map_link from Places_Bangla where Place_name='"+place+"';",null);
        if (description.moveToFirst()) {
            str = description.getString(0);
        }
        return str;
    }

}
