
# Rapport Assignment 6: Shared preferences


Det första som gjordes var att skapa en ny `Layout Resorce File`, det implementerades en *Knapp* och *TextView* i denna nya aktivitet. 
I `Activity_Main.xml` skapas en knapp som senare används i `MainActivity.java` för att öppna den tidigare skapade aktiviteten, detta görs via ett intent vid knapptryck. 

```java
public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button openActivityTwo;                              //  <<-----
    Intent intent;                                       //  <<-----
    SharedPreferences mainSharedPreference;
    SharedPreferences.Editor mainSharedPreferenceEditor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        textView = findViewById(R.id.main_textview);

        intent = new Intent(MainActivity.this, SecondActivity.class);                        //
                                                                                             // 
        openActivityTwo = findViewById(R.id.activity_two_button);                            //
        openActivityTwo.setOnClickListener(new View.OnClickListener() {                      //
            @Override                                                                        // Används för att öppna activity_second
            public void onClick(View v) {                                                    //
                onTapp();                                                                    //
            }                                                                                //
        });                                                                                  //
    }

    private void onTapp() {
        startActivity(intent);       // aktiverar intenten som öppnar activity_second
    }
}
```

Det skrevs till ett ID till TextViewn som fanns förprogramerad i `activity_main` för att möjliggöra __findViewByiD__ då den inte hade någon.  
Alla widgets som skapats i `activity_secound` kopplas samman med variabler via __findViewByiD__ 

När det var klart skapades instanser av `SharedPreferences` och `SharedPreferences.Editor` klasserna i *onCreate* metoden, 

**Skriv din rapport här!**

_Du kan ta bort all text som finns sedan tidigare_.

## Följande grundsyn gäller dugga-svar:

- Ett kortfattat svar är att föredra. Svar som är längre än en sida text (skärmdumpar och programkod exkluderat) är onödigt långt.
- Svaret skall ha minst en snutt programkod.
- Svaret skall inkludera en kort övergripande förklarande text som redogör för vad respektive snutt programkod gör eller som svarar på annan teorifråga.
- Svaret skall ha minst en skärmdump. Skärmdumpar skall illustrera exekvering av relevant programkod. Eventuell text i skärmdumpar måste vara läsbar.
- I de fall detta efterfrågas, dela upp delar av ditt svar i för- och nackdelar. Dina för- respektive nackdelar skall vara i form av punktlistor med kortare stycken (3-4 meningar).

Programkod ska se ut som exemplet nedan. Koden måste vara korrekt indenterad då den blir lättare att läsa vilket gör det lättare att hitta syntaktiska fel.

```
function errorCallback(error) {
    switch(error.code) {
        case error.PERMISSION_DENIED:
            // Geolocation API stöds inte, gör något
            break;
        case error.POSITION_UNAVAILABLE:
            // Misslyckat positionsanrop, gör något
            break;
        case error.UNKNOWN_ERROR:
            // Okänt fel, gör något
            break;
    }
}
```

Bilder läggs i samma mapp som markdown-filen.

![](android.png)

Läs gärna:

- Boulos, M.N.K., Warren, J., Gong, J. & Yue, P. (2010) Web GIS in practice VIII: HTML5 and the canvas element for interactive online mapping. International journal of health geographics 9, 14. Shin, Y. &
- Wunsche, B.C. (2013) A smartphone-based golf simulation exercise game for supporting arthritis patients. 2013 28th International Conference of Image and Vision Computing New Zealand (IVCNZ), IEEE, pp. 459–464.
- Wohlin, C., Runeson, P., Höst, M., Ohlsson, M.C., Regnell, B., Wesslén, A. (2012) Experimentation in Software Engineering, Berlin, Heidelberg: Springer Berlin Heidelberg.
