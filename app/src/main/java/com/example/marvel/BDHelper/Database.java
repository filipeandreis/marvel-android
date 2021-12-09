package com.example.marvel.BDHelper;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.example.marvel.models.Person;
import java.util.ArrayList;

public class Database extends SQLiteOpenHelper {
    private static final String DATABASE = "bdprodutos";
    private static final int VERSION = 1;

    public Database(Context context) {
        super(context, DATABASE, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String create = "CREATE TABLE characters(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, name TEXT, realname TEXT, team TEXT, firstappearance TEXT, createdBy TEXT, publisher TEXT, youtubeURL TEXT, IMDB TEXT, imageurl TEXT, bio TEXT);";

        String insert = "INSERT INTO characters(name,realname,team,firstappearance,createdby,publisher,youtubeURL,IMDB,imageurl,bio) VALUES ('Captain America','Steve Rogers','Avengers',1941,'Joe Simon','Marvel Comics','https://www.youtube.com/watch?v=dKrVegVI0Us','6.9/10','https://www.simplifiedcoding.net/demos/marvel/captainamerica.jpg','Prometendo servir seu país de qualquer maneira que pudesse, o jovem Steve Rogers tomou o soro do super soldado para se tornar o exército de um homem só da América. Lutando pelo vermelho, branco e azul por mais de 60 anos, o Capitão América é o símbolo vivo de liberdade e liberdade.');";
        String insert1 = "INSERT INTO characters(name,realname,team,firstappearance,createdby,publisher,youtubeURL,IMDB,imageurl,bio) VALUES ('Iron Man','Tony Stark','Avengers',1963,'Stan Lee','Marvel Comics','https://www.youtube.com/watch?v=5evGlVgmmfM','7.9/10','https://www.simplifiedcoding.net/demos/marvel/ironman.jpg','Ferido, capturado e forçado a construir uma arma por seus inimigos, o industrial bilionário Tony Stark criou uma armadura avançada para salvar sua vida e escapar do cativeiro. Agora com uma nova visão da vida, Tony usa seu dinheiro e inteligência para tornar o mundo um lugar melhor e mais seguro como o Homem de Ferro.');";
        String insert2 = "INSERT INTO characters(name,realname,team,firstappearance,createdby,publisher,youtubeURL,IMDB,imageurl,bio) VALUES ('Wolverine','James Howlett','X-Men',1974,'Len Wein','Marvel Comics','https://www.youtube.com/watch?v=wnww8PunWII','6.7/10','https://www.simplifiedcoding.net/demos/marvel/logan.jpg','Nascido com sentidos sobre-humanos e o poder de curar quase qualquer ferida, Wolverine foi capturado por uma organização canadense secreta e recebeu um esqueleto inquebrável e garras. Tratado como um animal, levou anos para ele se controlar. Agora, ele é o primeiro membro dos X-Men e dos Vingadores.');";
        String insert3 = "INSERT INTO characters(name,realname,team,firstappearance,createdby,publisher,youtubeURL,IMDB,imageurl,bio) VALUES ('Spiderman','Peter Parker','Avengers',1962,'Stan Lee','Marvel Comics','https://www.youtube.com/watch?v=Lxx0JErW4Vc','7.3/10','https://www.simplifiedcoding.net/demos/marvel/spiderman.jpg','Picado por uma aranha radioativa, o estudante do ensino médio Peter Parker ganhou a velocidade, força e poderes de uma aranha. Adotando o nome de Homem-Aranha, Peter esperava começar uma carreira usando suas novas habilidades. Ensinado que grandes poderes trazem grandes responsabilidades, o Aranha prometeu usar seus poderes para ajudar as pessoas.');";
        String insert4 = "INSERT INTO characters(name,realname,team,firstappearance,createdby,publisher,youtubeURL,IMDB,imageurl,bio) VALUES ('Thor','Thor Odinson','Avengers',1962,'Stan Lee','Marvel Comics','https://www.youtube.com/watch?v=JOddp-nlNvQ','7/10','https://www.simplifiedcoding.net/demos/marvel/thor.jpg','Como o deus nórdico do trovão e do relâmpago, Thor empunha uma das maiores armas já feitas, o martelo encantado Mjolnir. Enquanto outros descreveram Thor como um imbecil excessivamente musculoso e estúpido, ele é bastante inteligente e compassivo. Ele é autoconfiante e nunca, jamais, pararia de lutar por uma causa válida.');";
        String insert5 = "INSERT INTO characters(name,realname,team,firstappearance,createdby,publisher,youtubeURL,IMDB,imageurl,bio) VALUES ('Hulk','Robert Bruce Banner','Avengers',1962,'Stan Lee','Marvel Comics','https://www.youtube.com/watch?v=1fAs9WPb2sY','5.6/10','https://www.denofgeek.com/wp-content/uploads/2019/03/incredible-hulk-key-art.jpg?fit=1200%2C675','Pego em uma explosão de bomba gama enquanto tentava salvar a vida de um adolescente, o Dr. Bruce Banner foi transformado na criatura incrivelmente poderosa chamada Hulk. Um herói frequentemente mal compreendido, quanto mais zangado o Hulk fica, mais forte ele fica.');";
        String insert6 = "INSERT INTO characters(name,realname,team,firstappearance,createdby,publisher,youtubeURL,IMDB,imageurl,bio) VALUES ('Wanda Maximoff','Scarlet Witch.','Avengers',1964,'Stan Lee','Marvel Comics','https://www.youtube.com/watch?v=y4oH7qOhWMc','8.1/10','https://nerdist.com/wp-content/uploads/2021/02/Wanda-Maximoff-Civil-War.jpg','A nativa de Sokov, Wanda Maximoff, e seu irmão gêmeo Pietro sobreviveram a uma explosão em seu prédio que matou os pais. Outro míssil pousou, mas não explodiu. Isso os aterrorizou por dias enquanto permaneciam presos nos escombros, com o dispositivo mortal na frente deles, o nome Stark estampado na lateral. Anos depois, os dois se ofereceram para passar por experimentos genéticos supervisionados por HYDRA''s Baron Wolfgang von Strucker, usando o cetro de Loki, para potencialmente dar-lhes poderes. Uma das poucas sobreviventes dos experimentos, junto com seu irmão, Wanda descobriu-se com uma variedade de habilidades. Ao lado de Pietro, Wanda passou a usar essas habilidades para ajudar o robô Ultron, que compartilhava seu desdém por Tony Stark.');";
        String insert7 = "INSERT INTO characters(name,realname,team,firstappearance,createdby,publisher,youtubeURL,IMDB,imageurl,bio) VALUES ('Thanos','Josh Brolin Damion Poitier','Avengers',1973,'Jim Starlin','Marvel Comics','https://www.youtube.com/watch?v=osSJhXruEzU','8.3/10','https://i.insider.com/5a1eb89d3339b0962f8b459e','O Mad Titan Thanos, um indivíduo melancólico e taciturno, consumido pelo conceito de morte, buscou o poder pessoal e aumentou a força, dotando-se de implantes cibernéticos até se tornar mais poderoso do que qualquer um de seus irmãos.');";
        String insert8 = "INSERT INTO characters(name,realname,team,firstappearance,createdby,publisher,youtubeURL,IMDB,imageurl,bio) VALUES ('Deadpool','Wade Wilson','X-Force',1991,'Fabian Nicieza and Rob Liefeld','Marvel Comics','https://www.youtube.com/watch?v=Xithigfg7dA','8/10','https://miro.medium.com/max/3840/1*0ubYRV_WNR9iYrzUAVINHw.jpeg','Bem-vindos à biografia do personagem Deadpool, nerds! Quero dizer ... verdadeiros crentes! Trazido a você por mim, por mim e por mim: o fabuloso Deadpool! Eu poderia ter deixado algum estagiário empurrador de lápis fedorento contar a história de minha vida para você, mas você merece coisa melhor. Então, aqui está, direto do Merc com a boca de uma boca - cada detalhe do meu passado moralmente ambíguo, mentalmente instável e cheio de insinuações. Desde a minha primeira aparição em NEW MUTANTS # 98, ao meu mais recente anti-heróico de tirar o fôlego e alívio cômico, a uma terceira coisa que eu não consigo pensar agora, esta é a história definitiva de Deadpool.');";
        String insert9 = "INSERT INTO characters(name,realname,team,firstappearance,createdby,publisher,youtubeURL,IMDB,imageurl,bio) VALUES ('Clint Barton','Jeremy Renner','Avengers',2011,'Stan Lee and Don Heck','Marvel Comics','https://www.youtube.com/watch?v=VM4_X0MVLzY','N/A','https://images.hindustantimes.com/rf/image_size_630x354/HT/p2/2018/09/11/Pictures/null_495f16c2-b5a2-11e8-bbaf-ff4d73ce44e3.jpg','O homem que se tornaria conhecido como Hawkeye nasceu Clint Barton. Órfão em tenra idade, ele se juntou ao circo e se tornou aprendiz do Espadachim, um artista que se especializou em truques com lâminas. Depois que ele descobriu o Espadachim roubando do circo, os dois lutaram, e Barton foi dado como morto. Barton se recuperou e continuou seu treinamento marcial com o arqueiro residente do circo, Trickshot. Barton se destacou com o arco e decidiu usar suas habilidades para embarcar em uma carreira como um combatente do crime fantasiado chamado Hawkeye.');";
        String insert10 = "INSERT INTO characters(name,realname,team,firstappearance,createdby,publisher,youtubeURL,IMDB,imageurl,bio) VALUES ('Loki','Tom Hiddleston','Avengers',1962,'Stan Lee, Larry Lieber, penciller Jack Kirby','Marvel Comics','https://www.youtube.com/watch?v=UlnufxrJlAk','N/A','https://i.cdn.newsbytesapp.com/images/l205_32701605867168.jpg','Loki, Príncipe de Asgard, Odinson, herdeiro legítimo de Jotunheim e Deus do Mal, está sobrecarregado com um propósito glorioso. Seu desejo de ser um rei o leva a semear o caos em Asgard. Em sua ânsia de poder, ele estende seu alcance à Terra, onde acredita que eles precisam de um governante e encontra heróis improváveis ​​que interferem em seus planos. Deus da Travessura O sempre intrigante Loki, criado como filho do Rei Odin e da Rainha Frigga de Asgard, está ressentido por viver na sombra de seu irmão Thor. Loki estudou artes mágicas ganhando o título de “Deus do Mal”, enquanto seu irmão perseguia proezas físicas.');";
        String insert11 = "INSERT INTO characters(name,realname,team,firstappearance,createdby,publisher,youtubeURL,IMDB,imageurl,bio) VALUES ('Black Panther','T''Challa','Avengers',1966,'Stan Lee and Jack Kirby','Marvel Comics','https://www.youtube.com/watch?v=xjDjIWPwcPU','7.3/10','https://cms.qz.com/wp-content/uploads/2018/02/black-panther-e1513870292357.jpg?quality=75&strip=all&w=1600&h=900&crop=1','Um nativo da pequena, mas tecnologicamente avançada nação africana de Wakanda, T''Challa aceitou o manto de Pantera Negra, o lendário protetor do povo Wakandan, de seu pai, o Rei T''Chaka, que desempenhou o papel antes dele como seu pai antes dele e assim por diante.');";
        String insert12 = "INSERT INTO characters(name,realname,team,firstappearance,createdby,publisher,youtubeURL,IMDB,imageurl,bio) VALUES ('Jean Grey','Jean Elaine Grey','Avengers',1963,'Stan Lee and Jack Kirby','Marvel Comics','https://www.youtube.com/watch?v=azvR__GRQic','5.7/10','https://img.cinemablend.com/filter:scale/quill/1/6/0/d/2/f/160d2fecd5a21712d1336b6f11734abbfa9ed556.jpg?fw=1200','A filha mais nova do professor de história John Gray e sua esposa Elaine, Jean Gray tinha 10 anos quando seus poderes telepáticos mutantes se manifestaram pela primeira vez depois de experimentar as emoções de um amigo moribundo.');";
        String insert13 = "INSERT INTO characters(name,realname,team,firstappearance,createdby,publisher,youtubeURL,IMDB,imageurl,bio) VALUES ('Nick Fury','Colonel Nicholas','Avengers',1963,'Stan Lee and Jack Kirby','Marvel Comics','https://www.youtube.com/watch?v=Jef6OEBXl7w','N/A','https://hips.hearstapps.com/digitalspyuk.cdnds.net/18/25/1529317045-nick-fury-samuel-l-jackson-mcu.jpg','Nicholas Joseph Nick Fury é um espião de renome mundial, ex-Diretor da S.H.I.E.L.D. e fundador dos Vingadores. Fury começou sua carreira no Exército dos Estados Unidos no final dos anos 1960, chegando ao posto de Coronel antes de sua dispensa honrosa.');";
        String insert14 = "INSERT INTO characters(name,realname,team,firstappearance,createdby,publisher,youtubeURL,IMDB,imageurl,bio) VALUES ('Quicksilver','Pietro Maximoff','Avengers',1964,'Stan Lee and Jack Kirby','Marvel Comics','https://www.youtube.com/watch?v=T9GFyZ5LREQ','N/A','https://i.pinimg.com/736x/8c/3a/8b/8c3a8b103187094e6e93c601d326abae.jpg','Quicksilver tem a habilidade sobre-humana de se mover a grandes velocidades. Na maioria das representações, ele é um mutante, um ser humano nascido com poderes sobre-humanos inatos. ... Ele é o irmão gêmeo da Bruxa Escarlate e, na maioria das representações, o filho de Magneto e o meio-irmão de Polaris.');";
        String insert15 = "INSERT INTO characters(name,realname,team,firstappearance,createdby,publisher,youtubeURL,IMDB,imageurl,bio) VALUES ('Daredevil','Matthew Murdock','Avengers',1964,'Stan Lee and Bill Everett','Marvel Comics','https://www.youtube.com/watch?v=e0dDxVAO8K0','8.6/10','https://static.wikia.nocookie.net/marveldatabase/images/a/aa/Daredevil_Vol_6_21_Textless.jpg/revision/latest?cb=20200221001243','Cego quando criança em um acidente que deixou seus outros sentidos aprimorados a níveis extraordinários, Matt Murdock luta incansavelmente pela lei e pela justiça, tanto como advogado cruzado quanto como o contundente criminoso fantasiado chamado Demolidor.');";

        sqLiteDatabase.execSQL(create);

        sqLiteDatabase.execSQL(insert);
        sqLiteDatabase.execSQL(insert1);
        sqLiteDatabase.execSQL(insert2);
        sqLiteDatabase.execSQL(insert3);
        sqLiteDatabase.execSQL(insert4);
        sqLiteDatabase.execSQL(insert5);
        sqLiteDatabase.execSQL(insert6);
        sqLiteDatabase.execSQL(insert7);
        sqLiteDatabase.execSQL(insert8);
        sqLiteDatabase.execSQL(insert9);
        sqLiteDatabase.execSQL(insert10);
        sqLiteDatabase.execSQL(insert11);
        sqLiteDatabase.execSQL(insert12);
        sqLiteDatabase.execSQL(insert13);
        sqLiteDatabase.execSQL(insert14);
        sqLiteDatabase.execSQL(insert15);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        String characters = "DROP TABLE IF EXISTS characters";

        sqLiteDatabase.execSQL(characters);
    }

    public Person getCharacter(String id) {
        String[] args = {id};
        String[] columns = {"id","name","realname","team","firstappearance","createdby","publisher","youtubeURL","IMDB","imageurl","bio"};
        Cursor cursor = getWritableDatabase().rawQuery("SELECT * FROM characters WHERE id=?", args);

        Person person = new Person();

        while (cursor.moveToNext()) {
            person.setId(cursor.getInt(0));
            person.setName(cursor.getString(1));
            person.setRealName(cursor.getString(2));
            person.setTeam(cursor.getString(3));
            person.setFirstAppearance(cursor.getString(4));
            person.setCreatedBy(cursor.getString(5));
            person.setPublisher(cursor.getString(6));
            person.setYoutubeURL(cursor.getString(7));
            person.setImdb(cursor.getString(8));
            person.setImageURL(cursor.getString(9));
            person.setBio(cursor.getString(10));
        }
        return person;
    }

    public ArrayList<Person> getCharacters() {
        String[] columns = {"id","name","realname","team","firstappearance","createdby","publisher","youtubeURL","IMDB","imageurl","bio"};
        Cursor cursor = getWritableDatabase().query("characters", columns, null, null, null, null, null, null);
        ArrayList<Person> listas = new ArrayList<Person>();

        while (cursor.moveToNext()) {
            Person person = new Person();

            person.setId(cursor.getInt(0));
            person.setName(cursor.getString(1));
            person.setRealName(cursor.getString(2));
            person.setTeam(cursor.getString(3));
            person.setFirstAppearance(cursor.getString(4));
            person.setCreatedBy(cursor.getString(5));
            person.setPublisher(cursor.getString(6));
            person.setYoutubeURL(cursor.getString(7));
            person.setImdb(cursor.getString(8));
            person.setImageURL(cursor.getString(9));
            person.setBio(cursor.getString(10));

            listas.add(person);
        }
        return listas;
    }
}
