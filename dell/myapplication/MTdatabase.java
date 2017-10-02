package com.example.dell.myapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Dell on 02-Oct-17.
 */

public class MTdatabase extends SQLiteOpenHelper {
    final String DB_name = "MTData.db";
    final String Table_name = "medical_terms";
    final String COL_1 = "ID";
    final String COL_2 = "TNAME";
    final String COL_3 = "TINFO";

    public MTdatabase(Context context) {
        super(context, "MTData.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        sqLiteDatabase.execSQL("create table" + Table_name + "(ID INTEGER PRIMARY KEY AUTOINCREMENT, TNAME NCHAR ,TINFO TEXT)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS" + Table_name);
        onCreate(sqLiteDatabase);

    }

    public void insertData() {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_2, "Abdominal cavity");
        contentValues.put(COL_3, "the part of the body between the bottom of the ribs and the top of the thighs, containing most of the digestive and urinary systems along with some reproductive organs");
        contentValues.put(COL_2, "ABO blood groups");
        contentValues.put(COL_3, "The system by which human blood is classified, based on proteins occurring on red blood cells; the four classification groups are A, AB, B, and O");
        contentValues.put(COL_2, "Acnes");
        contentValues.put(COL_3, "a skin condition characterized by inflamed, pus-filled areas that occur on the skin's surface, most commonly occurring during adolescence");
        contentValues.put(COL_2, "Acquired immunodeficiency syndrome");
        contentValues.put(COL_3, "infection by the human immunodeficiency virus (HIV), which causes a weakening of the immune system");
        contentValues.put(COL_2, "Acute");
        contentValues.put(COL_3, "describes a condition or illness that begins suddenly and is usually short-lasting");
        contentValues.put(COL_2, "Acute respiratory disease");
        contentValues.put(COL_3, "an urgent condition in which oxygen levels in the blood are lower than normal and breathing is difficult");
        contentValues.put(COL_2, "Addiction");
        contentValues.put(COL_3, "dependence on a substance (such as alcohol or other drugs) or an activity, to the point that stopping is very difficult and causes severe physical and mental reactions");
        contentValues.put(COL_2, "Adenitis");
        contentValues.put(COL_3, "infection and inflammation of a gland, especially a lymph node");
        contentValues.put(COL_2, "AIDS");
        contentValues.put(COL_3, "symptoms including weight loss, fever, and enlarged lymph nodes experienced by people who are infected with HIV but do not yet have AIDS");
        contentValues.put(COL_2, "Analgesic");
        contentValues.put(COL_3, "a drug that relieves pain, such as aspirin or acetaminophen");
        contentValues.put(COL_2, "Anemia");
        contentValues.put(COL_3, "a condition in which the blood does not contain enough hemoglobin, the compound that carries oxygen from the lungs to other parts of the body");
        contentValues.put(COL_2, "Anethesia");
        contentValues.put(COL_3, "a loss of sensation in a certain part of the body or throughout the body");
        contentValues.put(COL_2, "Autism");
        contentValues.put(COL_3, "a mental disorder characterized by an inability to relate to other people and extreme withdrawal");
        contentValues.put(COL_2, "Autopsy");
        contentValues.put(COL_3, "the examination of a body following death, possibly to determine the cause of death or for research");
        contentValues.put(COL_2, "Axilla");
        contentValues.put(COL_3, "medical term for the armpit");
        contentValues.put(COL_2, "Bifocal");
        contentValues.put(COL_3, "a lens that corrects both near and distant vision by having two parts with different focusing strengths");
        contentValues.put(COL_2, "Bile");
        contentValues.put(COL_3, "a yellow-green liquid produced in the liver whose function is to remove waste from the liver and break down fats as food is digested");
        contentValues.put(COL_2, "Bladder");
        contentValues.put(COL_3, "an organ located in the pelvis whose function is to collect and store urine until it is expelled");
        contentValues.put(COL_2, "Blepharitis");
        contentValues.put(COL_3, "inflammation of the eyelids");
        contentValues.put(COL_2, "Botulism");
        contentValues.put(COL_3, "poisoning from poorly preserved food contaminated with a dangerous bacterial toxin that results in paralysis");
        contentValues.put(COL_2, "Bradycardia");
        contentValues.put(COL_3, "a slow heart rate, usually below 60 beats per minute in adults");
        contentValues.put(COL_2, "Bronchitis");
        contentValues.put(COL_3, "inflammation of the bronchial tubes, which connect the trachea to the lungs");
        contentValues.put(COL_2, "Bursa");
        contentValues.put(COL_3, "a fluid-filled sac that cushions and reduces friction in certain parts of the body");
        contentValues.put(COL_2, "Bursitis");
        contentValues.put(COL_3, "inflammation of a bursa due to excessive pressure or friction, or from injury");
        contentValues.put(COL_2, "Canal");
        contentValues.put(COL_3, "a tunnel-like passage");
        contentValues.put(COL_2, "Carcinogen");
        contentValues.put(COL_3, "anything that can cause cancer");


    }
}
