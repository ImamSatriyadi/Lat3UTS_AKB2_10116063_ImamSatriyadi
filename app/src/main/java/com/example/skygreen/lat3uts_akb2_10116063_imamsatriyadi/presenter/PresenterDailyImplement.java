package com.example.skygreen.lat3uts_akb2_10116063_imamsatriyadi.presenter;

import com.example.skygreen.lat3uts_akb2_10116063_imamsatriyadi.model.ModelDaily;
import com.example.skygreen.lat3uts_akb2_10116063_imamsatriyadi.model.ModelHome;
import com.example.skygreen.lat3uts_akb2_10116063_imamsatriyadi.view.InterfaceDaily;
import com.example.skygreen.lat3uts_akb2_10116063_imamsatriyadi.R;
import java.util.ArrayList;
import java.util.List;

/*
 * NIM   : 10116063
 * NAMA  : IMAM SATRIYADI
 * KELAS : AKB-2 / IF-2
 *
 * CHANGE LOG : SABTU 27 APRIL 2019
 * MEMBUAT PRESENTER IMPLEMENT DAILIY ACTIVITY
 * */

public class PresenterDailyImplement implements PresenterDaily {
    private InterfaceDaily interfaceDaily;
    private List<ModelDaily> modelDailist = new ArrayList<>();


    public PresenterDailyImplement(InterfaceDaily interfaceDaily){
        this.interfaceDaily = interfaceDaily;
        setData();
    }

    public void setData(){
        ModelDaily daily    = new ModelDaily();
        daily.setWaktu("04:30");
        daily.setKegiatan("Bangun pagi");
        daily.setIcon(R.drawable.ic_daily_78);
        modelDailist.add(daily);

        ModelDaily daily1   = new ModelDaily();
        daily1.setWaktu("05:00");
        daily1.setKegiatan("Sarapan pagi");
        daily1.setIcon(R.drawable.ic_daily_78);
        modelDailist.add(daily1);

        ModelDaily daily2   = new ModelDaily();
        daily2.setWaktu("05:30");
        daily2.setKegiatan("Berangkat kuliah");
        daily2.setIcon(R.drawable.ic_daily_78);
        modelDailist.add(daily2);

        ModelDaily daily3   = new ModelDaily();
        daily3.setWaktu("07:00 - 15:30");
        daily3.setKegiatan("Kegiatan di kampus");
        daily3.setIcon(R.drawable.ic_daily_78);
        modelDailist.add(daily3);

        ModelDaily daily4   = new ModelDaily();
        daily4.setWaktu("16:00");
        daily4.setKegiatan("Pulang dari kampus");
        daily4.setIcon(R.drawable.ic_daily_78);
        modelDailist.add(daily4);

        ModelDaily daily5   = new ModelDaily();
        daily5.setWaktu("17:30");
        daily5.setKegiatan("Sampai di rumah");
        daily5.setIcon(R.drawable.ic_daily_78);
        modelDailist.add(daily5);

        ModelDaily daily6   = new ModelDaily();
        daily6.setWaktu("19:00 - 21:00");
        daily6.setKegiatan("Waktu bersama keluarga");
        daily6.setIcon(R.drawable.ic_daily_78);
        modelDailist.add(daily6);

        ModelDaily daily7   = new ModelDaily();
        daily7.setWaktu("21:00");
        daily7.setKegiatan("Tidur malam");
        daily7.setIcon(R.drawable.ic_daily_78);
        modelDailist.add(daily7);
    }

    @Override
    public void load() {
        interfaceDaily.onLoad(modelDailist);
    }
}
