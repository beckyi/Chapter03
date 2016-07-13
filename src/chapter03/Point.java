package chapter03;

public class Point {
	private int x;
	private int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;

	}

//	 public String toString() {
//// 	return super.toString();
//	 	return "Point(" + x + "," + y + ")"; // Point 클래스만의 toString()
//	 }

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

//	 @Override
//	 public boolean equals(Object obj) {
//	 if (this == obj) {
//	 	return true;
//	 }
//	 if (this.getClass() != obj.getClass()) {
//	 	return false;
//	 }
//	 Point other = (Point)obj;
//	 if(this.x==other.getX() && this.y==other.getY()){
//		 return true;
//	 }
//	 	return false;
//	 }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}	//내용 값에 따라 해싱되어 출력 (주소 X)

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
}
