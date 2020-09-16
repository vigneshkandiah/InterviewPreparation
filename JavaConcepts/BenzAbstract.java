package JavaConcepts;

public  class BenzAbstract extends CarAbstract {
	public void engineSecret() {

		System.out.println("Benz Engine Secret");

	}
    @Override
	public void companyVault() {

		System.out.println("Benz Company Vault");

	}
	public static void main(String[] args) {
		
		CarAbstract car = new BenzAbstract();
		car.companyVault();
		car.engineSecret();
	}
	public void newMuiscSystem() {
		// TODO Auto-generated method stub
		
	}

}
