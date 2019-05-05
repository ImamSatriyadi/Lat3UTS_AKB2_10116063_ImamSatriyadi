package com.example.skygreen.lat3uts_akb2_10116063_imamsatriyadi;


import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

import com.example.skygreen.lat3uts_akb2_10116063_imamsatriyadi.adapter.RecyclerViewAdapterMusic;
import com.example.skygreen.lat3uts_akb2_10116063_imamsatriyadi.model.ModelMusic;
import com.example.skygreen.lat3uts_akb2_10116063_imamsatriyadi.presenter.PresenterMusic;
import com.example.skygreen.lat3uts_akb2_10116063_imamsatriyadi.presenter.PresenterMusicImplement;
import com.example.skygreen.lat3uts_akb2_10116063_imamsatriyadi.view.InterfaceMusic;
import com.example.skygreen.lat3uts_akb2_10116063_imamsatriyadi.view.InterfaceProfil;

import java.io.IOException;
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
 * CHANGE LOG : SABTU 4 MEI 2019
 * MEMBUAT FRAGMENT MUSIK AND VIDEO
 * */

public class MusicVideoFragment extends Fragment implements InterfaceMusic{
    private PresenterMusic presenterMusic;
    private List<ModelMusic> modelMusics    = new ArrayList<>();

    private MediaPlayer mediaPlayer1;
    private MediaPlayer mediaPlayer2;

    private Button btnPlay1;
    private Button btnStop1;
    private TextView txtJudulMusik1;

    private Button btnPlay2;
    private Button btnStop2;
    private TextView txtJudulMusik2;

    private VideoView videoView;

    public MusicVideoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_music_video, container, false);
        presenterMusic = new PresenterMusicImplement(this);

        txtJudulMusik1  = (TextView) view.findViewById(R.id.txt_judul_musik1);
        btnPlay1        = (Button) view.findViewById(R.id.btn_play1);
        btnStop1        = (Button) view.findViewById(R.id.btn_stop1);

        txtJudulMusik2  = (TextView) view.findViewById(R.id.txt_judul_musik2);
        btnPlay2        = (Button) view.findViewById(R.id.btn_play2);
        btnStop2        = (Button) view.findViewById(R.id.btn_stop2);

        videoView       = (VideoView) view.findViewById(R.id.video);
        videoView.setVideoURI(Uri.parse("android.resource://" + "com.example.skygreen.lat3uts_akb2_10116063_imamsatriyadi" + "/" + R.raw.video));

        videoView.setMediaController(new MediaController(getContext()));

        videoView.start();

        presenterMusic.load();
        return view;
    }

    @Override
    public void onLoad(List<ModelMusic> music) {
        modelMusics.clear();
        modelMusics.addAll(music);

        txtJudulMusik1.setText(music.get(0).getJudul());

        mediaPlayer1 = MediaPlayer.create(this.getContext(), music.get(0).getMusik());



        btnPlay1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer1.start();
                btnPlay1.setVisibility(View.INVISIBLE);
                btnPlay1.setEnabled(false);

                btnStop1.setVisibility(View.VISIBLE);
                btnStop1.setEnabled(true);
            }
        });

        btnStop1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer1.stop();

                btnStop1.setVisibility(View.INVISIBLE);
                btnStop1.setEnabled(false);

                btnPlay1.setVisibility(View.VISIBLE);
                btnPlay1.setEnabled(true);

                try {
                    //Menyetel audio ke status awal
                    mediaPlayer1.prepare();
                    mediaPlayer1.seekTo(0);
                }catch (Throwable t){
                    t.printStackTrace();
                }
            }
        });

        txtJudulMusik2.setText(music.get(1).getJudul());


        mediaPlayer2 = MediaPlayer.create(this.getContext(), music.get(1).getMusik());


        btnPlay2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mediaPlayer2.start();

                btnPlay2.setVisibility(View.INVISIBLE);
                btnPlay2.setEnabled(false);

                btnStop2.setVisibility(View.VISIBLE);
                btnStop2.setEnabled(true);
            }
        });

        btnStop2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer2.stop();

                btnStop2.setVisibility(View.INVISIBLE);
                btnStop2.setEnabled(false);

                btnPlay2.setVisibility(View.VISIBLE);
                btnPlay2.setEnabled(true);

                try {
                    //Menyetel audio ke status awal
                    mediaPlayer2.prepare();
                    mediaPlayer2.seekTo(0);
                }catch (Throwable t){
                    t.printStackTrace();
                }
            }
        });

    }


}
