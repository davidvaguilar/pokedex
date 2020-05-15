package com.almaralengineering.pokedex;

import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements PokemonListFragment.OnFragmentInteractionListener,
        DetailFragment.OnFragmentInteractionListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    @Override
    public void onPokemonSelected(Pokemon pokemon) {
        Toast.makeText(this, pokemon.getName(), Toast.LENGTH_SHORT).show();
        ImageView poke = (ImageView) findViewById(R.id.pokemon_detail_imageView);

        DetailFragment detailFragment = (DetailFragment) getSupportFragmentManager().findFragmentById(R.id.detail_fragment);
        detailFragment.setPokemonImage(pokemon.getImageId());

        detailFragment.playPokemonSound(pokemon.getSoundId());
    }
}
