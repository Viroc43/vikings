package org.edu;

public class Arts extends Education{

private void bSc() {
	System.out.println("Bsc - maths");
}
private void bEd() {
	System.out.println("B.ed");
}
private void bA() {
	System.out.println("Ba- eng");
}
private void bBA() {
	System.out.println("BBA");
}

private void ug() {
System.out.println("Ug -BCA ");
}
private void pg() {
System.out.println("Pg - MCA");
}
public static void main(String[] args) {
	Arts c = new Arts();
c.bSc();
c.bEd();
c.bA();
c.bBA();
c.ug();
c.pg();
}

}

