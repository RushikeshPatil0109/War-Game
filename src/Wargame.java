
public class Wargame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player1 player=new Player1("Abhay","sword",100);
		System.out.println(player.getName());
		System.out.println(player.getHealth());
		System.out.println(player.getWeapon());
		player.damagebygun1();
		player.damagebygun2();
		Player2 players=new Player2("sham","knife",100, true);
		System.out.println(players.getName());
		System.out.println(players.getHealth());
		System.out.println(players.getWeapon());
		players.damagebygun1();
	}
}
