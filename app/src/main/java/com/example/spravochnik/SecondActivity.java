package com.example.spravochnik;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {
    List<Flower> flowers = new ArrayList<Flower>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        setInitialData();
        RecyclerView recyclerView = findViewById(R.id.list_flower);
        FlowerAdapter adapter = new FlowerAdapter(this, flowers);
        recyclerView.setAdapter(adapter);
    }
    private void setInitialData() {
        flowers.add( new Flower("АБЕЛИЯ", "Растения выращивают в открытом грунте, используют для создания живых изгородей. ",
                R.drawable.abeliya, "Необходим только после высаживания."));
        flowers.add( new Flower("АЗАЛИЯ", "Можно выращивать на террасе или в саду.Это растение боится как засухи, так и весенних заморозков.",
                R.drawable.azaliya, "Земля должна оставаться влажной."));
        flowers.add( new Flower("АМАРИЛЛИС", "Сорта и гибриды выращивают как вне дома, в открытом грунте, так и в помещении.",
                R.drawable.amarillis, "В наиболее жаркие месяцы следует обильно поливать."));
        flowers.add( new Flower("ВИСТЕРИЯ", " В средней полосе можно выращивать в кадках, убирая на зиму в помещение.",
                R.drawable.visteriya, "Необходим только после посадки."));
        flowers.add( new Flower("ГОДЕЦИЯ", "Выращивают в открытом грунте на клумбах, газонах, и в качестве цветов на срезку.",
                R.drawable.godeciya, "Весной-летом поливают обильно."));
    }
}