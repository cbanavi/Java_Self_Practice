package day13_practice_tasks.state_task;

public class StateClients {

    public static void main(String[] args) {

        California california = new California("CA", "Democratic", "Gavin Newsom", "Laphonza Butler", 39_000_000 );
        Florida florida = new Florida("FL", "Republican", "Ron DeSantis", "Rick Scott", 21_000_000 );
        Virginia virginia = new Virginia("VA", "Democratic", "Glenn Youngkin", "Mark Warner", 8_000_000);

        System.out.println(california);
        System.out.println(florida);
        System.out.println(virginia);


    }

}