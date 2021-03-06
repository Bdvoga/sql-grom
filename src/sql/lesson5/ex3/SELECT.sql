INSERT INTO MOVIE VALUES(101,'movie1','dir1',2000,150);
INSERT INTO MOVIE VALUES(102,'movie2','dir2',2001,155);
INSERT INTO MOVIE VALUES(103,'movie3','dir1',2010,110);

INSERT INTO MOVIE_STAT VALUES(101,99.1,3,1);
INSERT INTO MOVIE_STAT VALUES(102,99.1,3,1);
INSERT INTO MOVIE_STAT VALUES(103,99.1,3,1);

UPDATE MOVIE_STAT SET RATING = 55.0, DOMESTIC_SALES = 5 WHERE MOVIE_ID = 102;
UPDATE MOVIE_STAT SET RATING = 60.4, DOMESTIC_SALES = 4, INTERNATIONAL_SALES = 2 WHERE MOVIE_ID = 103;

SELECT DIRECTOR, COUNT(DIRECTOR) FROM MOVIE
GROUP BY DIRECTOR;

SELECT MOVIE.DIRECTOR, SUM(MOVIE_STAT.DOMESTIC_SALES), SUM(MOVIE_STAT.INTERNATIONAL_SALES)
FROM MOVIE, MOVIE_STAT
WHERE MOVIE.ID = MOVIE_STAT.MOVIE_ID
GROUP BY MOVIE.DIRECTOR;