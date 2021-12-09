package com.example.marvel.activities;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import com.example.marvel.BDHelper.Database;
import com.example.marvel.models.Person;
import com.example.marvel.interfaces.PersonDAO;
import com.example.marvel.R;
import com.example.marvel.database.Connections;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.squareup.picasso.Picasso;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class DetailsActivity extends AppCompatActivity {
    ImageView imageView;
    TextView bio;
    PersonDAO personDAO;
    TextView teamName ;
    TextView realName;
    TextView firstAppearance;
    TextView createdBy;
    TextView publisher;
    TextView imdb;
    Database bdHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        imageView = findViewById(R.id.detailImage);
        bio = findViewById(R.id.detailTextView);
        teamName = findViewById(R.id.teamName);
        realName = findViewById(R.id.realName);
        firstAppearance = findViewById(R.id.firstAppearance);
        createdBy = findViewById(R.id.createdBy);
        publisher = findViewById(R.id.publisher);
        imdb = findViewById(R.id.imdbRating);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        CollapsingToolbarLayout toolBarLayout = (CollapsingToolbarLayout) findViewById(R.id.toolbar_layout);
        personDAO = Connections.getInstance(getApplicationContext()).getDatabase().getPersonDAO();
        long id =  getIntent().getLongExtra("id", 0);

        bdHelper = new Database(DetailsActivity.this);
        Person marvel = bdHelper.getCharacter(Long.toString(id));

        toolBarLayout.setTitle(marvel.getName());
        setViews(marvel);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(marvel.getYoutubeURL()));
                startActivity(intent);
            }
        });

    }

    void setViews (Person marvel) {
        this.setTitle(marvel.getName());
        teamName.setText(marvel.getTeam());
        Picasso.with(this)
                .load(marvel.getImageURL()).into(imageView);
        bio.              setText(Html.fromHtml(marvel.getBio()));
        realName.         setText(Html.fromHtml("<b>Nome real</b>\t\t\t\t\t\t\t\t\t" + marvel.getRealName()));
        teamName.         setText(Html.fromHtml("<b>Equipe</b>\t\t\t\t\t\t\t\t\t\t\t\t\t" + marvel.getTeam()));
        firstAppearance.  setText(Html.fromHtml("<b>Primeira aparição</b>\t\t\t" + marvel.getFirstAppearance()));
        createdBy.        setText(Html.fromHtml("<b>Criado por</b>\t\t\t\t\t\t\t\t\t" + marvel.getCreatedBy()));
        publisher.        setText(Html.fromHtml("<b>Publicado por</b>\t\t\t\t\t\t\t\t\t\t" + marvel.getPublisher()));
        imdb.             setText(Html.fromHtml("<b>Avaliação IMDB</b>\t\t\t\t\t\t" + marvel.getImdb()));
    }

}