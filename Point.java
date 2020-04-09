class Point {
	String id
	String boja
	double x,y;

	//TODO add new variable

	//TODO constructor

	//TODO setters and getters
	Point(){}
    Point(double a, double b)
    {
        x=a;
        y=b;

    }
    ~Point(){}
    void set_x(double a)
    {
        x=a;
    }
    void set_y(double b)
    {
        y=b;
    }

	public void move (char xDirection, char yDirection) {
		//TODO
	}

	public void draw () {
		//TODO
	}



}
