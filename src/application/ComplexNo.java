package application;

public class ComplexNo {
	
	private double real;
	private double img;
//Constructor 	
	public ComplexNo(){
		this.real = 0;
		this.img = 0;
	}
	
	public ComplexNo(double real,double img){
		this.real = real;
		this.img = img;
	}
	public ComplexNo(ComplexNo c){
		this.real = c.real;
		this.img = c.img;
		
	}
//Getter and Setter
	public double getReal() {
		return real;
	}

	public void setReal(double real) {
		this.real = real;
	}

	public double getImg() {
		return img;
	}

	public void setImg(double img) {
		this.img = img;
	}

//Methods of complex operations
	//Addition of ComplexNo.
	public ComplexNo add(ComplexNo c){
		ComplexNo tmp = new ComplexNo();
		tmp.real = this.real + c.real;
		tmp.img = this.img + c.img;
		return tmp;
	}
	//subtraction of ComplexNo
	public ComplexNo subtract(ComplexNo c){
		ComplexNo tmp = new ComplexNo();
		tmp.real = this.real - c.real;
		tmp.img = this.img - c.img;
		return tmp;	
	}
	//Multiplication of ComplexNo
	public ComplexNo multiply(ComplexNo c){
		ComplexNo tmp = new ComplexNo();
		tmp.real = this.real*c.real - this.img*c.img;
		tmp.img = this.real*c.img + this.img*c.real;
		return tmp;	
	}
	//Division of ComplexNo
	public ComplexNo division(ComplexNo c){
		if(this.isZero()){
			return null;
		}
		ComplexNo tmp = this.multiply(c.conjugate());
		tmp.real = tmp.real/c.modulus();
		tmp.img = tmp.img/c.modulus();
		return tmp;
	}
	//Calculating modulus 
	public double modulus(){
		double tmp = Math.pow(this.real*this.real+ this.img*this.img,0.5);
		return tmp;
	}
	//Conjugate of ComplexNo
	public ComplexNo conjugate(){
		ComplexNo tmp = new ComplexNo();
		tmp.real = this.real;
		tmp.img = -this.img;
		return tmp;
	}
	//Check if ComplexNo is Zero or Not
	public boolean isZero(){
		if(this.real == 0 && this.img == 0){
			return true;
		}
		return false;
	}
//Printing complex No.
	public String print(ComplexNo c){
		String tmp = this.real+ " "+ " "+this.img+"i";
		return tmp;
	}

}
