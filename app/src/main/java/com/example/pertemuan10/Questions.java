package com.example.pertemuan10;

public class Questions {
    public String mQuestions[] = {
            "Siapa nama dosen PAB kelas C?",
            "Apa nama angkatan Informatika UII 2018?",
            "Apa nama gedung Fakultas Teknologi Industri UII?",
            "Bahasa apa yang digunakan dalam Pemrograman Android Studio",
            "Berapa sks mata kuliah PAB?"
    };

    private String mChoices[][] = {
            {"Rahardian Kurniawan","Galang Prihadi","Kholid Haryono"},
            {"INSIGHT","PIXEL","METAFORA"},
            {"KAHAR MUZAKIR","ULIL","KH Mas Mansyur"},
            {"JAVA","C++","Pyton"},
            {"6","3","4"}
    };

    private String mCorrectAnswer[] = {"Galang Prihadi","INSIGHT","KH Mas Mansyur","JAVA","4"};

    public String getQuestions(int a) {
        String question =mQuestions[a];
        return question;
    }

    public String getChoice1(int a) {
        String choice =mChoices[a] [0];
        return choice;
    }

    public String getChoice2(int a) {
        String choice =mChoices[a] [1];
        return choice;
    }

    public String getChoice3(int a) {
        String choice =mChoices[a] [2];
        return choice;
    }

    public String getCorrectAnswer(int a){
        String answer = mCorrectAnswer[a];
        return answer;
    }
}
