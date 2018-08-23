package com.example.android.pets.data;

import android.provider.BaseColumns;

public final class PetContract {

    // to prevent someone from accidentally instantiating the contract class,
    // give it an empty constructor.
    private PetContract() {}

    // inner class for pets database table. each entry represents a single pet
    public static abstract class PetEntry implements BaseColumns {

        // unique ID number for each pets (int)
        public final static String _ID = BaseColumns._ID;

        // string constants for the columns
        public static final String TABLE_NAME = "pets";
        public static final String COLUMN_PET_NAME = "name";
        public static final String COLUMN_PET_BREED = "breed";
        public static final String COLUMN_PET_GENDER = "gender";
        public static final String COLUMN_PET_WEIGHT = "weight";

        // int constants for gender
        public static final int GENDER_MALE = 1;
        public static final int GENDER_FEMALE = 2;
        public static final int GENDER_UNKNOWN = 0;


    }
}
