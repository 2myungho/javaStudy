class Print{
	public String delimiter;
	public Print(String delimiter) {
		this.delimiter = delimiter;
	} 
	//생성자는 클래스와 똑같은 이름을 준다. 초기의 작업을 수행할 때 쓴다.
	//this는 그 클래스가 인스턴스화 되었을 때 인스턴스를 가리키는 특수한 것
	public void A() {
		System.out.println(this.delimiter);
		System.out.println("A");
		System.out.println("A");
	}
	public void B() {
		System.out.println(this.delimiter);
		System.out.println("B");
		System.out.println("B");
	}
}

