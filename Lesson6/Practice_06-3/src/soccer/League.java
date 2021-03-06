package src.soccer;

public class League {
    public static void main(String[] args) {
        Player player1 = new Player();
        player1.name = "Lionel Messi";

        Player player2 = new Player();
        player2.name = "Ion Kurteianu";

        Player player3 = new Player();
        player3.name = "Cristiano Ronaldo";

        Player player4 = new Player();
        player4.name = "Gica Hagi";

        Player player5 = new Player();
        player5.name = "Artur Ionita";

        Player player6 = new Player();
        player6.name = "Alexandru Iepureanu";

        Team team1 = new Team();
        team1.teamName = "Zimbru";
        team1.players = new Player[3];
        team1.players[0] = player4;
        team1.players[1] = player5;
        team1.players[2] = player6;

        Team team2 = new Team();
        team2.teamName = "Milsami";
        team2.players = new Player[3];
        team2.players[0] = player1;
        team2.players[1] = player2;
        team2.players[2] = player3;

        Goal goal1 = new Goal();
        goal1.player = player6;
        goal1.team = team1;
        goal1.time = 12;

        Goal goal2 = new Goal();
        goal2.player = player1;
        goal2.team = team1;
        goal2.time = 30;

        Goal goal3 = new Goal();
        goal3.player = player5;
        goal3.team = team1;
        goal3.time = 40;

        Goal[] scoredGoals = {goal1, goal2, goal3};

        Game game = new Game();
        game.hostTeam = team1;
        game.guestTeam = team2;
        game.goals = scoredGoals;


        System.out.print(team1.name+":\n");
        for (Player player:team1.players);
           System.out.print(player.name+"\n");

        System.out.println(team2.name+":");
        for (i =0; i< team2.players.length; i++);
        {
            System.out.println(team2.players[i].name);
        }

        System.out.println("Goals:");

            for (Goal goal:game.goals);
                System.out.println("Goal scored after"+ goal.time+ "mins by"+goal.player.name+"of the"+goal.team);
    }
}
