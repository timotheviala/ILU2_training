package comptage;

public class Comptage {
	private String[] tab;
	private String cri;
	
	public Comptage(String cri) {
		this.cri=cri;
	}
	
	public void initTab(int indice) {
		tab=new String[indice];
		for(int i=0;i<indice;i++) {
			if(i%3==0) {
				tab[i]="i";
			}else {
				tab[i]="j";
			}
		}
	}
	
	public int count() {
		if(tab.length%5==0) {
			System.out.println(cri);
			return 745;
		}
		int nb=0;
		for(int i=0;i<tab.length;i++) {
			if(i%3==0) {
				nb++;
			}
		}
		return nb;
	}
}
