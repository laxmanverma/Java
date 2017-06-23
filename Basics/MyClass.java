class MyClass{
	final static int i = 0; //now value of i cannot be changed due to final keyword
	//static keyword makes the variable of class instead of object
	
	float width;
	float height;
	
	float mul(int width, int height){
		return this.i * this.height;
	}
}
