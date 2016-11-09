package com.example.a21753725a.constraitapp;

import android.widget.TextView;

/**
 * Created by Perry on 16/10/2016.
 */

public class Player {

    private int life = 20;
    private int poison = 0;
    private TextView vida;
    private TextView veneno;

    public TextView getVida() {
        return vida;
    }

    public void setVida(TextView vida) {
        this.vida = vida;
    }

    public TextView getVeneno() {
        return veneno;
    }

    public void setVeneno(TextView veneno) {
        this.veneno = veneno;
    }

    public Player(TextView vida, TextView veneno) {
        this.vida = vida;
        this.veneno = veneno;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getPoison() {
        return poison;
    }

    public void setPoison(int poison) {
        this.poison = poison;
    }




    public void vidaMasUno() {
        life++;
        vida.setText(Integer.toString(life));
    }
    public void vidaMenosUno() {
        life--;
        vida.setText(Integer.toString(life));
    }
    public void venenoMasUno() {
        poison++;
        veneno.setText(Integer.toString(poison));
    }
    public void venenoMenosUno() {
        poison--;
        veneno.setText(Integer.toString(poison));
    }

    public void reset() {
        life = 20;
        poison = 0;
        vida.setText(Integer.toString(life));
        veneno.setText(Integer.toString(poison));
    }

}
