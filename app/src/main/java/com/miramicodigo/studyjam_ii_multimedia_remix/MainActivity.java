package com.miramicodigo.studyjam_ii_multimedia_remix;

import android.annotation.TargetApi;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    /**
     * @author Gustavo Lizarraga
     * @version 1.0 14/12/2016
     *
     * #DevStudyJam
     * */

    private MediaPlayer mediaPlayer = new MediaPlayer();

    private SoundPool spChanguito,
            spComoUnQuikCarnal,
            spConElJorge,
            spJoJoJojo,
            spNoEsAsi1,
            spNoEsAsi2,
            spPeroNoEsQueTeRallesAsi,
            spReyendote,
            spReyeto,
            spTeRespeto,
            spVasDisculparCarnal,
            spNaQueWer,
            spFX,
            spVocals,
            spKick,
            spHat,
            spClap,
            spIdiota,
            spCallate,
            spVeteAlDiablo;
    private int resChanguito,
            resComoUnQuikCarnal,
            resConElJorge,
            resJoJoJojo,
            resNoEsAsi1,
            resNoEsAsi2,
            resPeroNoEsQueTeRallesAsi,
            resReyendote,
            resReyeto,
            resTeRespeto,
            resVasDisculparCarnal,
            resNaQueWer,
            resFX,
            resVocals,
            resKick,
            resHat,
            resClap,
            resIdiota,
            resCallate,
            resVeteAlDiablo;

    private ToggleButton tbPistaElectronica, tbPistaMamboElectronico, tbPistaPopRock, tbPistaReggaeton, tbPistaVillera;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        initUI();
        createSoundPool();
        //createMediaPlayer();

        tbPistaElectronica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (tbPistaElectronica.isChecked()) {
                    try {
                        createMediaPlayer(1);
                        mediaPlayer.start();
                        mediaPlayer.setLooping(true);
                    }catch (IllegalStateException e){
                        System.out.println("Error: "+e.getMessage());
                    }
                } else {
                    mediaPlayer.pause();
                    mediaPlayer.setLooping(false);
                }
            }
        });
        tbPistaMamboElectronico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (tbPistaMamboElectronico.isChecked()) {
                    try {
                        createMediaPlayer(2);
                        mediaPlayer.start();
                        mediaPlayer.setLooping(true);
                    }catch (IllegalStateException e){
                        System.out.println("Error: "+e.getMessage());
                    }
                } else {
                    mediaPlayer.pause();
                    mediaPlayer.setLooping(false);
                }
            }
        });

        tbPistaPopRock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (tbPistaPopRock.isChecked()) {
                    try {
                        createMediaPlayer(3);
                        mediaPlayer.start();
                        mediaPlayer.setLooping(true);
                    }catch (IllegalStateException e){
                        System.out.println("Error: "+e.getMessage());
                    }
                } else {
                    mediaPlayer.pause();
                    mediaPlayer.setLooping(false);
                }
            }
        });
        tbPistaReggaeton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (tbPistaReggaeton.isChecked()) {
                    try {
                        createMediaPlayer(4);
                        mediaPlayer.start();
                        mediaPlayer.setLooping(true);
                    }catch (IllegalStateException e){
                        System.out.println("Error: "+e.getMessage());
                    }
                } else {
                    mediaPlayer.pause();
                    mediaPlayer.setLooping(false);
                }
            }
        });

        tbPistaVillera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (tbPistaVillera.isChecked()) {
                    try {
                        createMediaPlayer(5);
                        mediaPlayer.start();
                        mediaPlayer.setLooping(true);
                    }catch (IllegalStateException e){
                        System.out.println("Error: "+e.getMessage());
                    }
                } else {
                    mediaPlayer.pause();
                    mediaPlayer.setLooping(false);
                }
            }
        });
    }

    public void initUI(){
        tbPistaElectronica = (ToggleButton)findViewById(R.id.tbPistaElectronica);
        tbPistaMamboElectronico = (ToggleButton)findViewById(R.id.tbPistaMamboElectronico);
        tbPistaPopRock = (ToggleButton)findViewById(R.id.tbPistaPopRock);
        tbPistaReggaeton = (ToggleButton)findViewById(R.id.tbPistaReggaeton);
        tbPistaVillera = (ToggleButton)findViewById(R.id.tbPistaVillera);
    }

    public void createMediaPlayer(int val){
        switch (val){
            case 1:
                if(mediaPlayer.isPlaying()) {
                    mediaPlayer.stop();
                    mediaPlayer.release();
                }
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.pista_kygo_firestone);
                //mediaPlayer.setVolume(0.9f, 0.9f);
                tbPistaMamboElectronico.setChecked(false);
                tbPistaPopRock.setChecked(false);
                tbPistaReggaeton.setChecked(false);
                tbPistaVillera.setChecked(false);
                break;
            case 2:
                if(mediaPlayer.isPlaying()) {
                    mediaPlayer.stop();
                    mediaPlayer.release();
                }
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.pista_mambo_electronico);
                tbPistaElectronica.setChecked(false);
                tbPistaPopRock.setChecked(false);
                tbPistaReggaeton.setChecked(false);
                tbPistaVillera.setChecked(false);

                break;
            case 3:
                if(mediaPlayer.isPlaying()) {
                    mediaPlayer.stop();
                    mediaPlayer.release();
                }
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.pista_pop_rock_bateria);
                tbPistaMamboElectronico.setChecked(false);
                tbPistaElectronica.setChecked(false);
                tbPistaReggaeton.setChecked(false);
                tbPistaVillera.setChecked(false);

                break;
            case 4:
                if(mediaPlayer.isPlaying()) {
                    mediaPlayer.stop();
                    mediaPlayer.release();
                }
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.pista_reggaeto);
                tbPistaMamboElectronico.setChecked(false);
                tbPistaPopRock.setChecked(false);
                tbPistaElectronica.setChecked(false);
                tbPistaVillera.setChecked(false);

                break;
            case 5:
                if(mediaPlayer.isPlaying()) {
                    mediaPlayer.stop();
                    mediaPlayer.release();
                }
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.pista_villera);
                tbPistaMamboElectronico.setChecked(false);
                tbPistaPopRock.setChecked(false);
                tbPistaReggaeton.setChecked(false);
                tbPistaElectronica.setChecked(false);

                break;
        }
    }

    public void createSoundPool(){
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            createNewSoundPool();
        } else {
            createOldSoundPool();
        }
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    protected void createNewSoundPool(){
        AudioAttributes attributes = new AudioAttributes.Builder()
                .setUsage(AudioAttributes.USAGE_GAME)
                .setContentType(AudioAttributes.CONTENT_TYPE_MUSIC)
                .build();
        spChanguito= new SoundPool.Builder().setAudioAttributes(attributes).build();
        spComoUnQuikCarnal = new SoundPool.Builder().setAudioAttributes(attributes).build();
        spConElJorge = new SoundPool.Builder().setAudioAttributes(attributes).build();
        spJoJoJojo = new SoundPool.Builder().setAudioAttributes(attributes).build();
        spNoEsAsi1 = new SoundPool.Builder().setAudioAttributes(attributes).build();
        spNoEsAsi2 = new SoundPool.Builder().setAudioAttributes(attributes).build();
        spPeroNoEsQueTeRallesAsi = new SoundPool.Builder().setAudioAttributes(attributes).build();
        spReyendote = new SoundPool.Builder().setAudioAttributes(attributes).build();
        spReyeto = new SoundPool.Builder().setAudioAttributes(attributes).build();
        spTeRespeto = new SoundPool.Builder().setAudioAttributes(attributes).build();
        spVasDisculparCarnal = new SoundPool.Builder().setAudioAttributes(attributes).build();

        spNaQueWer = new SoundPool.Builder().setAudioAttributes(attributes).build();

        spFX = new SoundPool.Builder().setAudioAttributes(attributes).build();
        spVocals = new SoundPool.Builder().setAudioAttributes(attributes).build();
        spKick = new SoundPool.Builder().setAudioAttributes(attributes).build();
        spHat = new SoundPool.Builder().setAudioAttributes(attributes).build();
        spClap = new SoundPool.Builder().setAudioAttributes(attributes).build();

        spIdiota = new SoundPool.Builder().setAudioAttributes(attributes).build();
        spCallate = new SoundPool.Builder().setAudioAttributes(attributes).build();
        spVeteAlDiablo = new SoundPool.Builder().setAudioAttributes(attributes).build();

        chargeSoundPool();
    }

    @SuppressWarnings("deprecation")
    protected void createOldSoundPool(){
        spChanguito = new SoundPool(15,AudioManager.STREAM_MUSIC,0);
        spComoUnQuikCarnal = new SoundPool(15,AudioManager.STREAM_MUSIC,0);
        spConElJorge = new SoundPool(15,AudioManager.STREAM_MUSIC,0);
        spJoJoJojo = new SoundPool(15,AudioManager.STREAM_MUSIC,0);
        spNoEsAsi1 = new SoundPool(15,AudioManager.STREAM_MUSIC,0);
        spNoEsAsi2 = new SoundPool(15,AudioManager.STREAM_MUSIC,0);
        spPeroNoEsQueTeRallesAsi = new SoundPool(15,AudioManager.STREAM_MUSIC,0);
        spReyendote = new SoundPool(15,AudioManager.STREAM_MUSIC,0);
        spReyeto = new SoundPool(15,AudioManager.STREAM_MUSIC,0);
        spTeRespeto = new SoundPool(15,AudioManager.STREAM_MUSIC,0);
        spVasDisculparCarnal = new SoundPool(15,AudioManager.STREAM_MUSIC,0);

        spNaQueWer = new SoundPool(15,AudioManager.STREAM_MUSIC,0);

        spFX = new SoundPool(15,AudioManager.STREAM_MUSIC,0);
        spVocals = new SoundPool(15,AudioManager.STREAM_MUSIC,0);
        spKick = new SoundPool(15,AudioManager.STREAM_MUSIC,0);
        spHat = new SoundPool(15,AudioManager.STREAM_MUSIC,0);
        spClap = new SoundPool(15,AudioManager.STREAM_MUSIC,0);

        spIdiota = new SoundPool(15,AudioManager.STREAM_MUSIC,0);
        spCallate = new SoundPool(15,AudioManager.STREAM_MUSIC,0);
        spVeteAlDiablo = new SoundPool(15,AudioManager.STREAM_MUSIC,0);

        chargeSoundPool();
    }

    public void chargeSoundPool() {
        resChanguito = spChanguito.load(getApplicationContext(), R.raw.changuito, 1);
        resComoUnQuikCarnal = spComoUnQuikCarnal.load(getApplicationContext(), R.raw.comounquikcarnal, 1);
        resConElJorge = spConElJorge.load(getApplicationContext(), R.raw.coneljorge, 1);
        resJoJoJojo = spJoJoJojo.load(getApplicationContext(), R.raw.jojojojo, 1);
        resNoEsAsi1 = spNoEsAsi1.load(getApplicationContext(), R.raw.noesasi, 1);
        resNoEsAsi2 = spNoEsAsi2.load(getApplicationContext(), R.raw.noesasi2, 1);
        resPeroNoEsQueTeRallesAsi = spPeroNoEsQueTeRallesAsi.load(getApplicationContext(), R.raw.peronoesqueterallesasi, 1);
        resReyendote = spReyendote.load(getApplicationContext(), R.raw.reyendote, 1);
        resReyeto = spReyeto.load(getApplicationContext(), R.raw.reyeto, 1);
        resTeRespeto = spTeRespeto.load(getApplicationContext(), R.raw.terespeto, 1);
        resVasDisculparCarnal = spVasDisculparCarnal.load(getApplicationContext(), R.raw.vasdisculparcarnal, 1);

        resNaQueWer = spNaQueWer.load(getApplicationContext(), R.raw.na_que_wer, 1);

        resFX = spFX.load(getApplicationContext(), R.raw.edp_08_fx, 1);
        resVocals = spVocals.load(getApplicationContext(), R.raw.edp_09_vocals, 1);
        resKick = spKick.load(getApplicationContext(), R.raw.edp_10_kick, 1);
        resHat = spHat.load(getApplicationContext(), R.raw.edp_11_hat, 1);
        resClap = spClap.load(getApplicationContext(), R.raw.edp_12_clap, 1);

        resIdiota = spIdiota.load(getApplicationContext(), R.raw.idiota, 1);
        resCallate = spCallate.load(getApplicationContext(), R.raw.callate, 1);
        resVeteAlDiablo = spVeteAlDiablo.load(getApplicationContext(), R.raw.vete_al_diablo, 1);

    }

    public void changuito(View view) {
        if (resChanguito != 0){
            spChanguito.play(resChanguito, 1, 1, 0, 0, 1);
        }
    }

    public void comoUnQuickCarnal(View view) {
        if (resComoUnQuikCarnal != 0){
            spComoUnQuikCarnal.play(resComoUnQuikCarnal, 1, 1, 0, 0, 1);
        }
    }

    public void conElJorge(View view) {
        if (resConElJorge != 0){
            spConElJorge.play(resConElJorge, 1, 1, 0, 0, 1);
        }
    }

    public void joJoJoJo(View view) {
        if (resJoJoJojo != 0){
            spJoJoJojo.play(resJoJoJojo, 1, 1, 0, 0, 1);
        }
    }

    public void noEsAsi(View view) {
        if (resNoEsAsi1 != 0){
            spNoEsAsi1.play(resNoEsAsi1, 1, 1, 0, 0, 1);
        }
    }

    public void noEsAsi2(View view) {
        if (resNoEsAsi2 != 0){
            spNoEsAsi2.play(resNoEsAsi2, 1, 1, 0, 0, 1);
        }
    }

    public void peroNoEsQueTeRallesAsi(View view) {
        if (resPeroNoEsQueTeRallesAsi != 0){
            spPeroNoEsQueTeRallesAsi.play(resPeroNoEsQueTeRallesAsi, 1, 1, 0, 0, 1);
        }
    }

    public void reyendote(View view) {
        if (resReyendote != 0){
            spReyendote.play(resReyendote, 1, 1, 0, 0, 1);
        }
    }

    public void reyeto(View view) {
        if (resReyeto != 0){
            spReyeto.play(resReyeto, 1, 1, 0, 0, 1);
        }
    }

    public void teRespeto(View view) {
        if (resTeRespeto != 0){
            spTeRespeto.play(resTeRespeto, 1, 1, 0, 0, 1);
        }
    }

    public void vasDisculparCarnal(View view) {
        if (resVasDisculparCarnal != 0){
            spVasDisculparCarnal.play(resVasDisculparCarnal, 1, 1, 0, 0, 1);
        }
    }

    public void naQueWer(View view) {
        if (resNaQueWer != 0){
            spNaQueWer.play(resNaQueWer, 1, 1, 0, 0, 1);
        }
    }

    public void efectoClap(View view) {
        if (resClap != 0){
            spClap.play(resClap, 1, 1, 0, 0, 1);
        }
    }

    public void efectoHat(View view) {
        if (resHat != 0){
            spHat.play(resHat, 1, 1, 0, 0, 1);
        }
    }

    public void efectoKick(View view) {
        if (resKick != 0){
            spKick.play(resKick, 1, 1, 0, 0, 1);
        }
    }

    public void efectoVocals(View view) {
        if (resVocals != 0){
            spVocals.play(resVocals, 1, 1, 0, 0, 1);
        }
    }

    public void efectoFX(View view) {
        if (resFX != 0){
            spFX.play(resFX, 1, 1, 0, 0, 1);
        }
    }

    public void idiota(View view) {
        if (resIdiota != 0){
            spIdiota.play(resIdiota, 1, 1, 0, 0, 1);
        }
    }
    public void callate(View view) {
        if (resCallate != 0){
            spCallate.play(resCallate, 1, 1, 0, 0, 1);
        }
    }
    public void veteAlDiablo(View view) {
        if (resVeteAlDiablo != 0){
            spVeteAlDiablo.play(resVeteAlDiablo, 1, 1, 0, 0, 1);
        }
    }

}










