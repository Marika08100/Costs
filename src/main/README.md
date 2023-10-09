
Írj egy webes Spring Boot alkalmazást (1 pont), amiben emberek kiadásait lehet nyomon követni!

Adatbázisban legyenek eltárolva az emberek adatai (név, születési hely (szorgalmi: születési dátum), email) (2 pont), a kiadások adatai (hol, mennyit, ki költötte) (2 pont).
Adatbázisként használhatsz H2-t vagy MySQL-t is, a megoldásodhoz viszont mindenképp fel kell, hogy töltsd a táblákat lérehozó scriptet (ha van) és a példaadatokat létrehozó scriptet!

Valósítsd meg, hogy lehessen új embert (4 pont), kiadást (4 pont) felvenni a rendszerbe és a meglévő embereket frissíteni (5 pont), de ne lehessen kiadást törölni (2 pont)!

Lehessen továbbá statisztikákat lekérni:
egy ember adatait (kiadásokkal együtt, az összes emberre működjön) (5 pont),
a jelenlegi legtöbbet költő ember  adatait (5 pont)

Megjelenítéshez használj Thymeleafet!

Szorgalmi: Tárold el minden ember egyenlegét, ezt minden egyes kiadásnál csökkents, és ennél az egyenlegnél nagyobb új költést ne lehesen felvenni az adott emberhez! (3 pont)