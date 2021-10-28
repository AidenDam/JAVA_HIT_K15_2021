class Main
{
	public static void main(String[] args) {
		Guns DiepBeDe = new Guns(), DoanXinhGai = new Guns();

		while(true) {
			DiepBeDe.load();
			DiepBeDe.shoot();
			if(DiepBeDe.getAmmo() <= 0) {
				System.out.println("DiepBeDe thua");
				break;
			}
			DoanXinhGai.load();
			DoanXinhGai.shoot();
			if(DoanXinhGai.getAmmo() <= 0) {
				System.out.println("DoanXinhGai thua");
				break;
			}
		}
	}
}