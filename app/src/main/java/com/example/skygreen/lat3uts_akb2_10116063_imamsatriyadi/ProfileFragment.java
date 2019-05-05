package com.example.skygreen.lat3uts_akb2_10116063_imamsatriyadi;


import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.skygreen.lat3uts_akb2_10116063_imamsatriyadi.model.ModelProfile;
import com.example.skygreen.lat3uts_akb2_10116063_imamsatriyadi.presenter.PresenterHomeImplement;
import com.example.skygreen.lat3uts_akb2_10116063_imamsatriyadi.presenter.PresenterProfile;
import com.example.skygreen.lat3uts_akb2_10116063_imamsatriyadi.presenter.PresenterProfileImplent;
import com.example.skygreen.lat3uts_akb2_10116063_imamsatriyadi.view.InterfaceProfil;


import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */


/*
 * NIM   : 10116063
 * NAMA  : IMAM SATRIYADI
 * KELAS : AKB-2 / IF-2
 *
 * CHANGE LOG : KAMIS 2 MEI 2019
 * MEMBUAT FRAGMENT PROFIL
 * */
public class ProfileFragment extends Fragment implements InterfaceProfil {
    private TextView txtNimKelas;
    private TextView txtNama;
    private TextView txtJurusan;
    private TextView txtTempatTanggalLahir;
    private TextView txtDeskripsi;
    private Button btnTelpon;
    private Button btnFb;
    private Button btnEmail;
    private Button btnMaps;
    private WebView maps;
    private Button btnDialog;
    private List<ModelProfile> modelProfiles = new ArrayList<>();
    private PresenterProfile presenterProfile;
    private ImageView foto;

    public ProfileFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view       = inflater.inflate(R.layout.fragment_profile, container, false);
        presenterProfile   = new PresenterProfileImplent(this);
        txtNimKelas     = view.findViewById(R.id.txt_nim_profile);
        txtNama         = view.findViewById(R.id.txt_nama_profil);
        txtJurusan      = view.findViewById(R.id.txt_jurusan_profil);
        txtTempatTanggalLahir   = view.findViewById(R.id.txt_tempat_lahir);
        txtDeskripsi    = view.findViewById(R.id.txt_content_desc_profil);
        foto            = view.findViewById(R.id.img_profil);

        btnTelpon   = view.findViewById(R.id.btn_telpon);
        btnFb       = view.findViewById(R.id.btn_sosmed);
        btnEmail    = view.findViewById(R.id.btn_email);
        btnDialog   = view.findViewById(R.id.btn_dialog);
        btnMaps     = view.findViewById(R.id.btn_maps);
        maps        = view.findViewById(R.id.webview);

        maps.getSettings().setLoadsImagesAutomatically(true);
        maps.getSettings().setJavaScriptEnabled(true);
        maps.getSettings().setDomStorageEnabled(true);

        // Tiga baris di bawah ini agar laman yang dimuat dapat
        // melakukan zoom.
        maps.getSettings().setSupportZoom(true);
        maps.getSettings().setBuiltInZoomControls(true);
        maps.getSettings().setDisplayZoomControls(false);
        // Baris di bawah untuk menambahkan scrollbar di dalam WebView-nya
        maps.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        maps.setWebViewClient(new WebViewClient());
        maps.loadUrl("https://www.google.com/maps/place/6%C2%B050'38.2%22S+107%C2%B028'19.0%22E/@-6.843947,107.471953,17z/data=!3m1!4b1!4m5!3m4!1s0x0:0x0!8m2!3d-6.843947!4d107.471953");

        btnTelpon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent telpon   = new Intent(Intent. ACTION_DIAL);
                telpon.setData(Uri.fromParts("tel", modelProfiles.get(0).getNoTelepon(), null));
                startActivity(telpon);
            }
        });

        btnFb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sosmed   = new Intent(Intent. ACTION_VIEW);
                sosmed.setData(Uri. parse(modelProfiles.get(0).getUrlFb()));
                startActivity(sosmed);
            }
        });

        btnEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent email    = new Intent(Intent.ACTION_SENDTO);

                email.putExtra(Intent.EXTRA_EMAIL,  new String[]{modelProfiles.get(0).getEmail()});
                email.putExtra(Intent.EXTRA_SUBJECT, "");
                email.putExtra(Intent.EXTRA_TEXT, "");
                email.setData(Uri.parse("mailto:"));
                startActivity(email);
            }
        });

        btnDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog dialog = new Dialog(getActivity());
                dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog.setContentView(R.layout.about_dialog);

                final Button btn_close = (Button) dialog.findViewById(R.id.btn_close);

                dialog.show();
                btn_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });
            }
        });

        btnMaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url      = "https://www.google.com/maps/place/6%C2%B050'38.2%22S+107%C2%B028'19.0%22E/@-6.843947,107.471953,17z/data=!3m1!4b1!4m5!3m4!1s0x0:0x0!8m2!3d-6.843947!4d107.471953";
                Intent maps     = new Intent(Intent.ACTION_VIEW);
                maps.setData(Uri.parse(url));
                startActivity(maps);
            }
        });




        presenterProfile.load();

        return view;
    }

    @Override
    public void onLoad(List<ModelProfile> profiles) {
        modelProfiles.clear();
        modelProfiles.addAll(profiles);
        txtNimKelas.setText(profiles.get(0).getNimKelas());
        txtNama.setText(profiles.get(0).getNama());
        txtJurusan.setText(profiles.get(0).getJurusan());
        txtTempatTanggalLahir.setText(profiles.get(0).getTanggalLahir());
        txtDeskripsi.setText(profiles.get(0).getDeskripsi());
        foto.setImageResource(profiles.get(0).getFoto());
    }


}
