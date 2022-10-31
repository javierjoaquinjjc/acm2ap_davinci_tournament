import java.util.Date;

public class Main {
    public static void main(String args[]) {
        System.out.println("Da Vinci Tournament");
        String lugarDelParcial = new String("Aula 116, Da Vinci");

        Season torneoDaVinci = new Season("final");   //creamos torneo
        Date fechaPosibleParcial = new Date(2022,8,28); //creamos fecha

        Match primerPartial = new Match(lugarDelParcial, fechaPosibleParcial);     // creamos partido

        TeamSeason profesoresPOO = new TeamSeason( "Profes POO");
        TeamSeason estudiantesFC = new TeamSeason( "Estudiantes FC");

        Player profeSergio = new Player("Sergio Medina",1,"Goalkeeper");

        profesoresPOO.setPosition(1);
        estudiantesFC.setPosition(0);


        primerPartial.setLocalTeam(profesoresPOO);
        primerPartial.setVisitantTeam(estudiantesFC);

    }
}