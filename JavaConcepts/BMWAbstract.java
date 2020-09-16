package JavaConcepts;

public   class BMWAbstract extends CarAbstract {
	@Override
	public void engineSecret() {

		System.out.println("BMW Engine Secret");

	}
    @Override
	public void companyVault() {

		System.out.println("BMW Company Vault");

	}
    public void newMuiscSystem() {
		// TODO Auto-generated method stub
		
	}


	public static void main(String[] args) {

		CarAbstract car= new BMWAbstract();

		car.companyVault();
		car.engineSecret();

	}
	
	

}
