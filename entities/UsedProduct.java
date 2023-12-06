package exe_fix_polimorfismo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private Date manufactureDate;
	
	public UsedProduct() {
		super();
	}

	public UsedProduct(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	public Date getManufactureDate() {
		return manufactureDate;
	}
	
	public Date setManufactureDate() {
		return manufactureDate;
	}

	@Override
	public String priceTag() {
		return super.getName()
				+ " (used)"
				+ " $ " 
				+ String.format("%.2f", getPrice())
				+ " (Manufacture date: "
				+ sdf.format(manufactureDate)
				+ ")";
	}
}