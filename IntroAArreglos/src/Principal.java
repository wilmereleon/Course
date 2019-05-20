
public class Principal {
	public static void main(String[] args) {
		Punto objetoPunto = new Punto(); // To Create Object for manipulate different elements 
		objetoPunto.setX(66);
		objetoPunto.setY(4);
		objetoPunto.setZ(8);
		objetoPunto.setDimension("3D");
		System.out.println("Dimension: " + objetoPunto.getDimension());
		System.out.println("Coordenada X: " + objetoPunto.getX());
		System.out.println("Coordenada Y: " + objetoPunto.getY());
		System.out.println("Coordenada Z: " + objetoPunto.getZ());
	}
}
