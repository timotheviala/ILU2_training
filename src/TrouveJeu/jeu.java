package TrouveJeu;

public class jeu {
	private int[][] plateau;
	private int x;
	private int y;
	
	public jeu(int longueur,int abs,int ordo) {
		this.plateau=new int[longueur][longueur];
		this.x=abs;
		this.y=ordo;
	}
	
	public int tryCoordonnees(int abs,int ordo) {
		if(abs==1 && ordo==0) {
			return 10;
		}
		return 0;
	}
}