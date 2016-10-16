package com.example.a21753725a.constraitapp;

import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toolbar;

import static com.example.a21753725a.constraitapp.R.id.secondRestVida;
import static java.lang.Integer.parseInt;

public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }
boolean reset = false;

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.action_settings) {
            return true;
        }
        else
            return super.onOptionsItemSelected(item);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        setHasOptionsMenu(true);

        final View frag = inflater.inflate(R.layout.fragment_main, container, false);

        final TextView playerOneL = (TextView) frag.findViewById(R.id.vida);
        final TextView playerTwoL = (TextView) frag.findViewById(R.id.secondVida);
        final TextView playerOneP = (TextView) frag.findViewById(R.id.ven);
        final TextView playerTwoP = (TextView) frag.findViewById(R.id.secondPoison);

        final Player first = new Player(playerOneL, playerOneP);
        final Player second = new Player(playerTwoL, playerTwoP);

        //primer jugador

        Button sumVida = (Button) frag.findViewById(R.id.sumVida);
        sumVida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    first.vidaMasUno();
            }
        });

        Button restVida = (Button) frag.findViewById(R.id.restVida);
        restVida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               first.vidaMenosUno();
            }
        });

        Button sumVen = (Button) frag.findViewById(R.id.sumVen);
        sumVen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               first.venenoMasUno();
            }
        });

        Button restVen = (Button) frag.findViewById(R.id.restVen);
        restVen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                first.venenoMenosUno();
            }
        });

        //Segón jugador
        Button secondSumVida = (Button) frag.findViewById(R.id.secondSumVida);
        secondSumVida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                second.vidaMasUno();
            }
        });

        Button secondRestVida = (Button) frag.findViewById(R.id.secondRestVida);
        secondRestVida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                second.vidaMenosUno();
            }
        });

        Button secondSumVen = (Button) frag.findViewById(R.id.secondSumVen);
        secondSumVen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                second.venenoMasUno();
            }
        });

        Button secondRestVen = (Button) frag.findViewById(R.id.secondRestVen);
        secondRestVen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                second.venenoMenosUno();
            }
        });

        ImageButton twoLifeSteal = (ImageButton) frag.findViewById(R.id.twoLifeSteal);
        twoLifeSteal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                second.vidaMasUno();
                first.vidaMenosUno();
            }
        });

        ImageButton oneLifeSteal = (ImageButton) frag.findViewById(R.id.oneLifeSteal);
        oneLifeSteal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                first.vidaMasUno();
                second.vidaMenosUno();
            }
        });
        return frag;
    }
}
