package com.example.acrab.basketballpickup;

/**
 * Created by acrab on 4/9/2017.
 */
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;



public class DatabaseHandler extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "gamesDatabase";
    private static final String TABLE_GAMES = "games";
    private static final String NAME_ID = "name";
    private static final String TIME_ID = "time";
    private static final String ID = "id";


    public DatabaseHandler(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_GAMES_TABLE = "CREATE TABLE" + TABLE_GAMES + "(" + NAME_ID + "INTEGER PRIMARY KEY" + TIME_ID + "TEXT" +  ID + "TEXT" +")";
        db.execSQL(CREATE_GAMES_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
