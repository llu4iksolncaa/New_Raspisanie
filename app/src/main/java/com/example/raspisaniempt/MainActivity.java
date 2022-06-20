package com.example.raspisaniempt;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        MyData[] myMovieData = new MyData[]{
                new MyData("Группа П50-6-19, П50-11/6-20", "Неделя: Числитель/\nЗнаменатель\n"),
                new MyData("Понедельник","Пара               Предмет                  Преподаватель\n" +
                        "1. Разработка программных модулей/ А.Ю. Бушин\n" +
                        "2. Технология разработки и защиты баз данных А.С. Токарчук\n" +
                        "3.\tФизическая культура\t Д.М. Салоникес\n" +
                        "4.\tИнструментальные средства разработки ПО\t Ю.В. Севастьянов\n" +
                        "5.\tРазработка программных модулей\t А.А. Шимбирёв\n"),
                new MyData("Вторник","Пара               Предмет                  Преподаватель\n" +
                        "1.\t         ПРАКТИКА\t\n" +
                        "2.\t         ПРАКТИКА\n" +
                        "3.\t         ПРАКТИКА\t\n" +
                        "4.\t         ПРАКТИКА\t\n" +
                        "5.\t         ПРАКТИКА\n"),
                new MyData("Среда","Пара               Предмет                  Преподаватель\n" +
                        "2. \tТехнология разработки программного обеспечения\t Л.А. Соколова\n" +
                        "3. \tРазработка программных модулей\t А.Ю. Бушин\n" +
                        "4. \tСистемное программирование\t А.Д. Нилов\n" +
                        "5. \tРазработка мобильных приложений\t А.О. Лясников\n"),
                new MyData("Четверг","Пара               Предмет                  Преподаватель\n" +
                        "1.\t         ПРАКТИКА\t\n" +
                        "2.\t         ПРАКТИКА\n" +
                        "3.\t         ПРАКТИКА\t\n" +
                        "4.\t         ПРАКТИКА\t\n" +
                        "5.\t         ПРАКТИКА\n"),
                new MyData("Пятница","Пара               Предмет                  Преподаватель\n" +
                        "1. \tИностранный язык в профессиональной деятельности\t А.Д. Завьялова, А.Ю. Дымская\n" +
                        "2. \tТехнология разработки и защиты баз данных\t А.С. Токарчук\n" +
                        "3. \tИнструментальные средства разработки ПО/ Ю.В. Севастьянов\n" +
                        "4.  \t Разработка мобильных приложений А.О. Лясников\n" +
                        "5. \tТехнология разработки программного обеспечения/ Л.А. Соколова\n" +
                        "     Системное программирование А.Д. Нилов\n"),
        };

        MyAdapter myMovieAdapter = new MyAdapter(myMovieData,MainActivity.this);
        recyclerView.setAdapter(myMovieAdapter);

    }
}
