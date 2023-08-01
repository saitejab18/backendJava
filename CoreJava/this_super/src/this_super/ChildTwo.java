package this_super;
class ParentTwo{
	public void m1() {
		System.out.println("M1 method of parent two");
	}
}
class ChildTwo extends ParentTwo{
	public void m1() {
		System.out.println("M1 method of childTwo");
	}
	public void m2() {
		this.m1();
		super.m1();
	}

	public static void main(String[] args) {
          ChildTwo c = new ChildTwo();
          c.m1();
          c.m2();
	}

}
