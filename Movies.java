import java.util.Arrays;

public class Movies {

    public static void main(String[] args) {
        String[] indianaMovies = {"Indiana Jones and the Kingdom of the Crystal Skull", "Indiana Jones and the Last Crusade", "Indiana Jones and the Temple of Doom"};

        String[] firstMovieActors = {"Harrison Ford", "Shia LaBoeuf", "Karen Allen"};
        String[] secondMovieActors = {"Harrison Ford", "Sean Connery", "Denholm Elliott"};
        String[] thirdMovieActors = {"Harrison Ford", "Kate Capshaw", "Ke Huy Quan"};

        String[][] actors = new String[][]
                {
                        firstMovieActors,
                        secondMovieActors,
                        thirdMovieActors
                };

        for (int i = 0; i < indianaMovies.length; i++) {
            System.out.println("Dans le film" + indianaMovies[i] + " , les principaux acteurs sont : " + actors[i][0] + "," + actors[i][1] + "," + actors[i][2]);
        }
    }
}

