import java.util.*;

class Checker implements Comparator<Player>{//comparator is implemented by checker class which overrides compare function
    public int compare(Player a, Player b) {//first sorting based on score, if score is same then based on name
        if(a.score<b.score) return 1;
        else if(a.score>b.score) return -1;
        else return a.name.compareTo(b.name);
    }
}

class Player{
    String name;
    int score;
    
    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}

class practiceComparator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();
        
        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();
     
        Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}




