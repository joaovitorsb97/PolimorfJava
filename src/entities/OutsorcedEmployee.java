package entities;

public class OutsorcedEmployee extends Employee {
	
	private final static double percent = 1.1;

	private Double additionalCharge;
	
	public OutsorcedEmployee() {
		super();
	}

	public OutsorcedEmployee(String name, Integer hours, Double valuePerHours, Double additionalCharge) {
		super(name, hours, valuePerHours);
		this.additionalCharge = additionalCharge;
	}

	public Double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}
	
	@Override
	public double payment() {
		return super.payment() + additionalCharge * percent ;

	}
	
}
