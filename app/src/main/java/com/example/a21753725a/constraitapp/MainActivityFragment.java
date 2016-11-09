package com.example.a21753725a.constraitapp;

import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
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


    Player first;
    Player second;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        setHasOptionsMenu(true);
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View frag = inflater.inflate(R.layout.fragment_main, container, false);
        TextView playerOneL = (TextView) frag.findViewById(R.id.vida);
        TextView playerTwoL = (TextView) frag.findViewById(R.id.secondVida);
        TextView playerOneP = (TextView) frag.findViewById(R.id.ven);
        TextView playerTwoP = (TextView) frag.findViewById(R.id.secondPoison);

         first = new Player(playerOneL, playerOneP);
         second = new Player(playerTwoL, playerTwoP);

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

        //Robo de vida para cada jugador

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

    //iniciamos el menu
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        inflater.inflate(R.menu.reset_game, menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if(R.id.resetGame == id) {
            resetGame();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void resetGame(){
        first.reset();
        second.reset();
        Snackbar.make(getView(), "Reset!", Snackbar.LENGTH_SHORT).show();
    }
}
